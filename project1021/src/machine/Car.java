
class Car{
	String color="red";
	int price=500;
	String name ="benz";
	Wheel wheel;  //���ڵ尡 ������ ���� ����? 
						//Ŭ���� �ȿ��� �ڷ����� �� �� �ִµ�, �ڹ��� �ڷ����� �� 4���̴�.
						//���� �� Ŭ�����ȿ��� ����,����,���� �̿ܿ��� ��ü���� �ü��ִ�.
						//��ü �ڷ����� �ڷ����̴ϱ�....

	//Ŭ������� ������ �̸��� �޼��带 ������ �����ڶ� �ϰ�,
	//�����ڴ� �̸����� �� �˼� �ֵ���, ��ü ���� Ÿ�ӿ�, ���� �ʱ�ȭ�� �۾��� ������,
	//�۾��� �����ϴ� �뵵�� �޼����̴�.
	public Car(){
	//this.wheel=new Wheel();
	wheel=new Wheel(); //this������
	}

	public static void main(String[] args){
	Car c = new Car();
	System.out.println(c.name);
		
	
	//c.wheel=new Wheel(); //�� ������ٴ� ������ �̿��ϴ°� ����
	System.out.println(c.wheel.brand);
	
	//Wheel w = new Wheel();
	//System.out.println(w.brand);
	//System.out.println(w.color);
	//System.out.println(w.price);

	}

}
