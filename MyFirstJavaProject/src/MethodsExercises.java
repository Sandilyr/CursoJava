
public class MethodsExercises {

	String getGretting() {
		return "Hello Sandy";
	}

	void anotherMethod() {
		System.out.println("Executing...");
		return;
	}
	
	public static void main(String[] args) {
		
		MethodsExercises m = new MethodsExercises();
		String s = m.getGretting();
		System.out.println(s);
		
	}
	
}
