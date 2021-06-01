package activities;


class CustomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message=null;
	
	CustomException(String msg){
		this.message=msg;
	}


public String getMessage() {
	      return message;
	}
}


public class Activity8 {

	public static void main(String[] args) {
		try {
           
            Activity8.exceptionTest("Valid string ");
          
            Activity8.exceptionTest(null); // Exception is thrown here
            Activity8.exceptionTest("Won't execute");
        } 
		catch(CustomException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }

	}

	public static void exceptionTest(String str) throws CustomException {
		if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
	}
}
