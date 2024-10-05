package Week3Day3ClassRoomPractices;

public class AssigMethodOverLoading {

	
	
	public void reportStep(String msg , String status) {
		System.out.println("msg = " + msg + ", Status =  " + status);

	}
	public void reportStep(boolean snap, String status , String msg) {
		System.out.println("snap = " + snap + ", msg = " + msg + ", status = " + status);

	}
	
	public static void main(String[] args) {
		
		AssigMethodOverLoading  E1 = new AssigMethodOverLoading ();
		E1.reportStep("10 std", "Pass");
		E1.reportStep(false, "12 STD", "fail");
		
	}
}
