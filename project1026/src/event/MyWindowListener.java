package event;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
//������â�� ������� �߻��� �� �ִ� �̺�Ʈ�� �����ϴ� ������ �����ϱ�
public class MyWindowListener implements WindowListener{

	public void windowActivated(WindowEvent e){
		System.out.println("windowActivatedȣ��");  //Ȱ��ȭ(��, Ŀ���� ����â���ö�ö�)
	}
	public void windowClosed(WindowEvent e){
		System.out.println("windowClosedȣ��"); //â�� ������
	}
	public void windowClosing(WindowEvent e){
		System.out.println("windowClosingȣ��"); //x���� ��,�ݱ� ��ư�� ���� ��(����������)
	}
	public void windowDeactivated(WindowEvent e){
		System.out.println("windowDeactivatedȣ��"); //��Ȱ��ȭ
	}
	public void windowDeiconified(WindowEvent e){ 
		System.out.println("windowDeiconifiedȣ��"); //�ٽ�Ŀ����,�ö����
	}
	public void windowIconified(WindowEvent e){
		System.out.println("windowIconifiedȣ��"); //�۾�����,������ ��������
	}
	public void windowOpened(WindowEvent e){
		System.out.println("windowOpenedȣ��"); //â�� �� ��
	}
}
