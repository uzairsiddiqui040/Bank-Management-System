package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.SystemFlavorMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Class extends JFrame implements ActionListener {
    String pin;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7;

    Main_Class(String pin ){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(2100,700,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1700,700);
        add(l3);

        JLabel label1 = new JLabel("Please Select Your Transaction");
        label1.setFont(new Font("System",Font.BOLD,22));
        label1.setForeground(Color.white);
        label1.setBounds(480,150,400,30);
        l3.add(label1);

        btn1 = new JButton("DEPOSIT");
        btn1.setBounds(355,230,138,30);
        btn1.setBackground(new Color(65,125,128));
        btn1.setForeground(Color.white);
        btn1.addActionListener(this);
        l3.add(btn1);

        btn2 = new JButton("FAST CASH");
        btn2.setBounds(355,270,138,30);
        btn2.setBackground(new Color(65,125,128));
        btn2.setForeground(Color.white);
        btn2.addActionListener(this);
        l3.add(btn2);

        btn3 = new JButton("PIN CHANGE");
        btn3.setBounds(355,310,138,30);
        btn3.setBackground(new Color(65,125,128));
        btn3.setForeground(Color.white);
        btn3.addActionListener(this);
        l3.add(btn3);

        btn4 = new JButton("CASH WITHDRAW");
        btn4.setBounds(810,230,138,30);
        btn4.setBackground(new Color(65,125,128));
        btn4.setForeground(Color.white);
        btn4.addActionListener(this);
        l3.add(btn4);

        btn5 = new JButton("MINI STATEMENT");
        btn5.setBounds(810,270,138,30);
        btn5.setBackground(new Color(65,125,128));
        btn5.setForeground(Color.white);
        btn5.addActionListener(this);
        l3.add(btn5);

        btn6 = new JButton("BALANCE INQUIRY");
        btn6.setBounds(810,310,138,30);
        btn6.setBackground(new Color(65,125,128));
        btn6.setForeground(Color.white);
        btn6.addActionListener(this);
        l3.add(btn6);

        btn7 = new JButton("EXIT");
        btn7.setBounds(810,350,138,30);
        btn7.setBackground(new Color(65,125,128));
        btn7.setForeground(Color.white);
        btn7.addActionListener(this);
        l3.add(btn7);


        setLayout(null);
        setExtendedState(MAXIMIZED_BOTH);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            new Deposit(pin);
            setVisible(false);
        }
        if(e.getSource()==btn2){
            new FastCash(pin);
            setVisible(false);
        }
        if(e.getSource()==btn3){
            new ChangePIN(pin);
            setVisible(false);
        }
        if(e.getSource()==btn4){
            new WithDraw(pin);
            setVisible(false);
        }
        if(e.getSource()==btn5){
            new MiniStatement(pin);
        }
        if(e.getSource()==btn6){
            new BalanceInquiry(pin);
            setVisible(false);
        }
        if(e.getSource()==btn7){
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new Main_Class("");

    }
}
