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
		JLabel label1 = new JLabel("���̵�", Label.RIGHT);
		JTextField idTF = new JTextField(15);
		JLabel label2 = new JLabel("��й�ȣ", Label.RIGHT);
		JTextField pwd = new JTextField(15);
		JButton log = new JButton("�α���");
		JButton add = new JButton("ȸ������");
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
		// TODO �ڵ� ������ �޼ҵ� ����
		
	}
}

class panel2 extends JPanel implements ActionListener{
	public panel2(){
		setLayout(new GridLayout(6,1));
		JLabel label1 = new JLabel("�̸�", Label.RIGHT);
		JTextField text1 = new JTextField(10); 
		JLabel label2 = new JLabel("�ֹε�Ϲ�ȣ" ,Label.RIGHT);
		JTextField text2_1 = new JTextField(7);
		Label mid = new Label("-", Label.CENTER);
		JTextField text2_2 = new JTextField(7);
		JLabel label3 = new JLabel("��ȭ��ȣ" ,Label.RIGHT);
		JTextField text3 = new JTextField(15);
		JLabel label4 = new JLabel("���̵�" ,Label.RIGHT);
		JButton checkid = new JButton("�ߺ�Ȯ��" );
		JTextField text4 = new JTextField(15);
		JLabel label5 = new JLabel("��й�ȣ" ,Label.RIGHT);
		JTextField text5 = new JTextField(15);
		JButton check = new JButton("ȸ������" ); 
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
		// TODO �ڵ� ������ �޼ҵ� ����
		
	}
}
class panel3 extends JPanel implements ActionListener{
	

	public panel3(){
		setLayout(new BorderLayout());
		JTextArea timecheck = new JTextArea(10,20);
		timecheck.setEditable(false);
		JButton food = new JButton("�����ֹ�" );
		JButton send = new JButton("ī���ͷ� �޼���" );
		JButton mile = new JButton("���ϸ���" );
		JButton end = new JButton("����" );
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
		// TODO �ڵ� ������ �޼ҵ� ����
		
	}
}

class panel4 extends JPanel implements ActionListener{
	public panel4(){
		setLayout(new GridLayout(7,1));
		JLabel label1 = new JLabel("1.�ܹ���(2,000)", Label.RIGHT);
		JTextField text1 = new JTextField(2);
		JLabel label2 = new JLabel("2.�Ҽ���(2,000)", Label.RIGHT);
		JTextField text2 = new JTextField(2);
		JLabel label3 = new JLabel("3.���(1,500)", Label.RIGHT);
		JTextField text3 = new JTextField(2);
		JLabel label4 = new JLabel("4.�ݶ�(1,000)", Label.RIGHT);
		JTextField text4 = new JTextField(2);
		JLabel label5 = new JLabel("5.���̴�(1,000)", Label.RIGHT);
		JTextField text5 = new JTextField(2);
		JLabel label6 = new JLabel("6.Ŀ��(1,000)", Label.RIGHT);
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
		add("South", new JButton("�ֹ�" ));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
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
