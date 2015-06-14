import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class panel3 extends JFrame{
	panel2 a = new panel2(null,null);
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
                addprice(text6, text7, text8, text9, text10, text11);
                
                setVisible(false);
            }
        });
		add("South", order);
		
		setPreferredSize(new Dimension(350,350));
		pack();
		setVisible(true);
	}
	public void addprice(JTextField text6,JTextField text7,JTextField text8,JTextField text9
			,JTextField text10,JTextField text11){
		
		int h=Integer.parseInt(text6.getText());
        int s1=Integer.parseInt(text7.getText());
        int r=Integer.parseInt(text8.getText());
        int c1=Integer.parseInt(text9.getText());
        int s2=Integer.parseInt(text10.getText());
        int c2=Integer.parseInt(text11.getText());
        
        if(text6.getText().equals("")){}
        else {a.price+=h*2000;}
        if(text7.getText().equals("")){}
        else {a.price+=s1*2000;}
        if(text8.getText().equals("")){}
        else {a.price+=r*1500;}
        if(text9.getText().equals("")){}
        else {a.price+=c1*1000;}
        if(text10.getText().equals("")){}
        else {a.price+=s2*1000;}
        if(text11.getText().equals("")){}
        else {a.price+=c2*1000;}
        int total = h*2000+s1*2000+r*1500+c1*1000+s2*1000+c2*1000;
        JOptionPane.showMessageDialog(null,"총 "+total+"원 입니다.");
	}
	

}
