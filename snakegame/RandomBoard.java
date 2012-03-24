package snakegame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * have set position for snake and stair
 */

/**
 *
 * @author gulico Wara Wangtrakoon
 */
public class RandomBoard {
   String position[] ;
   
    public RandomBoard(){
       this.position = new String[50];
       int index =0;
       while(index < this.position.length){
           this.position[index] ="     ";
           index++;
       }
    }
     
    public void printBoard(String getBoard){
        System.out.print(getBoard);
        
        
    }
    
    public String getBoard(String board[]){
        return "---------------------------------------------------------------------------------\n"+
               "| "+board[40]+" | " +board[41] +" | " +board[42]+" | " +board[43]+" | " +board[44]+" | " +board[45]+" | " +board[46]+" | " +board[47]+" | " +board[48]+" | " +board[49]+" |\n"+
               "|"+"       "+"------------------------------------------------------------------------|\n"+
               "| "+board[39]+" | " +board[38] +" | " +board[37]+" | " +board[36]+" | " +board[35]+" | " +board[34]+" | " +board[33]+" | " +board[32]+" | " +board[31]+" | " +board[30]+" |\n"+
               "|------------------------------------------------------------------------"+"       "+"|\n"+
               "| "+board[20]+" | " +board[21] +" | " +board[22]+" | " +board[23]+" | " +board[24]+" | " +board[25]+" | " +board[26]+" | " +board[27]+" | " +board[28]+" | " +board[29]+" |\n"+
               "|"+"       "+"------------------------------------------------------------------------|\n"+
               "| "+board[19]+" | " +board[18] +" | " +board[17]+" | " +board[16]+" | " +board[15]+" | " +board[14]+" | " +board[13]+" | " +board[12]+" | " +board[11]+" | " +board[10]+" |\n"+ 
               "|------------------------------------------------------------------------"+"       "+"|\n"+
               "| "+board[0]+" | " +board[1] +" | " +board[2]+" | " +board[3]+" | " +board[4]+" | " +board[5]+" | " +board[6]+" | " +board[7]+" | " +board[8]+" | " +board[9]+" |\n"+
                "---------------------------------------------------------------------------------\n";
    }
    
    
    public void setSnake(int positionSnake,int offset){
    	position[positionSnake] = "   -"+offset;
    }
    public void setStair(int positionStair,int offset){
    	position[positionStair] = "   +"+offset;
    }
    
    public void markOnBoard(int initialMark,String characterName){
          if (characterName.charAt(0)=='A') {
           position[initialMark] = "A" + position[initialMark].substring(1, 5);
        }  if (characterName.charAt(1)=='B') {
            position[initialMark] = position[initialMark].charAt(0) + "B" + position[initialMark].substring(2, 5);
        }  if (characterName.charAt(2)=='C') {
            position[initialMark] = position[initialMark].substring(0, 2) + "C" + position[initialMark].substring(3, 5);
        } 
       }
   
    public void deleteOnBoard(int initialMark, String characterName) {
        if (characterName.equals("A")) {
           position[initialMark] = " " + position[initialMark].substring(1, 5);
        } else if (characterName.equals("B")) {
            position[initialMark] = position[initialMark].charAt(0) + " " + position[initialMark].substring(2, 5);
        } else if (characterName.equals("C")) {
            position[initialMark] = position[initialMark].substring(0, 2) + " " + position[initialMark].substring(3, 5);
        }
     }
    
    public String getValueOnBoard(int index){
        return position[index];
    }
    
    public void setRandomBoard(RandomBoard board){
    	int count = 0;
    	int positionSnake = 0;
    	int positionStair = 0;
    	int offset;
    	while (count < 3){
    		positionSnake = (int)(Math.random()*44)+5;
    		if(board.getValueOnBoard(positionSnake).charAt(3) != '+' &&board.getValueOnBoard(positionSnake).charAt(3) != '-'){
    			offset = (int)(Math.random()*5)+1;
    			board.setSnake(positionSnake, offset);
    			count++;
    		}
    		}
    	while (count < 6){
    		positionStair = (int)(Math.random()*44)+1;
    		if(board.getValueOnBoard(positionStair).charAt(3) != '+' &&board.getValueOnBoard(positionStair).charAt(3) != '-'){
    			offset = (int)(Math.random()*5)+1;
    			board.setStair(positionStair, offset);
    			count++;
    		}
    	}
    	count = 0;
    }
}

    
    
  