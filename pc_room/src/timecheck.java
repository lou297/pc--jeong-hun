public class timecheck extends Thread {
	/**
	 * �ʸ� ǥ���� ����
	 */
	private  int i =0;
	
	@Override
	public void run() {
		
		//��� �ʸ� ǥ���ϱ� ���ؼ�..
		while(true)
		{
			try {
				//1�ʸ��� �޽��� ǥ��
				showSec();
				// 1�ʸ��� ����
				sleep(60000);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

	/**
	 *  �޽��� ǥ��
	 */
	private void showSec() {
		System.out.println((++i)+"��");
		
	}
	
}


