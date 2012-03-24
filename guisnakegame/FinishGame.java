/**
 * @author gulico_pocky Wara Wangtrakoon
 */

package guisnakegame;

import javax.swing.JOptionPane;

public class FinishGame{
    public boolean finish(String name,int position){
        if (position == 49){
            JOptionPane.showMessageDialog(null,name + " Win...");
            return true;
        }
        else{
            return false;
        }
    }
    
}
