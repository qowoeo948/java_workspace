/*Use��Ű������ Account ���� Ŭ���� �����ϱ�*/
package use;

//UseAccount(����Ϸ��� ��ü) -->Account(������ ��ü, �����Ǿ����)
import bank.Account;
class UseAccount{
	public static void main(String[] args){
	Account acc = new Account();  //���� Ŭ���� ����(public�̶� ���� ������ ������)
	
	//���� ������ ���� �����غ���

	//bank ����� -> public   ������ ���� ����
	//System.out.println(acc.bank);

	//customer ���̸� -> protected  ��Ӱ��迡 �ְų�, ������Ű���� ��쿡�� ���� ����
	//���� UseAccount�� Account�� ��Ӱ��谡 ���� ���� �ٸ� ��Ű�� �̹Ƿ�, ������ ���� �Ұ���
	//System.out.println(acc.customer);


	//num ���¹�ȣ -> �����ڰ� �ƹ��͵� ��� ���� ����. �̷��� ���������ڸ� default���������ڶ� �Ѵ�
	//�츮�� default��� Ű���带 ����ϸ� �ȵ�. �׳� ���־���
	//default���� �����ڴ� ���� ��Ű���� �ִ� Ŭ���������� ������ ������ֹǷ� 
	//protected���� �Ѵܰ� �� ��ٷӴ�. (�� ��Ӱ��迡 �־, ���� ��Ű���� �ƴ϶�� ���ٺҰ���)
	//�츮�� ���ݱ��� �ǽ��ߴ� ��� Ŭ������ ��� default����, �츮�� ���� ���丮 �ȿ��� �ǽ���
	//�ؿԱ� ������ �̷� ������ ������ �������̴�.
	//System.out.println(acc.num);

	//balance �ݾ� -> private  AccountŬ���� �����θ� ���� ����..
	//���� �츮�� Account�ڽ��� �ƴ϶�, ���� ���� ��� �Ұ� �����..
	//System.out.println(acc.balance);

	//acc.balance=10; //�̹���� ���� ������ �Ұ���
	acc.setBalance(10); //10������ ���� �޼��带 ���ؼ��� ���ٰ���
	//�׷��� ������ �ܰ� ��� Ȯ���ұ�? ������ ������ ��������...
	//�ܰ� ������ �ƴ϶�, �ܰ� �����Ϸ��� �� ���� �޼��带 �����ؾ� �Ѵ�.

	//�ܰ�Ȯ��
	System.out.println(acc.getBalance());

	System.out.println(acc.balance);
	}
}
