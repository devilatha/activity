package activity;
import java.io.*;
import java.util.Scanner;

public class ac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m=25;
		Scanner sc=new Scanner(System.in);
		int Array[];   
		Array = new int[m];
				for(n=0;n<m;n++)
				{
				Array[n]=sc.nextInt();	
				}
		   int maximum = Array[0];
		        for (n = 1; n < m; n++){
		            if (Array[n] > maximum)
		                maximum = Array[n];
		       
			}
		System.out.println(maximum);
		}

	}


