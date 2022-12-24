package packages;

class TestPack{
	public static void main(String args[]){
		System.out.println("This is first Package's class printing...");
		package_Demo TD1 = new package_Demo();
		TD1.display();

		System.out.println("This is second Package's class printing...");
		package_Demo2 TD2 = new package_Demo2();
		TD2.display();
		
		System.out.println("This is thired inner Package's class printing...");
		package_Demo3 TD3 = new package_Demo3();
		TD2.display();
	}
}