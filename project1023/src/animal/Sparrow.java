//������ �����Ѵ�
package animal;
public class Sparrow extends Bird{
	String name="�� ����";

	public void jjack(){
	System.out.println("����");
	}

	//�ڽ�Ŭ�������� �θ�� �ڡڡ�100%�ڡڡڡ�(�Ű������� �ٲٴ°͵� xxx)������ �޼��带 �����ϴ�
	//����� �������̵��̶� �Ѵ�. (overriding)
	//�� �����ϴ°�? 
	//������ �޼��带 �ڽĿ���, ����� ����, �߰� �ϴ� ���� ���׷��̵� �ϰ� ���� �� ���

	//���� ! �������� vs ����������
	/*
	�����ε��� ���� Ŭ����������, ����� ����� �޼������ ���� ���� ������ ����, �Ű������� ������
	�ڷ������� �����ϸ� �ߺ����Ǹ� �������ְڴ�.

	�������̵��� ��Ӱ��迡�� �ڽ��� �θ��� �޼��带 ������ �ϴ� ���
	*/
	public void fly(){
	System.out.println("������ ���ƿ�");
	}

	public static void main(String[] args){
		Sparrow sp = new Sparrow();
		sp.fly(); //������ �޼��� ȣ��

		Bird bird = new Bird();
		bird.fly(); //�θ��� ���� �޼��� ȣ��

		Bird bird2 = new Sparrow();
		bird2.fly();
	}

}
