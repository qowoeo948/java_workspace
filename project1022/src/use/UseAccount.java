/*Use패키지에서 Account 계좌 클래스 접근하기*/
package use;

//UseAccount(사용하려는 객체) -->Account(사용당할 객체, 공개되어야함)
import bank.Account;
class UseAccount{
	public static void main(String[] args){
	Account acc = new Account();  //계좌 클래스 생성(public이라 여기 까지는 가능함)
	
	//접근 제한자 별로 접근해보기

	//bank 은행명 -> public   무조건 접근 가능
	//System.out.println(acc.bank);

	//customer 고객이름 -> protected  상속관계에 있거나, 같은패키지인 경우에만 접근 가능
	//현재 UseAccount는 Account와 상속관계가 없고 서로 다른 패키지 이므로, 데이터 접근 불가능
	//System.out.println(acc.customer);


	//num 계좌번호 -> 개발자가 아무것도 명시 하지 않음. 이러한 접근제한자를 default접근제한자라 한다
	//우리가 default라는 키워드를 명시하면 안됨. 그냥 냅둬야함
	//default접근 제한자는 같은 패키지에 있는 클래스끼리만 접근을 허용해주므로 
	//protected보다 한단계 더 까다롭다. (즉 상속관계에 있어도, 같은 패키지가 아니라면 접근불가함)
	//우리가 지금까지 실습했던 모든 클래스가 사실 default였고, 우리는 같은 디렉토리 안에서 실습을
	//해왔기 떄문에 이런 에러를 만나지 않은것이다.
	//System.out.println(acc.num);

	//balance 금액 -> private  Account클래스 스스로만 접근 가능..
	//따라서 우리는 Account자신이 아니라서, 절대 절대 사용 불가 폐쇄적..
	//System.out.println(acc.balance);

	//acc.balance=10; //이방법은 직접 접근이 불가능
	acc.setBalance(10); //10원으로 수정 메서드를 통해서만 접근가능
	//그런데 수정된 잔고를 어떻게 확인할까? 변수에 접근을 막았으니...
	//잔고 수정이 아니라, 잔고에 접근하려는 것 또한 메서드를 제공해야 한다.

	//잔고확인
	System.out.println(acc.getBalance());

	System.out.println(acc.balance);
	}
}
