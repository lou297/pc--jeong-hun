import java.util.ArrayList;
import java.util.Scanner;


public class pc {
	ArrayList<client> clientlist = new ArrayList<client>();
	
	public void login(String ID,String pwd,int check){//�α��� ���̵� ��й�ȣ Ȯ��
		
		for(int i =0;i<clientlist.size();i++){
			if(clientlist.get(i).getID()==ID&&clientlist.get(i).getpwd()==pwd){
				System.out.println("�α��� �Ǿ����ϴ�.");
				check=1;
				break;
			}
		}
	}
	
	public void addprice(int time,int index){//�����ؾ��ϴ� ��� �߰�	
		int price=1200*time;
		clientlist.get(index).setprice(price);	
	}
	
	
	
	public void sendmessage(String msg){//ī���ͷ� �޼��� ����
		System.out.println(msg);
		System.out.println("���� �Ǿ����ϴ�.");
	}

	public void set_telpwd(int pwdnow,int index){
		Scanner s= new Scanner(System.in);
		System.out.println("���� �� ��ȭ��ȣ ��й�ȣ");
		int tel=s.nextInt();
		String pwd = s.next();
		clientlist.get(index).settel(tel);
		clientlist.get(index).setpwd(pwd);
	}
	
	public static void start(){
		pc a = new pc();
		Scanner s = new Scanner(System.in);
		while(true){
			int choice=0;
			int num =1;
			int index=num;
			
			if(choice==0){
					System.out.println("1.ȸ������ 2.�α���");
				int select = s.nextInt();
				if(select==1){
					int price = 0;
					int using =0;
					System.out.println("�̸� �ֹι�ȣ ��ȭ��ȣ ID ��й�ȣ ");
					String name = s.next();
					int rrn = s.nextInt();
					int tel = s.nextInt();
					String ID = s.next();
					String pwd = s.next();
					a.clientlist.add(new client(num,name,rrn,tel,ID,pwd,price,using));
					num++;
				}
				else{
					int check =0;
					System.out.println("ID ��й�ȣ");
					String ID = s.next();
					String pwd = s.next();
					a.login(ID, pwd,check);
					if(check==1){choice=2;}
					else{System.out.println("ID�Ǵ� ��й�ȣ�� Ʋ���ϴ�.");}
				}
			}
			
			else if(choice==2){
				System.out.println("1.���� 2.�ĺ�");
				int pricecheck=s.nextInt();
				if(pricecheck==1){
					System.out.println("��� �� �ð��� �Է��ϼ���(�ð� ����)");
					int time = s.nextInt();
					a.addprice(time,index);
					choice=3;
				}
				else{choice=4;}
			}
			
			else if(choice==3||choice==4){
				System.out.println("1.�����ֹ� 2.�ð��߰�(�����϶�) 3.ī���ͷθ޼��� 4.������������ 5.���� 6.��ǻ������");
				int order = s.nextInt();
				if(order==1){
					System.out.println("1.�ܹ���(2000) 2.�Ҽ���(2000) 3.���(1500)"
							+ "4.�ݶ�(1000) 5.���̴�(1000) 6.Ŀ��(1000)");
					
					
				}
				else if(order==2){
					if(choice==3){
						System.out.println("�߰� �� �ð��� �Է��Ͻÿ�.");
						int time=s.nextInt();
						a.addprice(time,index);
					}
					else{System.out.println("�ĺ� ����� �ð��� �߰��� �� �����ϴ�.");}
				}
				else if(order==3){
					System.out.println("������ �޼����� �Է��ϼ���.");
					String msg = s.next();
					a.sendmessage(msg);
				}
				else if(order==4){
					System.out.println("���� ��й�ȣ�� �Է����ּ���.");
					
				}
				else if(order==5){
					System.out.println("������ �����Ͻðڽ��ϱ�?(��/�ƴϿ�)");
					String end =s.next();
					if(end.equals("��")){choice=0;}
				}
				else {break;}
			}
			
		}
	}
		
				
}