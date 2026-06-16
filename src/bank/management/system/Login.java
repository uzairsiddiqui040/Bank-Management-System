package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField textField;
    JPasswordField passwordField;
    JButton button1,button2,button3;
    Login() {
        super("Bank Management System");

//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
//        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(350, 10, 100, 100);
//        add(image);
//
//        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
//        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        ImageIcon ii3 = new ImageIcon(ii2);
//        JLabel iimage = new JLabel(ii3);
//        iimage.setBounds(630, 350, 100, 100);
//        add(iimage);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.white);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(230,100,450,40);
        add(label1);

        label2 = new JLabel("Card No: ");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setBounds(325,190,375,30);
        add(label2);

        textField = new JTextField(15);
        textField.setFont(new Font("Aria",Font.BOLD,14));
        textField.setBounds(475,190,230,38);
        add(textField);

        label3 = new JLabel("PIN: ");
        label3.setForeground(Color.white);
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setBounds(325,250,375,30);
        add(label3);

        passwordField = new JPasswordField(15);
        passwordField.setFont(new Font("Arial",Font.BOLD,14));
        passwordField.setBounds(475,250,230,30);
        add(passwordField);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.black);
        button1.setBounds(480,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.setBounds(600,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.white);
        button3.setBackground(Color.black);
        button3.setBounds(470,350,240,30);
        button3.addActionListener(this);
        add(button3);


        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank123.jpg"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 850, 480);
        add(iiimage);


        setLayout(null);
        setSize(850, 480);
        setLocation(200, 150);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource()==button1){
                Connect connect = new Connect();
                String cardNo = textField.getText();
                String pin = passwordField.getText();
                String query = "select * from login where cardNo = '"+cardNo+"' and pin = '"+pin+"'";
                ResultSet resultSet = connect.statement.executeQuery(query);
                if(resultSet.next()) {
                    new Main_Class(pin);
                    setVisible(false);

                }else {
                    JOptionPane.showMessageDialog(null,"Please Enter Correct CardNo and PIN");
                }

            }
            if(e.getSource()==button2){
                textField.setText("");
                passwordField.setText("");

            }
            if(e.getSource()==button3) {
                new Signup();
                setVisible(false);


            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main() {
        new Login();
    }
}