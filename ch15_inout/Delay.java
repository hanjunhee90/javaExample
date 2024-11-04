package ch15_inout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * class Name   : Delay
 * Author       : JunHee
 * Created Date : 2024. 9. 13.
 * Version      : 1.0
 * Purpose      : 텍스트 파일 생성
 * Description  :
 */
public class Delay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//날짜 포멧
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String currentDate = sdf.format(new Date());
		String filePath = "delay.txt";
		File file = new File(filePath);
		
		try {
			// 파일에 데이터를 바이트 단위로 쓰기 위한 클래스
			FileOutputStream fos = new FileOutputStream(file, true);
			fos.write((currentDate + " 오늘의 지각자...\n").getBytes());
			while(true) {
				System.out.println("오늘의 지각자를 기록하세요. exit 를 입력하면 종료.");
				String msg = sc.nextLine();
				if("exit".equalsIgnoreCase(msg)) {
					System.out.println("종료합니다.");
					break;
				}
				fos.write((msg + "\n").getBytes());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}

	}

}
