package Session5;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int code[] = new int[5];
		code[0] = 10;
		code[1] = 20;
		code[2] = 30;
		code[3] = 40;
		code[4] = 50;
		
		
		try {
			int i;
			for (i = 0; i < code.length; i++) {
				System.out.println(code[i]);
			}
			System.out.println(code[7]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("> Handling Array index out of bound exception.");
			System.out.println("> Array code only have 5 elements in it. \n> We cannot print the seventh element.");
			
			
		}
		
	}

}
