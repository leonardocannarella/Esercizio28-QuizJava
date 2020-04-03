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
    JLabel titolo;
    JTextField nome;
    JButton conferma;

    public MyPanel()
    {
        q1 = new Quiz();
        titolo = new JLabel("BENVENUTO! Prima di cominciare, inserisci il tuo nome");
        nome = new JTextField();
        conferma = new JButton("Conferma");

        setLayout(new GridLayout(3,1));
        add(titolo);
        add(nome);
        add(conferma);

        conferma.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(!nome.getText().equals(""))
        {
            q1.setNome(nome.getText());
            JOptionPane.showMessageDialog(this, "Benvenuto " + nome.getText()+"!");
            MyFrame1 f = new MyFrame("Partita");
            Container c = f.getContentPane();
            MyPanel1 p = new MyPanel1(this, q1);
            this.setVisible(false);
            f.setVisible(true);
        }
    }
}
