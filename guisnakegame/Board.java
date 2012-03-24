/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guisnakegame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Image;
import java.awt.event.MouseListener;
import javax.swing.SpringLayout;

/**
 *
 * @author PrinceZidane
 */
public class Board extends JFrame implements MouseListener {
    String indexPic[] = {"0101","0201","0301","0302","0303","0304","0305","0306",
"0307","0407","0507","0506","0505","0504","0503","0502",
"0501","0500","0600","0700","0701","0702","0703","0704",
"0705","0706","0707","0708","0709","0710","0711","0811",
"0911","0911","0910","0909","0908","0907","0906","0905",
"0904","0903","0902","1002","1102","1103","1104","1105",
"1106","1107","1108"};
            
    String name, dice, found;
    JLayeredPane allPanel;
    JPanel spanel = new JPanel();
    JPanel npanel = new JPanel();
    JTextField showName, showValueOfDice, showFound;
    JButton button = new JButton("Roll Dice");
    Image bgImage;
    static BackGround bg = new BackGround();
    int layercount = 2;
    final int POINT_CHARACTER_X = 49;
    final int POINT_CHARACTER_Y = 48;

    public Board(String aaa) {
        this.name = "Show Name";
        this.dice = "Show value of Dice";
        this.found = "Found snake or stair";

        showName = new JTextField(name);
        showValueOfDice = new JTextField(dice);
        showFound = new JTextField(found);

        setSize(900, 700);

        npanel.setLayout(new GridLayout(4, 1));
        npanel.add(showName);
        npanel.add(showValueOfDice);
        npanel.add(showFound);

        allPanel = new JLayeredPane();
        allPanel.setLayout(new SpringLayout());

        JPanel bgPanel = new JPanel();
        bgPanel.setLayout(new BorderLayout());
        spanel.add(button);
        button.addMouseListener(this);

        //bgPanel.add(npanel, BorderLayout.EAST);
        bgPanel.add(bg.NewPane(), BorderLayout.CENTER);
        bgPanel.add(spanel, BorderLayout.EAST);

        allPanel.add(bgPanel, new Integer(1));
        allPanel.setBackground(Color.RED);
        add(allPanel);

        setBackground(Color.red);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        //set value for command line
        this.position = new String[50];
        int index = 0;
        while (index < this.position.length) {
            this.position[index] = "     ";
            index++;
        }
    }
    String position[];

    public void printBoard(String getBoard) {
        System.out.print(getBoard);


    }

    public String getBoard(String board[]) {
        return "---------------------------------------------------------------------------------\n"
                + "| " + board[40] + " | " + board[41] + " | " + board[42] + " | " + board[43] + " | " + board[44] + " | " + board[45] + " | " + board[46] + " | " + board[47] + " | " + board[48] + " | " + board[49] + " |\n"
                + "|" + "       " + "------------------------------------------------------------------------|\n"
                + "| " + board[39] + " | " + board[38] + " | " + board[37] + " | " + board[36] + " | " + board[35] + " | " + board[34] + " | " + board[33] + " | " + board[32] + " | " + board[31] + " | " + board[30] + " |\n"
                + "|------------------------------------------------------------------------" + "       " + "|\n"
                + "| " + board[20] + " | " + board[21] + " | " + board[22] + " | " + board[23] + " | " + board[24] + " | " + board[25] + " | " + board[26] + " | " + board[27] + " | " + board[28] + " | " + board[29] + " |\n"
                + "|" + "       " + "------------------------------------------------------------------------|\n"
                + "| " + board[19] + " | " + board[18] + " | " + board[17] + " | " + board[16] + " | " + board[15] + " | " + board[14] + " | " + board[13] + " | " + board[12] + " | " + board[11] + " | " + board[10] + " |\n"
                + "|------------------------------------------------------------------------" + "       " + "|\n"
                + "| " + board[0] + " | " + board[1] + " | " + board[2] + " | " + board[3] + " | " + board[4] + " | " + board[5] + " | " + board[6] + " | " + board[7] + " | " + board[8] + " | " + board[9] + " |\n"
                + "---------------------------------------------------------------------------------\n";
    }

