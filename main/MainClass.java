package devesh.assignment.main;

import devesh.assignment.data.DataClass;
import devesh.assignment.singleton.SingletonClass;

public class MainClass {

	public static void main(String[] args) {
		 DataClass dc = new DataClass();
		 dc.display();
		 dc.displayLocal();
		 SingletonClass.initialize("HelloWorld").displayString();
	}

}
