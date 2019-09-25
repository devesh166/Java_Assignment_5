package devesh.assignment.data;

public class DataClass {
	int varA;
	char varB;

	public void display() {
		System.out.println("varA =" + varA + " varB =" + varB);
	}

	public void displayLocal() {
		int a;
		int b;
//		System.out.println("Local variable a= "+a+"b= "+b);
		
/*      There is no default value for local variables. Therefore they must be 
        Initialized before use.
*/		
	}

}
