import java.util.List;

import javax.swing.table.AbstractTableModel;

public class useTable extends AbstractTableModel {
	private final static String[] COLUMNS = { "이름", "아이디", "시작시간",
			"종료시간", "요금"};

	private List<uselist> uselists;

	public useTable(List<uselist> uselists) {
		this.uselists = uselists;
	}

	@Override
	public int getRowCount() {
		return uselists.size();
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
		uselist usinglist = uselists.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return usinglist.getname();
		case 1:
			return usinglist.getID();
		case 2:
			return usinglist.getstart();
		case 3:
			return usinglist.getend();
		case 4:
			return usinglist.getprice();


		}
		return null;
	}

}
