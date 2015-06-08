public class timecheck extends Thread {
	/**
	 * 초를 표시할 변수
	 */
	private  int i =0;
	
	@Override
	public void run() {
		
		//계속 초를 표시하기 위해서..
		while(true)
		{
			try {
				//1초마다 메시지 표시
				showSec();
				// 1초마다 슬립
				sleep(60000);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

	/**
	 *  메시지 표시
	 */
	private void showSec() {
		System.out.println((++i)+"분");
		
	}
	
}


