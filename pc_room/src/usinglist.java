public class usinglist {
	String name_;
	String ID_;
	String start;
	String end;
	int price;
	public usinglist(String name_,String ID_,String start,String end,int price){
		this.name_= name_;
		this.ID_ =ID_;
		this.start=start;
		this.end=end;
		this.price=price;
		
	}
	
	public String getname_(){
		return name_;
	}
	public String getID_(){
		return ID_;
	}
	public String getstart(){
		return start;
	}
	public String getend(){
		return end;
	}
	public int getprice(){
		return price;
	}
	
	public void setname_(String name_){
		this.name_=name_;
	}
	public void setID_(String ID_){
		this.ID_=ID_;
	}
	public void setstart(String start){
		this.start=start;
	}
	public void setend(String end){
		this.end=end;
	}
	public void setprice(int price){
		this.price=price;
	}
	
}
