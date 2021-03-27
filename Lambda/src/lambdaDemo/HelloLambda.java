package lambdaDemo;

class HelloLambda {
	public void display()
	{
		HelloOperation aop=(int var,int var2)->{
			System.out.println("Result is"+(var+var2));
			return var+var2;};
			aop.calculate(80, 40);
		
		HelloString hello=()->{return "Welcome to Lambda demo";};
		System.out.println("Messge is "+hello.message());
		
			
	}
	
	public static void main(String args[])
	{
		HelloLambda hello=new HelloLambda();
		hello.display();
	}

}
