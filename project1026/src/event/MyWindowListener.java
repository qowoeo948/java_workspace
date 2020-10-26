package event;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
//윈도우창을 대상으로 발생할 수 있는 이벤트를 감지하는 리스너 구현하기
public class MyWindowListener implements WindowListener{

	public void windowActivated(WindowEvent e){
		System.out.println("windowActivated호출");  //활성화(즉, 커서가 현재창에올라올때)
	}
	public void windowClosed(WindowEvent e){
		System.out.println("windowClosed호출"); //창이 닫히면
	}
	public void windowClosing(WindowEvent e){
		System.out.println("windowClosing호출"); //x누를 때,닫기 버튼을 누를 때(닫히진않음)
	}
	public void windowDeactivated(WindowEvent e){
		System.out.println("windowDeactivated호출"); //비활성화
	}
	public void windowDeiconified(WindowEvent e){ 
		System.out.println("windowDeiconified호출"); //다시커지기,올라오고
	}
	public void windowIconified(WindowEvent e){
		System.out.println("windowIconified호출"); //작아지기,밑으로 내려가고
	}
	public void windowOpened(WindowEvent e){
		System.out.println("windowOpened호출"); //창이 뜰 때
	}
}
