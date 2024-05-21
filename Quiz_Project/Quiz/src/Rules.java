import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener{
    String id;
    JButton Start,back;
    Rules(String id){
        this.id=id;
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading =new JLabel("Welcome "+id+" to simple Minds ");
        heading.setBounds(50,20,700,30);heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(Color.BLUE);
        add(heading);


        JLabel rules =new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setForeground(Color.BLACK);
        rules.setText(
                "<html>"+
                        "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                        "4. Crying is allowed but please do so quietly." + "<br><br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                        "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                        "<html>"
        );

        add(rules);


        Start =new JButton("Start");
        Start.setBounds(400,500,100,30);
        /*rules.setBackground(Color.BLUE);
        rules.setForeground(Color.black);*/

        Start.addActionListener(this);
        add(Start);



        back =new JButton("Back");
        back.setBounds(250,500,100,30);
//        back.setBackground(Color.WHITE);
//        back.setForeground(Color.BLUE);
        back.addActionListener(this);
        add(back);

        setSize(800,650);
        setLocation(300,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==Start){
            setVisible(false);
            new quiz(id);
//            String id = tfname.getText();
//            setVisible(false);
//            new Rules(id);

        }
        else {
        setVisible(false);
        new login();

        }

    }
    public static void main(String[] args){
         new Rules("User ");
    }
}
