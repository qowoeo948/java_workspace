package animal;
public class Duck extends Bird{
	//Duck is a Bird
	//Duck���� Bird���̴�
	//������ ����
	String name="�� ����";

	public void quack(){
	System.out.println("�в�");
	}

	public static void main(String[] args){
	Duck d1 = new Duck();
	Duck d2 = new Duck();

	Bird b = new Bird();

	//b=new Duck(); �̰� ����

	//��ü �ڷ����� �ڷ����̴�!!
	Duck a = new Duck();
	Bird r = new Bird();
	r = a ; //ū <- ����  ����
	a = r ; // ��<-ū  �Ұ���
	//a=(Duck)r;   ����  ��<--ū  downcasting
	//r = (Bird)a;  ����  ū<--���� upcasting

	//���: ��ü�ڷ����� �ڷ����̹Ƿ�, �⺻�ڷ����� ��Ģ�� ���κ� �״�� ����ǰ� �ִ�.
	//���κ� �״�� ����ǰ� �ִ�...

	}
}
