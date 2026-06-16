package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    String formNo;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4;
    JRadioButton r1,r2,r3,r4;
    JButton button;
    JTextField textCnic;
    Signup2(String first){
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25 , 10, 100, 100);
        add(image);

        this.formNo = first;

        JLabel label1 = new JLabel("Page 2");
        label1.setBounds(330,30,680,40);
        label1.setFont(new Font("Ralway",Font.BOLD,22));
        add(label1);

        JLabel labelform = new JLabel("Form No : "+ formNo);
        labelform.setBounds(600,7,680,40);
        labelform.setFont(new Font("Ralway",Font.BOLD,22));
        add(labelform);

        JLabel label2 = new JLabel("Additional Details");
        label2.setBounds(300,70,600,40);
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        add(label2);

        JLabel labelReligion = new JLabel("Religion : ");
        labelReligion.setBounds(100,150,100,30);
        labelReligion.setFont(new Font("Ralway",Font.BOLD,20));
        add(labelReligion);

        String religion[] = {"Muslim","Hindu","Sikh","Christian","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(222, 243, 255));
        comboBox.setBounds(300,150,400,30);
        comboBox.setFont(new Font("Ralway",Font.BOLD,14));
        add(comboBox);

        JLabel labelIncome = new JLabel("Income : ");
        labelIncome.setBounds(100,190,100,30);
        labelIncome.setFont(new Font("Ralway",Font.BOLD,20));
        add(labelIncome);

        String income[] = {"Null","< 50,000","< 150,000","< 500,000","Above 10,00000"};
        comboBox2 = new JComboBox(income);
        comboBox2.setBackground(new Color(222, 243, 255));
        comboBox2.setBounds(300,190,400,30);
        comboBox2.setFont(new Font("Ralway",Font.BOLD,14));
        add(comboBox2);

        JLabel labelEducation = new JLabel("Education : ");
        labelEducation.setBounds(100,230,200,30);
        labelEducation.setFont(new Font("Ralway",Font.BOLD,20));
        add(labelEducation);

        String education[] = {"Under Graduates","Graduates","Post Graduates","Masters ","Doctorate"};
        comboBox3 = new JComboBox(education);
        comboBox3.setBackground(new Color(222, 243, 255));
        comboBox3.setBounds(300,230,400,30);
        comboBox3.setFont(new Font("Ralway",Font.BOLD,14));
        add(comboBox3);

        JLabel labelOccupation = new JLabel("Occupation : ");
        labelOccupation.setBounds(100,270,200,30);
        labelOccupation.setFont(new Font("Ralway",Font.BOLD,20));
        add(labelOccupation);

        String occupation[] = {"Self-Employeed","Employee","Bussiness","Student ","Retired","Other"};
        comboBox4 = new JComboBox(occupation);
        comboBox4.setBackground(new Color(222, 243, 255));
        comboBox4.setBounds(300,270,400,30);
        comboBox4.setFont(new Font("Ralway",Font.BOLD,14));
        add(comboBox4);

        JLabel labelSeniorCitizen = new JLabel("Senior Citizen : ");
        labelSeniorCitizen.setBounds(100,310,200,30);
        labelSeniorCitizen.setFont(new Font("Ralway",Font.BOLD,20));
        add(labelSeniorCitizen);

        r1 = new JRadioButton("Yes");
        r1.setBackground(new Color(222, 240, 255));
        r1.setBounds(300,310,200,30);
        r1.setFont(new Font("Ralway",Font.BOLD,20));
        add(r1);

        r2 = new JRadioButton("No");
        r2.setBackground(new Color(222, 240, 255));
        r2.setBounds(500,310,200,30);
        r2.setFont(new Font("Ralway",Font.BOLD,20));
        add(r2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);

        JLabel labelExistingAccount = new JLabel("Existing Account : ");
        labelExistingAccount.setBounds(100,350,200,30);
        labelExistingAccount.setFont(new Font("Ralway",Font.BOLD,20));
        add(labelExistingAccount);

        r3 = new JRadioButton("Yes");
        r3.setBackground(new Color(222, 240, 255));
        r3.setBounds(300,350,200,30);
        r3.setFont(new Font("Ralway",Font.BOLD,20));
        add(r3);

        r4 = new JRadioButton("No");
        r4.setBackground(new Color(222, 240, 255));
        r4.setBounds(500,350,200,30);
        r4.setFont(new Font("Ralway",Font.BOLD,20));
        add(r4);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r3);
        buttonGroup2.add(r4);

        JLabel labelCnic = new JLabel("CNIC : ");
        labelCnic.setBounds(100,390,200,30);
        labelCnic.setFont(new Font("Ralway",Font.BOLD,20));
        add(labelCnic);

        JLabel labelCnic2 = new JLabel("Follow this format (XXXXX-XXXXXXX-X)");
        labelCnic2.setBounds(300,420,400,30);
        labelCnic2.setFont(new Font("Ralway",Font.BOLD,18));
        add(labelCnic2);

        textCnic = new JTextField();
        textCnic.setBounds(300,390,400,30);
        textCnic.setFont(new Font("Ralway",Font.BOLD,14));
        add(textCnic);

        button = new JButton("Next");
        button.setForeground(Color.white);
        button.setBackground(Color.black);
        button.setBounds(600,500,100,30);
        button.setFont(new Font("Halway",Font.BOLD,14));
        button.addActionListener(this);
        add(button);

        getContentPane().setBackground(new Color(222, 240, 255));
        setLayout(null);
        setSize(850, 600);
        setLocation(270, 80);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String religion = (String) comboBox.getSelectedItem();
        String income = (String) comboBox2.getSelectedItem();
        String education = (String) comboBox3.getSelectedItem();
        String occupation = (String) comboBox4.getSelectedItem();
        String senior_citizen = null;
        if(r1.isSelected()){
            senior_citizen = "Yes";
        }else if(r2.isSelected()){
            senior_citizen = "No";
        }
        String existing_account = null;
        if(r3.isSelected()){
            senior_citizen = "Yes";
        }else if(r4.isSelected()){
            senior_citizen = "No";
        }
        String cnic = textCnic.getText();
        try {
            if(cnic.isEmpty()){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
        }else {
            Connect connect = new Connect();
                String query = "insert into signUptwo values('"+formNo+"','"+religion+"','"+income+"','"+education+"','"+occupation+"','"+senior_citizen+"','"+existing_account+"','"+cnic+"')";
                connect.statement.executeUpdate(query);
                new Signup3(formNo);
                setVisible(false);
        }
        }catch(Exception E){
            E.printStackTrace();
        }



    }

    static void main(String[] args) {
        new Signup2("");
    }
}
