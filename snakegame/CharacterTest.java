/**
 * @author Attakorn Poonkesorn
 * @since 16 August 2011
 * @note NetBeans 7.0.1
 * @note Windows 7 Professional 32 bit
 */

package snakegame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cartoonman
 */
public class CharacterTest {
    
    
   /*
    * Default constructor
    */
    @Test
    public void Character_Test() {
        Character a = new Character("B",50);
        assertEquals("B",a.getCharacterName());
        assertEquals(50,a.getCharacterPlace());
       
    }
    /*
    * get character'name
    */    
    @Test
    public void getCharacterName_Test() {
        Character a = new Character("A",0);
        assertEquals("A",a.getCharacterName());
        assertEquals(0,a.getCharacterPlace());
    }

    /*
    * set character'name
    */    
    @Test
    public void setCharacterName_Test() {
        Character a = new Character("A",4);
        assertEquals("A",a.getCharacterName());
        assertEquals(4,a.getCharacterPlace());
    }

    /*
    * get character'place
    */    
    @Test
    public void getCharacterPlace_Test() {
        Character a = new Character("B",12);
        assertEquals("B",a.getCharacterName());
        assertEquals(12,a.getCharacterPlace());
    }

    /*
    * set character'place
    */  
    @Test
    public void setCharacterPlace_Test() {
        Character a = new Character("C",14);
        assertEquals(14,a.getCharacterPlace());
        assertEquals("C",a.getCharacterName());   
    }
    
    

 

}
