package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = Arrays.asList(3, 4, 7, 8, 9, 1, 5, 4, 16);
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(data);
		
		list.stream().filter((n) -> n%2 != 0).forEach(System.out::println);
	}

}
