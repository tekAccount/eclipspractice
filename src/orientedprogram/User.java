package orientedprogram;

public class User {

	String username;
	String password;

	public String getusername() {
		return username;

	}

	public void setusername(String username) {
		this.username = username;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {

		User myuser = new User();

		myuser.setusername("shaheera");
		System.out.println(myuser.getusername());
		myuser.setpassword("12345");
		System.out.println(myuser.getpassword());

	}

}
