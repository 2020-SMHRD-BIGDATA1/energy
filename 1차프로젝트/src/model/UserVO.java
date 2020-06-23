package model;

public class UserVO {
	
	private String id;
	private String pw;
	private String name;
	private int age;
	private String addr;
	private String phone;
	private int money;
	
	
	public UserVO(String id, String pw, String name, int age, String addr, String phone,int money) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.phone = phone;
		this.money = money;
	}
	
	public UserVO(String id, String pw, String name, int age, String addr, String phone) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.phone = phone;
		
	}
	
	
	public UserVO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}


	public UserVO(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public UserVO(String id, String pw, String name, int money) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.money = money;
	}

	public UserVO(String id, String pw, String addr, String phone) {
		this.id = id;
		this.pw = pw;
		this.addr = addr;
		this.phone = phone;
	}

	public UserVO(String id, int money) {
		this.id = id;
		this.money = money;
	}
	
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
