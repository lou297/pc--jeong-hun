import java.util.ArrayList;
import java.util.Scanner;


public class pc {
	ArrayList<client> clientlist = new ArrayList<client>();
	
	public void login(String ID,String pwd,int check){
		
		for(int i =0;i<clientlist.size();i++){
			if(clientlist.get(i).getID()==ID&&clientlist.get(i).getpwd()==pwd){
				System.out.println("로그인 되었습니다.");
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
			System.out.println("1.회원가입 2.로그인");
			int select = s.nextInt();
			if(select==1){
				int price = 0;
				System.out.println("이름 주민번호 전화번호 ID 비밀번호 ");
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
				System.out.println("ID 비밀번호");
				String ID = s.next();
				String pwd = s.next();
				a.login(ID, pwd,check);
				if(check==1){break;}
				else{System.out.println("ID또는 비밀번호가 틀립니다.");}
			}
		}
		
		System.out.println("1.선불 2.후불");
		int pricecheck=s.nextInt();
		if(pricecheck==1){
			System.out.println("사용 할 시간을 입력하세요(시간 단위)");
			int time = s.nextInt();
			int price=1200*time;
			//a.addprice(price,ID,pwd);
		}
		
		while(true){
			System.out.println("1.음식주문 2.시간추가 3.카운터로 메세지 4.개인정보변경 5.종료");
		}
	}
}
