import java.io.Serializable;


public class foodlist implements Serializable{
	private String id;
	private String start;
	private String price;

	public foodlist(String id,String start,String price){
		this.id=id;
		this.start=start;
		this.price=price;
	}
	public String getid(){
		return id;
	}
	public String getstart(){
		return start;
	}
	public String getprice(){
		return price;
	}
	public void setname(String id){
		this.id=id;
	}
	public void setstart(String start){
		this.start=start;
	}
	public void setprice(String price){
		this.price=price;
	}
	
	
}
