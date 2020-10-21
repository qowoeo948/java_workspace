class HighHeel{
	String color;  

	public HighHeel(String color){
	this.color=color;
	}
	public void setColor(String color){
		this.color=color;
	}
	public static void main(String[] args){
	HighHeel h = new HighHeel("red");
	h.setColor("red");

	System.out.println(h.color);
	}
	
}
