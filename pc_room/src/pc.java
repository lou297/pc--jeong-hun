import java.util.ArrayList;
import java.util.Scanner;


public class pc {
	ArrayList<client> clientlist = new ArrayList<client>();
	
	public void login(String ID,String pwd,int check){
		
		for(int i =0;i<clientlist.size();i++){
			if(clientlist.get(i).getID()==ID&&clientlist.get(i).getpwd()==pwd){
				System.out.println("�α��� �Ǿ����ϴ�.");
				check=1;
				break;
			}
		}
	}
	
	public void addprice(int price,String ID, String pwd){
		for(int i =0;i<clientlist.size();i++){
			if(clientlist.get(i).getID()==ID&&clientlist.get(i).getpwd()==pwd){
				clientlist.get(i).setprice(price);
			}
		}
	}

	public static void start(){
		pc a = new pc();
		Scanner s = new Scanner(System.in);
		while(true){
			int num =1;
			System.out.println("1.ȸ������ 2.�α���");
			int select = s.nextInt();
			if(select==1){
				int price = 0;
				System.out.println("�̸� �ֹι�ȣ ��ȭ��ȣ ID ��й�ȣ ");
				String name = s.next();
				int rrn = s.nextInt();
				int tel = s.nextInt();
				String ID = s.next();
				String pwd = s.next();
				a.clientlist.add(new client(num,name,rrn,tel,ID,pwd,price));
				num++;
			}
			else{
				int check =0;
				System.out.println("ID ��й�ȣ");
				String ID = s.next();
				String pwd = s.next();
				a.login(ID, pwd,check);
				if(check==1){break;}
				else{System.out.println("ID�Ǵ� ��й�ȣ�� Ʋ���ϴ�.");}
			}
		}
		
		System.out.println("1.���� 2.�ĺ�");
		int pricecheck=s.nextInt();
		if(pricecheck==1){
			System.out.println("��� �� �ð��� �Է��ϼ���(�ð� ����)");
			int time = s.nextInt();
			int price=1200*time;
			//a.addprice(price,ID,pwd);
		}
		
		while(true){
			System.out.println("1.�����ֹ� 2.�ð��߰� 3.ī���ͷ� �޼��� 4.������������ 5.����");
		}
	}
}
