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
		
		timecheck.setFont(new Font("궁서",Font.PLAIN,27));
		timecheck.setText("\n\n       "+i+"분");
		javax.swing.Timer t = new javax.swing.Timer(60000, new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	              timecheck.setText("\n\n       "+(++i)+"분");
	          }
	       });
		JButton food = new JButton("음식주문" );
		food.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new panel3();
                setVisible(false);
            }
        });
		JButton send = new JButton("카운터로 메세지" );
		JButton mile = new JButton("마일리지" );
		JButton end = new JButton("종료" );
		
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
