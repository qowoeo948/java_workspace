package bank;

/*���� ���¸� �����Ѵ�: ������ ��������..������ �����͸� ���� �ٷ�
	��Ű���� ���� Ŭ������ public���� ���� ���� ������, �ٸ� ��� Ŭ������ �� Ŭ������ ����� �� ����
	�̰� ������ �ƴ϶�, �׳� �ǹ� ���� ���̴�.
	Ŭ������ ����� ����� �̱� ������ public���� �����ϵ�, �� ���� ����鿡 ���� ����ó�� �ϸ�Ǵ°��̴�.
*/
//���� public���� ����!
public class Account{
	/*���¿� �� ���� �Ӽ��� ����*/
	public String bank="�������"; //�����
	protected String customer; //���̸�
	String num="002-388-85465"; //���� ��ȣ
	private int balance=100000; //�ݾ�
	
	//�ܰ����
	public void setBalance(int balance){
	this.balance = balance;
	}
	
	//�ܰ�Ȯ�� �޼���
	//�̿� ���� private�� ����� ������ ���� �����ϴ� �޼��带 ������ getter�� �Ѵ�.
	//�׸��� ���� ���� setBalanceó�� private������ ���� �����ϴ� �޼��带 setter�� �Ѵ�.
	//getter,setter�� ���־��� ������ �޼��� ���� ����̴�.
	public int getBalance(){
	return balance;
	}

	public void setNum(String num){
		this.num = num;
	}
	public String getNum(){
	return num;
	}

	

}
