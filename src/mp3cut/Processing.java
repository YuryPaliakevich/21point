package mp3cut;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Асус on 03.08.2017.
 */
public class Processing {
   private static Cards c = new Cards();
public static ArrayList<Integer> list = new ArrayList<>();
public static void setTempList(){
    for(int i = 0;i<36;i++){
        list.add(i,i + 1);
    }
}
public static boolean checking(int i){
    if(list.get(i-1)!=-1){
     int counter = 0;
     for(int j = 0;j<36;j++){
         if(list.get(j)==-1)
             counter++;
     }
     if(counter==36) return true;
        list.set(i-1,-1);
        return true;
    }
    else return false;

}
   public static BufferedImage getImage(int k) {


       try {
           return c.getMyCard(k);
       } catch (IOException e) {
           e.printStackTrace();
       }

return null;
   }


    public static int getPoints(int k) {

return c.getPointsFromCard(k);

    }




}
