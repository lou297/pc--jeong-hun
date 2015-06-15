import java.io.Serializable;


public class uselist implements Serializable {
	
	private String name;
	private String ID;
	private String start;
	private String end;
	private String price;


	public uselist(String name,String ID,String start,String end,String price){
		this.name=name;
		this.ID=ID;
		this.start=start;
		this.end=end;
		this.price=price;
	}
	public String getname(){
		return name;
	}
	public String getID(){
		return ID;
	}
	public String getstart(){
		return start;
	}
	public String getend(){
		return end;
	}
	public String getprice(){
		return price;
	}
	
	public void setname(String name){
		this.name=name;
	}
	public void setID(String ID){
		this.ID=ID;
	}
	public void setstart(String start){
		this.start=start;
	}
	public void setend(String end){
		this.end=end;
	}
	public void setprice(String price){
		this.price=price;
	}
}
