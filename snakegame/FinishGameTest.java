/**
 * @author Chaowarat Tangrueng
 * @since 16/08/2011
 * @note NetBeans 7.0.1
 * @note JUnit 4.8.2
 * @note Windows 7 Professional x64
 * @Purpose:Test all method in class FinishGame
 */
package snakegame;

import org.junit.Test;
import static org.junit.Assert.*;

public class FinishGameTest {
    
    @Test
    public void FinishGameTest() {
    }

    @Test
    public void finish_test1() {
        FinishGame fh = new FinishGame();
        assertEquals(false, fh.finish("A",10));
    }
    @Test
    public void finish_test2() {
        FinishGame fh = new FinishGame();
        assertEquals(true, fh.finish("Chaow",49));
    }
    @Test
    public void finish_test3() {
        FinishGame fh = new FinishGame();
        assertEquals(false, fh.finish("B",50));
    }
}
