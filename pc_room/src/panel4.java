import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class panel4 extends JFrame{
	int k =0;
	int j=0;
	int r =0;
	
	ArrayList<client> user = new ArrayList<client>();
	
	public void adduser(String name,String rrn,String tel,String ID,String pwd){
		user.add(new client(name,rrn,tel,ID,pwd));
	}
	
	public void checkoverlap(String name,String rrn,int k){
		for(int i=0;i<user.size();i++){
			if(user.get(i).getname().equals(name)){
				if(user.get(i).getrrn().equals(rrn)){k=1;}//k==1이라면 이미 회원아이디가 존재함.
				else{k=2;}
			}
		}
	}
	
	public void checkID(String ID,int j){
		for(int i=0;i<user.size();i++){
			if(user.get(i).getID().equals(ID)){j=1;}//j==1이라면 같은 아이디가 존재함
			else{j=2;}
		}
	}
	
	public void entirecheck(int k,int j,int r){
		if(k==1){JOptionPane.showMessageDialog(null,"이미 존재하는 회원님의 아이디가 있습니다.");}
		else {
			if(j==1){JOptionPane.showMessageDialog(null,"아이디 중복확인을 해주세요.");}
			else if(j==2){JOptionPane.showMessageDialog(null,"이미 존재하는 아이디입니다.");}
			else{r=1;}
		}
		
	}
	
	public panel4(){
		getContentPane();
		setLayout(new GridLayout(6,1));
		JLabel label1 = new JLabel("이름", Label.RIGHT);
		JTextField text1 = new JTextField(10); 
		JLabel label2 = new JLabel("주민등록번호" ,Label.RIGHT);
		JTextField text2_1 = new JTextField(7);
		Label mid = new Label("-", Label.CENTER);
		JTextField text2_2 = new JTextField(7);
		JLabel label3 = new JLabel("전화번호" ,Label.RIGHT);
		JTextField text3 = new JTextField(15);
		JLabel label4 = new JLabel("아이디" ,Label.RIGHT);
		JButton checkid = new JButton("중복확인" );
		JTextField text4 = new JTextField(15);
		JLabel label5 = new JLabel("비밀번호" ,Label.RIGHT);
		JTextField text5 = new JTextField(15);
		JButton check = new JButton("회원가입" ); 
		
		/*String name =text1.getText();
    	String rrn = text2_1.getText()+text2_2.getText();
    	String tel = text3.getText();
    	String ID = text4.getText();
    	String pwd = text5.getText();*/
		
		checkid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	String ID = text4.getText();
            	checkID(ID,j);
            	if(j==1){JOptionPane.showMessageDialog(null,"사용할 수 없는 아이디입니다.");}
            	else if(j==2){JOptionPane.showMessageDialog(null,"사용할 수 있는 아이디입니다.");}
            }
		});
		
		
		check.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	String name =text1.getText();
            	String rrn = text2_1.getText()+text2_2.getText();
            	checkoverlap( name, rrn, k);
            	entirecheck( k, j, r);
            	if(r==1){
            		new panel1();
            		setVisible(false);
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
