import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;


public class panel2 extends JFrame{
	int i =0;
	int price;
	JTextArea timecheck=new JTextArea(4,7);
	ArrayList<usinglist> user = new ArrayList<usinglist>();
	public panel2(String name ,String ID){
		Calendar calendar = Calendar.getInstance();
        java.util.Date date = calendar.getTime();
        String start = (new SimpleDateFormat("yyyy년MM월dd일HH시mm분").format(date));
       
		getContentPane();
		setLayout(new BorderLayout());
		timecheck.setEditable(false);
		
		timecheck.setFont(new Font("궁서",Font.PLAIN,27));
		timecheck.setText("\n       "+(++i)+"분\n");
		timecheck.append("       "+i*20+"원");
		javax.swing.Timer t = new javax.swing.Timer(1000, new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	        	   
	              timecheck.setText("\n       "+(++i)+"분\n");
	              timecheck.append("       "+i*20+"원");
	          }
	       });
		JButton food = new JButton("음식주문" );
		food.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new panel3();
                
            }
        });
		
		
		JButton end = new JButton("종료" );
		end.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	price+=i*20;
                JOptionPane.showMessageDialog(null,"요금은 "+price+"원 입니다.");
                Calendar calendar = Calendar.getInstance();
                java.util.Date date = calendar.getTime();
                String end = (new SimpleDateFormat("yyyy년MM월dd일HH시mm분").format(date));
                setVisible(false);
                add(name,ID,start,end,price);
                
            }
        });
		
		Panel textpanel = new Panel();
		Panel buttonpanel = new Panel();
		textpanel.add(timecheck);
		buttonpanel.add(food);

		buttonpanel.add(end);
		add("North", textpanel);
		add("Center", buttonpanel);
		setPreferredSize(new Dimension(330,270));
		pack();
		setVisible(true);
		
		t.start();
		
		
	}
	public void add(String name,String ID,String start,String end,int price){
		usinglist one = new usinglist(name,ID,start,end,price);
		user.add(one);
		save(one);
	}
	public void save(usinglist one){
		SwingWorker worker = new SwingWorker(){
			
			@Override
			protected Object doInBackground() throws Exception {
				FileOutputStream fout = null;
				ObjectOutputStream oos = null;

				
				
				try{fout = new FileOutputStream("use.dat");
					oos = new ObjectOutputStream(fout);

					oos.writeObject(one);//
					oos.reset();
					

				} catch (Exception e) {
					System.out.println(e.getMessage());
				} finally {
					try {
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


}
