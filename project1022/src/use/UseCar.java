package use;
import car.Taxi; //����ϰ��� �ϴ� �ý� ����Ʈ
import car.Truck;
import car.Bus;
//�Ѳ����� �ϴ� ���
//import car.*;  ������ ���ε��� ���ִ°��� ����

class UseCar{

	public static void main(String[] args){
	Taxi t = new Taxi(); //�ý��� �ν��Ͻ� ����, 
								//���ͺ��� �ýø� �����ɰ� ������ �ýú��� �ռ� �θ��� Car�� �����ؾ�
								//�ýõ� ������ �� �ֱ� ������ Car�ν��Ͻ��� �����ȴ�

	
	t.pass();
	t.move(); //�и� move()�޼���� �ýÿ� ���µ��� �̰� ȣ��ȴٸ� ��� �����Ȱ���
	}

}
