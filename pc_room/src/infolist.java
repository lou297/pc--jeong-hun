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

public class infolist extends JFrame{
	main a =new main();
	public infolist(){
		
		getContentPane();
		setLayout(new GridLayout(3,1));
		JLabel name1 = new JLabel("이름", Label.RIGHT);
		JTextField name = new JTextField(15);
		JButton search = new JButton("검색");
		
		
		search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	int k =0;
            	String name2=name.getText();

            	if(name.getText().equals("")){
            		JOptionPane.showMessageDialog(null,"이름을 입력해주세요.");
            	}
            	
            	
            	else{
            		name(name2);
            	}
            	
            }
        });
		

		JPanel login1 = new JPanel();
		JPanel login2 = new JPanel();
		JPanel login3 = new JPanel();
		login1.add(name1);
		login1.add(name);
		
		login3.add(search);
		add("West", login1);
		
		add("West", login3);
		setPreferredSize(new Dimension(250,250));
		pack();
		setVisible(true);
	}
	
	public void name(String name2){
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
				for(int i =0;i<clients.size();i++){
        			if(clients.get(i).getname().equals(name2)){
        				k=1;
        				
        			}
        		}
				new infolist2(name2);
        		if(k==0){
        			JOptionPane.showMessageDialog(null,"일치하는 이름이 없습니다.");
        		}
				return null;
			}
		};
		worker.execute();
	}
	
	

}
