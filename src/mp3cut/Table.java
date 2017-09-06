package mp3cut;

import javax.swing.*;
import java.awt.*;


/**
 * Created by Асус on 07.08.2017.
 */
public class Table extends JFrame {
   private JLabel[]label  = new JLabel[RealGame.getPlayersList().size()];
    private JPanel panel = new JPanel();
    private JLabel points = new JLabel("Total points: ");

    public Table(){

setLayout(new BorderLayout());

        panel.setLayout(new GridLayout(RealGame.getPlayersList().size(),1));

for(int i = 0;i<RealGame.getPlayersList().size();i++){
            label[i] = new JLabel("The Points of the "+RealGame.getPlayersList().get(i).getName()+" "+ RealGame.getPlayersList().get(i).getPoints());

        }
        makeFont();
add(points,BorderLayout.NORTH);
        add(panel,BorderLayout.CENTER);


    }
    private void makeFont() {

        for(int i = 0;i<RealGame.getPlayersList().size();i++){
            label[i].setFont(new Font("Arial", Font.BOLD, 20));
            panel.add(label[i]);
        }
points.setFont(new Font("Arial", Font.BOLD, 20));

    }


}
