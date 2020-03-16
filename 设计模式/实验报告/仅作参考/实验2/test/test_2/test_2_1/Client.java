/***********************************************************************
 * Module:  Client.java
 * Author:  Administrator
 * Purpose: Defines the Class Client
 ***********************************************************************/
package test_2_1;
import java.util.*;

/** @pdOid a8904b5d-76ff-4bc6-9470-af58a13dc9a8 */
public class Client {
	public static void main(String[] args){
		Shape shape = null;
		try{
			shape = ShapeFactory.createShape("circle");
			shape.init();
			shape.setColor();
			shape.setSize();
			shape.fill();
			shape.display();
		}
		catch(UnsupportedShapeException e){
			System.out.println(e.getMessage());
		}	
	}
}