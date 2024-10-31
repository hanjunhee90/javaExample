package ch12_exception;

// 사용자 정의 예외처리 클래스
public class BixException extends Exception{

	private String errCode="";
	
	public BixException(String errCode, String errMsg) {
		super(errMsg);
		this.errCode = errCode;
	}
	
	public BixException(String errMsg) {
		super(errMsg);
	}
	
	public BixException() {
		
	}
	public BixException(Exception e) {
		super(e);
	}

	public String getErrCode() {
		return errCode;
	}

	
}
