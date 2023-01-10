import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

public class Program {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	List<Shape> myShapes = new ArrayList<>();
	
	myShapes.add(new Rectangle(3.0, 2.0));
	myShapes.add(new Circle(2.0));
	System.out.println("Total area: " + totalArea(myShapes));
	
	List<Circle> myCircle  = new ArrayList<>();
	myCircle.add(new Circle(2.0));
	myCircle.add(new Circle(3.0));
	System.out.println("Total area: " + totalArea(myShapes));
	
	sc.close();
}
	public static Double totalArea( List<? extends Shape> list) {
		double sum = 0.0;
		for(Shape shape : list) {
			sum += shape.area();
		}
		return sum;
	}
}
