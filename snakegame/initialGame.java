/*
 * @author gulico Wara Wangtrakoon
 * Ready to play
 * step of play
 * create board
 * set character
 * loop play*/
package snakegame;

public class initialGame {
	public static void main(String args[]){
		RandomBoard board = new RandomBoard();
		Character A = new Character();
		Character B = new Character();
		Character C = new Character();
		FinishGame end = new FinishGame();
		Dice D = new Dice();
		MoveNormal M = new MoveNormal();
		board.setRandomBoard(board);
		board.printBoard(board.getBoard(board.position));
		board.markOnBoard(A.getCharacterPlace(),M.name("A", board.getBoard(board.position)));
		board.markOnBoard(B.getCharacterPlace(),M.name("B", board.getBoard(board.position)));
		board.markOnBoard(C.getCharacterPlace(),M.name("C", board.getBoard(board.position)));
		board.printBoard(board.getBoard(board.position));
		while(!end.finish(A.getCharacterName(),A.getCharacterPlace()) && !end.finish(B.getCharacterName(),B.getCharacterPlace()) && !end.finish(C.getCharacterName(),C.getCharacterPlace())){
			playGame(A,D,"A",board,M,end);
			if(end.finish(A.getCharacterName(), A.getCharacterPlace()))
				break;
			playGame(B,D,"B",board,M,end);
			if(end.finish(B.getCharacterName(), B.getCharacterPlace()))
				break;
			playGame(C,D,"C",board,M,end);
			if(end.finish(B.getCharacterName(), B.getCharacterPlace()))
				break;
		}
	}
	 public static void playGame(Character name,Dice D,String sign,RandomBoard board, MoveNormal M,FinishGame end){
		 	D.point =0;
			System.out.printf("Turn.."+name.getCharacterName()+"\nYour sign is "+sign+"\nPlease input something or free and Press Enter\n");
			D.rollDice(D.wait(null));
			board.deleteOnBoard(name.getCharacterPlace(), sign);
			name.setCharacterPlace(M.position(name.getCharacterPlace(), D.getPoint()));
			name.setCharacterPlace(M.position(name.getCharacterPlace(), board.getValueOnBoard(name.getCharacterPlace())));
			board.markOnBoard(name.getCharacterPlace(),M.name(sign, board.getBoard(board.position)));
			board.printBoard(board.getBoard(board.position));
			D.point =0;
	 }
}
