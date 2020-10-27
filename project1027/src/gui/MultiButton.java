package gui;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.TextField;

public class MultiButton extends Frame{
	Button bt1;
	Button bt2;
	TextField t;

	public MultiButton(){
	bt1 = new Button("��ư1");
	bt2 = new Button("��ư2");
	t = new TextField(20);
	
	this.setLayout(new FlowLayout());
	
	this.add(bt1);
	this.add(bt2);
	this.add(t);

	MyActionListener listener = new MyActionListener(bt1,bt2,t);

	bt1.addActionListener(listener); //��ư�� ������ ����
	bt2.addActionListener(listener); //��ư�� ������ ����
	t.addActionListener(listener); //�ؽ�Ʈ�ڽ����� Ŭ���̺�Ʈ ���� ����...


	this.setSize(300,400);
	this.setVisible(true);
	}
	public static void main(String[] args){
	new MultiButton();
	}
}
