import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class pc_room extends JFrame{
	public pc_room(){
		setTitle("ÇÑ¾ç ÇÇ½Ã¹æ");
		getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel seat = new JPanel();
		seat.setLayout(new GridLayout(5,5,5,5));
		
		JButton bt1 = new JButton("1¹ø ÁÂ¼®" );
		bt1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt2 = new JButton("2¹ø ÁÂ¼®" );
		bt2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt3 = new JButton("3¹ø ÁÂ¼®" );
		bt3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt4 = new JButton("4¹ø ÁÂ¼®" );
		bt4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt5 = new JButton("5¹ø ÁÂ¼®" );
		bt5.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt6 = new JButton("6¹ø ÁÂ¼®" );
		bt6.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt7 = new JButton("7¹ø ÁÂ¼®" );
		bt7.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt8 = new JButton("8¹ø ÁÂ¼®" );
		bt8.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt9 = new JButton("9¹ø ÁÂ¼®" );
		bt9.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt10 = new JButton("10¹ø ÁÂ¼®" );
		bt10.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt11= new JButton("11¹ø ÁÂ¼®" );
		bt11.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt12 = new JButton("12¹ø ÁÂ¼®" );
		bt12.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt13 = new JButton("13¹ø ÁÂ¼®" );
		bt13.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt14 = new JButton("14¹ø ÁÂ¼®" );
		bt14.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt15 = new JButton("15¹ø ÁÂ¼®" );
		bt15.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt16 = new JButton("16¹ø ÁÂ¼®" );
		bt16.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt17 = new JButton("17¹ø ÁÂ¼®" );
		bt17.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt18 = new JButton("18¹ø ÁÂ¼®" );
		bt18.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt19 = new JButton("19¹ø ÁÂ¼®" );
		bt19.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt20 = new JButton("20¹ø ÁÂ¼®" );
		bt20.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt21 = new JButton("21¹ø ÁÂ¼®" );
		bt21.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt22 = new JButton("22¹ø ÁÂ¼®" );
		bt22.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt23 = new JButton("23¹ø ÁÂ¼®" );
		bt23.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt24 = new JButton("24¹ø ÁÂ¼®" );
		bt24.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt25 = new JButton("25¹ø ÁÂ¼®" );
		bt25.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		seat.add(bt1);
		seat.add(bt2);
		seat.add(bt3);
		seat.add(bt4);
		seat.add(bt5);
		seat.add(bt6);
		seat.add(bt7);
		seat.add(bt8);
		seat.add(bt9);
		seat.add(bt10);
		seat.add(bt11);
		seat.add(bt12);
		seat.add(bt13);
		seat.add(bt14);
		seat.add(bt15);
		seat.add(bt16);
		seat.add(bt17);
		seat.add(bt18);
		seat.add(bt19);
		seat.add(bt20);
		seat.add(bt21);
		seat.add(bt22);
		seat.add(bt23);
		seat.add(bt24);
		seat.add(bt25);
		
		
		JPanel menu = new JPanel();
		menu.setLayout(new BorderLayout());
		JButton re = new JButton("È¸¿øÁ¤º¸ ¼öÁ¤" );
		JButton search = new JButton("»ç¿ëÀÚ ÀÌ¿ë³»¿ª Ã£±â" );
		JButton use = new JButton("ÀÌ¿ë³»¿ª" );
		JButton list = new JButton("È¸¿ø¸ñ·Ï" );
		re.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	new info();
            }
        });
		search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	new infolist();
            }
        });
		list.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	new list();
            }
        });
		
		use.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	new use();
            }
        });
		Panel a = new Panel();
		a.add(re);
		a.add(search);
		a.add(use);
		a.add(list);
		menu.add(a);
		
		add("Center",seat);
		add("South",menu);
		
		setPreferredSize(new Dimension(700,700));
		pack();
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new pc_room();

	}

}
