/**
 * @author gulico Wara Wangtrakoon
 * create test for RandomBoard Class
 */
package snakegame;

import org.junit.Test;
import static org.junit.Assert.*;

public class RandomBoardTest {
	@Test
	//Test default constructor
    public void getBoard_1() {
        RandomBoard test = new RandomBoard();
        String expected = "---------------------------------------------------------------------------------\n"
        				+ "|       |       |       |       |       |       |       |       |       |       |\n"
        				+ "|       ------------------------------------------------------------------------|\n"
        				+ "|       |       |       |       |       |       |       |       |       |       |\n"
        				+ "|------------------------------------------------------------------------       |\n"
        				+ "|       |       |       |       |       |       |       |       |       |       |\n"
        				+ "|       ------------------------------------------------------------------------|\n"
        				+ "|       |       |       |       |       |       |       |       |       |       |\n"
        				+ "|------------------------------------------------------------------------       |\n"
        				+ "|       |       |       |       |       |       |       |       |       |       |\n"
        				+ "---------------------------------------------------------------------------------\n";
        assertEquals(expected, test.getBoard(test.position));
    }
	
	@Test
	//test getValueOnBoard
	public void getValueOnBoard_1(){
		RandomBoard testadd = new RandomBoard();
		assertEquals("     ", testadd.getValueOnBoard(10));
	}
    
    @Test
    //test markOnBoard
    public void markOnBoard_2() {
    	RandomBoard testadd = new RandomBoard();
        testadd.markOnBoard(10, " B   ");
        assertEquals(" B   ", testadd.getValueOnBoard(10));
    }
    
    @Test
    //test markOnBoard
    public void markOnBoard_3() {
    	RandomBoard testadd = new RandomBoard();
        testadd.markOnBoard(29, "ABC  ");
        assertEquals("ABC  ", testadd.getValueOnBoard(29));
    }
    
    @Test
    //Test markOnBoard
    public void getBoard2() {
    	RandomBoard testadd = new RandomBoard();
        testadd.markOnBoard(3, " B   ");
        testadd.markOnBoard(3, "A    ");
        assertEquals("AB   ", testadd.getValueOnBoard(3));
    }
    
    @Test
    //Test setSnake
    public void setSnake_1(){
    	RandomBoard testadd = new RandomBoard();
    	testadd.setSnake(5, 2);
    	assertEquals("   -2", testadd.getValueOnBoard(5));
    }
    
    @Test
    //Test setSnake
    public void setSnake2(){
    	RandomBoard testadd = new RandomBoard();
    	testadd.setSnake(10, 5);
    	assertEquals("   -5", testadd.getValueOnBoard(10));
    }
    @Test
    //Test setSnake
    public void setSnake3(){
    	RandomBoard testadd = new RandomBoard();
	    testadd.setSnake(32, 1);
	    assertEquals("   -1", testadd.getValueOnBoard(32));
    }
    
    @Test
    //Test setStair
    public void setStair1(){
    	RandomBoard testadd = new RandomBoard();
	    testadd.setStair(3, 5);
	    assertEquals("   +5", testadd.getValueOnBoard(3));
    }
    
    @Test
    //Test setStair
    public void setStair2(){
    	RandomBoard testadd = new RandomBoard();
	    testadd.setStair(29, 2);
	    assertEquals("   +2", testadd.getValueOnBoard(29));
    }
    
    @Test
    //Test setStair
    public void setStair3(){
    	RandomBoard testadd = new RandomBoard();
	    testadd.setStair(40, 5);
	    assertEquals("   +5", testadd.getValueOnBoard(40));
    }
    
    @Test
    //Test deleteOnBoard
    public void deleteOnBoard_1(){
    	RandomBoard testadd = new RandomBoard();
	    testadd.markOnBoard(5, "ABC  ");
	    testadd.deleteOnBoard(5, "B");
	    assertEquals("A C  ", testadd.getValueOnBoard(5));
    }
    
    @Test
    //Test deleteOnBoard
    public void deleteOnBoard_2(){
    	RandomBoard testadd = new RandomBoard();
	    testadd.markOnBoard(5, " BC  ");
	    testadd.deleteOnBoard(5, "C");
	    assertEquals(" B   ", testadd.getValueOnBoard(5));
    }
    
    @Test
    //Test deleteOnBoard
    public void deleteOnBoard_3(){
    	RandomBoard testadd = new RandomBoard();
	    testadd.markOnBoard(5, "A    ");
	    testadd.deleteOnBoard(5, "A");
	    assertEquals("     ", testadd.getValueOnBoard(5));
    }
    
    @Test
    //Test setRandomBoard
    public void setRandomBoardTest(){
    	RandomBoard testadd = new RandomBoard();
    	String expected = "---------------------------------------------------------------------------------\n"
			+ "|       |       |       |       |       |       |       |       |       |       |\n"
			+ "|       ------------------------------------------------------------------------|\n"
			+ "|       |       |       |       |       |       |       |       |       |       |\n"
			+ "|------------------------------------------------------------------------       |\n"
			+ "|       |       |       |       |       |       |       |       |       |       |\n"
			+ "|       ------------------------------------------------------------------------|\n"
			+ "|       |       |       |       |       |       |       |       |       |       |\n"
			+ "|------------------------------------------------------------------------       |\n"
			+ "|       |       |       |       |       |       |       |       |       |       |\n"
			+ "---------------------------------------------------------------------------------\n";
    	testadd.setRandomBoard(testadd);
    	assertNotSame(expected, testadd, expected);
    }
}
