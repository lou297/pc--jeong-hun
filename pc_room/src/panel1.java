import java.awt.AWTEvent;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingWorker;


public class panel1 extends JFrame{
	public panel1(){
		setTitle("�α���ȭ��");
		getContentPane();
		setLayout(new GridLayout(3,1));
		JLabel label1 = new JLabel("���̵�", Label.RIGHT);
		JTextField idTF = new JTextField(15);
		JLabel label2 = new JLabel("��й�ȣ", Label.RIGHT);
		JTextField pwd = new JTextField(15);
		JButton log = new JButton("�α���");
		JButton add = new JButton("ȸ������");
		
		log.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	if(idTF.getText().equals("")){
            		JOptionPane.showMessageDialog(null,"���̵� �Է����ּ���.");
            	}
            	else if(pwd.getText().equals("")){
            		JOptionPane.showMessageDialog(null,"��й�ȣ�� �Է����ּ���.");
            	}
            	else{
            		call(idTF,pwd);
            		
            	}
            	
                
                
            }
        });
		add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new panel4();
            }
        });

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
		setPreferredSize(new Dimension(350,350));
		pack();
		setVisible(true);
	}
	public void call(JTextField id,JTextField pwd){
		ArrayList<client> clients = new ArrayList<client>();
		SwingWorker worker = new SwingWorker() {

			@Override
			protected Object doInBackground() throws Exception {
				// test for books
				
				FileInputStream fin = null;
				ObjectInputStream ois = null;
				

				try {
					fin = new FileInputStream("client.dat");
					ois = new ObjectInputStream(fin);
					ArrayList list = (ArrayList) ois.readObject();
					
					for (int i = 0; i < list.size(); i++)
						clients.add((client) list.get(i));

				} catch (Exception e) {
					System.out.println(e.getMessage());
				} finally {
					try {
						ois.close();
						fin.close();
					} catch (IOException ioe) {
					}
				}
				int k =0;
				for(int i=0;i<clients.size();i++){
		    		
					if(id.getText().equals(clients.get(i).getID())){
						k=1;
						if(pwd.getText().equals(clients.get(i).getpwd())){
							getname(id.getText());
						}
						else {
							
							JOptionPane.showMessageDialog(null,"��й�ȣ�� Ʋ���ϴ�.");
							break;
						}
						
					}
					
		    	}
				if(k==0){
						JOptionPane.showMessageDialog(null,"�������� �ʴ� ���̵��Դϴ�.");
					}
				
				return null;
			}
		};
		
		worker.execute();
		
		
		
	}
	String name=null;
	public void getname(String id){
		
		ArrayList<client> clients = new ArrayList<client>();
		SwingWorker worker = new SwingWorker() {

			@Override
			protected Object doInBackground() throws Exception {
				// test for books
				
				FileInputStream fin = null;
				ObjectInputStream ois = null;
				

				try {
					fin = new FileInputStream("client.dat");
					ois = new ObjectInputStream(fin);
					ArrayList list = (ArrayList) ois.readObject();
					
					for (int i = 0; i < list.size(); i++)
						clients.add((client) list.get(i));

				} catch (Exception e) {
					System.out.println(e.getMessage());
				} finally {
					try {
						ois.close();
						fin.close();
					} catch (IOException ioe) {
					}
				}
				
				
				int k=0;
				for(int i =0;i<clients.size();i++){
					if(clients.get(i).getID().equals(id)){
						name = (clients.get(i).getname());
						k=1;
					}
					
				}
				new panel2(name,id);
				setVisible(false);
				return null;
				
			}
		};
		
		worker.execute();
		//return name;
		
	}
	
	
	

}
