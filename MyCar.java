
public class MyCar {		// 클래스 선언
	// 클래스 멤버 : 생성자, 멤버 변수, 메소드
	
	// 멤버변수
	private int speed;	// 전역변수
	int wheel;
	public String irum;
	public final static int HANDLE = 1;		// 대문자로 써주는 것이 개발자들의 약속		// final를 쓸 때는 무조건 초기화
	
	
	// 생성자, 생성자 오버로딩
	public MyCar() {
		
	}	
	
	public MyCar(int speed) {
		this.speed = speed;
	}

	public MyCar(int speed, int wheel) {
		this(speed);		// this.speed = speed;
		this.wheel = wheel;			// this는 첫줄에 한 번밖에 못 쓴다.
	}
	
	public MyCar(String irum, int wheel) {
		this.irum = irum;
		this.wheel = wheel;
	}
	
	public MyCar(int wheel, String irum) {
		this.wheel = wheel;
		this.irum = irum;
	}

	public MyCar(int speed, int wheel, String irum) {
		this(speed);		// this.speed = speed;
		this.wheel = wheel;
		this.irum = irum;
	}

	
	// 정보 은닉 : 정당한 권한을 행사하는 것
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	// 메소드 	[접근제어자] 리턴 타입 메소드명([매개변수...]) {}
	public void display() {	// 메소드명은 소문자로 시작
		System.out.println("이름:" + this.irum + ", 속도:" + this.speed + ", 바퀴수:" + this.wheel);	// this 상관X
	}
	
	// 메소드 오버로딩
	public void display(String irum, int speed, int wheel) {	
		System.out.println("이름:" + irum + ", 속도:" + speed + ", 바퀴수:" + wheel);	// this 상관O
	}
	
	public static void test() {		// static메소드에는 static변수만 입력가능
		System.out.println("static 메소드 수행");
		System.out.println("핸들수는 " + MyCar.HANDLE);
		//System.out.println(speed);	//   멤버변수이므로 에러
	}
	
}
