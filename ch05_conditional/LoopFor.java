package ch05_conditional;

/**
 * class Name   : LoopFor
 * Author       : JunHee
 * Created Date : 2024. 8. 7.
 * Version      : 1.0
 * Purpose      : 
 * Description  : 
 */
public class LoopFor {

	public static void main(String[] args) {
		
	// 2 ~ 9단 출력
		for(int i=2; i<=9;i++) {
			System.out.println(i+"단");
			if(i==5) {
				continue;  // for 문 돌다 continue 만나면 아래의 for문 건너띄고 다음 거 실행(브레이크는 탈출)
			}
			for(int j=1; j<=9;j++) {
				System.out.printf("%d x %d = %d \n", i, j, i*j);  // %d 는 뒤에 값 전달 화면출력 \n 은 띄어쓰기
			}
		}
		// break문 -> 반목문 내에서 break 문이 실행되면 반복문이 즉시 종료됨. 해당스코프 문만 브레이크됨
		
		// 1 ~ n 까지 더한 값이 100 이상이 되는 지점의 n을 구하시오.
		int sum5 = 0;
		for(int i=1; i<999; i++) {
			sum5 +=i;
			if(sum5 >= 100) {
				System.out.println("100 이상이 되는 n:"+i);
				break;				
			}
			
			
		}
		
		outer:
			for(int  i = 0; i < 5; i++) {
				System.out.println("메인 for"+i);
				for(int j=0; j<5; j++) {
					System.out.println("서브 for"+j);
					if(j==2) {
						break outer;
					}
				}
			}
		
		
		
	}

}
