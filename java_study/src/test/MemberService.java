package test;

public class MemberService {
	private boolean login;
	private String logout;
	
	
	public boolean islogin(String string, String string2) {
		if (string == "hong" && string2 == "12345") {
			login = true;
		}
		else {
			login = false;
		}
		return login;
	}
	
	
	public String islogout(String string) {
		System.out.println(string + "님이 로그아웃 되었습니다"); 
		return logout;
	}
}
