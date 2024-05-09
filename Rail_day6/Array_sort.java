package Rail_day6;

public class Array_sort {
	
	 public static void main(String[] args) {
    //define original array     
    int [] intArray = new int [] {0,0,0,2,2,1};     
    int temp = 0;    

    //print original array    
   System.out.println("Original array: ");    
   for (int i = 0; i <intArray.length; i++) {     
       System.out.print(intArray[i] + " ");    
    }    
    //Sort the array in ascending order using two for loops    
    for (int i = 0; i <intArray.length; i++) {     
      for (int j = i+1; j <intArray.length; j++) {     
          if(intArray[i] < intArray[j]) {      //swap elements if not in order
             temp = intArray[i];    
             intArray[i] = intArray[j];    
             intArray[j] = temp;    
           }     
        }     
    }    
    //print sorted array    
    System.out.println("\nArray sorted in ascending order: ");    
    for (int i = 0; i <intArray.length; i++) {     
        System.out.print(intArray[i] + " ");    
    }    
}   

}
