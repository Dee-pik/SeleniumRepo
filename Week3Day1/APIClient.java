package Week3Day1;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("Endpoint = " + endpoint);

	}
	public void sendRequest(String endpoint, String requestBody, String requestStatus) {
         System.out.println("End point = "+ endpoint + " , RequestBody  = " + requestBody + " , Request status = " + requestStatus );
	}
	
	
	public static void main(String[] args) {
		
		APIClient OL1 = new APIClient();
		OL1.sendRequest("Users");
		OL1.sendRequest("Users","Username & Password", "200 ok status");
		
	}
	
	
	
}
