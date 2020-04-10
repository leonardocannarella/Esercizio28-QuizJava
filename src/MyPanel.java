/*
 *  PANNELLO PER INSERIRE IL PROPRIO NOME
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener
{
    Quiz q1;
    int pt = 0, contatore = 0;
    JLabel segnatoreDomande, testoDomanda, punteggio;
    JButton avvia, a, b, c, d;

    public MyPanel()
    {
        q1 = new Quiz();
        segnatoreDomande = new JLabel("QUIZ");
        segnatoreDomande.setHorizontalAlignment(JLabel.CENTER);
        segnatoreDomande.setFont(segnatoreDomande.getFont().deriveFont(25.0f));
        testoDomanda = new JLabel();
        testoDomanda.setFont(segnatoreDomande.getFont().deriveFont(17.0f));
        testoDomanda.setHorizontalAlignment(JLabel.CENTER);
        punteggio = new JLabel("Punteggio: 0");
        punteggio.setHorizontalAlignment(JLabel.CENTER);
        avvia = new JButton("Inizia gioco");
        a = new JButton();
        a.setEnabled(false);
        b = new JButton();
        b.setEnabled(false);
        c = new JButton();
        c.setEnabled(false);
        d = new JButton();
        d.setEnabled(false);

        setLayout(new GridLayout(8, 3));
        add(new JLabel());      add(segnatoreDomande);      add(new JLabel());
        add(new JLabel());      add(testoDomanda);          add(new JLabel());
        add(new JLabel());      add(a);                     add(new JLabel());
        add(new JLabel());      add(b);                     add(new JLabel());
        add(new JLabel());      add(c);                     add(new JLabel());
        add(new JLabel());      add(d);                     add(new JLabel());
        add(new JLabel());      add(new JLabel());          add(new JLabel());
        add(punteggio);         add(new JLabel());          add(avvia);

        avvia.addActionListener(this);
        a.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object pulsantePremuto = e.getSource();

        if(pulsantePremuto == avvia)
        {
            avvia.setEnabled(false);
            a.setEnabled(true);
            b.setEnabled(true);
            c.setEnabled(true);
            d.setEnabled(true);
            segnatoreDomande.setText("Domanda " + (contatore+1));
            testoDomanda.setText(q1.visualizzaDomanda(contatore));
            a.setText(q1.visualizzaA(contatore));
            b.setText(q1.visualizzaB(contatore));
            c.setText(q1.visualizzaC(contatore));
            d.setText(q1.visualizzaD(contatore));
        }

        if(pulsantePremuto == a)
        {
            if(q1.verificaCorretta(a.getText(), contatore))
            {
                pt++;
                punteggio.setText("Punteggio: " + pt);
                contatore++;
                JOptionPane.showMessageDialog(this, "La risposta è esatta!");
                if(contatore == 10)
                {
                    JOptionPane.showMessageDialog(this, "Gioco terminato. Grazie per aver giocato!");
                    System.exit(0);
                }
                segnatoreDomande.setText("Domanda " + (contatore+1));
                testoDomanda.setText(q1.visualizzaDomanda(contatore));
                a.setText(q1.visualizzaA(contatore));
                b.setText(q1.visualizzaB(contatore));
                c.setText(q1.visualizzaC(contatore));
                d.setText(q1.visualizzaD(contatore));
            }
            else
            {
                contatore++;
                JOptionPane.showMessageDialog(this, "La risposta è sbagliata!");
                if(contatore == 10)
                {
                    JOptionPane.showMessageDialog(this, "Gioco terminato. Grazie per aver giocato!");
                    System.exit(0);
                }
                segnatoreDomande.setText("Domanda " + (contatore+1));
                testoDomanda.setText(q1.visualizzaDomanda(contatore));
                a.setText(q1.visualizzaA(contatore));
                b.setText(q1.visualizzaB(contatore));
                c.setText(q1.visualizzaC(contatore));
                d.setText(q1.visualizzaD(contatore));
            }
        }

        if(pulsantePremuto == b)
        {
            if(q1.verificaCorretta(b.getText(), contatore))
            {
                pt++;
                punteggio.setText("Punteggio: " + pt);
                contatore++;
                JOptionPane.showMessageDialog(this, "La risposta è esatta!");
                if(contatore == 10)
                {
                    JOptionPane.showMessageDialog(this, "Gioco terminato. Grazie per aver giocato!");
                    System.exit(0);
                }
                segnatoreDomande.setText("Domanda " + (contatore+1));
                testoDomanda.setText(q1.visualizzaDomanda(contatore));
                a.setText(q1.visualizzaA(contatore));
                b.setText(q1.visualizzaB(contatore));
                c.setText(q1.visualizzaC(contatore));
                d.setText(q1.visualizzaD(contatore));
            }
            else
            {
                contatore++;
                JOptionPane.showMessageDialog(this, "La risposta è sbagliata!");
                if(contatore == 10)
                {
                    JOptionPane.showMessageDialog(this, "Gioco terminato. Grazie per aver giocato!");
                    System.exit(0);
                }
                segnatoreDomande.setText("Domanda " + (contatore+1));
                testoDomanda.setText(q1.visualizzaDomanda(contatore));
                a.setText(q1.visualizzaA(contatore));
                b.setText(q1.visualizzaB(contatore));
                c.setText(q1.visualizzaC(contatore));
                d.setText(q1.visualizzaD(contatore));
            }
        }

        if(pulsantePremuto == c)
        {
            if(q1.verificaCorretta(c.getText(), contatore))
            {
                pt++;
                punteggio.setText("Punteggio: " + pt);
                contatore++;
                JOptionPane.showMessageDialog(this, "La risposta è esatta!");
                if(contatore == 10)
                {
                    JOptionPane.showMessageDialog(this, "Gioco terminato. Grazie per aver giocato!");
                    System.exit(0);
                }
                segnatoreDomande.setText("Domanda " + (contatore+1));
                testoDomanda.setText(q1.visualizzaDomanda(contatore));
                a.setText(q1.visualizzaA(contatore));
                b.setText(q1.visualizzaB(contatore));
                c.setText(q1.visualizzaC(contatore));
                d.setText(q1.visualizzaD(contatore));
            }
            else
            {
                contatore++;
                JOptionPane.showMessageDialog(this, "La risposta è sbagliata!");
                if(contatore == 10)
                {
                    JOptionPane.showMessageDialog(this, "Gioco terminato. Grazie per aver giocato!");
                    System.exit(0);
                }
                segnatoreDomande.setText("Domanda " + (contatore+1));
                testoDomanda.setText(q1.visualizzaDomanda(contatore));
                a.setText(q1.visualizzaA(contatore));
                b.setText(q1.visualizzaB(contatore));
                c.setText(q1.visualizzaC(contatore));
                d.setText(q1.visualizzaD(contatore));
            }
        }

        if(pulsantePremuto == d)
        {
            if(q1.verificaCorretta(d.getText(), contatore))
            {
                pt++;
                punteggio.setText("Punteggio: " + pt);
                contatore++;
                JOptionPane.showMessageDialog(this, "La risposta è esatta!");
                if(contatore == 10)
                {
                    JOptionPane.showMessageDialog(this, "Gioco terminato. Grazie per aver giocato!");
                    System.exit(0);
                }
                segnatoreDomande.setText("Domanda " + (contatore+1));
                testoDomanda.setText(q1.visualizzaDomanda(contatore));
                a.setText(q1.visualizzaA(contatore));
                b.setText(q1.visualizzaB(contatore));
                c.setText(q1.visualizzaC(contatore));
                d.setText(q1.visualizzaD(contatore));
            }
            else
            {
                contatore++;
                JOptionPane.showMessageDialog(this, "La risposta è sbagliata!");
                if(contatore == 10)
                {
                    JOptionPane.showMessageDialog(this, "Gioco terminato. Grazie per aver giocato!");
                    System.exit(0);
                }
                segnatoreDomande.setText("Domanda " + (contatore+1));
                testoDomanda.setText(q1.visualizzaDomanda(contatore));
                a.setText(q1.visualizzaA(contatore));
                b.setText(q1.visualizzaB(contatore));
                c.setText(q1.visualizzaC(contatore));
                d.setText(q1.visualizzaD(contatore));
            }
        }

    }
}
