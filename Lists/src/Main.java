import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		list.add("Derick");
		list.add("Lucas");
		list.add("Fontes");
		list.add("Andrade");
		list.add("Derc");
		list.add("Luc");
		list.add("Font");
		list.add("And");
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println(list.size());
		System.out.println("---------------------------");
		System.out.println();
		list.removeIf(x -> x.charAt(0) == 'D');
		
		for(String x : list) {
			System.out.println(x);
		}
		
		
		System.out.println("---------------------------");
		System.out.println();
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		System.out.println();
		String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
		
		
			System.out.println(name);
		
		
		
		sc.close();
	}
}
