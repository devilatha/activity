package activity;
import java.io.*;
import java.util.Scanner;
public class prime {
	
		public static void main(String[] args) 
		{
		int a,k=0,flag=0;      
		int N; 
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		k=N/2;      
		if(N==0||N==1)
		{  
		System.out.println(N+" is not prime number");      
		}
		else{  
		for(a=2;a<=k;a++)
		{      
		if(N%a==0)
		{      
		System.out.println(N+" is not prime number");      
		flag=1;      
		break;      
		}      
		}      
		if(flag==0)  
		{ System.out.println(N+" is prime number");
		}  
		}  
		}    
		}




