package ch09_class.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizMain {

	public static void main(String[] args) {
		
		// movieDB는 싱글톤 패턴으로 디자인되어 있어서
		// 외부에서 new를 할 수 없고 내부에서 생성되어진 하나의 인스턴스만을 사용할 수 있음
		MovieDB movieDB1 = MovieDB.getInstance();
		MovieDB movieDB2 = MovieDB.getInstance();
		System.out.println(movieDB1); // 객체의 주소가 같음(동일한 객체)
		System.out.println(movieDB2);
		
		// 영화 맞추기 게임
		// 1. 명대사 출력 맞추면 score +3
		// 틀리면 2. 배우 출력 score +2
		// 틀리면 3. 영화명 초성 출력 score +1
		ArrayList<Movie> movieList = movieDB1.getMovieList();
		// collection shuffle (순서를 랜덤하게 섞음)
		Collections.shuffle(movieList);
		
		//System.out.println(movieList);
		
		int score = 0;
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			String answer;
			
			for(int i = 0; i < movieList.size(); i++) {
				
				System.out.println(movieList.get(i).getQuotes());
				System.out.print(">>>>>");
				answer = scanner.nextLine();
				
				if(answer.equals(movieList.get(i).getTitle())) {
					System.out.println("정답입니다.~~!!!");
					
					score = score+3;
					count++;
				}else {
					System.out.println(movieList.get(i).getActors());
					System.out.print(">>>>>");
					answer = scanner.nextLine();
					
					if(answer.equals(movieList.get(i).getTitle())) {
						System.out.println("정답입니다.~~!!!");
						score = score+2;
						count++;
					}
					if(!answer.equals(movieList.get(i).getTitle())) {
						System.out.println(movieList.get(i).getWord());
						System.out.print(">>>>>");
						answer = scanner.nextLine();
						if(answer.equals(movieList.get(i).getTitle())) {
							System.out.println("정답입니다.~~!!!");
							score = score+1;
							count++;
						}
					}
				}
				
				
				
			}
			if(count==movieList.size()) {
				System.out.println("점수는 : "+score);
				break;
			}
			
		}

	}

}
