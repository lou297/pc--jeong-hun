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

public class info extends JFrame{
	main a =new main();
	public info(){
		
		getContentPane();
		setLayout(new GridLayout(3,1));
		JLabel name1 = new JLabel("이름", Label.RIGHT);
		JTextField name = new JTextField(15);
		JLabel rrn0 = new JLabel("주민등록번호", Label.RIGHT);
		JTextField rrn = new JTextField(7);
		Label mid = new Label("-", Label.CENTER);
		JTextField rrn1 = new JTextField(7);
		JButton search = new JButton("검색");
		
		
		search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	
            	String name2=name.getText();
            	String rrn3=rrn.getText();
            	String rrn4=rrn1.getText();
            	String rrn2 = rrn.getText()+rrn1.getText();
            	if(name.getText().equals("")){
            		JOptionPane.showMessageDialog(null,"이름을 입력해주세요.");
            	}
            	else if(rrn.getText().equals("")||rrn1.getText().equals("")){
            		JOptionPane.showMessageDialog(null,"주민등록번호를 입력해주세요.");
            	}
            	else{
            		modify(name2,rrn3,rrn4,rrn2);
            	}
            	
            }
        });
		

		JPanel login1 = new JPanel();
		JPanel login2 = new JPanel();
		JPanel login3 = new JPanel();
		login1.add(name1);
		login1.add(name);
		login2.add(rrn0);
		login2.add(rrn);
		login2.add(mid);
		login2.add(rrn1);
		login3.add(search);
		add("West", login1);
		add("West", login2);
		add("West", login3);
		setPreferredSize(new Dimension(300,280));
		pack();
		setVisible(true);
	}
	
	public void modify(String name2,String rrn3 ,String rrn4,String rrn2 ){
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
				int j=0;
				for(int i =0;i<clients.size();i++){
					
            		if(clients.get(i).getname().equals(name2)){
            			k=1;
            			if(clients.get(i).getrrn().equals(rrn2)){
            				j=1;
            				
            				new info2(name2,rrn3,rrn4);
            				setVisible(false);
            				break;
            			}
            		} 
            			
            		}
            		if(k==1&&j==0){
            				JOptionPane.showMessageDialog(null,"주민등록번호가 일치하지 않습니다.");}
            		
            		
            		if(k==0){
            			JOptionPane.showMessageDialog(null,"일치하는 이름이 없습니다.");
            		}
				return null;
			}
		};
		worker.execute();
	}
	
}
