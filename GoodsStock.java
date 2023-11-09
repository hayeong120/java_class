
public class GoodsStock {
	
	String goodsCode;	// 상품 코드
	int stockNum=10;		// 재고 수량
	
	// 생성자 오버로딩
	public GoodsStock() {	// 기본생성자
		
	}
	
	public GoodsStock(String goodsCode, int stockNum) {		// 생성자
		this.goodsCode = goodsCode;		// this를 꼭 붙여야함
		this.stockNum = stockNum;		// 지역변수 > 전역변수
	}

	// 입고
	void addStock(int amount) {		// void 이므로 return이 없다.
		stockNum += amount;
	}
	
	// 출고
	int subtractStock(int amount) {	 
		if(stockNum<amount) {
			System.out.println("물품 수량이 부족합니다.");
			return 0;
		}
		stockNum -= amount;
		return stockNum;
	}
}
