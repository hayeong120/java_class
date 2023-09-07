//public class Lotto {
//
//	public static void main(String[] args) {
//		int count = 1000;	// 백만원
//		int lotto[] = new int[7];	// 당첨번호 6개 + 보너스 번호 1개 
//		int human[] = new int[6];
//		int lucky = 0; 	// 맞힌 숫자의 갯수
//		int lucky_b = 0; 	// 보너스번호 일치:1, 불일치:0
//		int rank1=0, rank2=0, rank3=0, rank4=0, rank5=0;
//		
//		// 로또 당첨번호
//		for (int i=0; i<lotto.length; i++) {
//			lotto[i] = (int)(Math.random()*45) + 1;
//			for (int j=0; j<i; j++) {
//				if(lotto[i]==lotto[j]) {
//					i--;
//					break;
//				}
//			} // for j
//		} // for i
//		
//		for (int k=1; k<=count; k++) {
//			System.out.printf("[제 %5d회] : ", k);
//			for (int i=0; i<6; i++) {
//				System.out.print(lotto[i] + " ");
//			}
//			System.out.println();
//		}
//		System.out.printf("[%2d]\t", lotto[6]);
//			
//		//사용자 지정 번호
//			for (int i=0; i<human.length; i++) {
//				human[i] = (int)(Math.random()*45) + 1;
//				for (int j=0; j<i; j++) {
//					if(human[i]==human[j]) {
//						i--;
//						break;
//					} else if (human[i] != lotto[i] && j == 5) {
//		                  System.out.printf("%2d ", human[i]);
//		               }  
//				} // for j
//			} // for i
//			
//		//보너스 번호 확인
//			  int i1;
//		         for (i1 = 0; i1 < human.length; i1++) {
//		            if (lotto[6] == human[i1]) {
//		               lucky_b = 1;
//		               break;
//		            }   //if
//		         }   //i1
//
//		switch(lucky) {
//			case 6:
//	            System.out.println("*****[ 1등 ]*****");
//	            rank1++;
//	            break;
//	         case 5:
//	            if(lucky_b==1) {
//	               System.out.print("[ 2등 ]");
//	               rank2++;
//	            }
//	            else {
//	               System.out.print("[ 3등 ]");
//	               rank3++;
//	            }
//	            break;
//	         case 4:
//	            System.out.print("[ 4등 ]");
//	            rank4++;
//	            break;
//	         case 3:
//	            System.out.print("[ 5등 ]");
//	            rank5++;
//	            break;
//	         default :
//	            System.out.print("[ 꽝 ]");
//	            break;
//
//			}
//		
//		lucky = 0;
//		for(int i=0; i<human.length; i++) {
//			for(int j=0; j<6; j++) {
//				if(human[i]==lotto[j]) {
//					lucky++;
//					System.out.printf("%2d ", human[i]);
//					break;
//				}
//			} // for j
//		} // for i 
//		
//		System.out.println("   " + lucky + "개 일치");
//		
//			System.out.println();
//			System.out.println("총 도전횟수 : " + count + "회");
//			System.out.println("1등 " + rank1 + "회");
//			System.out.println("2등 " + rank2 + "회");
//			System.out.println("3등 " + rank3 + "회");
//			System.out.println("4등 " + rank4 + "회");
//			System.out.println("5등 " + rank5 + "회");
//		}
//
//	}

public class Lotto {

   public static void main(String[] args) {
      int count = 1000;   //백만원
      int lotto[] = new int[7];   //당첨번호 6개 + 보너스번호 1개
      int human[] = new int[6];
      int lucky = 0;   //맞힌 숫자의 개수
      int lucky_b = 0;   //보너스 번호
      int rank1 = 0, rank2 = 0,rank3 = 0, rank4 = 0, rank5 = 0;
      
      //당첨번호
      for (int i = 0; i < lotto.length; i++) {
         lotto[i] = (int)(Math.random()*45) + 1;
         for (int j = 0; j < i; j++) {   //j = 0, 1, 2
            if (lotto[i] == lotto[j]) {
            i--;
            break;
            }   //if
         }   //j
      }   //for i
      
      //중간값확인
//      for (int i = 0; i < lotto.length; i++) {
//         System.out.print(lotto[i] + " ");
//      }
      
      for (int k = 0; k < count; k++) {
         System.out.printf("[제 %5d 회] : ", k);
         for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + " ");
         }   //i
         System.out.printf("[%2d]\t", lotto[6]);
         
         //사용자 지정 번호
         for (int i = 0; i < human.length; i++) {
            human[i] = (int)(Math.random()*45) + 1;
            for (int j = 0; j < i; j++) {   //j = 0, 1, 2
               if (human[i] == human[j]) {
               i--;
               break;
               }   //if
               else if (human[i] != lotto[i] && j == 5) {
                  System.out.printf("%2d ", human[i]);
               }   //else if
            }   //j
         }   //i
         
         // 보너스 번호확인
         int i1;
         for (i1 = 0; i1 < human.length; i1++) {
            if (lotto[6] == human[i1]) {
               lucky_b = 1;
               break;
            }   //if
         }   //i1
         
         switch (lucky) {
         case 6:
            System.out.println("*****1등 당첨!*****");
            rank1++;
            break;
         case 5:
            if (lucky_b == 1) {
               System.out.print("[ 2등 ]");
               rank2++;
            }
            else {
               System.out.print("[ 3등 ]");
               rank3++;
            }
         case 4:
            System.out.print("[ 4등 ]");
            rank4++;
            break;
         case 3:
            System.out.print("[ 5등 ]");
            rank5++;
            break;
         default :
            System.out.print("[ 꽝 ]");
            break;
         }
         
         lucky = 0;
         for (int i = 0; i < human.length; i++) {
            for (int j = 0; j < 6; j++) {
               if (human[i] == lotto[j]) {
                  lucky++;
                  System.out.printf("%2d ", human[i]);
                  break;
               }   //if
            }   //j
         }   //i

//         System.out.print("   " + lucky + "개 일치");
         System.out.println();
      }   //k
         System.out.println("총 도전횟수 1000회");
         System.out.println("1등 " + rank1 + "회");
         System.out.println("2등 " + rank2 + "회");
         System.out.println("3등 " + rank3 + "회");
         System.out.println("4등 " + rank4 + "회");
         System.out.println("5등 " + rank5 + "회");
   }

}