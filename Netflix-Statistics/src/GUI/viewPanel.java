package GUI;

import javax.swing.*;
import java.awt.*;

public class viewPanel extends JPanel {

    public viewPanel(){
        super(new FlowLayout(FlowLayout.LEFT));
                createComponents();
                setBackground(Color.red);
    }

    private void createComponents(){
        JButton Overzicht1 = new JButton("Overzicht1");
        Overzicht1.setPreferredSize(new Dimension(100,40));
        JButton Overzicht2 = new JButton("Overzicht2");
        Overzicht2.setPreferredSize(new Dimension(100,40));
        JButton Overzicht3 = new JButton("Overzicht3");
        Overzicht3.setPreferredSize(new Dimension(100,40));
        JButton Overzicht4 = new JButton("Overzicht4");
        Overzicht4.setPreferredSize(new Dimension(100,40));
        add(Overzicht1);
        add(Overzicht2);
        add(Overzicht3);
        add(Overzicht4);
    }
}
