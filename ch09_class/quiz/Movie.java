package ch09_class.quiz;

// VO (Value oOject) or DTO(Data Transfer Object)
// 값 객체        : 값을 표현하는 목적으로 사용되는 객체  setter X
// 데이터 전송 객체  : 데이터 전송을 목적으로 사용하는 객체  getter, setter
public class Movie {
	
	private String title;   /** 영화제목*/
	private String quotes;  /** 명대사*/
	private String actors;  /** 배우*/
	private String word;    /** 초성*/
	// 1. 기본 생성자
	public Movie(String title, String quotes, String actors, String word) {
		super();
		this.title = title;
		this.quotes = quotes;
		this.actors = actors;
		this.word = word;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// 2. setter, getter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getQuotes() {
		return quotes;
	}
	public void setQuotes(String quotes) {
		this.quotes = quotes;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	
	// 3. toString
	@Override
	public String toString() {
		return "Movie [title=" + title + ", quotes=" + quotes + ", actors=" + actors + ", word=" + word + "]";
	}
		
	
} 
