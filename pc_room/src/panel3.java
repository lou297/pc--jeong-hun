import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingWorker;


public class panel3 extends JFrame{
	
	ArrayList <foodlist> list = new ArrayList<foodlist>();
	public  panel3(String id,String start){
		setTitle("음식메뉴");
		
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
            	String price= addprice(text6, text7, text8, text9, text10, text11)+"";
            	
            	saveprice(id,start,price);
                setVisible(false);
                
            }
        });
		add("South", order);
		
		setPreferredSize(new Dimension(350,350));
		pack();
		setVisible(true);
		
	}
	public void saveprice(String id,String start,String price){
		foodlist one = new foodlist(id,start,price);
		list.add( one);
		save(list);
	}
	public void save(ArrayList list){
		SwingWorker worker = new SwingWorker(){
			
			@Override
			protected Object doInBackground() throws Exception {
				FileInputStream fin = null;
				ObjectInputStream ois = null;
				FileOutputStream fout = null;
				ObjectOutputStream oos = null;

				
				
				try{
					fin = new FileInputStream("food.dat");
					ois = new ObjectInputStream(fin);
					ArrayList list2 = (ArrayList) ois.readObject();
					for (int i = 0; i < list2.size(); i++)
						list.add((foodlist) list2.get(i));
					
					
					fout = new FileOutputStream("food.dat");
					oos = new ObjectOutputStream(fout);

					oos.writeObject(list);//
					oos.reset();
					

				} catch (Exception e) {
					System.out.println(e.getMessage());
				} finally {
					try {
						ois.close();
						fin.close();
						fout.close();
						oos.close();
					} catch (IOException ioe) {
					}
				}
				return null;
			}
		};
		worker.execute();
	}
	public int addprice(JTextField text6,JTextField text7,JTextField text8,JTextField text9
			,JTextField text10,JTextField text11){
		
		int h;
        int s1;
        int r;
        int c1;
        int s2;
        int c2;
        int price=0;
        if(text6.getText().equals("")){h=0;}
        else {
        	h=Integer.parseInt(text6.getText());
        	price+=h*2000;}
        if(text7.getText().equals("")){s1=0;}
        else {
        	s1=Integer.parseInt(text7.getText());
        	price+=s1*2000;}
        if(text8.getText().equals("")){r=0;}
        else {
        	r=Integer.parseInt(text8.getText());
        	price+=r*1500;}
        if(text9.getText().equals("")){c1=0;}
        else {
        	c1=Integer.parseInt(text9.getText());
        	price+=c1*1000;}
        if(text10.getText().equals("")){s2=0;}
        else {
        	s2=Integer.parseInt(text10.getText());
        	price+=s2*1000;}
        if(text11.getText().equals("")){c2=0;}
        else {
        	c2=Integer.parseInt(text11.getText());
        	price+=c2*1000;}
        JOptionPane.showMessageDialog(null,"총 "+price+"원 입니다.");
        return price;
	}
	

}
