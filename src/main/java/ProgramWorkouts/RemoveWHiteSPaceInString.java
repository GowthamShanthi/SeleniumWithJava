package ProgramWorkouts;

public class RemoveWHiteSPaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String inpstring = "We lc ome";
		
		String updtdstr = inpstring.replaceAll("\\s","");
		
		
		String trimstr = inpstring.trim();
		
		System.out.println(trimstr);
		
		System.out.println(updtdstr);

	}

}
