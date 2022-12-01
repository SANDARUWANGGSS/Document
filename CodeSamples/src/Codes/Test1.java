package Codes;

public class Test1 {
	public static void main(String args[])
	{
		//Bad code
		Long i = new Long(1L);
		String s = new String("abc");
		System.out.println(s);
//		When directly assign a constant value, only create an 
//		object reference that points to the constant value
		
		Long j = 1L;
		String y = "abc";
		System.out.println(y);
		
		
		
	}
}
