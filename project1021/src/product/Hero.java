public class Hero {
	int hp=10;
	boolean fly=false;
	String name="�ް���";
	//Bullet bullet; //��ü���̹Ƿ�, has a����

	
	public void setHp(int hp) { //hp ���� �����ϰ� �ʹ� 
		this.hp=hp;
		System.out.println(hp);
	}
	public void setFly(boolean fly) {//fly ���� �����ϰ� �ʹ�
	this.fly=fly;
	System.out.println(fly);
	}
	public void setName(String name) {//name ���� �����ϰ� �ʹ�		
	this.name=name;
	System.out.println(name);
	}
	
	//public void fire(Bullet bullet){//bullet �� �ٸ� ����� �����ϰ� �ʹ�
	//this.bullet = bullet
	//}

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.setHp(200);
		hero.setFly(true);
		hero.setName("�Ⱑ��");
		//Bullet b = new Bullet();
		//hero.fire(b);	

		
	}	
}
