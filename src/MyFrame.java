/*
 *  FRAME PER INSERIRE INSERIRE IL NOME
 */

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame
{
    public MyFrame(String titolo)
    {
        super(titolo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(50,50,500,602);
    }
}
