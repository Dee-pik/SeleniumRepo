package Abstraction;

public class NormalExeClass extends KumarsamyAbsta {

	

	@Override
	public void rankwith() {
	     System.out.println("15th rank");		
		
	}

	@Override
	public void gradeloan() {
System.out.println("A grade");		
	}

	@Override
	public void card() {
System.out.println("Credit card");		
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		NormalExeClass affi = new NormalExeClass();
		
		affi.gradeloan();
		affi.card();
		affi.cgpaky();
		affi.limitedBalance();
        affi.rankwith();
		
		
		
	}
}
