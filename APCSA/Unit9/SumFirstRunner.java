package Unit9;



import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;



//(c) A+ Computer Science

//www.apluscompsci.com

//Name -

//Date -



public class SumFirstRunner

{

	public static void main( String args[] )

	{	

		ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5));

		ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));

		ArrayList<Integer> l3 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));

		ArrayList<Integer> l4 = new ArrayList<Integer>(Arrays.asList(32767));

		ArrayList<Integer> l5 = new ArrayList<Integer>(Arrays.asList(255,255));

		ArrayList<Integer> l6= new ArrayList<Integer>(Arrays.asList(9,10,-88,100,-555,2));

		ArrayList<Integer> l7= new ArrayList<Integer>(Arrays.asList(10,10,10,11,456));

		ArrayList<Integer> l8= new ArrayList<Integer>(Arrays.asList(-111,1,2,3,9,11,20,1));

		ArrayList<Integer> l9 = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,6));

		ArrayList<Integer> l10 = new ArrayList<Integer>(Arrays.asList(12,15,18,21,23,1000));

		ArrayList<Integer> l11 = new ArrayList<Integer>(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,0));

		ArrayList<Integer> l12 = new ArrayList<Integer>(Arrays.asList(9,10,-8,10000,-5000,-3000));

		

		System.out.println(ListSumFirst.go(l1));

		System.out.println(ListSumFirst.go(l2));

		System.out.println(ListSumFirst.go(l3));

		System.out.println(ListSumFirst.go(l4));

		System.out.println(ListSumFirst.go(l5));

		System.out.println(ListSumFirst.go(l6));

		System.out.println(ListSumFirst.go(l7));

		System.out.println(ListSumFirst.go(l8));

		System.out.println(ListSumFirst.go(l9));

		System.out.println(ListSumFirst.go(l10));

		System.out.println(ListSumFirst.go(l11));

		System.out.println(ListSumFirst.go(l12));





	}

}
