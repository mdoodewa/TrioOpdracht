package GUI;

import Database.SqlConnection;

import javax.swing.*;
import java.awt.*;


public class UserInterface implements Runnable {
    private JFrame frame;

    public UserInterface() {
    }

    @Override
    public void run() {
        frame = new JFrame("Netflix Statistix");
        frame.setPreferredSize(new Dimension(1000, 900));//set the window size

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//making the close button work
        frame.setTitle("Netflix statistics");
        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.add(new accountPanel());
        container.add(new viewPanel(), BorderLayout.NORTH);
        container.add(new footerPanel(), BorderLayout.SOUTH);

    }

    public JFrame getFrame() {
        return frame;
    }
}