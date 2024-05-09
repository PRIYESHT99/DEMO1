package Rail_day4;
import java.util.*;

interface Drawable{  
void draw();  
}  
//Implementation: by second user  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class Circle implements Drawable{  
public void draw(){System.out.println("drawing circle");}  
} 

public class Interfaces_Example {
	
	public static void main(String args[]){  
		Drawable d=new Circle();  
		d.draw();  
		}

}
