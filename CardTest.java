
public class CardTest {

	public static void main(String[] args) {

		System.out.println("카드의 넓이 : " + Card.width);
		//System.out.println("카드의 무늬 : " + Card.kind);
		
		Card c1 = new Card();
		c1.kind = "스페이드";
		c1.number = 3;
		
		
		Card c2 = new Card();
		c2.kind = "다이아몬드";
		c2.number = 9;
		
//		Card c3 = new Card();
//		c3.kind = "하트";
//		c3.number = 7;
//		c3.width = 100;
//		c3.height = 250;
		
		System.out.println("c1은 " + c1.kind + c1.number + "이며, 크기는 (" + c1.width + "," + c1.height + ")");
		
		Card.width = 80;	// =c1.width = 80;
		Card.height = 120;
	}

}
