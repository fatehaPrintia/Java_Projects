import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
public class login extends JFrame implements ActionListener{
    JButton rules;
    JTextField tfname;
    login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(-10,-10,550,500); //uporer image
        add(image);

        JLabel heading =new JLabel("Simple Minds");
        heading.setBounds(680,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        heading.setForeground(Color.BLUE);
        add(heading);




        JLabel id =new JLabel("Enter Your Id");
        id.setBounds(720,150,270,20);
        id.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        id.setForeground(Color.BLUE);
        add(id);


        tfname =new JTextField();
        tfname.setBounds(680,200,200,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,17));
        add(tfname);


        //buttons

        rules =new JButton("Rules");
        rules.setBounds(720,270,120,25);
        /*rules.setBackground(Color.BLUE);
        rules.setForeground(Color.black);*/

        rules.addActionListener(this);
        add(rules);



//        JButton back =new JButton("Back");
//        back.setBounds(820,390,120,25);
//        /*rules.setBackground(Color.BLUE);
//        rules.setForeground(Color.black);*/
//        rules.addActionListener(this);
//        add(back);




        setSize(1000,500);
        setLocation(180,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==rules){
            String id = tfname.getText();
            setVisible(false);
            new Rules(id);

        }
//        else if (ae.getSource()==back){
//        setVisible(false);
//
//        }

    }
    public static void main(String[] args){
        new login();
    }
}