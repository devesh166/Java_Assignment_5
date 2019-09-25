package devesh.assignment.singleton;

public class SingletonClass {
	String str;
	public static SingletonClass initialize(String s) {
//		str=s;    
//      Cannot access non static members inside static method
		SingletonClass single= new SingletonClass();
		return single;
	}
	public void displayString() {
		System.out.println("String str="+str);
	}
}
