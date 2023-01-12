import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	//não garante ordenação, o TreeSet<> sim
	//Set<String> set = new HashSet<>();
	//Set<String> set = new TreeSet<>();
	Set<String> set = new LinkedHashSet<>();
	
	set.add("TV");
	set.add("Notebook");
	set.add("Tablet");
	
	//System.out.println(set.contains("Notebook"));
	
	//set.remove("Tablet");
	set.removeIf(x -> x.length() < 3);
	
	
	for (String p : set) {
		System.out.println(p);
	}
	
	sc.close();
}
}
