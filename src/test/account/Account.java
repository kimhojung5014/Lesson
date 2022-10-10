package test.account;

public class Account {
	String Name,No;
	int Balance;
	
	public Account(String name, String no, int balance) {
		Name = name;
		No	= no;
		Balance = balance;
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getNo() {
		return No;
	}

	public void setNo(String no) {
		No = no;
	}

	public int getBalance() {
		return Balance;
	}

	public int setBalance(int balance) {
		return Balance = balance;
	}
	
	public void withdraw(int k) {
		if(k>Balance) {
			System.out.println("예금액보다 출금액이 많습니다.");
		}else {
		Balance -= k;
		System.out.println("잔금은 "+Balance+"원 입니다.");}
	}
	@Override
	public String toString() {
		return "계좌 기본정보: {"+ Name+","+No+","+Balance+"}";
	}
}
