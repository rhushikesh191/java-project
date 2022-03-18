import java.util.HashSet;

import java.util.*;

public class Hashsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> divideby5 = new ArrayList<>();
		
		divideby5.add(5);
		divideby5.add(10);
		divideby5.add(15);
		divideby5.add(20);
		divideby5.add(25);
		divideby5.add(30);
		divideby5.add(35);
		divideby5.add(40);
		divideby5.add(45);
		divideby5.add(50);
		
		List<Integer> divideby3 = new ArrayList<>();
		
		divideby3.add(3);
		divideby3.add(6);
		divideby3.add(9);
		divideby3.add(12);
		divideby3.add(15);
		divideby3.add(18);
		divideby3.add(21);
		divideby3.add(24);
		divideby3.add(27);
		divideby3.add(30);
		
		Set<Integer>divideby3or5=new HashSet<>(divideby5);
		divideby3or5.addAll(divideby3);
		System.out.println(divideby3or5);
	}

}