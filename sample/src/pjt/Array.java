package pjt;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Array {
	public static void main(String[] args) {
		Set set=new HashSet<>();
		
		while(set.size()!=10)
		{
			int val=(int)(10*Math.random())+65;
			if(!set.contains(val))
			{
				System.out.println(val);
				set.add(val);
			}
		}
		
		
		}
		
	
		
}




