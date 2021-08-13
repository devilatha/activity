package activity;
import java.util.Scanner;
public class calarea {
	
		
			public static void main(String args[]){
			    Scanner sc = new Scanner(System.in);
			    int dif_lb = 23;
			    int peri = 206;
			    int sum_lb = peri/2;
			    int l=(dif_lb+sum_lb)/2;
			    int b=sum_lb-l;
			    int area=l*b;
			    System.out.print("The area of rectangle is : "+area);
			}
		}



