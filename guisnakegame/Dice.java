package guisnakegame;
import java.util.Scanner;

public class Dice {
	int point = 0;
	int waited = 0;
	public int rollDice(int waited){
		if(waited == 1){
			this.point = (int)(Math.random()*6)+1;
			System.out.println("Roll dice point ="+point);
		}
		return point;
	}
	
	public int getPoint(){
		return this.point;
	}
	
	public int wait(int waited){
		Scanner scan = new Scanner(System.in);
		waited = scan.nextInt();
        return waited;
	}


}