    public void markOnBoard(int initialMark, String characterName) {
        System.out.println(characterName);
        //this for command line
        if (characterName.charAt(0)=='A') {
           position[initialMark] = "A" + position[initialMark].substring(1, 5);
        }  if (characterName.charAt(1)=='B') {
            position[initialMark] = position[initialMark].charAt(0) + "B" + position[initialMark].substring(2, 5);
        }  if (characterName.charAt(2)=='C') {
            position[initialMark] = position[initialMark].substring(0, 2) + "C" + position[initialMark].substring(3, 5);
        } 
        //Mark on GUI
        int indexA = findIndexOfChar("A");
        int indexB = findIndexOfChar("B");
        int indexC = findIndexOfChar("C");
        String firstA = indexPic[indexA].substring(0, 2);
        String lastA = indexPic[indexA].substring(2, 4);
        int xA = Integer.parseInt(firstA)*POINT_CHARACTER_X;
        int yA = Integer.parseInt(lastA)*POINT_CHARACTER_Y;
        String firstB = indexPic[indexB].substring(0, 2);
        String lastB = indexPic[indexB].substring(2, 4);
        int xB = Integer.parseInt(firstB)*POINT_CHARACTER_X;
        int yB = Integer.parseInt(lastB)*POINT_CHARACTER_Y;
        String firstC = indexPic[indexC].substring(0, 2);
        String lastC = indexPic[indexC].substring(2, 4);
        int xC = Integer.parseInt(firstC)*POINT_CHARACTER_X;
        int yC = Integer.parseInt(lastC)*POINT_CHARACTER_Y;
        //clear screen of character
        allPanel.add(bg.NewPane("", 0, 0,true), new Integer(layercount++));
        javax.swing.SwingUtilities.updateComponentTreeUI(this);
        if ((indexB==indexC)&&(indexB==indexA)){
            allPanel.add(bg.NewPane("CH123.png", xA, yA,false), new Integer(layercount++));
            javax.swing.SwingUtilities.updateComponentTreeUI(this);
        }
        else if (indexB==indexC){
            if (indexB != 0){
                allPanel.add(bg.NewPane("CH23.png", xB, yB,false), new Integer(layercount++));
            }
            allPanel.add(bg.NewPane("CH1.png", xA, yA,false), new Integer(layercount++));
            javax.swing.SwingUtilities.updateComponentTreeUI(this);
        }
        else if (indexA==indexC){
            if (indexA != 0){
                allPanel.add(bg.NewPane("CH13.png", xA, yA,false), new Integer(layercount++));
            }
            allPanel.add(bg.NewPane("CH2.png", xB, yB,false), new Integer(layercount++));
            javax.swing.SwingUtilities.updateComponentTreeUI(this);
        }
        else if (indexA==indexB){
            if (indexB != 0){
                allPanel.add(bg.NewPane("CH12.png", xA, yA,false), new Integer(layercount++));
            }
            allPanel.add(bg.NewPane("CH3.png", xC, yC,false), new Integer(layercount++));
            javax.swing.SwingUtilities.updateComponentTreeUI(this);
        }
        else{
            if(indexA != 0){
                allPanel.add(bg.NewPane("CH1.png", xA, yA,false), new Integer(layercount++));
            }
            if(indexB != 0){
                allPanel.add(bg.NewPane("CH2.png", xB, yB,false), new Integer(layercount++));
            }
            if(indexC != 0){
                allPanel.add(bg.NewPane("CH3.png", xC, yC,false), new Integer(layercount++));
            }
            javax.swing.SwingUtilities.updateComponentTreeUI(this);
        }
    }
    public String getValueOnBoard(int index){
        return position[index];
    }
    public int findIndexOfChar(String character){
        for (int i = 0;i<50;i++){
            if((position[i].charAt(0)==character.charAt(0))||(position[i].charAt(1)==character.charAt(0))||(position[i].charAt(2)==character.charAt(0))){
                return i;
            }
        }       
        return 0;
    }
    public void deleteOnBoard(int initialMark, String characterName) {
       //this for command line
        if (characterName.equals("A")) {
           position[initialMark] = " " + position[initialMark].substring(1, 5);
        } else if (characterName.equals("B")) {
            position[initialMark] = position[initialMark].charAt(0) + " " + position[initialMark].substring(2, 5);
        } else if (characterName.equals("C")) {
            position[initialMark] = position[initialMark].substring(0, 2) + " " + position[initialMark].substring(3, 5);
        }
        //clear screen of character
        allPanel.add(bg.NewPane("", 0, 0,true), new Integer(layercount++));
        javax.swing.SwingUtilities.updateComponentTreeUI(this); 
        
        int indexA,indexB,indexC;
        
        if(characterName.equals("A")){
            indexB = findIndexOfChar("B");
            indexC = findIndexOfChar("C");
            if (indexB==indexC){
                markOnBoard(indexB," BC  ") ;
                javax.swing.SwingUtilities.updateComponentTreeUI(this); 
            }
            else{
                markOnBoard(indexB," B   ") ;
                javax.swing.SwingUtilities.updateComponentTreeUI(this); 
                markOnBoard(indexC,"  C  ") ;
                javax.swing.SwingUtilities.updateComponentTreeUI(this); 
            }
        }
        else if(characterName.equals("B")){
            indexA = findIndexOfChar("A");
            indexC = findIndexOfChar("C");
            if (indexA==indexC){
                markOnBoard(indexA,"A C  ") ;
                javax.swing.SwingUtilities.updateComponentTreeUI(this); 
            }
            else{
                markOnBoard(indexA,"A    ") ;
                javax.swing.SwingUtilities.updateComponentTreeUI(this); 
                markOnBoard(indexC,"  C  ") ;
                javax.swing.SwingUtilities.updateComponentTreeUI(this); 
            }
        }
        else if(characterName.equals("C")){
            indexA = findIndexOfChar("A");
            indexB = findIndexOfChar("B");
            if (indexA==indexB){
                markOnBoard(indexA,"AB   ") ;
                javax.swing.SwingUtilities.updateComponentTreeUI(this); 
            }
            else{
                markOnBoard(indexA,"A    ") ;
                javax.swing.SwingUtilities.updateComponentTreeUI(this); 
                markOnBoard(indexB," B   ") ;
                javax.swing.SwingUtilities.updateComponentTreeUI(this); 
            }
        }    
     }
//    public void test() throws InterruptedException{
//            markOnBoard(1, "A    ");
//            Thread.sleep(2000);
//            javax.swing.SwingUtilities.updateComponentTreeUI(this);
//            markOnBoard(1, " BC  ");
//            Thread.sleep(2000);
//            javax.swing.SwingUtilities.updateComponentTreeUI(this);
//            deleteOnBoard(1, "A");
//            javax.swing.SwingUtilities.updateComponentTreeUI(this);
//            markOnBoard(1, " B   ");
//            Thread.sleep(2000);
//            deleteOnBoard(1, "A");
//            javax.swing.SwingUtilities.updateComponentTreeUI(this);
//    }
    int point;
    public int getPoint(){
        return this.point;
    }
    public void setPoint(int x){
         this.point = x;
    }
    @Override
    public void mouseClicked(MouseEvent e) {      
        point = 1;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
