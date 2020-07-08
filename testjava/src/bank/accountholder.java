package bank;

public class accountholder {
	
	String firstname;
	String lastname;
	int age;
	float balance;
	boolean eligibilityforcc;
	
	public void cceligibilitycheck()
	{
		if(age>=25 && balance>=25000)
			eligibilityforcc=true;
	}
	
}
