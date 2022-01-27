package com.company;

import com.company.personagens.escudo.Escudos;
import com.company.personagens.escudo.escudos.Escudo25;
import com.company.personagens.escudo.escudos.Escudo50;
import com.company.personagens.inimigo.Inimigo;
import com.company.personagens.inimigo.Inimigo1;
import com.company.personagens.inimigo.Inimigo2;
import com.company.personagens.inimigo.Inimigo3;
import com.company.personagens.personagens.Personagem;
import com.company.personagens.personagens.Personagem1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class View extends JPanel {
    private Personagem p;
    private Inimigo i1;
    private Inimigo i2;
    private Inimigo i3;

    public View() {
        KeyListener listener = new MyKeyListener();
        this.addKeyListener(listener);
        this.setFocusable(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.BLACK);
        g2d.fillOval(p.getX(), p.getY(), 20, 20);

        g2d.setColor(Color.GREEN);
        g2d.fillOval(i1.getX(), i1.getY(), 20, 20);

        g2d.setColor(Color.RED);
        g2d.fillOval(i2.getX(), i2.getY(), 20, 20);

        g2d.setColor(Color.BLUE);
        g2d.fillOval(i3.getX(), i3.getY(), 20, 20);


        g2d.drawString(Integer.toString(p.getLife()), 10, 10);
        g2d.drawString(Integer.toString(p.getLista().size()), 250, 10);

    }

    public void jogar(View game) throws InterruptedException {
        int x = 1024;
        int y = 768;
        JFrame frame = new JFrame("Kindon");


        JLabel label = new JLabel();

        label.setBounds(0, 0, x, y);

        game.setLayout(null);
        game.add(label);

        frame.add(game);
        frame.setSize(x, y);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        p = new Personagem1("Kratos",512, 384);
        i1 = new Inimigo1("dudu", 10, 450);
        i2 = new Inimigo2("tata", 400, 20);
        i3 = new Inimigo3("vava", 50, 50);
        p.addObserver(i1);
        p.addObserver(i2);
        p.addObserver(i3);

        Escudos escudo50 = new Escudo50();
        Escudos escudo25 = new Escudo25();
        escudo50.setSucessor(escudo25);
        escudo25.setSucessor(null);

        p.setEscudo(escudo50);
;
        System.out.println(p.getEscudo());
        while (true) {
            p.notifyObservers();
            game.repaint();
            Thread.sleep(50);
        }
    }


    public class MyKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {

            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT -> p.setX(p.getX() - p.correr());
                case KeyEvent.VK_RIGHT -> p.setX(p.getX() + p.correr());
                case KeyEvent.VK_UP -> p.setY(p.getY() - p.correr());
                case KeyEvent.VK_DOWN -> p.setY(p.getY() + p.correr());
                case KeyEvent.VK_SPACE -> p.notifyObserversAtaque();
            }
        }

        @Override
        public void keyReleased(KeyEvent keyEvent) {

        }


    }
}
