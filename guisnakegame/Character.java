/**
 * @author Attakorn Poonkesorn
 * @since 16 August 2011
 * @note NetBeans 7.0.1
 * @note Windows 7 Professional 32 bit
 */

/**
 *
 * @author Cartoonman
 */
package guisnakegame;

import java.util.Iterator;
import java.util.Scanner;

public class Character {
    private String characterName;
    private int characterPlace;
     
    /*
    * Default constructor
    */
    public Character(String name) {
        this.characterName = name;
        this.characterPlace = 0;
    }
     
    /*
    * constructor
    */
    public Character(String charName,int charPlace) {
        this.characterName = charName;
        this.characterPlace = charPlace;
    }



    //private Character() {
    //    throw new UnsupportedOperationException("Not yet implemented");
    //}

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String charName) {
        this.characterName = charName;
    }

    public int getCharacterPlace() {
        return characterPlace;
    }

    public void setCharacterPlace(int charPlace) {
        this.characterPlace = charPlace;
    }

   /*         
     * @Purpose:    choose sign of character for player
     *              and input player'name to character'name
     * @param:      sign (chooseSign:String)
     * @output:     character (:String)
     * @Contract:   characterSign(String) => String 
     * @tester      characterSign("A") => "A"
     *              characterSign("B") => "B"
     *              characterSign("C") => "C"
     *              characterSign("X") => "X"
     *              characterSign("Y") => "X"
     *              characterSign("Z") => "X"
     */
    public String characterSign(String chooseSign){
        if("A".equals(chooseSign)){
            return "A";
        }
        else if("B".equals(chooseSign)){
            return "B";
        }
        else if("C".equals(chooseSign)){
            return "C";
        }
        else{
            System.out.println("You input invalid Character");
            return "X";
        }
    }   
    
    public String recieveValue(){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        return name;
    }
}