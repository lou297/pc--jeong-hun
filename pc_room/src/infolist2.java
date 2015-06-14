import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class infolist2 extends JFrame{
	JTable tableBook = new javax.swing.JTable();
	private JScrollPane scrollpane;
	panel2 a = new panel2(null,null);
	public infolist2(String name) {
		scrollpane = new javax.swing.JScrollPane();
		tableBook = new javax.swing.JTable();
		setTitle("사용 목록");
		ArrayList<usinglist> user = new ArrayList<usinglist>();
		for(int i=0;i<a.user.size();i++){
			if(a.user.get(i).getname_().equals(name)){
				user.add(a.user.get(i));
			}
		}
		tableBook.setModel(new useTable(user));
		scrollpane.setViewportView(tableBook);
		getContentPane().add(scrollpane, java.awt.BorderLayout.CENTER);	
		pack();
		setVisible(true);
	}
	
	
	

}