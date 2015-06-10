import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



/*class panel1 extends JPanel implements ActionListener{	
	public panel1(){
		setLayout(new GridLayout(3,1));
		JLabel label1 = new JLabel("아이디", Label.RIGHT);
		JTextField idTF = new JTextField(15);
		JLabel label2 = new JLabel("비밀번호", Label.RIGHT);
		JTextField pwd = new JTextField(15);
		JButton log = new JButton("로그인");
		JButton add = new JButton("회원가입");
		log.addActionListener(this);
		add.addActionListener(this);
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
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 자동 생성된 메소드 스텁
		
	}
}

class panel2 extends JPanel implements ActionListener{
	public panel2(){
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
		check.addActionListener(this);
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
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 자동 생성된 메소드 스텁
		
	}
}
class panel3 extends JPanel implements ActionListener{
	

	public panel3(){
		setLayout(new BorderLayout());
		JTextArea timecheck = new JTextArea(10,20);
		timecheck.setEditable(false);
		JButton food = new JButton("음식주문" );
		JButton send = new JButton("카운터로 메세지" );
		JButton mile = new JButton("마일리지" );
		JButton end = new JButton("종료" );
		food.addActionListener(this);
		send.addActionListener(this);
		mile.addActionListener(this);
		end.addActionListener(this);
		Panel textpanel = new Panel();
		Panel buttonpanel = new Panel();
		textpanel.add(timecheck);
		buttonpanel.add(food);
		buttonpanel.add(send);
		buttonpanel.add(mile);
		buttonpanel.add(end);
		add("North", textpanel);
		add("Center", buttonpanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 자동 생성된 메소드 스텁
		
	}
}

class panel4 extends JPanel implements ActionListener{
	public panel4(){
		setLayout(new GridLayout(7,1));
		JLabel label1 = new JLabel("1.햄버거(2,000)", Label.RIGHT);
		JTextField text1 = new JTextField(2);
		JLabel label2 = new JLabel("2.소세지(2,000)", Label.RIGHT);
		JTextField text2 = new JTextField(2);
		JLabel label3 = new JLabel("3.라면(1,500)", Label.RIGHT);
		JTextField text3 = new JTextField(2);
		JLabel label4 = new JLabel("4.콜라(1,000)", Label.RIGHT);
		JTextField text4 = new JTextField(2);
		JLabel label5 = new JLabel("5.사이다(1,000)", Label.RIGHT);
		JTextField text5 = new JTextField(2);
		JLabel label6 = new JLabel("6.커피(1,000)", Label.RIGHT);
		JTextField text6 = new JTextField(2);
		JPanel order1 = new JPanel();
		JPanel order2= new JPanel();
		JPanel order3 = new JPanel();
		JPanel order4 = new JPanel();
		JPanel order5 = new JPanel();
		JPanel order6 = new JPanel();
		order1.add(label1);
		order1.add(text1);
		order2.add(label2);
		order2.add(text2);
		order3.add(label3);
		order3.add(text3);
		order4.add(label4);
		order4.add(text4);
		order5.add(label5);
		order5.add(text5);
		order6.add(label6);
		order6.add(text6);
		add("West", order1);
		add("West", order2);
		add("West", order3);
		add("West", order4);
		add("West", order5);
		add("West", order6);
		add("South", new JButton("주문" ));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO 자동 생성된 메소드 스텁
		
	}
}

public class Form{
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		Container con = jf.getContentPane();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		con.add(new panel3(), BorderLayout.CENTER);
		jf.setPreferredSize(new Dimension(350,350));
		jf.pack();
		jf.setVisible(true);
		
		con.add(new panel4(), BorderLayout.CENTER);
		jf.setPreferredSize(new Dimension(350,350));
		jf.pack();
		jf.setVisible(true);
		
	}
}
*/
