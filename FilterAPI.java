package streamapi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;

public class FilterAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = Arrays.asList(23, 45, 67,89);
		
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(45);
        list.add(28);
        list.addAll(List.of(45, 75, 99,29, 105));
        list.addAll(data);
        System.out.println(list);
        
       Stream listStream = list.stream(); //in this method u have to make object for another operation 
       
       
       list.stream().filter((n) -> n>60).forEach((n) -> System.out.print(n + " "));   // another method of using stream
       List<Integer> g60 = list.stream().filter((n) -> n>60 && n<90).toList();   //for printing list.
       System.out.println();
       System.out.println(g60);
	}

}
