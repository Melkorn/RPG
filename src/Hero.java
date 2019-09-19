import java.util.Random;

public class Hero {
	
	// statistics
	public String name, specie, proffesion;

	public int height, weight, age;
	//
	public int strenght, inteligence, agility, stamina, health;
	

	// show stat
	public void stats() {
		System.out.println(name + " is a " + proffesion + " of race " + specie);
	System.out.println(" Height: " + height + " || "+ " Weight: " + weight + " || " + " Age: " + age);
	System.out.println(" Strenght : " + strenght + " || " + "Intelignce: " + inteligence);
	System.out.println(" Agility: " + agility + " || " + " Stamina: " + stamina + " || " + " Health: " + health);
	}
	
	
	
	// actions
	
		// create
		public void create () {
			
			Random create = new Random();
			
			height = create.nextInt(50)+150;
			weight = create.nextInt(60)+50;
			age = create.nextInt(30)+20;
			strenght = create.nextInt(13)+19;
			inteligence = create.nextInt(13)+19;
			agility = create.nextInt(13)+19;
			stamina = create.nextInt(13)+19;
			health = create.nextInt(300)+150;
			
			}	

		
	
	
	public void hello() {
		System.out.println(" Hello there I'am " + name);
		System.out.println("test");
		
	}
	
}
