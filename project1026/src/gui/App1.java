/*
윈도우에 들어갈 수 있는 여러 컴포넌트 알아보기
ex)버튼,텍스트필드,라디오박스,체크박스,초이스,이미지,textarea.....
*/
package gui;
import java.awt.Frame; //사용하려는 클래스의 위치 등록
							//어딘가에 .class로 존재하기 때문에 사용가능할 것이다..

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Image;
import java.awt.Toolkit;

class App1{
	public static void main(String[] args){
	//윈도우 생성

	//난생 처음보는 클래스를 만났을 때 대처법
	/*
	대응,대처자세0. 사용하려는 클래스가 대충 어떤 목적으로 지원되는것인지 그용도 파악
	대응,대처자세1. 자바의 모든 객체는 결국 3가지 유형밖에 없다.
	대응,대처자세2. 클래스는 쓰라고 만든것이다, 따라서 메모리에 올리는 법만 알면된다.

	1)일반클래스: new하면 된다!!! new뒤의 생성자 조사!!(api문서를 통해)
	2)추상클래스: new불가하므로, 자식을 정의해서 new하거나 이미 구현한
						인스턴스를 이용하면 된다. (api 문서 통해 구현한 인스턴스 가져오기)
	3)인터페이스: new불가하므로, 자식을 정의해서 new하거나 이미 구현한
						인스턴스를 이용하면 된다. (api 문서 통해 구현한 인스턴스 가져오기)
	*/

	//처음보지만, 일반이기 떄문에 new다음에 오는 생성자를 조사해서 사용
	Frame frame = new Frame(); //자바 윈도우프로그래밍에서의 윈도우!!
	//프레임은 디폴트가 눈에 보이지 않는 상태임, 따라서 보이도록 메서드 호출!!
	//frame.보여지게 하는 메서드
	frame.setVisible(true); //Window 객체로부터 상속받은 메서드
	//매개 변수로는 논리값을사용할 수 있다.
	frame.setSize(300,400);

	//윈도우가 생성되었으므로, 윈도우안에 배치할 각종 컴포넌트를 조사해보자!!
	//버튼 Button(일반,추상,인터조사 후 일반 new 생성자 조사)
	Button bt = new Button("나버튼");

	//버튼을 부착하기 전에, 레이아웃 스타일을 지정해야 하는데, 레이아웃은 추후 배울꺼니까
	//일단 FlowLayout을 사용해보자
	FlowLayout flow = new FlowLayout();
	frame.setLayout(flow); //윈도우에 플로우 방식의 배치적용

	//버튼을 윈도우 컨테이너에 부착하자~!!
	frame.add(bt);  //add메서드의 매개변수는 component형이므로, 
							//Button도 component의 자식이기 때문에 같은 자료형에 해당하여
							//add()의 인수로 올 수있다.

	

	//html에서의 input type="text"는 자바에서는 TextField라 한다.
	TextField t = new TextField("good",10);
	frame.add(t);

	//Checkbox
	Checkbox ch1 = new Checkbox("독서");
	Checkbox ch2 = new Checkbox("수영");
	Checkbox ch3 = new Checkbox("컴퓨터");
	frame.add(ch1);
	frame.add(ch2);
	frame.add(ch3);

	//TextArea
	TextArea area = new TextArea(5,20);
	frame.add(area);

	//그냥텍스트
	Label la = new Label("회원가입 양식입니다.");
	frame.add(la);

	//이미지 넣기!!
	//Image는 추상클래스 이며, 플랫폼(window,mac,linux)이 지정한 방식으로 얻을 수 있다..
	//플랫폼에 맞게 가져오려면, DefaultToolkit 클래스로부터 자원을 얻어야 한다.
	Toolkit kit = Toolkit.getDefaultToolkit(); //static메서드!!따라서 클래스명으로 접근할수있다.

	//툴킷은 이미지를 로컬상의 경로로부터 얻어올 수 있다.
	//경로사용시 주의할점: 역슬래시는 윈도우 os에만 사용하는 표기이므로,
	//지금 이 자바 코드가 모든 os에서 실행되려면, 사실 중립적인 경로로 가야한다.. 
	Image img = kit.getImage("C:/workspacedk/java_workspace/project1026/src/res/fire.jpg");
	//System.out.println("이지지 주소값은 "+img);
	

	//화면에 출력하는 수업은 오늘 불가..
	//왜? 지금까지 html에서는 이미지를 html문서에 덧붙여서 구현했으나, 자바와 같은 이반적인 컴파일
	//기반의 프로그래밍 언어에서는 랜더링(직접그리는 작업)을 해야 하기 때문이다..
	//그냥 add()한다고 되는게 아니다.
	}
}
