import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	List<Integer> myInts = Arrays.asList(5, 2, 10);
	printList(myInts);
	
	List<String> myStrs = Arrays.asList("Maria", "João", "Paulo");
	printList(myStrs);
	sc.close();
}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
