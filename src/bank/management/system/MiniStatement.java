package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {
    JButton btn1;
    String pin;
    JEditorPane editorPane;
    JScrollPane scrollPane;
    MiniStatement(String pin){
        this.pin = pin;
        getContentPane().setBackground(new Color(170,255,255));
        setSize(400,600);
        setLocation(20,30);
        setLayout(null);

        editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        editorPane.setEditable(false);
        editorPane.setPreferredSize(new Dimension(400, 400));
        editorPane.setOpaque(false);
        editorPane.setBackground(new Color(0, 0, 0, 0));

        scrollPane = new JScrollPane(editorPane);
        scrollPane.setBounds(20, 100, 340, 380);
        scrollPane.setFont(new Font("System",Font.BOLD,15));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setOpaque(false);
        scrollPane.setBorder(null);
        scrollPane.getViewport().setOpaque(false);

        add(scrollPane);

        JLabel label2 = new JLabel("MINI STATEMENT");
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(140,20,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,60,300,20);
        label3.setFont(new Font("System",Font.BOLD,13));
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,500,300,20);
        label4.setFont(new Font("System",Font.BOLD,13));
        add(label4);

        try{
            Connect connect = new Connect();
            ResultSet resultSet = connect.statement.executeQuery("Select * from login where pin = '"+pin+"'");
            while(resultSet.next()){
                label3.setText("Card Number : "+ resultSet.getString("cardNo").substring(0,4)+"XXXXXXXX"+ resultSet.getString("cardNo").substring(0,4));
            }


        }catch (Exception E){
            E.printStackTrace();
        }
        try {
            Connect connect = new Connect();
            ResultSet resultSet = connect.statement.executeQuery("Select * from bank where pin = '"+pin+"'");

            int balance = 0;
            StringBuilder htmlContent = new StringBuilder();
            htmlContent.append("<html><body style='background-color: transparent; font-size: 10px; font-family: system; white-space: nowrap;'>");

            while(resultSet.next()) {
                htmlContent.append(resultSet.getString("date"))
                        .append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
                        .append(resultSet.getString("type"))
                        .append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
                        .append(resultSet.getString("amount"))
                        .append("<br><br>");

                if(resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }

            htmlContent.append("</body></html>");
            editorPane.setText(htmlContent.toString());
            editorPane.setCaretPosition(0);

            label4.setText("Your Total Balance is Rs. "+balance);

        } catch (Exception E) {
            E.printStackTrace();
        }
        btn1 = new JButton("EXIT");
        btn1.setForeground(Color.white);
        btn1.setBackground(Color.black);
        btn1.setBounds(260,550,100,25);
        btn1.addActionListener(this);
        add(btn1);

        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new MiniStatement("");
    }
}
