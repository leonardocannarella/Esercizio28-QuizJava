import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel //implements ActionListener
{
    //TODO Scrivi i componenti per i pannelli
    Quiz q1 = new Quiz();

    /* public MyPanel()     //TODO Scrivi e compila il costruttore
    {

    } */

    public void actionPerformed(ActionEvent e)
    {
        Object pulsantePremuto = e.getSource();
    }
}
