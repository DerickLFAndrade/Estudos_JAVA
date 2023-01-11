import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	List<Integer> intList = new ArrayList<Integer>();
	intList.add(10);
	intList.add(5);
	
	List<? extends Number> list = intList;
	
	Number x = list.get(0);
	
	System.out.println(x);
	//list.add(20);
	
	List<Object> myObjecs = new ArrayList<Object>();
	myObjecs.add("Maria");
	myObjecs.add("Alex");
	
	List<? super Number> myNums = myObjecs;
	
	myNums.add(10);
	//Number myNunms = myNums.get(0);
	//Contravariância
	
	System.out.println(x);
	//list.add(20);
	
	
	sc.close();
}
}
