package bank.management.system;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    JTextField textField;
    JButton btn1,btn2;
    Deposit(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(2100,700,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1700,700);
        add(l3);

        JLabel label1 = new JLabel("Enter Amount you want to Deposit");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setForeground(Color.white);
        label1.setBounds(500,150,400,30);
        l3.add(label1);

        textField = new JTextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        textField.setBounds(500,190,270,25);
        textField.setFont(new Font("System",Font.BOLD,16));
        l3.add(textField);

        btn1 = new JButton("Deposit");
        btn1.setBounds(810,310,130,30);
        btn1.setBackground(new Color(65,125,128));
        btn1.setForeground(Color.white);
        btn1.addActionListener(this);
        l3.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(810,350,130,30);
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
        String amount = textField.getText();
        Date date = new Date();
        if (e.getSource().equals(btn1)) {
            if(textField.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit.");
            }else {
                Connect connect = new Connect();
                String query = "insert into bank values ('"+pin+"','"+date+"','Deposit','"+amount+"')";
                connect.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs. "+amount+" deposited successfully");
                new Main_Class(pin);
                setVisible(false);

            }

        }else if(e.getSource().equals(btn2)){
            new Main_Class(pin);
            setVisible(false);
        }


        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
