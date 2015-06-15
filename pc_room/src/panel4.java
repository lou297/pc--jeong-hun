import java.awt.AWTEvent;
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


public class panel4 extends JFrame{
	
	
	main a = new main();
	ArrayList<client> clients= new ArrayList<client>();
	
	public void adduser(String name,String rrn,String tel,String ID,String pwd){
		client one =  new client(name,rrn,tel,ID,pwd); 
		clients.add(one);
		System.out.println();
		saveuser(clients);
	}
	
	public void saveuser(ArrayList clients){
		SwingWorker worker = new SwingWorker(){
			
			@Override
			protected Object doInBackground() throws Exception {
				FileInputStream fin = null;
				ObjectInputStream ois = null;
				FileOutputStream fout = null;
				ObjectOutputStream oos = null;

				try{fin = new FileInputStream("client.dat");
					ois = new ObjectInputStream(fin);
					ArrayList list = (ArrayList) ois.readObject();
					for (int i = 0; i < list.size(); i++)
						clients.add((client) list.get(i));
					
					fout = new FileOutputStream("client.dat");
					oos = new ObjectOutputStream(fout);

					oos.writeObject(clients);//
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
	
	
	public void checkid(String ID){
		ArrayList<client> clients = new ArrayList<client>();
		SwingWorker worker = new SwingWorker() {

			@Override
			protected Object doInBackground() throws Exception {
				// test for books
				
				FileInputStream fin = null;
				ObjectInputStream ois = null;
				
				int k=0;
				try {
					fin = new FileInputStream("client.dat");
					ois = new ObjectInputStream(fin);
					ArrayList list = (ArrayList) ois.readObject();
					
					for (int i = 0; i < list.size(); i++)
						{clients.add((client) list.get(i));}

					for(int i=0;i<clients.size();i++){
	        			if(clients.get(i).getID().equals(ID)){
	        				k=1;
	        				JOptionPane.showMessageDialog(null,"����� �� ���� ���̵��Դϴ�.");
	        			}//j==1�̶�� ���� ���̵� ������
	        			
	            		}
	            		if(k==0){
	            			JOptionPane.showMessageDialog(null,"����� �� �ִ� ���̵��Դϴ�.");
	            		}
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				} finally {
					try {
						ois.close();
						fin.close();
					} catch (IOException ioe) {
					}
				}
				
				return null;
			}
		};
		worker.execute();
	}
	
	public void check(String name,String rrn,String tel,String ID,String pwd){
		
		ArrayList<client> clients = new ArrayList<client>();
		SwingWorker worker = new SwingWorker() {

			@Override
			protected Object doInBackground() throws Exception {
				// test for books
				
				FileInputStream fin = null;
				ObjectInputStream ois = null;
				
				int k=0;
				try {
					fin = new FileInputStream("client.dat");
					ois = new ObjectInputStream(fin);
					ArrayList list = (ArrayList) ois.readObject();
					
					for (int i = 0; i < list.size(); i++)
						{clients.add((client) list.get(i));}

					for(int i=0;i<clients.size();i++){
	        			if(clients.get(i).getID().equals(ID)){
	        				k=1;
	        				JOptionPane.showMessageDialog(null,"���̵� �ߺ�Ȯ���� ���ּ���.");
	        			}//j==1�̶�� ���� ���̵� ������
	            		}
	            		if(k==0){
	            			JOptionPane.showMessageDialog(null,"ȸ�������� �Ϸ� �Ǿ����ϴ�.");
	            			adduser(name,rrn,tel,ID,pwd);
	            			setVisible(false);
	            		}
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				} finally {
					try {
						ois.close();
						fin.close();
					} catch (IOException ioe) {
					}
				}
				
				return null;
			}
		};
		worker.execute();

		
	}
	
	
	public panel4(){
		setTitle("ȸ������");
		getContentPane();
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
		
		/*String name =text1.getText();
    	String rrn = text2_1.getText()+text2_2.getText();
    	String tel = text3.getText();
    	String ID = text4.getText();
    	String pwd = text5.getText();*/
		
		checkid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	String ID = text4.getText();
        
            	int k=0;
            	if(ID.equals("")){JOptionPane.showMessageDialog(null,"���̵� �Է����ּ���.");}
            	else{
            		checkid(ID);
            	}
            	

            	
            }
		});
		
		check.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	int k=0;
            	String name =text1.getText();
            
            	String rrn = text2_1.getText()+text2_2.getText();
            	String tel = text3.getText();
            	String ID = text4.getText();
            	String pwd = text5.getText();
            	if(name.equals("")){
            		JOptionPane.showMessageDialog(null,"�̸��� �Է����ּ���.");
            	}
            	else if(text2_1.getText().length()!=6){
            		JOptionPane.showMessageDialog(null,"�ֹε�Ϲ�ȣ ���ڸ� 6�ڸ��� �Է����ּ���.");
            	}
            	else if(text2_2.getText().length()!=7){
            		JOptionPane.showMessageDialog(null,"�ֹε�Ϲ�ȣ ���ڸ� 7�ڸ��� �Է����ּ���.");
            	}
            	else if(pwd.equals("")){
            		JOptionPane.showMessageDialog(null,"��й�ȣ�� �Է����ּ���.");
            	}
            	else{
            		check(name,rrn,tel,ID,pwd);
            	}
            	
            }
        });
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
		setPreferredSize(new Dimension(350,350));
		pack();
		setVisible(true);
	}

}
