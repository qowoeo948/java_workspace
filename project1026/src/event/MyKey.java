package event;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
//Ű����� ������ �̺�Ʈ�� �߻��ϸ�, �ڹ� ����ӽ��� KeyListener���� keyEvent
//�ν��Ͻ��� �����Ѵ�..
//�� ���޵� �ν��Ͻ��� KeyListener�� ������ �߻�޼���鿡 ���޵Ǿ����Ƿ�,
//�����ڴ� �߻�޼��带 �������ϸ鼭 ���ϴ� ������ �ۼ��ϸ� �ȴ�.
public class MyKey implements KeyListener{
	//�������̵��ϰ�, Ű���� ���������� ������? �޼��� ������ ó��..
	

	//keyListener�� ��� �������� �޼��尡 ���� 3���� �ȴ�.
	public void keyPressed(KeyEvent e){
	//System.out.println("KeyPressed called..");
	//Ű�� ������
	}

	public void keyReleased(KeyEvent e){
	System.out.println("keyReleased called..");
	//Ű�� ������ �� ��
	}

	public void keyTyped(KeyEvent e){
	//System.out.println("keyTyped called..");
	//Ű�� ĥ ��..
	}

}
