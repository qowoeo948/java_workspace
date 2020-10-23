package animal;
public class Duck extends Bird{
	//Duck is a Bird
	//Duck형은 Bird형이다
	//오리는 새다
	String name="난 오리";

	public void quack(){
	System.out.println("꽥꽥");
	}

	public static void main(String[] args){
	Duck d1 = new Duck();
	Duck d2 = new Duck();

	Bird b = new Bird();

	//b=new Duck(); 이것 가능

	//객체 자료형도 자료형이다!!
	Duck a = new Duck();
	Bird r = new Bird();
	r = a ; //큰 <- 작은  가능
	a = r ; // 작<-큰  불가능
	//a=(Duck)r;   가능  작<--큰  downcasting
	//r = (Bird)a;  가능  큰<--작은 upcasting

	//결론: 객체자료형도 자료형이므로, 기본자료형의 원칙이 상당부분 그대로 적용되고 있다.
	//상당부분 그대로 적용되고 있다...

	}
}
