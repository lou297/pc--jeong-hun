
public class client {
	
	int num;
	String name;
	int rrn;//주민등록번호
	int tel;
	String ID;
	String pwd;
	int price;////음료,음식+사용시간의 총요금
	
	
	public client(int num,String name,int rrn,int tel,String ID,String pwd,int price){
	this.num = num;
	this.name = name;
	this.rrn = rrn;
	this.tel = tel;
	this.ID = ID;
	this.pwd = pwd;
	this.price = price;
	}
	
	public int getnum(){
		return num;
	}
	public String getname(){
		return name;
	}
	public int getrrn(){
		return rrn;
	}
	public int gettel(){
		return tel;
	}
	public String getID(){
		return ID;
	}
	public String getpwd(){
		return pwd;
	}
	public int getuprice(){
		return price;
	}
	public void setnum(int num){
		this.num = num;
	}
	public void setname(String name){
		this.name =  name;
	}
	public void setrrn(int rrn){
		this.rrn = rrn;
	}
	public void settel(int tel){
		this.tel= tel;
	}
	public void setID(String ID){
		this.ID = ID;
	}
	public void setpwd(String pwd){
		this.pwd = pwd;
	}
	public void setprice(int price){
		this.price += price;
	}
}
	
	
	