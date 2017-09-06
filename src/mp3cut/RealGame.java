package mp3cut;


import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Асус on 01.08.2017.
 */
public class RealGame extends JFrame {
    private int pointsForGame = 0;
    private static ArrayList<OtherPlayers> playersList = new ArrayList<>();
    boolean bp = true;
    private JLabel points = new JLabel("Your points : 0");
    private JButton takeCard = new JButton("Take a card");

    public static ArrayList<OtherPlayers> getPlayersList() {
        return playersList;
    }


    private JButton newGame = new JButton("Start a new Game");
    private JButton end = new JButton("End a game");
    private JPanel panelForCards = new JPanel();
private JButton newTurn = new JButton("New turn");
private int count = 0;
private Graphics g = getGraphics();



    public RealGame() {
        super("Playing");
        setLayout(new GridLayout(0, 2));
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        panel.setLayout(new GridLayout(4, 0));
        makeFont();
        panel.add(takeCard);
        panel.add(newGame);
        panel.add(newTurn);
        panel.add(end);

        add(panel);
        panel1.setLayout(new BorderLayout());
        panel1.add(points, BorderLayout.SOUTH);
        add(panel1);
        panelForCards.setLayout(new GridLayout(0, 2));
        panel1.add(panelForCards, BorderLayout.CENTER);
        takeCard.addActionListener(new Listener());
        newGame.addActionListener(new Listener());
        end.addActionListener(new Listener());
newTurn.addActionListener(new Listener());
    }

    private void makeFont() {
        takeCard.setFont(new Font("Arial", Font.BOLD, 20));
        newGame.setFont(new Font("Arial", Font.BOLD, 20));
        end.setFont(new Font("Arial", Font.BOLD, 20));
        points.setFont(new Font("Arial", Font.BOLD, 20));
        newTurn.setFont(new Font("Arial", Font.BOLD, 20));
    }

    private class Listener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == newGame) {
                while (!playersList.isEmpty()){
                    int i = 0;
                    playersList.remove(i);
                }
count = 1;
                playersList.add(count-1,new OtherPlayers());

playersList.get(count-1).setName(JOptionPane.showInputDialog(null,"Enter your name "));

                bp = false;

            twoCards();
                points.setText("Your points : " + pointsForGame);

            }

            if (e.getSource() == takeCard) {
                if (bp)
                    JOptionPane.showMessageDialog(null, "You aren't able to take a card");
                else {
                    if (pointsForGame == 21)
                        JOptionPane.showMessageDialog(null, "So stupid..");
int k = gettingCard();

                        Graphics g = getGraphics();
                        g.fillRect(300,0,300,600);
                        Image img = Processing.getImage(k);
                        g.drawImage(img, 300, 300, 150, 200, null);
                    pointsForGame+=Processing.getPoints(k);
playersList.get(count-1).setPoints(pointsForGame);
                        points.setText("Your points : " + pointsForGame);
                        if (pointsForGame == 21) {


                            JOptionPane.showMessageDialog(null, "Congratulations!! 21 points!");
                            try {
                                Firework firework = new Firework();
                                firework.setSize(400,400);
                                firework.setLocationRelativeTo(null);
                                firework.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                                firework.setResizable(false);
                                firework.setVisible(true);
                            } catch (IOException e1) {
                                JOptionPane.showMessageDialog(null,"No such File");
                            }
                        }    if (pointsForGame > 21)
                                JOptionPane.showMessageDialog(null, "Oh..man...sad news for you..");

                            }

                    }

                if (e.getSource() == end) {
                    Processing.setTempList();
                    pointsForGame = 0;
                    points.setText("Your points : " + pointsForGame);
                    bp = true;
                    repaint();

                  Table table = new Table();
                    table.setSize(500,500);
                    table.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    table.setLocationRelativeTo(null);
                    table.setVisible(true);
                    while (!playersList.isEmpty()){
                        int i = 0;
                        playersList.remove(i);
                    }
                }
                if(e.getSource()==newTurn){
                if(!bp) {
                  count++;

                    playersList.add(count - 1, new OtherPlayers());
                    repaint();
                    points.setText("Your points : 0");
                    playersList.get(count-1).setName(JOptionPane.showInputDialog(null,"Enter your name "));
                    twoCards();
                    points.setText("Your points : " + pointsForGame);

                }
                else JOptionPane.showMessageDialog(null, "Click 'Start a new game' ");
                }

            }
        }


        private int gettingCard() {
            boolean b = false;
            int rand = 0;
            while (!b) {
                rand = 1+(int) (Math.random() * 35 + 1);
                b = Processing.checking(rand);
            }
            return rand;
        }
private void twoCards() {
    Processing.setTempList();

    int counter = 300;
    pointsForGame = 0;
    Graphics g = getGraphics();
    g.fillRect(300, 0, 300, 600);
    for (int i = 0; i < 2; i++, counter += 150) {
        int k = gettingCard();

        Image img = Processing.getImage(k);
        g.drawImage(img, counter, 300, 150, 200, null);
        pointsForGame += Processing.getPoints(k);
    }

    playersList.get(count - 1).setPoints(pointsForGame);
    if (pointsForGame == 21) {


        JOptionPane.showMessageDialog(null, "Congratulations!! 21 points!");
        try {
            Firework firework = new Firework();
            firework.setSize(400, 400);
            firework.setLocationRelativeTo(null);
            firework.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            firework.setResizable(false);
            firework.setVisible(true);
        } catch (IOException e1) {
            JOptionPane.showMessageDialog(null, "No such File");
        }
    }
    if (pointsForGame > 21)
        JOptionPane.showMessageDialog(null, "There are more than 21 points.. You should start a new game");

}

    }


