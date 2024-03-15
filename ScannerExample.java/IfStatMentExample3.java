class  IfStatMentExample3
{
	public static void main(String[] args) {
		System.out.println("EXECUTION STARTS ");
		if (false){
			int a;
			if (false)// Class names, 'IfStatmentExample3', are only accepted if annotation processing is explicitly requested
//1 error
				a=10;
			System.out.println("Hello from If Block");
			System.out.println("EXECUTION ends");

		}
	}
}