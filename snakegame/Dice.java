/**
 * @author gulico Wara Wangtrakoon
 * Create dice for play game
 */
package snakegame;
import java.util.Scanner;

public class Dice {
	int point = 0;
	String waited = "";
	public int rollDice(String waited){
		if(waited != null){
			this.point = (int)(Math.random()*6)+1;
			System.out.println("Roll dice point ="+point);
		}
		return point;
	}
	
	public int getPoint(){
		return this.point;
	}
	
	public String wait(String waited){
		Scanner scan = new Scanner(System.in);
		waited = scan.nextLine();
        return waited;
	}


}