package ListPackage;

public class ExecutionClass extends ICICBank {

	@Override
	public void loan() {
System.out.println("8%");		
	}

	@Override
	public void withdrwals() {
		System.out.println("10L");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void card() {
		System.out.println("Credit card");
	}

	public static void main(String[] args) {
		
		
		
		ExecutionClass ec = new ExecutionClass();
		ec.card();
		ec.kyc();
		ec.loan();
		ec.withdrwals();
		ec.limitedBalance();
		
		
		
		
		
		
	}
	
	
	
}








