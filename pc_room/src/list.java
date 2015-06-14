import java.awt.print.Book;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingWorker;


public class list extends JFrame{
	JTable tableBook = new javax.swing.JTable();
	private JScrollPane scrollpane;
	public list() {
		scrollpane = new javax.swing.JScrollPane();
		tableBook = new javax.swing.JTable();
		setTitle("회원 목록");
		addlist();
		scrollpane.setViewportView(tableBook);
		getContentPane().add(scrollpane, java.awt.BorderLayout.CENTER);	
		pack();
		setVisible(true);
	}
	public void addlist(){
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
				tableBook.setModel(new listTable(clients));
				return null;
			}
		};
		worker.execute();
	}
	
	
	

}
