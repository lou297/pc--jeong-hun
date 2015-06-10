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
import javax.swing.JTextField;


public class panel3 extends JFrame{
	
	public panel3(){
		
		getContentPane();
		setLayout(new GridLayout(7,1));
		JLabel label8 = new JLabel("1.햄버거(2,000)", Label.RIGHT);
		JTextField text6 = new JTextField(2);
		JLabel label9 = new JLabel("2.소세지(2,000)", Label.RIGHT);
		JTextField text7 = new JTextField(2);
		JLabel label10 = new JLabel("3.라면(1,500)", Label.RIGHT);
		JTextField text8 = new JTextField(2);
		JLabel label11 = new JLabel("4.콜라(1,000)", Label.RIGHT);
		JTextField text9 = new JTextField(2);
		JLabel label12 = new JLabel("5.사이다(1,000)", Label.RIGHT);
		JTextField text10 = new JTextField(2);
		JLabel label13 = new JLabel("6.커피(1,000)", Label.RIGHT);
		JTextField text11 = new JTextField(2);
		JPanel order1 = new JPanel();
		JPanel order2= new JPanel();
		JPanel order3 = new JPanel();
		JPanel order4 = new JPanel();
		JPanel order5 = new JPanel();
		JPanel order6 = new JPanel();
		order1.add(label8);
		order1.add(text6);
		order2.add(label9);
		order2.add(text7);
		order3.add(label10);
		order3.add(text8);
		order4.add(label11);
		order4.add(text9);
		order5.add(label12);
		order5.add(text10);
		order6.add(label13);
		order6.add(text11);
		add("West", order1);
		add("West", order2);
		add("West", order3);
		add("West", order4);
		add("West", order5);
		add("West", order6);
		JButton order =new JButton("주문" );
		order.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new panel2();
                setVisible(false);
            }
        });
		add("South", order);
		
		setPreferredSize(new Dimension(350,350));
		pack();
		setVisible(true);
	}
	

}
