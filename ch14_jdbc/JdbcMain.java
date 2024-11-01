package ch14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcMain {
	
	private static final String URL ="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static final String DB_ID ="java";
	private static final String DB_PW="oracle";
	
	
	public static void main(String[] args) {
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("학사 정보 시스템입니다.");
			System.out.println("1.조회|2.수정(q:종료)");
			String msg = scan.nextLine();
			if(msg.equals("q")) {
				System.out.println("학사 정보 시스템 종료");
				
				break;
			}
			int sel = Integer.parseInt(msg);
			if(sel == 1) {
				System.out.println("조회할 학번을 입력해 주세요:");
				int num1 = scan.nextInt();
				selectView(num1);
				continue;
				// 학생의 정보 출력
			}else if(sel == 2) {
				System.out.println("수정할 학번을 입력해 주세요:");
				String nums = scan.nextLine();
				int num2 = Integer.parseInt(nums);
				System.out.println("새로운 이름을 입력해주세요.:");
				String name = scan.nextLine();
				updateView(num2, name);					
				continue;
			}else {
				System.out.println("다시 입력!");
			}
		}
	}
	
	public static void updateView(int num, String name) {
		// db와 연결
				Connection conn = null;
				// sql 명령
				PreparedStatement ps = null;
				// 쿼리실행
				ResultSet rs = null;
				// 1.드라이버 로딩
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
					System.exit(0); //프로그램종료
				}
				try {
					conn = DriverManager.getConnection(URL, DB_ID, DB_PW);
					
					StringBuffer query = new StringBuffer();
					query.append(" UPDATE 학생 ");
					query.append(" SET 이름 = ? ");
					query.append(" WHERE 학번 = ? ");

					ps = conn.prepareStatement(query.toString());
					
					ps.setString(1, name);
					ps.setInt(2, num);
					int cnt = ps.executeUpdate();
					if(cnt > 0) {
						System.out.println("정보가 성공적으로 업데이트 되었습니다.");
					}else {
						System.out.println("대상건이 없음");
					}
					
				} catch (SQLException e) {		
					e.printStackTrace();
				} finally {
					// connection 객체를 꼭 닫아야함.
					// 안닫으면 계속 쌀여서 에러 발생
					if(rs != null) {
						try {
							rs.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if(ps != null) {
						try {
							ps.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if(conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
	}
	
	public static void selectView(int num) {
		// db와 연결
		Connection conn = null;
		// sql 명령
		PreparedStatement ps = null;
		// 쿼리실행
		ResultSet rs = null;
		// 1.드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0); //프로그램종료
		}
		try {
			conn = DriverManager.getConnection(URL, DB_ID, DB_PW);
			
			StringBuffer query = new StringBuffer();
			query.append(" SELECT 이름 ");
			query.append("       ,전공 ");
			query.append("       ,평점 ");
			query.append(" FROM 학생 ");
			query.append(" WHERE 학번 = ? ");

			ps = conn.prepareStatement(query.toString());
			ps.setInt(1, num);  // 
			rs = ps.executeQuery();  //
			
			while(rs.next()) {
				String name = rs.getString("이름");
				String major = rs.getString("전공");
				int avg = rs.getInt("평점");
				System.out.println("이름:"+name+" 전공:"+major+" 평점:"+avg);
			}
		} catch (SQLException e) {		
			e.printStackTrace();
		} finally {
			// connection 객체를 꼭 닫아야함.
			// 안닫으면 계속 쌀여서 에러 발생
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
