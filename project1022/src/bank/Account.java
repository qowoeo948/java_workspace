package bank;

/*고객의 계좌를 정의한다: 업무가 신중해짐..예민한 데이터를 많이 다룸
	패키지에 넣은 클래스를 public으로 공개 하지 않으면, 다른 어떠한 클래스도 이 클래스를 사용할 수 없음
	이건 보안이 아니라, 그냥 의미 없는 짓이다.
	클래스는 쓰라고 만든것 이기 떄문에 public으로 공개하되, 그 안의 내용들에 대해 보안처리 하면되는것이다.
*/
//따라서 public으로 공개!
public class Account{
	/*계좌에 들어갈 만한 속성들 정의*/
	public String bank="기업은행"; //은행명
	protected String customer; //고객이름
	String num="002-388-85465"; //계좌 번호
	private int balance=100000; //금액
	
	//잔고수정
	public void setBalance(int balance){
	this.balance = balance;
	}
	
	//잔고확인 메서드
	//이와 같이 private로 선언된 변수의 값을 리턴하는 메서드를 가리켜 getter라 한다.
	//그리고 위와 같이 setBalance처럼 private변수의 값을 변경하는 메서드를 setter라 한다.
	//getter,setter는 아주아주 유명한 메서드 정의 기법이다.
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
