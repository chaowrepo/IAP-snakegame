/**
 * @author Chaowarat Tangrueng
 * @since 16/08/2011
 * @note NetBeans 7.0.1
 * @note Windows 7 Professional x64
 * @Purpose:To move charactor to destination
 *          and tell value to put in board
 * @Contract: position(int,int) => int
 *            name(String ,String ) => String
 *            position(int,String) => int
 */

package snakegame;

public class MoveNormal {
    private String values;
    
    public MoveNormal(){
        this.values = "    ";
    }
    
    public int position(int position,int dice){
        int des = position+dice;
        // check destination is over board length
        if (des > 49){
            des = (49 - (des -= 49));
        }        
        return des;
    }
    // check found snake/stair
    public int position(int currentPosition,String getFromBoard){
        // check found snake
        if (getFromBoard.charAt(3)=='-'){
            System.out.println("Found SNAKE!..");
            currentPosition -= Integer.parseInt(getFromBoard.substring(4, 5));          
        }
        // check found stair
        else if (getFromBoard.charAt(3)=='+'){
            System.out.println("Found STAIR!..");
            currentPosition += Integer.parseInt(getFromBoard.substring(4, 5));          
        }
        // check destination is over board length
        if (currentPosition > 49){
            currentPosition = (49 - (currentPosition -= 49));
        }
        return currentPosition;
    }
    
    public String name(String py,String board){
        if (py.equals("A")){
            this.values = py +  board.substring(1, 4);
            return this.values;
        }
        else if (py.equals("B")){
            this.values = board.substring(0, 1) + py +  board.substring(2, 4);
            return this.values;
        }
        else if (py.equals("C")){
            this.values = board.substring(0, 2) + py + board.substring(3, 4);
            return this.values;
        }
        else{
            return "-1"; //error
        }
    }
}
