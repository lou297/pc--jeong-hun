import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
            		for(int i =0;i<a.call().size();i++){
            		if(((client) a.call().get(i)).getname().equals(name2)){
            			k=1;
            			
            		}
            		
            		
            		}
            		if(k==0){
            			JOptionPane.showMessageDialog(null,"일치하는 이름이 없습니다.");
            		}
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
	

}
