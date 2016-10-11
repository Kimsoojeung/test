package exercisehelloworld;

public class helloworld {

	private String msg;
	static int count=0;
	static String prefix="";
	
	public helloworld(){
		msg="helloworld";
	}
	public helloworld(String msg){
		this.msg=msg;
	}
	public helloworld(String msg, int option){
		if(option==1)
			this.msg=msg;
		else if(option==2)
			this.msg=msg+", æ»≥Á«œººø‰";
	}
	public void print(){
		count++;
		System.out.println("["+count+"]"+prefix+msg);
	}
	//public void print(){
		//System.out.println(msg);
	//}
	public String getMsg(){
		return msg;
	}
	public void setMsg(String msg){
		this.msg=msg;
	}
	public void go(){
		helloworld hello1=new helloworld();
		hello1.print();
		
		helloworld hello2=new helloworld("my hello world");
		hello2.print();
		
		helloworld hello3=new helloworld("hello", 2);
		hello3.print();
		
		hello2.setMsg("π›∞©Ω¿¥œ¥Ÿ!");
		System.out.println(hello2.getMsg());
		
		helloworld.prefix="greetings";
		hello2.print();
		hello3.print();
		
		helloworld.prefix="¿ŒªÒ∏ª : ";
		hello2.print();
		hello3.print();
	}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("helloworld");
		helloworld hr=new helloworld();
		hr.go();
	}*/

}
