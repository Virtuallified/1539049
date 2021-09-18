/*Create a dynamic array - insert elements and shuffle it*/

import java.io.*;
import java.util.*;

class Shuffle_Array
{
	public static void main(String args[])
	{
		List<Integer> solution = new ArrayList<>();
		for (int i = 1; i <= 6; i++)
		{
			solution.add(i);
		}
		Collections.shuffle(solution);
		
		System.out.println(solution.toString());
	}
}