package string;

import java.util.HashMap;

public class MaxTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {7,1,0,8};

		System.out.println(getMaxTime(arr));

	}

	static String getMaxTime(int[] arr) {

		if (arr.length > 4 && arr.length < 4)
			return "-1";

		String time = "";

		boolean flag = false;

		int index;

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}

		// for 1st hour place

		for (index = 2; index >= 0; index--) {
			if (hasDigit(hm, index)) {
				flag = true;
				time += index;
				break;
			}
		}

		if (!flag)
			return "-1";

		flag= false;
		
		// for 2nd hour place if 2 is at first place
		if (time.charAt(0) == '2') {

			for (index = 3; index >= 0; index--) {
				if (hasDigit(hm, index)) {
					flag = true;
					time += index;
					break;
				}
			}
		} else { 
			for (index = 9; index >= 0; index--) {
				if (hasDigit(hm, index)) {
					flag = true;
					time += index;
					break;
				}
			}
		}

		if (!flag)
			return "-1";

		flag= false;
		
		time+=":";
		
		// for 1st min place
		
		for(index=5;index>=0;index--) {
			if(hasDigit(hm, index)) {
				flag = true;
				time+= index;
				break;
			}
		}
	
		if (!flag)
			return "-1";

		flag= false;
		//for 2nd min place
		
		for(index=9;index>=0;index--) {
			if(hasDigit(hm, index)) {
				flag = true;
				time+= index;
				break;
			}
		}
	
		if (!flag)
			return "-1";

		return time;
	}

	static boolean hasDigit(HashMap<Integer, Integer> hm, int digit) {

		if (hm.containsKey(digit) && hm.get(digit) > 0) {
			hm.put(digit, hm.get(digit) - 1);

			return true;
		}

		return false;

	}

}
