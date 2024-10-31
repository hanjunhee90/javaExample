package ch12_exception;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * class Name   : ExMethod
 * Author       : JunHee
 * Created Date : 2024. 8. 20.
 * Version      : 1.0
 * Purpose      : exception
 * Description  : 예외처리와 예외처리 인한 메소드의 차이
 */
public class ExMethod {
	
	public static void printName(String nm) throws BixException{
		// 컴파일, 런타임 오류는 아니지만
		// 우리 업무에서는 오류로 보는 상황에 대한 예외처리 방법
		if(nm.length() == 0) {
			throw new BixException("001", "이름에 empty 가 들어옴.");
		}else if(nm.length() ==1) {
			throw new BixException();
		}
	}
	
	
	public static long dateMillSec(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date temp = (Date) sdf.parse(date);
		return temp.getTime();
	}
	
	public static long dateMillSec2(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date temp;
		Long result = 0l;
		try {
			temp = (Date) sdf.parse(date);
			result = temp.getTime();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
