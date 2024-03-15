class IfStatmentExample2
{
	public static void main(String[] args) {
		System.out.println("EXECUTION STARTS ");
		if (false)
			int a=10;/* error: variable declaration not allowed here
                        int a=10;
                            ^
1 error
*/
		System.out.println("Hello From If Block ");
		System.out.println("EXECUTION ENDS");
	}
}