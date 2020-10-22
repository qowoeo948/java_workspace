package use;
import animal.Dog; //Dog라는 클래스의 package선언부를 그대로 적으면 된다.
		//사용하고자 하는 클래스의 위치 명시
class UseDog{
	public static void main(String[] args){
	//현재 클래스와는 다른 경로에 있는 클래스를 사용 
	//컴파일러가 어떻게 Dog.class를 찾을 수 있는지 알아야 한다.
	//현재로서는 컴파일러가 UseDog와 같은 디렉토리만 찾아 헤맵니다.
	//따라서 아래의 코드는 cant find sysmol에러가 날것이다.
	//이 문제를 해결하려면, 클래스의 경로를 알려줘야 하는데,
	//일반적으로 경로를 등록할때는 환경변수를 이용한다.
	//경로가 일반 파일일 경우는 path 환경변수 이지만,
	//경로가 클래스 파일일 경우는 classpath 환경변수를 이용하면 된다
	//이때, classpath 환경변수에 어느 경로를 등록해야 할지 고민!!

		Dog d = new Dog();
		d.run(); //메서드 호출 추가하고 재 컴파일!
	}
}
