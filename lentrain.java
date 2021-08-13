package activity;
import java.util.*;
public class lentrain {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
				
					Scanner sc = new Scanner(System.in);
					int train_sp, t,train_len;
					System.out.print("Enter the train speed in km/hr : ");
					train_sp=sc.nextInt();
					System.out.print("\nEnter the time in seconds : ");
					t=sc.nextInt();
					train_len = (train_sp * 1000 * t)/3600;
					System.out.print("The length of train is : "+train_len+"m");
				}
			

		}




