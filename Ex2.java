package lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Ex2 extends JPanel implements ActionListener {
    private static final int BALL_SIZE = 30;
    private int x = 200;
    private int y = 200;
    private int xSpeed = 2;
    private int ySpeed = 3;
    private Timer timer;
    private Random random = new Random();

    public Ex2() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.WHITE);
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, BALL_SIZE, BALL_SIZE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += xSpeed;
        y += ySpeed;

        if (x <= 0 || x >= getWidth() - BALL_SIZE) {
            xSpeed = -xSpeed;
            randomizeSpeed();
        }
        if (y <= 0 || y >= getHeight() - BALL_SIZE) {
            ySpeed = -ySpeed;
            randomizeSpeed();
        }

        repaint();
    }

    private void randomizeSpeed() {
        xSpeed = (random.nextInt(5) + 1) * (xSpeed < 0 ? -1 : 1);
        ySpeed = (random.nextInt(5) + 1) * (ySpeed < 0 ? -1 : 1);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        Ex2 ballPanel = new Ex2();
        frame.add(ballPanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
