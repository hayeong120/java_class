
public class MainCar {

	public static void main(String[] args) {
//		//MyCar.HANDLE = 3;		// final를 붙였기 때문에 에러
//		System.out.println("핸들수는 " + MyCar.HANDLE);
//			
//		MyCar.test();
//		//System.out.println("속력은 " + MyCar.speed);		// new를 안했기에 에러
		
		MyCar c1 = new MyCar();
		//c1.display();		// 초기화를 안 했으므로 기본값 출력
		
		//c1.speed = 100;		// private이므로 에러 발생 
		 c1.setSpeed(100);
		 c1.display();
		 
//		 int r = c1.getSpeed();
//		 System.out.println(r);
		 
		 System.out.println(c1.getSpeed());
		 //System.out.println(c1.setSpeed());		// void 
		 
		 
		 System.out.println("=====생성자 오버로딩=====");
		 
		 MyCar choi = new MyCar();
		 choi.display();
		 
		 MyCar jinho = new MyCar(200);
		 jinho.display();
		 
		 MyCar seungho = new MyCar("BMW", 4);
		 seungho.display();
		 
		 MyCar jihyang = new MyCar(300, 6);
		 jihyang.display();	 
		 jihyang.display("벤츠", 500, 4);
		 
//		 choi.test();
//		 jinho.test();
//		 seungho.test();
//		 jihyang.test();
		 MyCar.test();
		 
	}

}
