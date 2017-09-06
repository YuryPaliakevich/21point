package mp3cut;


import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.File;
/**
 * Created by Асус on 07.08.2017.
 */
public class Firework extends JFrame{
   private Icon img = new ImageIcon("src\\Images\\0_132455_48995aec_orig.gif");
private JLabel label = new JLabel(img);
    public Firework() throws IOException {
      setLayout(new BorderLayout());


add(label, BorderLayout.CENTER);


    }





}
