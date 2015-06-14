import java.util.List;

import javax.swing.table.AbstractTableModel;

public class listTable extends AbstractTableModel {
	private final static String[] COLUMNS = { "이름", "주민번호", "전화번호",
			"아이디", "비밀번호"};

	private List<client> clients;

	public listTable(List<client> clients) {
		this.clients = clients;
	}

	@Override
	public int getRowCount() {
		return clients.size();
	}

	@Override
	public int getColumnCount() {
		return COLUMNS.length;
	}

	@Override
	public String getColumnName(int column) {
		return COLUMNS[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		client client = clients.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return client.getname();
		case 1:
			return client.getrrn();
		case 2:
			return client.gettel();
		case 3:
			return client.getID();
		case 4:
			return client.getpwd();


		}
		return null;
	}

}
