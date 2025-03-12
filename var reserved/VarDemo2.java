// Java program to demonstrate that
// var cannot be used with Generic type

import java.util.*;
class VarDemo2 {
	public static void main(String[] args)
	{
		// var<Integer> al = new ArrayList<Integer>();
        var<var> al = new ArrayList<Integer>();
	

		al.add(10);
		al.add(20);
		al.add(30);
	
		
		System.out.println(al);

		var list = new ArrayList<String>();
	}
}
