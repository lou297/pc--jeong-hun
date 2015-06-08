import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


abstract public class pc_room_form extends Frame implements ActionListener{
	private CardLayout cardLayout = null;
	private TextField idTF = null;
	private TextField pwd = null;
	public void pc_panel(){
		cardLayout = new CardLayout();
		setLayout(cardLayout);
		Panel loginPanel = new Panel();
		loginPanel.setLayout(new BorderLayout());
		idTF = new TextField(20);
		pwd = new TextField(20);
		JButton log = new JButton("로그인");
		JButton add = new JButton("회원가입");
		
		log.addActionListener(this);
		add.addActionListener(this);
		Panel login = new Panel();
		login.add(idTF);
		login.add(pwd);
		loginPanel.add("Center", login);
		add("login", loginPanel);
/////////////////////////////////////////////////////////////
		Panel peoplepanel = new Panel();
		peoplepanel.setLayout(new BorderLayout());
		JLabel label1 = new JLabel("이름", Label.RIGHT);
		JTextField text1 = new JTextField(10); 
		JLabel label2 = new JLabel("주민등록번호" ,Label.RIGHT);
		JTextField text2_1 = new JTextField(7);
		Label mid = new Label("-", Label.CENTER);
		JTextField text2_2 = new JTextField(7);
		JLabel label3 = new JLabel("전화번호" ,Label.RIGHT);
		JTextField text3 = new JTextField(15);
		JLabel label4 = new JLabel("아이디" ,Label.RIGHT);
		JTextField text4 = new JTextField(15);
		JLabel label5 = new JLabel("비밀번호" ,Label.RIGHT);
		JTextField text5 = new JTextField(15);
		JButton check = new JButton("회원가입" ); 
		check.addActionListener(this);
		Panel add_people = new Panel();
		add_people.add(label1);
		add_people.add(text1);
		add_people.add(label2);
		add_people.add(text2_1);
		add_people.add(mid);
		add_people.add(text2_2);
		add_people.add(label3);
		add_people.add(text3);
		add_people.add(label4);
		add_people.add(text4);
		add_people.add(label5);
		add_people.add(text5);
		loginPanel.add("Center", add_people);
		add("people", peoplepanel);
/////////////////////////////////////////////////////////////
		Panel main = new Panel();
		main.setLayout(new BorderLayout());
		JTextArea timecheck = new JTextArea(30,30);
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
		main.add("Center", textpanel);
		main.add("West", buttonpanel);
		add("main",main);
////////////////1.음식주문 2.시간추가(선불일때) 3.카운터로메세지 4.개인정보변경 5.종료 6.컴퓨터종료
		add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//cardLayout.show(this, "people");	
            }
		});
		log.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//cardLayout.show(this, "main");	
            }
		});
		
		setSize(300, 300);	
		cardLayout.show(this, "login");	
		setVisible(true);

	}
	
	public static void main(String[] args) {
		
		
	}

}
