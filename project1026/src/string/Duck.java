package string;
//자바의 모든 객체는 절대 피할 수없는 최상위 객체를 두고 있다.
//Object 객체이다.개발자가 상속을 명시하지 않더라도 디폴트로 이미 상속되어 있다..
class Duck{
	String name="오리";

	/*아래의 메서드는 Object클래스로부터 상속받은 메서드이며,
		이 메서드는 객체를 스트링으로 반환하고자 할 때 동작한다.
		즉 아래의 메서드는, 객체를 출력하고자 할때 등에 자동으로 동작한다.

		아래의 메서드는 Object의 메서드이지만, 테스트로 동작하는 시점을 알기위해 잠시
		오버라이드해봤다.. 부모꺼를 오버라이드하면 자식껄 우선으로 호출하니까 밑에께 호출되는겨

		결론" 예를 들어 String s1 = "apple"; 여기서 주소값이 아닌 apple이 나오는 이유는
		toString떄문이다!

	*/
	public String toString(){
		System.out.println("toString()메서드 동작합니다.");
		return "";
	}
	public static void main(String[] args){
	Duck d = new Duck();

	System.out.println(d); //오리 자체가 아니라 오리의 주소값이 나온다.
	System.out.println(new Duck());//오리자체를 출력
	}
}
