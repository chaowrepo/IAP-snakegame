/*
 * @author gulico Wara Wangtrakoon
 * Ready to play
 * step of play
 * create board
 * set character
 * loop play*/
package guisnakegame;

public class initialGame {

    public static void main(String args[]) {
        Board board = new Board("SnakeGame");
        board.setVisible(true);
        javax.swing.SwingUtilities.updateComponentTreeUI(board);
        //Board br = new Board();
        Character A = new Character("Player 1");
        Character B = new Character("Player 2");
        Character C = new Character("Player 3");
        FinishGame end = new FinishGame();
        Dice D = new Dice();
        MoveNormal M = new MoveNormal();


        while (!end.finish(A.getCharacterName(), A.getCharacterPlace()) && !end.finish(B.getCharacterName(), B.getCharacterPlace()) && !end.finish(C.getCharacterName(), C.getCharacterPlace())) {
            playGame(A, D, "A", board, M, end);
            if (end.finish(A.getCharacterName(), A.getCharacterPlace())) {
                break;
            }
            playGame(B, D, "B", board, M, end);
            if (end.finish(B.getCharacterName(), B.getCharacterPlace())) {
                break;
            }
            playGame(C, D, "C", board, M, end);
            if (end.finish(B.getCharacterName(), B.getCharacterPlace())) {
                break;
            }
        }

        board.dispose();
    }

    public static void playGame(Character name, Dice D, String sign, Board board, MoveNormal M, FinishGame end) {
        D.point = 0;
        System.out.printf("Turn.." + name.getCharacterName() + "\nYour sign is " + sign + "\nPlease press 1\n");
        D.rollDice(D.wait(0)); 
        if(name.getCharacterPlace()!=0){
            board.deleteOnBoard(name.getCharacterPlace(), sign);
        }
        name.setCharacterPlace(M.position(name.getCharacterPlace(), D.getPoint()));
        name.setCharacterPlace(M.position(name.getCharacterPlace(), board.getValueOnBoard(name.getCharacterPlace())));
        
        board.markOnBoard(name.getCharacterPlace(), M.name(sign, board.getBoard(board.position)));
        board.printBoard(board.getBoard(board.position));
        board.setPoint(0);
        D.point = 0;
    }
}