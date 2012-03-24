/**
 * @author Chaowarat Tangrueng
 * @since 16/08/2011
 * @note NetBeans 7.0.1
 * @note JUnit 4.8.2
 * @note Windows 7 Professional x64
 * @Purpose:Test all method in class MoveNormal
 */

package snakegame;

import org.junit.Test;
import static org.junit.Assert.*;

public class MoveNormalTest {
     //Test method position(int position,int dice)
    @Test
    public void position_Test1() {
        MoveNormal instance = new MoveNormal();
        assertEquals(6, instance.position(0, 6));
    }
    @Test
    public void position_Test2() {
        MoveNormal instance = new MoveNormal();
        assertEquals(26, instance.position(20, 6));
    }
    @Test
    public void position_Test3() {
        MoveNormal instance = new MoveNormal();
        assertEquals(46, instance.position(48, 4));
    }
    @Test
    public void position_Test4() {
        MoveNormal instance = new MoveNormal();
        assertEquals(48, instance.position(45, 5));
    }
    //Test method name(char player,String board)
    @Test
    public void name_Test1() {
        MoveNormal instance = new MoveNormal();
        assertEquals("A100", instance.name("A", "1100"));
    }
    @Test
    public void name_Test2() {
        MoveNormal instance = new MoveNormal();
        assertEquals("1B10", instance.name("B", "1110"));
    }
    @Test
    public void name_Test3() {
        MoveNormal instance = new MoveNormal();
        assertEquals("01C0", instance.name("C", "0100"));
    }
    @Test
    public void name_Test4() {
        MoveNormal instance = new MoveNormal();
        assertEquals("-1", instance.name("D", "1101")); //Test error
    }
    //Test method position(int,int,String)
    @Test
    public void position_Test11() {
        MoveNormal instance = new MoveNormal();
        assertEquals(25, instance.position(20,"AB +5"));
    }
    @Test
    public void position_Test12() {
        MoveNormal instance = new MoveNormal();
        assertEquals(27, instance.position(30," B -3"));
    }
    @Test
    public void position_Test13() {
        MoveNormal instance = new MoveNormal();
        assertEquals(46, instance.position(48,"  C+4"));
    }


}