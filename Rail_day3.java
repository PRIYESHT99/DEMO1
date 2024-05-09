import java.util.*; 
import java.util.Scanner;
public class Rail_day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		float ff= 444.444f;
		double dd= 55.555555555;
		System.out.printf("%.2f\n",ff);
		System.out.printf("%.2f",dd);
     
  }
}


class secondHigestNoInArray {

public static void main(String[] args) {


Scanner sc = new Scanner(System.in);


System.out.print("Enter the size of the array: ");
int size = sc.nextInt();


int[] arr = new int[size];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < size; i++) {
arr[i] = sc.nextInt();
}



int max = Integer.MIN_VALUE;
int second_Max = Integer.MIN_VALUE;
for (int num : arr) {
if (num > max) {
second_Max = max;
max = num;
} else if (num > second_Max && num < max) {
second_Max = num;
}
}


System.out.println("The second highest element in the array is: " + second_Max);

sc.close();

}
}
 

class Swaping   
{  
 public static void main(String a[])   
 {   
     System.out.println("Enter the value of x and y");  
     Scanner sc = new Scanner(System.in);  
     int x = sc.nextInt();  
     int y = sc.nextInt();  
     System.out.println("before swapping numbers: "+x +" "+ y);  
     x = x + y;   
     y = x - y;   
     x = x - y;   
     System.out.println("After swapping: "+x +"  " + y);   
 }   
  
	}


