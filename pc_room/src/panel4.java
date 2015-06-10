import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class panel4 extends JFrame{
	public panel4(){
		getContentPane();
		setLayout(new GridLayout(6,1));
		JLabel label1 = new JLabel("이름", Label.RIGHT);
		JTextField text1 = new JTextField(10); 
		JLabel label2 = new JLabel("주민등록번호" ,Label.RIGHT);
		JTextField text2_1 = new JTextField(7);
		Label mid = new Label("-", Label.CENTER);
		JTextField text2_2 = new JTextField(7);
		JLabel label3 = new JLabel("전화번호" ,Label.RIGHT);
		JTextField text3 = new JTextField(15);
		JLabel label4 = new JLabel("아이디" ,Label.RIGHT);
		JButton checkid = new JButton("중복확인" );
		JTextField text4 = new JTextField(15);
		JLabel label5 = new JLabel("비밀번호" ,Label.RIGHT);
		JTextField text5 = new JTextField(15);
		JButton check = new JButton("회원가입" ); 
		check.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new panel1();
                setVisible(false);
            }
        });
		JPanel add_people1 = new JPanel();
		JPanel add_people2= new JPanel();
		JPanel add_people3 = new JPanel();
		JPanel add_people4 = new JPanel();
		JPanel add_people5 = new JPanel();
		JPanel add_people6 = new JPanel();
		add_people1.add(label1);
		add_people1.add(text1);
		add_people2.add(label2);
		add_people2.add(text2_1);
		add_people2.add(mid);
		add_people2.add(text2_2);
		add_people3.add(label3);
		add_people3.add(text3);
		add_people4.add(label4);
		add_people4.add(text4);
		add_people4.add(checkid);
		add_people5.add(label5);
		add_people5.add(text5);
		add_people6.add(check);
		add("West", add_people1);
		add("West", add_people2);
		add("West", add_people3);
		add("West", add_people4);
		add("West", add_people5);
		add("West", add_people6);
		setPreferredSize(new Dimension(350,350));
		pack();
		setVisible(true);
	}

}
