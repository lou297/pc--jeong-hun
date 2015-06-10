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


public class panel1 extends JFrame{
	public panel1(){
		getContentPane();
		setLayout(new GridLayout(3,1));
		JLabel label1 = new JLabel("아이디", Label.RIGHT);
		JTextField idTF = new JTextField(15);
		JLabel label2 = new JLabel("비밀번호", Label.RIGHT);
		JTextField pwd = new JTextField(15);
		JButton log = new JButton("로그인");
		JButton add = new JButton("회원가입");
		log.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new panel2();
                setVisible(false);
            }
        });
		add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new panel4();
                setVisible(false);
            }
        });

		JPanel login1 = new JPanel();
		JPanel login2 = new JPanel();
		JPanel login3 = new JPanel();
		login1.add(label1);
		login1.add(idTF);
		login2.add(label2);
		login2.add(pwd);
		login3.add(log);
		login3.add(add);
		add("West", login1);
		add("West", login2);
		add("West", login3);
		setPreferredSize(new Dimension(350,350));
		pack();
		setVisible(true);
	}
	

}
