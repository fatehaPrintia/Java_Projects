import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class score extends JFrame implements ActionListener {
    score(String id,int score){

        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,140,300,250); //uporer image
        add(image);



        JLabel heading =new JLabel("Thank You "+ id+" for playing simple Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma", Font.PLAIN,26));
        add(heading);


        JLabel scoree =new JLabel("Your Score is "+ score);
        scoree.setBounds(350,200,300,30);
        scoree.setFont(new Font("Tahoma", Font.PLAIN,26));
        add(scoree);


        JButton submit =new JButton("Try Again!");
        submit.setBounds(380,270,120,30);
        submit.setBackground(new Color(20,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new login();

    }

    public static void main(String[] args){
        new score("User",0);
    }
}
