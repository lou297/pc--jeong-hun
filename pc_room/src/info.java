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

public class info extends JFrame{
	main a =new main();
	public info(){
		
		getContentPane();
		setLayout(new GridLayout(3,1));
		JLabel name1 = new JLabel("�̸�", Label.RIGHT);
		JTextField name = new JTextField(15);
		JLabel rrn0 = new JLabel("�ֹε�Ϲ�ȣ", Label.RIGHT);
		JTextField rrn = new JTextField(7);
		Label mid = new Label("-", Label.CENTER);
		JTextField rrn1 = new JTextField(7);
		JButton search = new JButton("�˻�");
		
		
		search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	
            	int k =0;
            	String name2=name.getText();
            	String rrn3=rrn.getText();
            	String rrn4=rrn1.getText();
            	String rrn2 = rrn.getText()+rrn1.getText();
            	if(name.getText().equals("")){
            		JOptionPane.showMessageDialog(null,"�̸��� �Է����ּ���.");
            	}
            	else if(rrn.getText().equals("")||rrn1.getText().equals("")){
            		JOptionPane.showMessageDialog(null,"�ֹε�Ϲ�ȣ�� �Է����ּ���.");
            	}
            	else{
            		for(int i =0;i<a.call().size();i++){
            		if(((client) a.call().get(i)).getname().equals(name2)){
            			k=1;
            			if(((client) a.call().get(i)).getrrn().equals(rrn2)){
            				new info2(name2,rrn3,rrn4);
            				setVisible(false);
            			}
            			else{
            				JOptionPane.showMessageDialog(null,"�ֹε�Ϲ�ȣ�� ��ġ���� �ʽ��ϴ�.");
            			}
            		}
            		System.out.println(k);
            		
            		}
            		if(k==0){
            			JOptionPane.showMessageDialog(null,"��ġ�ϴ� �̸��� �����ϴ�.");
            		}
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
	

}
