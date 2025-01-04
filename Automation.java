package Abstraction1;

public class Automation implements Language  {

	public void Python() {
		// TODO Auto-generated method stub
		
	}

	public int Selenium() {
		// TODO Auto-generated method stub
		return 100;
	}

	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.Python();
		{
			System.out.println("Phython");
		}
		int selenium = obj.Selenium();
		{
			System.out.println("Selenium - " + selenium);
		}
	}
}
