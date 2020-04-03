import java.awt.*;
import javax.swing.*;

public class Test
{
    public static void main(String[] args) {
        MyFrame f = new MyFrame("Quiz");
        Container c = f.getContentPane();
        MyPanel p = new MyPanel();
        c.add(p);

        f.setVisible(true);
    }
}
