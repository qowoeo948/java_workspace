class UseCat{
	public static void main(String[] args){
	Cat c = new Cat(); //����� �ν��Ͻ� 1�� ����

	System.out.println("�̸�: "+c.name);
	System.out.println("����: "+c.age);
	System.out.println("��ȥ����: "+c.isMarried);

	c.walk();
	c.cry();

	}
}
