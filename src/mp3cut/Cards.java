package mp3cut;


import javax.imageio.ImageIO;
import javax.swing.*;
import javax.xml.bind.SchemaOutputResolver;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Асус on 04.08.2017.
 */
public class Cards {
    private File file = new File("src\\Images");
String[] s = file.list();
  private static ArrayList<String> cards = new ArrayList<>();
    public void fillWithCards(){

    for(int i = 0; i < s.length ; i++){
    cards.add(s[i]);
    }


}


    public int getPointsFromCard(int k) {

    String s = cards.get(k-1);
        switch (s){
            case"6_buben.jpg":
            case"6_of_spades.svg.png":
            case"i (1).jpg":
            case"i.jpg":return 6;
            case"7_of_diamonds.svg.png":
            case"i (9).jpg":
            case"i (13).jpg":
            case"Playing_card_spade_7.svg_.png":return 7;
            case"8_of_hearts.svg.png":
            case"882061952.png":
            case"i (4).jpg":
            case"i (14).jpg":return 8;
            case"d095701s-960.jpg":
            case"i (2).jpg":
            case"i (5).jpg":
            case"RcARe5Bai.png":return 9;
            case"2000px-Playing_card_spade_10.svg.png":
            case"desyatka-buben.png":
            case"711196.png":
            case"i (15).jpg":return 10;
            case"i (3).jpg":
            case"i (6).jpg":
            case"i (10).jpg":
            case"i (16).jpg":return 2;
            case"i (7).jpg":
            case"i (11).jpg":
            case"i (17).jpg":
            case"kcp028sQ.jpg":return 3;
            case"i (8).jpg":
            case"i (12).jpg":
            case"i (18).jpg":
            case"mnZzVgremKs.jpg":return 4;
            case"9czodReyi.png":
            case"Ace_of_diamonds.svg.png":
            case"dirxKepkT.png":
            case"vinilos-poker-treboles.jpg":
               if (JOptionPane.showConfirmDialog(null,"Here's an Ace. If you want 1, click yes. If you want 11, click no","Question",JOptionPane.YES_NO_OPTION)==0)
               {
return 1;
               }
               else return 11;



        }

return 0;
}


    public BufferedImage getMyCard(int k) throws IOException {
return ImageIO.read(new File("src\\Images\\"+cards.get(k-1)));

   }
}
