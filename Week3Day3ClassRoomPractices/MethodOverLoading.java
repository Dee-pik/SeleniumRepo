package Week3Day3ClassRoomPractices;

public class MethodOverLoading {
	
	
	public void browser() {
		System.out.println("No input given for to return");


	}
	
	 public void  browser(String name) {
		 System.out.println("Browser name is :" + name);
	 }
	 
	 public int browser(int version) {
		return version;
		 
	 }
	 
	 public char browser(char a ) {
		return a;
		 
		 
	 }
	 public static void main(String[] args) {
	
		 MethodOverLoading OL = new MethodOverLoading();
		 OL.browser();
		 OL.browser("Chrome");
		 System.out.println(OL.browser(121));
		 System.out.println(OL.browser('a'));
		
		 
		 
	}
	}

