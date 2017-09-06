package mp3cut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TheGame extends JFrame{
    private JButton startTheGame = new JButton("<html> <font size = 20> Start a game</font></html>");


public TheGame(String s){
super(s);
setLayout(new BorderLayout());
add(startTheGame,BorderLayout.CENTER);
startTheGame.addActionListener((ActionEvent e)->{
            RealGame r = new RealGame();
        r.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        r.setSize(600,600);
        r.setLocationRelativeTo(null);
        r.setResizable(false);
        r.setVisible(true);
        Cards c = new Cards();
        c.fillWithCards();
    }
);

}



}
