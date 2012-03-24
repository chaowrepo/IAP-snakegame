/**
 * @author gulico Wara Wangtrakoon
 * create test for Dice Class
 */
package snakegame;
import org.junit.Test;
import static org.junit.Assert.*;

public class Dice_Test {
	Dice a = new Dice();
	@Test
	//test Default Construct
	public void testGetPoint_1(){
	assertEquals(0, a.getPoint());
	}
	@Test
	//test get point after roll dice
	public void testGetPoint_2(){
	assertEquals(a.rollDice(""), a.getPoint());
	assertEquals(a.rollDice(""), a.getPoint());
	}
	@Test
	//test not roll dice
	public void testGetPoint_3(){
	a.rollDice(null);
	assertEquals(0, a.getPoint());
	}
	@Test
	//test point from roll dice
	public void testRollDice(){
		Dice a = new Dice();
		assertEquals(0,a.rollDice(null));
		assertTrue(0 <= a.rollDice(""));
		assertTrue(6 >= a.rollDice(""));
	}
}
