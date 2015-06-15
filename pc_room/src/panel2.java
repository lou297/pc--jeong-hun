import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
	int i =-1;
	int price=0;
	
	JTextArea timecheck=new JTextArea(4,7);
	ArrayList<uselist> user = new ArrayList<uselist>();
	public panel2(String name ,String ID){
		setTitle("pc화면");
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
                new panel3(ID,start);
                
            }
        });
		
		
		JButton end = new JButton("종료" );
		end.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	addprice(i*20);
            	
            	callprice(ID,start);
            	
            	t.stop();
                
                setVisible(false);
                Calendar calendar = Calendar.getInstance();
                java.util.Date date = calendar.getTime();
                String end = (new SimpleDateFormat("yyyy년MM월dd일HH시mm분").format(date));
               
                String price2=price+"";
                
                add(name,ID,start,end,price2);
                JOptionPane.showMessageDialog(null,"요금은 "+price+"원 입니다.");
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
	public void add(String name,String ID,String start,String end,String price){
		uselist one = new uselist(name,ID,start,end,price);
		
		user.add( one);
		
		save(user);
	}
	
	public void callprice(String id,String start){
		ArrayList<foodlist> list = new ArrayList<foodlist>();
		SwingWorker worker = new SwingWorker() {

			@Override
			protected Object doInBackground() throws Exception {
				// test for books
				
				FileInputStream fin = null;
				ObjectInputStream ois = null;
				

				try {
					fin = new FileInputStream("food.dat");
					ois = new ObjectInputStream(fin);
					ArrayList list2 = (ArrayList) ois.readObject();
					
					for (int i = 0; i < list2.size(); i++)
						list.add((foodlist) list2.get(i));
					for(int i =0;i<list.size();i++){
						
						if(list.get(i).getid().equals(id)){
							
							if(list.get(i).getstart().equals(start))
								
							addprice(Integer.parseInt(list.get(i).getprice()));
							
						}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				} finally {
					try {
						ois.close();
						fin.close();
					} catch (IOException ioe) {
					}
				}
				
				return null;
			}
		};
		
		worker.execute();
	}
	public void save(ArrayList one){
		
		SwingWorker worker = new SwingWorker(){
			
			@Override
			protected Object doInBackground() throws Exception {
				FileInputStream fin = null;
				ObjectInputStream ois = null;
				FileOutputStream fout = null;
				ObjectOutputStream oos = null;

				
				
				try{
					fin = new FileInputStream("use.dat");
					ois = new ObjectInputStream(fin);
					ArrayList list = (ArrayList) ois.readObject();
					
					for (int i = 0; i < list.size(); i++)
						one.add((uselist) list.get(i));
					
					
					fout = new FileOutputStream("use.dat");
					oos = new ObjectOutputStream(fout);

					oos.writeObject(one);//
					oos.reset();
					
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				} finally {
					try {
						ois.close();
						fin.close();
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
	
	public void addprice(int pri){
		
		price+=pri;
	}

}
