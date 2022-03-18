import java .util.*;
public class Vectordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add("maharashtra");
		v.add(100);
		v.add(true);
		v.add("goa");
		v.add(new Object());
		System.out.println(v);
		Object o=v.clone();
		
		
		System.out.println(o);
		
		
		
		
	}

}
