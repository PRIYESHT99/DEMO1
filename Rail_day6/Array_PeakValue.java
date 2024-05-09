package Rail_day6;

import java.util.Scanner;

public class Array_PeakValue {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("give the array size:");
	int n=sc.nextInt();

    int a[]=new int[n]; //declaration
    for(int i=0;i<a.length;i++)//initialization
    {
        a[i]=sc.nextInt();
    }
//    for(int i:a)//to show stored array
//    {
//        System.out.println(i);
//
//    }
//    
    for (int i = 1; i <a.length-1; i++) {
        if (a[i]>a[i-1] && a[i]>a[i+1]){
            System.out.println(a[i]);
            break;
        	}
    	}
    
	}
}
