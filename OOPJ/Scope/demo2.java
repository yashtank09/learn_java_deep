package Scope;

// Non-Subclass within the same package
public class demo2
{
	demo1 d1 = new demo1();	
	
	public void show(){
		System.out.println(d1.a+d1.b+d1.c+d1.d);
	}
}