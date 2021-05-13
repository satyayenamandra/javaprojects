package com.satya.lambabasics;

public class Greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		MyLambda myLambdaFunction = () -> System.out.println("Hello World");

		MyAdd addFunction = (int a, int b) -> a+b;
		
}
	
}

interface MyLambda{
	void foo();

}

interface MyAdd{
	int addFunction(int a, int b);
}
