package Scope;

public class demo1
{
	int a = 10;
	private int b = 10;
	protected int c = 10;
	public int d = 10;
	
	public void display(){
		System.out.println(a+b+c+d);
	}
}