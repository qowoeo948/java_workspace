package event;
import java.awt.*;
import java.awt.event.*;

public class MultiActionListener implements ActionListener{
	//�� �޼����, ������ ��� ��ư�� ������ �Ѿ�´�!!
	public void actionPerformed(ActionEvent e){
	//������ �߻���Ų �̺�Ʈ�� ���� ��� ������ Event�ν��Ͻ��� ���޵Ǿ� ���Ƿ�
	//� ��ư�� ���ȴ����� �� �� �ִ�.
	System.out.println(e);

	//�̺�Ʈ ��ü�� �޼��� �߿�, �̺�Ʈ�� ����Ų ������Ʈ(�̺�Ʈ �ҽ�)�� �����ϴ� �޼��� 
	if(e.getSource()==bt1){ //�̺�Ʈ�� ����Ų ������ ��Ƴ��� �޼���
		 
	}

	
}