class DataType3{

public static void main(String[] args) {
short s1=3; 
short s2=4; 
int a1 = 3;
int a2 = 4;

//정수의 연산수행에서 만일, 연산의 대상이 되는 데이터가 int형 보다
//작은 자료형일 경우(byte,short)연산속도를 높이기 위해, 연산에 최적화된
//자료형인 int형으로 자동 형변환을 일으킨다.
//형변환을 일으킨다.

short sum = s1+s2; 
//해결책 1) int sum = s1+s2;
//해결책 2) short sum = (short)(s1+s2);
//(short)에서의 소괄호를 cast연산자라 한다..
int result = a1+a2;

}
}
