package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = Arrays.asList(10, 60, 45, 90, 30, 24, 50, 76);
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(data);
		list.stream().filter((n) -> n>=50 && n<=60 ).forEach((n) -> System.out.println(n));
	}

}
