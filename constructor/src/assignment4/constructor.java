package assignment4;

public class constructor {
	
	public constructor() {
		this(1,2,4,5);
		System.out.println("Default constructor");
	}
	public constructor(int a){
		this();
		System.out.println("One parameriterize");
		
	}
	public constructor(int a,int b) {
		this(6,7,8);
		System.out.println("Two parameritized");
		
	}
	public constructor(int a,int b, int c ) {
		this(8);
		System.out.println("Three parameritized");
	}
	public constructor(int a, int b,int c,int d) {
		System.out.println("Four parameritized");
	}
	public static void main(String[] args) {
		constructor obj= new constructor(22,44);
	}

}
