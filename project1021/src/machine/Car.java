
class Car{
	String color="red";
	int price=500;
	String name ="benz";
	Wheel wheel;  //이코드가 낯설지 않은 이유? 
						//클래스 안에는 자료형을 둘 수 있는데, 자바의 자료형은 총 4개이다.
						//따라서 이 클래스안에는 문자,숫자,논리값 이외에도 객체형도 올수있다.
						//객체 자료형도 자료형이니까....

	//클래스명과 동일한 이름의 메서드를 가리켜 생성자라 하고,
	//생성자는 이름에서 도 알수 있듯이, 객체 생성 타임에, 무언가 초기화할 작업이 있을때,
	//작업을 수행하는 용도의 메서드이다.
	public Car(){
	//this.wheel=new Wheel();
	wheel=new Wheel(); //this뺴도돼
	}

	public static void main(String[] args){
	Car c = new Car();
	System.out.println(c.name);
		
	
	//c.wheel=new Wheel(); //이 방법보다는 생성자 이용하는게 좋다
	System.out.println(c.wheel.brand);
	
	//Wheel w = new Wheel();
	//System.out.println(w.brand);
	//System.out.println(w.color);
	//System.out.println(w.price);

	}

}
