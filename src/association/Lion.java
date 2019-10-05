package association;

public class Lion {
	private String name;
	
	public Lion (String n) {
		this.name = n;
	}
	
	public void printName() {
		System.out.println("This lions name is " + this.name);
	}
	
	Bal rondeBal = new Bal();
	
	public void playWithBal() {
		System.out.print("This Lion is ");
		rondeBal.playWithMe();
		
	}
}
