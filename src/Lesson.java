import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return " It's a Machine ";
	}
	
	public void construct() {
		System.out.println(" Machine constructed ");
	}

}

class Balista extends Machine {

	@Override
	public String toString() {
		return " It's a Balista ";
	}
	
	public void shot() {
		System.out.println(" Arrow lunched -----> ");
	}
}

public class Lesson {

	public static void main(String[] args) {


		ArrayList<Machine> list1 = new ArrayList<Machine>();

		list1.add(new Machine());
		list1.add(new Machine());
	

		ArrayList<Balista> list2 = new ArrayList<Balista>();

		list2.add(new Balista());
		list2.add(new Balista());
		
		showList(list2);
		showList2(list2);
	}

	public static void showList(ArrayList<? extends Machine> list) {
		for (Machine value : list) {
			value.construct();
			System.out.println(value);
			
		}
	}
		
		public static void showList2(ArrayList<? super Balista> list) {
			for (Object value : list) {
				
				System.out.println(value);
				
			}
	}
}
