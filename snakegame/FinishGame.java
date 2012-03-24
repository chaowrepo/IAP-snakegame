/**
 * @author Chaowarat Tangrueng
 * @since 17/08/2011
 * @note NetBeans 7.0.1
 * @note Windows 7 Professional x64
 * @Contract: finish(String,int) => boolean
 */

package snakegame;

public class FinishGame {
    public boolean finish(String name,int position){
        if (position == 49){
            System.out.println(name + " Win...");
            return true;
        }
        else{
            return false;
        }
    }
    
}
