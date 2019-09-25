import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Save2 {
	static String strenght, inteligence, agility, stamina, health, height, weight, age;
	public static void save2() throws IOException {
		
		 
		File file = new File(NewRandomCharacter.name + ".txt");
		if(!file.exists()) {
            file.createNewFile();
        }
        strenght = String.valueOf(NewRandomCharacter.strenght);
        inteligence = String.valueOf(NewRandomCharacter.inteligence);
        agility = String.valueOf(NewRandomCharacter.agility);
        stamina = String.valueOf(NewRandomCharacter.stamina);
        health = String.valueOf(NewRandomCharacter.health);
        height = String.valueOf(NewRandomCharacter.height);
        weight = String.valueOf(NewRandomCharacter.weight);
        age = String.valueOf(NewRandomCharacter.age);
        
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
           br.write(NewRandomCharacter.name);
           br.newLine();
           br.write(NewRandomCharacter.srace);
           br.newLine();
           br.write(NewRandomCharacter.sprof);
           br.newLine();
           br.write(height);
           br.newLine();
           br.write(weight);
           br.newLine();
           br.write(age);
           br.newLine();
           br.write(strenght);
           br.newLine();
           br.write(inteligence);
           br.newLine();
           br.write(agility);
           br.newLine();
           br.write(stamina);
           br.newLine();
           br.write(health);
        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }

	}
	public static void main(String[] args) throws IOException {
		save2();

	}

}
