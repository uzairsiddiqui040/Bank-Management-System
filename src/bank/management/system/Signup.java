package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JTextField textName, textFName, textEmail, textAddress,textCity, textCode;
    JDateChooser dateChooser;
    JRadioButton r1,r2,r3,r4;
    JButton next;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);
    Signup(){
        super("Application Form");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25 , 10, 100, 100);
        add(image);


        JLabel label1 = new JLabel("Application Form No : " + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Haleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330,70,680,40);
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(300,100,600,40);
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        add(label3);

        JLabel labelName = new JLabel("Name : ");
        labelName.setBounds(100,150,100,30);
        labelName.setFont(new Font("Ralway",Font.BOLD,20));
        add(labelName);

        textName = new JTextField();
        textName.setBounds(300,150,400,30);
        textName.setFont(new Font("Ralway",Font.BOLD,14));
        add(textName);

        JLabel labelFName = new JLabel("Father's Name : ");
        labelFName.setBounds(100,190,200,30);
        labelFName.setFont(new Font("Ralway",Font.BOLD,20));
        add(labelFName);

        textFName = new JTextField();
        textFName.setBounds(300,190,400,30);
        textFName.setFont(new Font("Ralway",Font.BOLD,14));
        add(textFName);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setBounds(100,230,200,30);
        DOB.setFont(new Font("Ralway",Font.BOLD,20));
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,230,400,30);
        dateChooser.setFont(new Font("Ralway",Font.BOLD,15));
        add(dateChooser);

        JLabel gender = new JLabel("Gender :");
        gender.setBounds(100,270,200,30);
        gender.setFont(new Font("Ralway",Font.BOLD,20));
        add(gender);

        r1 = new JRadioButton("Male");
        r1.setBounds(300,270,170,30);
        r1.setFont(new Font("Ralway",Font.BOLD,20));
        r1.setBackground(new Color(222,255,228));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(500,270,200,30);
        r2.setFont(new Font("Ralway",Font.BOLD,20));
        r2.setBackground(new Color(222,255,228));
        add(r2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);

        JLabel email = new JLabel("Email :");
        email.setBounds(100,310,200,30);
        email.setFont(new Font("Ralway",Font.BOLD,20));
        add(email);

        textEmail = new JTextField();
        textEmail.setBounds(300,310,400,30);
        textEmail.setFont(new Font("Ralway",Font.BOLD,14));
        add(textEmail);

        JLabel address = new JLabel("Address :");
        address.setBounds(100,350,200,30);
        address.setFont(new Font("Ralway",Font.BOLD,20));
        add(address);

        textAddress = new JTextField();
        textAddress.setBounds(300,350,400,30);
        textAddress.setFont(new Font("Ralway",Font.BOLD,14));
        add(textAddress);

        JLabel city = new JLabel("City :");
        city.setBounds(100,390,200,30);
        city.setFont(new Font("Ralway",Font.BOLD,20));
        add(city);

        textCity = new JTextField();
        textCity.setBounds(300,390,400,30);
        textCity.setFont(new Font("Ralway",Font.BOLD,14));
        add(textCity);

        JLabel maritalStatus = new JLabel("Marital Status :");
        maritalStatus.setBounds(100,430,200,30);
        maritalStatus.setFont(new Font("Ralway",Font.BOLD,20));
        add(maritalStatus);

        r3 = new JRadioButton("Married");
        r3.setBounds(300,430,170,30);
        r3.setFont(new Font("Ralway",Font.BOLD,20));
        r3.setBackground(new Color(222,255,228));
        add(r3);

        r4 = new JRadioButton("Unmarried");
        r4.setBounds(500,430,200,30);
        r4.setFont(new Font("Ralway",Font.BOLD,20));
        r4.setBackground(new Color(222,255,228));
        add(r4);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r3);
        buttonGroup2.add(r4);

        next = new JButton("Next");
        next.setFont(new Font("Ralway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(600,520,100,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850, 600);
        setLocation(270, 80);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formNo = first;
        String name = textName.getText();
        String fName = textFName.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if (r2.isSelected()){
            gender = "Female";
        }
        String email = textEmail.getText();
        String address = textAddress.getText();
        String city = textCity.getText();
        String maritalStatus = null;
        if(r3.isSelected()){
            maritalStatus = "Married";
        }else if (r4.isSelected()){
            maritalStatus = "UnMarried";
        }

        try{
            if(textName.getText().equals("") || textFName.getText().equals("") || textEmail.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Fill all fields.");
            }else {
                Connect connect = new Connect();
                String query = "insert into signUp values('"+formNo +"','"+name +"','"+fName+"','"+dob+"','"+gender+"','"+email+"','"+address+"','"+city+"','"+maritalStatus+"')";
                connect.statement.executeUpdate(query);
                new Signup2(first);
                setVisible(false);
            }
        }
        catch(Exception E)
        {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();



    }
}
