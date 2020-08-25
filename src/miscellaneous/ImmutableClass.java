package miscellaneous;

public final class ImmutableClass {

	final String name;
	final int regNo ;
	
	public ImmutableClass(String name, int regNo) {
		
		this.name = name;
		this.regNo = regNo;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRegNo() {
		return regNo;
	}
	
public static void main(String []args) {
		
		ImmutableClass obj = new ImmutableClass("Prashant", 123456);
		System.out.println(obj.getName());
		System.out.println(obj.getRegNo());
		
	}
	
}

//class Test{
//	
//	public static void main(String []args) {
//		
//		ImmutableClass obj = new ImmutableClass("Prashant", 123456);
//		System.out.println(obj.getName());
//		System.out.println(obj.getRegNo());
//		
//	}
//	
//	
//	
//}