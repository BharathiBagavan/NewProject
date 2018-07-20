package samplejava;

import java.util.Scanner;

public class Understandarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int arr[]={20,38,14,22,8};
		/*int arr[]= new int[10];
		Scanner s = new Scanner(System.in);
		System.out.println("enter the numbers");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);	
		} */
		int arr1[][]= new int[10][10];
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the numbers of rows");
		int rows=s1.nextInt();
		System.out.println("enter the numbers of column");
		int column=s1.nextInt();
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr1[i][j]=s1.nextInt();
			}}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(arr1[i][j]);	
				System.out.print("\t");
			}
			System.out.println();
			}
	
			}
	
		}
		


