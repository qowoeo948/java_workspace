/*�ʱ�ȭ ��*/
class InitalBlock{
	//��������ȿ� {����ȭ}������ �� �ǹ̴�?
	{

	int sum=0;
	for(int i=1;i<=10;i++){
	sun+=i;
	}
	 //�� Ŭ������ �ν��Ͻ��� �����ɶ����� �̿����� ȣ���ϰ� ��...
	 //�ν��Ͻ��ʱ�ȭ���̶� �Ѵ�.
	 System.out.println("�ν��Ͻ� �ʱ�ȭ �� ȣ��");
	}

	//static�ʱ�ȭ ��
	//main() �޼��忡 ���� ���� ������, ����Ǵ� �ʱ�ȭ ��
	static{
	System.out.println("�����ϱ��� �ʱ�ȭ �ϰڽ��ϴ�");
	System.out.println("A");

	}

	public static void main(String[] args){
		int a=3;

		//�׳� ��ȭ ���ѳ��� ����.
		//Ȥ���� �̾ȿ� ������ �����ϸ� �ش� ����������
		//��ȿ�ϴ�
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
