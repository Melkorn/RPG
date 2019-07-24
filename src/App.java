import java.util.Scanner;


public class App {

	public static void main(String[] args) {
	
	System.out.println(" Welcome to RPG Hero Generator ");
	System.out.println(" Do You want to create a new hero? ");
	
	Scanner ans = new Scanner(System.in);
	String ans1 = ans.nextLine();
		if( ans1.equals("Yes") || ans1.equals("yes")) {
			
			System.out.println(" What should be his/her name: ");
			
			Hero hero1 = new Hero();
			Scanner hero = new Scanner(System.in);
			String name = hero.nextLine();
			hero1.name = name;
			
			System.out.println(" What specie is " + name + " ?");
		
			
			
			String specie = null;
			
			
				
			
			do {
				System.out.println(" You can choose between: Human || Elf || Dwarf ");
				specie = hero.nextLine();
				hero1.specie = specie;
			
			}
			while (false == (specie.equals("Human") || specie.equals("human") || specie.equals("Elf") || specie.equals("elf") || specie.equals("Dwarf") || specie.equals("dwarf")));	
			
	
			System.out.println(" Choose Your character proffesion");
			
						
			boolean prof1;
			boolean prof2;
			boolean prof3;
			boolean prof4;
			boolean prof5;
			boolean prof6;
			boolean prof7;
			boolean prof8;
	
			
			do {
				
			
			System.out.println(" You can choose between: Knight || Wizard || Palladin || Barbarian ");
			
			String prof = hero.nextLine();
			hero1.proffesion = prof;
			prof1 = prof.equals("Knight");
			prof2 = prof.equals("knight");
			prof3 = prof.equals("Wizard");
			prof4 = prof.equals("wizard");
			prof5 = prof.equals("Palladin");
			prof6 = prof.equals("palladin");
			prof7 = prof.equals("Barbarian");
			prof8 = prof.equals("barbarian");
			// System.out.println(prof1 + " " + prof2 + " " + prof3 + " " + prof4 + " " + prof5 + " " + prof6 + " " + prof7 + " " + prof8);
			}
			while(!(prof1 == true || prof2 == true || prof3 == true || prof4 == true|| prof5 == true || prof6 == true || prof7 == true || prof8 == true));
			hero1.create();
			hero1.stats();
		
	
	
	hero.close();
	}
		else {
			System.out.println(" Ok, Bye ");
		}
		ans.close();
	}

}
