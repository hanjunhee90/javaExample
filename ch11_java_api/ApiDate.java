package ch11_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ApiDate {

	public static void main(String[] args) {
		// 1.Date 클래스
		// 1970년 1월 1일 자정(UTC)이후의 시간을 밀리초 단위로 표현
		Date dateToday = new Date();
		System.out.println(dateToday);
		// 원하는 문자열 format형태
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(dateToday));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.format(dateToday));
		//KST 한국
		//뉴욕시간
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.US);
		TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
		sdf3.setTimeZone(timeZone);
		System.out.println(sdf3.format(dateToday));
		
		// string to data
		String str = "2024/08/02 09:00:00"; // 2024-02-02 형태면 밑의 데이터포멧형식도 맞춰서 해줘야함 yyyy-MM-dd
		sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		try {
			Date start = sdf.parse(str);
			System.out.println(start);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Calendar 클래스 (year, month, 같은 필드를 제공) 날짜계산에 유용함
		// Date 클래스 보다 달력계산에 좀더 효과? 적임
		Calendar caITiday = Calendar.getInstance();  // <-- 싱클톤
		System.out.println(caITiday.getTime());
		System.out.println(caITiday.get(Calendar.DATE));
		System.out.println(caITiday.get(Calendar.MONTH)+1);
		System.out.println(caITiday.get(Calendar.YEAR));
		System.out.println(caITiday.get(Calendar.HOUR_OF_DAY));
		//1일뒤
		// 업무 로직에 날짜 추가 혹은 시작부터 몇일뒤 이런 계산에 유용
		caITiday.add(Calendar.DATE, 1);
		System.out.println(sdf.format(caITiday.getTime()));
		//3일뒤
		caITiday.add(Calendar.DATE, 3);
		System.out.println(sdf.format(caITiday.getTime()));
		//5개월뒤
		caITiday.add(Calendar.MONTH, 5);
		System.out.println(sdf.format(caITiday.getTime()));
		
		Calendar calenders = Calendar.getInstance();
		int year = 2024;
		int month = 1;
		//month는 0부터 시작함
		calenders.set(year, month-1, 1); //해당월의 1일날짜
		System.out.println(sdf.format(calenders.getTime()));
		//해당 월의 마지막 일자 얻기
		int lastDay = calenders.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		//해당 월의 시작요일
		int startDay = calenders.get(Calendar.DAY_OF_WEEK);
		System.out.println(startDay); // 1:일요일 2:월요일
		
		//캘린더 만들기
		System.out.println(year + "년" + month + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int current = 1;
		for(int i = 1; i <= 42; i++) {  // 캘린더는 아무리 많아야 42칸
			if(i < startDay) {
				System.out.print("\t");
			}else {
				if(!(i % 7 == 1 || i % 7 == 0)) {
					System.out.printf("%d\t", current);
				}else {
					System.out.printf("%d\t",current);
				}
				current++;
				if(current > lastDay) {
					break;
				}
			}
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		
		// 년, 월을 입력받아 해당 년월의 달력을 출력하는 기능을 구현하시오
		// workingCalender(2024, 2)
		// workingCalender(2024, 3)
		// workingCalender(2024,12)
		
		workingCalender(2024,2);
		
	}
	
	public static void workingCalender(int year, int month) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		Calendar calenders = Calendar.getInstance();
		
		//month는 0부터 시작함
		calenders.set(year, month-1, 1); //해당월의 1일날짜
		System.out.println(sdf.format(calenders.getTime()));
		//해당 월의 마지막 일자 얻기
		int lastDay = calenders.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		//해당 월의 시작요일
		int startDay = calenders.get(Calendar.DAY_OF_WEEK);
		System.out.println(startDay); // 1:일요일 2:월요일
		
		//캘린더 만들기
		System.out.println(year + "년" + month + "월 달력");
		System.out.println("월\t화\t수\t목\t금");
		int current = 1;
		for(int i = 1; i <= 42; i++) {
			if(i < startDay) {
				if(i !=1) {
					System.out.print("\t");
				}
				
			}else {
				
				if(!(i % 7 == 1 || i % 7 == 0)) {
					 
					System.out.printf("%2d\t", current);
				}
				current++;
				if(current > lastDay) {
					break;
				}
			}
			if(i % 7 == 0) {
				System.out.println();
			}
		}
	}

}
