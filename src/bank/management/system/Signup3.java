package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    ButtonGroup buttonGroup;
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formNo;
    Signup3(String formNo){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25 , 10, 100, 100);
        add(image);
        this.formNo = formNo;

        JLabel labelform = new JLabel("Form No : "+ formNo);
        labelform.setBounds(600,7,680,40);
        labelform.setFont(new Font("Ralway",Font.BOLD,22));
        add(labelform);

        JLabel label1 = new JLabel("Page 3");
        label1.setBounds(200,20,430,40);
        label1.setFont(new Font("Raleway",Font.BOLD,20));
        add(label1);

        JLabel label2 = new JLabel("Account Details");
        label2.setBounds(200,50,430,40);
        label2.setFont(new Font("Raleway",Font.BOLD,25));
        add(label2);

        JLabel label3 = new JLabel("Account Type : ");
        label3.setBounds(100,120,430,40);
        label3.setFont(new Font("Raleway",Font.BOLD,20));
        add(label3);

        r1 = new JRadioButton("Saving Account");
        r1.setBounds(100,160,300,40);
        r1.setFont(new Font("Raleway",Font.BOLD,15));
        r1.setBackground(new Color(222, 240, 255));
        add(r1);

        r2 = new JRadioButton("Current Account");
        r2.setBounds(400,160,300,40);
        r2.setFont(new Font("Raleway",Font.BOLD,15));
        r2.setBackground(new Color(222, 240, 255));
        add(r2);

        r3 = new JRadioButton("Default");
        r3.setBounds(100,190,300,40);
        r3.setFont(new Font("Raleway",Font.BOLD,15));
        r3.setBackground(new Color(222, 240, 255));
        add(r3);

        r4 = new JRadioButton("Fixed Deposit Account");
        r4.setBounds(400,190,300,40);
        r4.setFont(new Font("Raleway",Font.BOLD,15));
        r4.setBackground(new Color(222, 240, 255));
        add(r4);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel label4 = new JLabel("Card Number : ");
        label4.setBounds(100,250,430,40);
        label4.setFont(new Font("Raleway",Font.BOLD,20));
        add(label4);

        JLabel label5 = new JLabel("XXXX-XXXX-XXXX-4331");
        label5.setBounds(350,250,430,40);
        label5.setFont(new Font("Raleway",Font.BOLD,15));
        add(label5);

        JLabel label6 = new JLabel("(Your 16-digit card Number)");
        label6.setBounds(100,280,430,40);
        label6.setFont(new Font("Raleway",Font.BOLD,10));
        add(label6);

        JLabel label7 = new JLabel("(It will appear on atm card/cheque book and statements)");
        label7.setBounds(350,280,430,40);
        label7.setFont(new Font("Raleway",Font.BOLD,10));
        add(label7);

        JLabel label8 = new JLabel("PIN : ");
        label8.setBounds(100,310,430,40);
        label8.setFont(new Font("Raleway",Font.BOLD,20));
        add(label8);

        JLabel label9 = new JLabel("XXXX");
        label9.setBounds(350,310,430,40);
        label9.setFont(new Font("Raleway",Font.BOLD,20));
        add(label9);

        JLabel label10 = new JLabel("(4-digit password)");
        label10.setBounds(100,340,430,40);
        label10.setFont(new Font("Raleway",Font.BOLD,10));
        add(label10);

        JLabel label11 = new JLabel("Services Required : ");
        label11.setBounds(100,380,430,40);
        label11.setFont(new Font("Raleway",Font.BOLD,20));
        add(label11);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(new Color(222, 240, 255));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,420,200,40);
        add(c1);

        c2 = new JCheckBox("Mobile Banking ");
        c2.setBackground(new Color(222, 240, 255));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(300,420,200,40);
        add(c2);

        c3 = new JCheckBox("Internet Banking");
        c3.setBackground(new Color(222, 240, 255));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(600,420,200,40);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setBackground(new Color(222, 240, 255));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(100,450,200,40);
        add(c4);

        c5 = new JCheckBox("E-Statements");
        c5.setBackground(new Color(222, 240, 255));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(300,450,200,40);
        add(c5);

        c6 = new JCheckBox("Cheque Book");
        c6.setBackground(new Color(222, 240, 255));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(600,450,200,40);
        add(c6);

        c7 = new JCheckBox("I hereby declares that the above entered details is correct to the best of my knowledge.");
        c7.setBackground(new Color(222, 240, 255));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,480,600,40);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.blue);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Halway",Font.BOLD,12));
        submit.setBounds(690,520,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Halway",Font.BOLD,12));
        cancel.setBounds(570,520,100,30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(new Color(222, 240, 255));
        setLayout(null);
        setSize(850, 600);
        setLocation(270, 80);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accountType = null;
        if(r1.isSelected()){
            accountType = "Saving Account";
        }else if (r2.isSelected()){
            accountType = "Current Account";
        }else if (r3.isSelected()){
            accountType = "Default";
        }else if (r4.isSelected()){
            accountType = "Fixed Deposit Account";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardNo = "" + Math.abs(first7);
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String services = " ";
        if(c1.isSelected()){
            services += "ATM Card, ";
        }
        if(c2.isSelected()){
            services += "Mobile Banking, ";
        }
        if(c3.isSelected()){
            services += "Internet Banking, ";
        }
        if(c4.isSelected()){
            services += "Email Alerts, ";
        }
        if(c5.isSelected()){
            services += "E-Statement, ";
        }
        if(c6.isSelected()){
            services += "Cheque Book, ";
        }
        if(services.endsWith(", ")){
            services = services.substring(0,services.length()-2);
        }

        try{
            if (e.getSource().equals(submit)) {
                if (buttonGroup.getSelection() == null) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                }else if(!c7.isSelected()){
                    JOptionPane.showMessageDialog(null,"You must declare that the provided information is correct");
                } else {
                    Connect connect = new Connect();
                    String query = "insert into signUpthree values('" + formNo + "','" + accountType + "','" + cardNo + "','" + pin + "','" + services + "')";
                    String query2 = "insert into login values('" + formNo + "','" + cardNo + "','" + pin + "')";
                    connect.statement.executeUpdate(query);
                    connect.statement.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card No : " + cardNo + "\nPIN : " + pin);
                    new Deposit(pin);
                    setVisible(false);

                }
            }
            if (e.getSource().equals(cancel)){
                    System.exit(0);
                }


        }catch (Exception E){
            E.printStackTrace();
        }



    }

    public static void main(String[] args) {
        new Signup3("");

    }
}
