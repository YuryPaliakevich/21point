package mp3cut;

import javax.swing.*;


public class Main {

    public static void main(String[] args) {
	TheGame game  = new TheGame("21point");

	game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        game.setSize(600,600);
        game.setLocationRelativeTo(null);
game.setVisible(true);

    }
}
