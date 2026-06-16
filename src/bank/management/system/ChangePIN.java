package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePIN extends JFrame implements ActionListener {
    String pin;
    JButton btn1,btn2;
    JPasswordField passwordField1,passwordField2;
    ChangePIN(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(2100,700,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1700,700);
        add(l3);

        JLabel label1 = new JLabel("CHANGE 4-Digit PIN");
        label1.setFont(new Font("System",Font.BOLD,22));
        label1.setForeground(Color.white);
        label1.setBounds(500,150,400,30);
        l3.add(label1);

        JLabel label2 = new JLabel("NEW PIN :");
        label2.setFont(new Font("System",Font.BOLD,14));
        label2.setForeground(Color.white);
        label2.setBounds(480,190,400,30);
        l3.add(label2);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(590,192,140,25);
        passwordField1.setBackground(new Color(65,125,128));
        passwordField1.setForeground(Color.white);
        passwordField1.addActionListener(this);
        l3.add(passwordField1);

        JLabel label3 = new JLabel("RE-ENTER PIN :");
        label3.setFont(new Font("System",Font.BOLD,14));
        label3.setForeground(Color.white);
        label3.setBounds(480,230,400,30);
        l3.add(label3);

        passwordField2 = new JPasswordField();
        passwordField2.setBounds(590,232,140,25);
        passwordField2.setBackground(new Color(65,125,128));
        passwordField2.setForeground(Color.white);
        passwordField2.addActionListener(this);
        l3.add(passwordField2);

        btn1 = new JButton("CONFIRM");
        btn1.setBounds(810,310,140,30);
        btn1.setBackground(new Color(65,125,128));
        btn1.setForeground(Color.white);
        btn1.addActionListener(this);
        l3.add(btn1);

        btn2 = new JButton("BACK");
        btn2.setBounds(810,350,140,30);
        btn2.setBackground(new Color(65,125,128));
        btn2.setForeground(Color.white);
        btn2.addActionListener(this);
        l3.add(btn2);


        setLayout(null);
        setExtendedState(MAXIMIZED_BOTH);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String pin1 = passwordField1.getText();
            String pin2 = passwordField2.getText();
            if(e.getSource()==btn1) {
                if (passwordField1.getText().equals("") || passwordField2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter both fields.");
                    return;
                }
                if (!pin1.equals(pin2)) {
                    JOptionPane.showMessageDialog(null, "Entered PIN doesn't Match.");
                    return;
                }
                if (pin1.length() != 4 && pin2.length() != 4 && pin1.equals(pin2)) {
                    JOptionPane.showMessageDialog(null,"InValid : PIN must be 4 digits.");
                    return;
                }

                    Connect connect = new Connect();
                    String query1 = "Update bank set pin = '" + pin1 + "' where pin = '" + pin + "'";
                    String query2 = "Update login set pin = '" + pin1 + "' where pin = '" + pin + "'";
                    String query3 = "Update signUpthree set pin = '" + pin1 + "' where pin = '" + pin + "'";

                    connect.statement.executeUpdate(query1);
                    connect.statement.executeUpdate(query2);
                    connect.statement.executeUpdate(query3);

                    JOptionPane.showMessageDialog(null, "PIN Changed Successfully.");
                    new Main_Class(pin);
                    setVisible(false);

            }
            if(e.getSource()==btn2){
                new Main_Class(pin);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new ChangePIN("");
    }
}
