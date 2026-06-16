package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceInquiry extends JFrame implements ActionListener {
    String pin;
    JButton btn1;
    JLabel label1,label2;
    BalanceInquiry(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(2100,700,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1700,700);
        add(l3);

        label1 = new JLabel("Your Current Balance is :");
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setForeground(Color.white);
        label1.setBounds(500,150,400,30);
        l3.add(label1);

        label2 = new JLabel();
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setForeground(Color.white);
        label2.setBounds(500,200,400,30);
        l3.add(label2);

        btn1 = new JButton("Back");
        btn1.setBounds(810,350,140,30);
        btn1.setBackground(new Color(65,125,128));
        btn1.setForeground(Color.white);
        btn1.addActionListener(this);
        l3.add(btn1);

        int balance = 0;
        try{
            Connect connect = new Connect();
            ResultSet resultSet = connect.statement.executeQuery("Select * from bank where pin ='"+pin+"'");
            while(resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }

            }
        }catch (Exception E){
            E.printStackTrace();
        }
        label2.setText("Rs. "+balance);

        setLayout(null);
        setExtendedState(MAXIMIZED_BOTH);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Main_Class(pin);
        setVisible(false);

    }

    public static void main(String[] args) {
        new BalanceInquiry("");
    }
}
