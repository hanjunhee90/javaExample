package ch05_conditional;

import java.util.Scanner;

public class ConditionalEx3 {

	public static void main(String[] args) {
		Scanner scan;
	      short price;
	      label32: {
	         label31: {
	            scan = new Scanner(System.in);
	            System.out.print("어떤걸 드릴까요?");
	            String order = scan.nextLine();
	            price = 0;
	            switch(order.hashCode()) {
	            case 1616000:
	               if (order.equals("아아")) {
	                  break label31;
	               }
	               break;
	            case 47959044:
	               if (order.equals("밀크티")) {
	                  price = 5000;
	                  break label32;
	               }
	               break;
	            case 861563040:
	               if (order.equals("아메리카노")) {
	                  break label31;
	               }
	               break;
	            case 1628467620:
	               if (order.equals("카푸치노")) {
	                  price = 4500;
	                  break label32;
	               }
	            }

	            System.out.println("메뉴가 없습니다.....");
	            break label32;
	         }

	         price = 3000;
	      }

	      if (price > 0) {
	         System.out.println("선택한 음료는 " + price + "원 입니다.");
	      }

	      scan.close();

	}

}
