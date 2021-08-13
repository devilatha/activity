package activity;
import java.io.*;
import java.util.Scanner;
public class average {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int i,s=0,N;
			float average;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 10 numbers to find the average:");
			for(i=0;i<10;i++)
			{
			N=sc.nextInt();
			s=s+N;
			}
			average=s/10;
			System.out.println("The average of 10 number "+"is "+average);
			}
			

		}

