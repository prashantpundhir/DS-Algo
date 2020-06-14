package Array;

public class DecryptPwdHackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "51Pa*0Lp*0e";

		String sd = decrypt(s);

		System.out.println(sd);
	}

	public static String decrypt(String s) {
		char[] sn = s.toCharArray();
		int st = 0;
		
		int slen = sn.length;
		for (int i = slen - 1; i >= 0; i--) {
			if (sn[i] == '0') {
				sn[i] = sn[st];
				sn[st] = '_';
				st++;
			}
			if (sn[i] == '*') {
				sn[i] = '_';
				char t = sn[i - 1];
				sn[i - 1] = sn[i - 2];
				sn[i - 2] = t;
				i = i - 2;
			}

		}

		String fin = new String(sn);

		return fin.replace("_", "");

	}
}
