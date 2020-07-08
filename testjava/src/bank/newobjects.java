package bank;

public class newobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		accountholder gopi = new accountholder();
		accountholder guru = new accountholder();
		accountholder navi = new accountholder();
		gopi.firstname="Gopiraja";
		gopi.lastname="v";
		gopi.age=34;
		gopi.balance=25000;
		gopi.cceligibilitycheck();
		System.out.println("Is gopi eligible for cc :" +gopi.eligibilityforcc);
		
		guru.firstname="GURUDHARSHAN";
		guru.lastname="GOIPRAJA";
		guru.age=6;
		guru.balance=5000;
		guru.cceligibilitycheck();
		System.out.println("Is GURU eligible for cc :" +guru.eligibilityforcc);
	}

}
