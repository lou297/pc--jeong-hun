import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class pc_room extends JFrame{
	public pc_room(){
		getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel seat = new JPanel();
		seat.setLayout(new GridLayout(5,5,5,5));
		
		JButton bt1 = new JButton("1�� �¼�" );
		bt1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) 
		{ 
			
			
			new panel1();bt1.setBackground(Color.BLUE);}});
		JButton bt2 = new JButton("2�� �¼�" );
		bt2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) 
		{new panel1();bt2.setBackground(Color.BLUE);}});
		JButton bt3 = new JButton("3�� �¼�" );
		bt3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt4 = new JButton("4�� �¼�" );
		bt4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt5 = new JButton("5�� �¼�" );
		bt5.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt6 = new JButton("6�� �¼�" );
		bt6.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt7 = new JButton("7�� �¼�" );
		bt7.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt8 = new JButton("8�� �¼�" );
		bt8.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt9 = new JButton("9�� �¼�" );
		bt9.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt10 = new JButton("10�� �¼�" );
		bt10.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt11= new JButton("11�� �¼�" );
		bt11.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt12 = new JButton("12�� �¼�" );
		bt12.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt13 = new JButton("13�� �¼�" );
		bt13.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt14 = new JButton("14�� �¼�" );
		bt14.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt15 = new JButton("15�� �¼�" );
		bt15.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt16 = new JButton("16�� �¼�" );
		bt16.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt17 = new JButton("17�� �¼�" );
		bt17.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt18 = new JButton("18�� �¼�" );
		bt18.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt19 = new JButton("19�� �¼�" );
		bt19.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt20 = new JButton("20�� �¼�" );
		bt20.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt21 = new JButton("21�� �¼�" );
		bt21.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt22 = new JButton("22�� �¼�" );
		bt22.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt23 = new JButton("23�� �¼�" );
		bt23.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt24 = new JButton("24�� �¼�" );
		bt24.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent arg0) {new panel1();}});
		JButton bt25 = new JButton("25�� �¼�" );
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
		JButton re = new JButton("ȸ������ ����" );
		JButton stock = new JButton("���Ȯ��" );
		JButton use = new JButton("�̿볻��" );
		JButton list = new JButton("ȸ�����" );
		Panel a = new Panel();
		a.add(re);
		a.add(stock);
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
