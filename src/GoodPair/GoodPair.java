package GoodPair;

import java.util.Scanner;

public class GoodPair {
	
	public static int pair(int arr[],int size, int addedNumber)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(arr[i]+arr[j] == addedNumber)
				{
					return 1;
				}
			}
		}
		return 0;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter Size of the Array :");
		int number = scan.nextInt();
		System.out.println("Enter elements of the Array :");
		int[] arr = new int[number];
		for(int i =0;i<number;i++)
		{
			arr[i]=scan.nextInt();
		}	
		int addedNumber = scan.nextInt();
		int size = arr.length;
		System.out.println(pair(arr,size,addedNumber));

	}

}
