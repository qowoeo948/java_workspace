package event;
import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Choice;

class MyWin extends Frame{
					//MyWin is a Frame
	Button bt; //MyWin has a bt
	TextField t;
	Choice ch; //html������ select�ڽ��� ����

	public MyWin(){
	bt = new Button("�� ������");
	t = new TextField(15);
	ch = new Choice();

	//ch�� ������ ä���
	ch.add("java programing");
	ch.add("JSP programing");
	ch.add("Android programing");
	ch.add("Spring programing");
	ch.add("Mybatis programing");

	this.setLayout(new FlowLayout());
	//��ư�� �����쿡 ����!!
	this.add(bt); //�������� ����Ʈ�� BorderLayout�̹Ƿ�, ���Ϳ����� ũ�� ��������
	this.add(t);
	this.add(ch);

	//��ư�� ������ ����!!
	bt.addActionListener(new MyListener());
	//�ؽ�Ʈ�ڽ��� ������ ����!!
	t.addKeyListener(new MyKey());
	//���콺 ������ ����
	this.addMouseListener(new MyMouse());
	//���̽��� ������ ����
	ch.addItemListener(new MyItem()); 

	this.addWindowListener(new MyWindowListener());
	
	this.setSize(300,400);
	this.setVisible(true);
	}

	public static void main(String[] args){
		new MyWin();
	}
}
