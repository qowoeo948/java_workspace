package use;
import car.Taxi; //사용하고자 하는 택시 임포트
import car.Truck;
import car.Bus;
//한꺼번에 하는 방법
//import car.*;  하지만 따로따로 해주는것이 좋음

class UseCar{

	public static void main(String[] args){
	Taxi t = new Taxi(); //택시의 인스턴스 생성, 
								//얼핏보면 택시만 생성될거 같지만 택시보다 앞선 부모인 Car가 존재해야
								//택시도 존재할 수 있기 떄문에 Car인스턴스도 생성된다

	
	t.pass();
	t.move(); //분명 move()메서드는 택시에 없는데도 이게 호출된다면 상속 성공된거임
	}

}
