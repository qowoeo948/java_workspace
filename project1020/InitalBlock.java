/*초기화 블럭*/
class InitalBlock{
	//멤버영역안에 {지역화}시켰을 때 의미는?
	{

	int sum=0;
	for(int i=1;i<=10;i++){
	sun+=i;
	}
	 //이 클래스의 인스턴스가 생성될때마다 이영역을 호출하게 됨...
	 //인스턴스초기화블럭이라 한다.
	 System.out.println("인스턴스 초기화 블럭 호출");
	}

	//static초기화 블럭
	//main() 메서드에 의해 실행 직전에, 수행되는 초기화 블럭
	static{
	System.out.println("실행하기전 초기화 하겠습니다");
	System.out.println("A");

	}

	public static void main(String[] args){
		int a=3;

		//그냥 블럭화 시켜놓은 것임.
		//혹여나 이안에 변수를 선언하면 해당 블럭내에서만
		//유효하다
		//{
		//	int b=5;
		//}
	//System.out.println(b);

	System.out.println("B");
	new InitalBlock();
	new InitalBlock();
	new InitalBlock();
	}
	
}
