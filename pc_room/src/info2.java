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

public class info2 extends JFrame{
	main a  = new main();
	
	public void modify(JTextField text1,JTextField text2,JTextField text3
			,JTextField text4,JTextField text5,JTextField text6){
		String name=text1.getText();
		String rrn=text2.getText()+text3.getText();
		String tel=text4.getText();
		String ID=text5.getText();
		String pwd=text6.getText();
		for(int i =0;i<a.call().size();i++){
			if(((client) a.call().get(i)).getname().equals(name)){
				if(((client) a.call().get(i)).getrrn().equals(rrn)){
					a.call().set(i,new client(name,rrn,tel,ID,pwd));
				}
			}
		}
		
	}
	
	
	
		
	
	

	
	
	
	
	
	public info2(String name,String rrn1,String rrn2){
		getContentPane();
		setLayout(new GridLayout(6,1));
		JLabel label1 = new JLabel("이름", Label.RIGHT);
		JTextField text1 = new JTextField(10); 
		text1.setText("name");
		text1.setEditable(false);
		JLabel label2 = new JLabel("주민등록번호" ,Label.RIGHT);
		JTextField text2_1 = new JTextField(7);
		text2_1.setText(rrn1);
		text2_1.setEditable(false);
		Label mid = new Label("-", Label.CENTER);
		JTextField text2_2 = new JTextField(7);
		text2_2.setText(rrn2);
		text2_2.setEditable(false);
		JLabel label3 = new JLabel("전화번호" ,Label.RIGHT);
		JTextField text3 = new JTextField(15);
		JLabel label4 = new JLabel("아이디" ,Label.RIGHT);
		JButton checkid = new JButton("중복확인" );
		JTextField text4 = new JTextField(15);
		JLabel label5 = new JLabel("비밀번호" ,Label.RIGHT);
		JTextField text5 = new JTextField(15);
		JButton check = new JButton("수정" ); 
		
		/*String name =text1.getText();
    	String rrn = text2_1.getText()+text2_2.getText();
    	String tel = text3.getText();
    	String ID = text4.getText();
    	String pwd = text5.getText();*/
		
		checkid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	String ID = text4.getText();
        
            	int k=0;
            	if(ID.equals("")){JOptionPane.showMessageDialog(null,"아이디를 입력해주세요.");}
            	else{
            		for(int i=0;i< a.call().size();i++){
        			if( ((client)a.call().get(i)).getID().equals(ID)){
        				k=1;
        				JOptionPane.showMessageDialog(null,"사용할 수 없는 아이디입니다.");
        			}//j==1이라면 같은 아이디가 존재함
        			
            		}
            		if(k==0){
            			JOptionPane.showMessageDialog(null,"사용할 수 있는 아이디입니다.");
            		}
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
            		JOptionPane.showMessageDialog(null,"이름을 입력해주세요.");
            	}
            	else if(text2_1.getText().length()!=6){
            		JOptionPane.showMessageDialog(null,"주민등록번호 앞자리 6자리를 입력해주세요.");
            	}
            	else if(text2_2.getText().length()!=7){
            		JOptionPane.showMessageDialog(null,"주민등록번호 뒷자리 7자리를 입력해주세요.");
            	}
            	else if(pwd.equals("")){
            		JOptionPane.showMessageDialog(null,"비밀번호를 입력해주세요.");
            	}
            	else{
            		for(int i=0;i<a.call().size();i++){
        			if(((client)a. call().get(i)).getID().equals(ID)){
        				k=1;
        				JOptionPane.showMessageDialog(null,"아이디 중복확인을 해주세요.");
        			}//j==1이라면 같은 아이디가 존재함
            		}
            		if(k==0){
            			modify(text1,text2_1,text2_2,text3,text4,text5);
            			JOptionPane.showMessageDialog(null,"수정 되었습니다.");
            			setVisible(false);
            		}
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
