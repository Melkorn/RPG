import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Save {
	static String strenght, inteligence, agility, stamina, health, height, weight, age;
	public static void save() throws IOException {
		
		 
		File file = new File(NewCustomCharacter.name + ".txt");
		if(!file.exists()) {
            file.createNewFile();
        }
        strenght = String.valueOf(CharacterInfoWindow.strenght);
        inteligence = String.valueOf(CharacterInfoWindow.inteligence);
        agility = String.valueOf(CharacterInfoWindow.agility);
        stamina = String.valueOf(CharacterInfoWindow.stamina);
        health = String.valueOf(CharacterInfoWindow.health);
        height = String.valueOf(CharacterInfoWindow.height);
        weight = String.valueOf(CharacterInfoWindow.weight);
        age = String.valueOf(CharacterInfoWindow.age);
        
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
           br.write(NewCustomCharacter.name);
           br.newLine();
           br.write(NewCustomCharacter.srace);
           br.newLine();
           br.write(NewCustomCharacter.sprof);
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
		save();

	}

}
