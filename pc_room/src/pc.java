import java.util.ArrayList;
import java.util.Scanner;


public class pc {
	ArrayList<client> clientlist = new ArrayList<client>();
	
	public void login(String ID,String pwd,int check){//로그인 아이디 비밀번호 확인
		
		for(int i =0;i<clientlist.size();i++){
			if(clientlist.get(i).getID()==ID&&clientlist.get(i).getpwd()==pwd){
				System.out.println("로그인 되었습니다.");
				check=1;
				break;
			}
		}
	}
	
	public void addprice(int time,int index){//지불해야하는 요금 추가	
		int price=1200*time;
		clientlist.get(index).setprice(price);	
	}
	
	
	
	public void sendmessage(String msg){//카운터로 메세지 전송
		System.out.println(msg);
		System.out.println("전송 되었습니다.");
	}

	public void set_telpwd(int pwdnow,int index){
		Scanner s= new Scanner(System.in);
		System.out.println("변경 할 전화번호 비밀번호");
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
					System.out.println("1.회원가입 2.로그인");
				int select = s.nextInt();
				if(select==1){
					int price = 0;
					int using =0;
					System.out.println("이름 주민번호 전화번호 ID 비밀번호 ");
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
					System.out.println("ID 비밀번호");
					String ID = s.next();
					String pwd = s.next();
					a.login(ID, pwd,check);
					if(check==1){choice=2;}
					else{System.out.println("ID또는 비밀번호가 틀립니다.");}
				}
			}
			
			else if(choice==2){
				System.out.println("1.선불 2.후불");
				int pricecheck=s.nextInt();
				if(pricecheck==1){
					System.out.println("사용 할 시간을 입력하세요(시간 단위)");
					int time = s.nextInt();
					a.addprice(time,index);
					choice=3;
				}
				else{choice=4;}
			}
			
			else if(choice==3||choice==4){
				System.out.println("1.음식주문 2.시간추가(선불일때) 3.카운터로메세지 4.개인정보변경 5.종료 6.컴퓨터종료");
				int order = s.nextInt();
				if(order==1){
					System.out.println("1.햄버거(2000) 2.소세지(2000) 3.라면(1500)"
							+ "4.콜라(1000) 5.사이다(1000) 6.커피(1000)");
					
					
				}
				else if(order==2){
					if(choice==3){
						System.out.println("추가 할 시간을 입력하시오.");
						int time=s.nextInt();
						a.addprice(time,index);
					}
					else{System.out.println("후불 계산은 시간을 추가할 수 없습니다.");}
				}
				else if(order==3){
					System.out.println("전송할 메세지를 입력하세요.");
					String msg = s.next();
					a.sendmessage(msg);
				}
				else if(order==4){
					System.out.println("현재 비밀번호를 입력해주세요.");
					
				}
				else if(order==5){
					System.out.println("정말로 종료하시겠습니까?(네/아니요)");
					String end =s.next();
					if(end.equals("네")){choice=0;}
				}
				else {break;}
			}
			
		}
	}
		
				
}