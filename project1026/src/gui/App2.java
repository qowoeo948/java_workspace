package gui;
import java.awt.*;
import java.awt.event.*;
public class App2 extends Frame{
	Label lb_id;
	Label lb_pass;
	TextField tf_id;
	TextField tf_pass;
	Button bt1;
	Button bt2;
	Panel pncenter;
	Panel pnsouth;
	
	public App2(){
		lb_id = new Label("ID");
		lb_pass = new Label("PASSWORD");
		tf_id = new TextField();
		tf_pass = new TextField();
		bt1 = new Button("동동");
		bt2 = new Button("규규");
		pncenter = new Panel();
		pnsouth = new Panel();

		this.add(pncenter,BorderLayout.CENTER);
		pncenter.setBackground(Color.YELLOW);
		this.add(pnsouth,BorderLayout.SOUTH);
		pnsouth.setBackground(Color.GREEN);

		pncenter.setLayout(new GridLayout(2,2));
		pncenter.add(lb_id);
		pncenter.add(tf_id);
		pncenter.add(lb_pass);
		pncenter.add(tf_pass);

		pnsouth.add(bt1);
		pnsouth.add(bt2);


		this.setSize(250,250);
		this.setVisible(true);

	}

	public static void main(String[] args){

	new App2();
	}
		

}

