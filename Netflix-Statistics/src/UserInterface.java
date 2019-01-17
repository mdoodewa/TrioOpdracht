import javax.swing.*;
import java.awt.*;


public class UserInterface implements Runnable {
    private JFrame frame;

    public UserInterface() {
    }

    @Override
    public void run() {
        frame = new JFrame("Netflix Statistix");
        frame.setPreferredSize(new Dimension(1000, 1000));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        //container.add(new selectPanel());
        container.add(new viewPanel(), BorderLayout.NORTH);
        //container.add(new footerPanel(), BorderLayout.SOUTH);

    }

    public JFrame getFrame() {
        return frame;
    }
}