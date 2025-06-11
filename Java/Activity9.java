package Activities;



public class Activity9 {
	public void exceptionTest(String str) throws StringisEmptyException{
		if(str.isEmpty()) {
			throw new StringisEmptyException("String cannot be empty");
		}else {
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		Activity9 obj = new Activity9();
		try {
			obj.exceptionTest("This will be printed");
			obj.exceptionTest("");
		}catch(StringisEmptyException ex){
			System.out.println(ex.getMessage());
		}
	    System.out.println("End of program");
	}

}
