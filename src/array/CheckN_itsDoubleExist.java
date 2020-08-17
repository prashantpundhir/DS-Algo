package array;

import java.util.HashSet;
import java.util.Set;

public class CheckN_itsDoubleExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 22, 3,6,  5, 7 };

		System.out.println(findDouble(arr));

	}

	public static Boolean findDouble(int arr[]) {

		Set<Integer> s = new HashSet<>();

		for (Integer i : arr) {
			if (s.contains(2 * i) || ((i%2==0) && s.contains(i / 2))) {
				return true;
			}
			s.add(i);

		}
		return false;
	}

}
