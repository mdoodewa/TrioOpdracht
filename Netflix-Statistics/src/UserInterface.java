import java.awt.Container;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeListener;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Netflix Statistix");
        frame.setPreferredSize(new Dimension(1000, 900));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//making the close button work
        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container){
        JTabbedPane tabbedPane = new JTabbedPane();

        JComponent overzicht1 = makeAccountPanel();
        tabbedPane.addTab("Accounts", overzicht1);
        //tabbedPane.setComponentAt(0, overzicht1);

        JComponent overzicht2 = makePanel("overzicht2");
        tabbedPane.addTab("Overzicht 2", overzicht2);

        JComponent overzicht3 = makePanel("overzicht3");
        tabbedPane.addTab("Overzicht 3", overzicht3);

        JComponent overzicht4 = makePanel("overzicht4");
        tabbedPane.addTab("Overzicht 4", overzicht4);

        container.add(tabbedPane);
        container.add(new Footer(), BorderLayout.SOUTH);
    }

    private JComponent makeAccountPanel(){
        JPanel accountPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        JPanel leftMenu = new JPanel();
        leftMenu.setLayout(new BoxLayout(leftMenu, BoxLayout.Y_AXIS));

        ActionListener l = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AccountInputUI inputFrame = new AccountInputUI();
                inputFrame.run();
            }
        };

        JButton createButton = new JButton();
        createButton.setText("Create account");
        createButton.addActionListener(l);

        JButton listButton = new JButton();
        listButton.setText("List accounts");

        leftMenu.add(createButton);
        leftMenu.add(listButton);
        accountPanel.add(leftMenu);
        return accountPanel;
    }

   private JComponent makePanel(String t){
        JPanel p = new JPanel();
        JLabel l = new JLabel();
        l.setText(t);
        p.add(l);
        return p;
    }
}
