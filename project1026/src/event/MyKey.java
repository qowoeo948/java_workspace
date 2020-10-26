package event;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
//키보드와 관련한 이벤트가 발생하면, 자바 가상머신이 KeyListener에게 keyEvent
//인스턴스를 전달한다..
//이 전달된 인스턴스는 KeyListener가 보유한 추상메서드들에 전달되어지므로,
//개발자는 추상메서드를 재정의하면서 원하는 로직을 작성하면 된다.
public class MyKey implements KeyListener{
	//오버라이딩하고, 키보드 누를때마다 눌렀어? 메세지 나오게 처리..
	

	//keyListener의 경우 재정의할 메서드가 무려 3개나 된다.
	public void keyPressed(KeyEvent e){
	//System.out.println("KeyPressed called..");
	//키를 누를때
	}

	public void keyReleased(KeyEvent e){
	System.out.println("keyReleased called..");
	//키를 눌렀다 뗄 때
	}

	public void keyTyped(KeyEvent e){
	//System.out.println("keyTyped called..");
	//키를 칠 때..
	}

}
