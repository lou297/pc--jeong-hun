import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Form2 {
	public static void main(String[] args) {
		JFrame ja = new JFrame();
		Container cont = ja.getContentPane();
		ja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cont.add(new seat(), BorderLayout.CENTER);
		cont.add(new menu(), BorderLayout.SOUTH);
		ja.setPreferredSize(new Dimension(700,700));
		ja.pack();
		ja.setVisible(true);
		
	}
}

class seat extends JPanel implements ActionListener{	
	public seat(){
		setLayout(new GridLayout(5,5,5,5));
		for(int i=1;i<26;i++){
			add(new JButton(i+""));
		}
		setSize(200,200);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
	}
}

class menu extends JPanel implements ActionListener{	
	public menu(){
		setLayout(new BorderLayout());
		JButton re = new JButton("ȸ������ ����" );
		JButton stock = new JButton("���Ȯ��" );
		JButton use = new JButton("�̿볻��" );
		JButton list = new JButton("ȸ�����" );
		re.addActionListener(this);
		stock.addActionListener(this);
		use.addActionListener(this);
		list.addActionListener(this);
		Panel a = new Panel();
		a.add(re);
		a.add(stock);
		a.add(use);
		a.add(list);
		add(a);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
	}
}