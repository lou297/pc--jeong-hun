import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.UIManager;


public class panel2 extends JFrame{
	int i =0;
	JTextArea timecheck=new JTextArea(5,7);
	public panel2(){
		getContentPane();
		setLayout(new BorderLayout());
		timecheck.setEditable(false);
		
		timecheck.setFont(new Font("�ü�",Font.PLAIN,27));
		timecheck.setText("\n\n       "+i+"��");
		javax.swing.Timer t = new javax.swing.Timer(60000, new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              timecheck.setText("\n\n       "+(++i)+"��");
	          }
	       });
		JButton food = new JButton("�����ֹ�" );
		food.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new panel3();
                setVisible(false);
            }
        });
		JButton send = new JButton("ī���ͷ� �޼���" );
		JButton mile = new JButton("���ϸ���" );
		JButton end = new JButton("����" );
		
		Panel textpanel = new Panel();
		Panel buttonpanel = new Panel();
		textpanel.add(timecheck);
		buttonpanel.add(food);
		buttonpanel.add(send);
		buttonpanel.add(mile);
		buttonpanel.add(end);
		add("North", textpanel);
		add("Center", buttonpanel);
		setPreferredSize(new Dimension(350,350));
		pack();
		setVisible(true);
		t.start();
	}


}
