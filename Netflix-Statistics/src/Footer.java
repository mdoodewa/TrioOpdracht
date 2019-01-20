import javax.swing.*;
import java.awt.*;

public class Footer extends JPanel{
    public Footer(){
        super(new GridLayout(1,2));
        createComponents();
    }

    private void createComponents() {
        add(new JTextField("Netflix Statistix"));
        add(new JTextField("Informatica, Jaar 1, 23IVT1A1, Martijn Doodewaard, Pawel Trajdos, Stan Begthel"));
    }
}
