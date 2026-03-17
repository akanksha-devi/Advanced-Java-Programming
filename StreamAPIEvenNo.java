package streamapi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Predicate;
public class StreamAPIEvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = Arrays.asList(10, 15, 20, 25, 30, 11, 17, 16);
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(data);
		
		list.stream().filter((n) -> n%2==0).forEach((n) -> System.out.print(n + " "));  //finding even number
		
	}

}
