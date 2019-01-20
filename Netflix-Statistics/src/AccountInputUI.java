import java.awt.Container;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;

public class AccountInputUI implements ActionListener{
    JTextField tf1, tf2, tf3, tf4, tf5, tf6;
    JButton buttonConfirm,buttonCancel;
    JFrame f;
    public void run(){
        f = new JFrame();
        f = new JFrame("Accountgegevens");
        f.setPreferredSize(new Dimension(800, 600));

        tf1 = new JTextField();
        tf1.setBounds(50,50,150,20);
        tf2 = new JTextField();
        tf2.setBounds(50,100,150,20);
        tf3 = new JTextField();
        tf3.setBounds(50,150,150,20);
        tf4 = new JTextField();
        tf4.setBounds(50,200,150,20);
        tf5 = new JTextField();
        tf5.setBounds(50,250,150,20);
        tf6 = new JTextField();
        tf6.setBounds(50,300,150,20);
        tf6.setEditable(false);
        buttonConfirm=new JButton("Ok");
        buttonConfirm.setBounds(50,350,50,50);
        buttonCancel=new JButton("Cancel");
        buttonCancel.setBounds(120,350,50,50);
        buttonConfirm.addActionListener(this);
        buttonCancel.addActionListener(this);
        f.add(tf1);f.add(tf2);f.add(tf3); f.add(tf4); f.add(tf5); f.add(tf6); f.add(buttonConfirm);f.add(buttonCancel);
        f.setSize(300,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        //Add the other input fields
        String s1=tf1.getText();
        String s2=tf2.getText();
        String s3=tf3.getText();
        String s4=tf4.getText();
        String s5=tf5.getText();

        //Make this more dynamic
        Address address = new Address(s1, s2, s3, s4, s5);


        Account newAccount = Account.createAccount(s1, address);

        if(e.getSource()==buttonConfirm){
            String result="Account created with id: " + newAccount.getId();
            tf3.setText(result);
        }else if(e.getSource()==buttonCancel) {
            f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
        }
    }
}
