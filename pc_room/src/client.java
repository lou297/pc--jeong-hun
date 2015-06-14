import java.io.Serializable;


public class client implements Serializable {
	
	
	private String name;
	private String rrn;//주민등록번호
	private String tel;
	private String ID;
	private String pwd;
	
	
	
	
	public client(String name,String rrn,String tel,String ID,String pwd){
	
	this.name = name;
	this.rrn = rrn;
	this.tel = tel;
	this.ID = ID;
	this.pwd = pwd;
	
	}
	
	
	public String getname(){
		return name;
	}
	public String getrrn(){
		return rrn;
	}
	public String gettel(){
		return tel;
	}
	public String getID(){
		return ID;
	}
	public String getpwd(){
		return pwd;
	}
	
	
	public void setname(String name){
		this.name =  name;
	}
	public void setrrn(String rrn){
		this.rrn = rrn;
	}
	public void settel(String tel){
		this.tel= tel;
	}
	public void setID(String ID){
		this.ID = ID;
	}
	public void setpwd(String pwd){
		this.pwd = pwd;
	}
	
}
	
	
	