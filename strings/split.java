package strings;

public class split {

	public static void main(String[] args) {
		String bikes="Hero,Honda,BMW,Kawasaki";
		String allbikes[]=bikes.split(",");
		for(String bike: allbikes) {
			System.out.println(bike);
		}

	}

}