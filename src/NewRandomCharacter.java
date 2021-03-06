import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewRandomCharacter extends JFrame implements ActionListener {
	public static int strenght, inteligence, agility, stamina, health, height, weight, age, race, prof;
	public static String name, srace, sprof;
	JButton bBack, bSave;
	JLabel jlName, jlStrenght, jlInteligence, jlAgility, jlStamina, jlHealth, jlHeight, jlWeight, jlAge, jlRace, jlProf;
////////////////////////////////////////////////////////////////////////////
	public NewRandomCharacter() {
		
		setSize(600,400);
		setTitle("RPG");
		
		setLayout(null);
		
		jlName = new JLabel("Name ");
		jlName.setBounds(150, 15, 300, 50);
		jlName.setText("Name: " + name);
		add(jlName);
		
		jlRace = new JLabel("Race");
		jlRace.setBounds(150, 30, 300, 50);
		jlRace.setText("Race: " + srace);
		add(jlRace);
		
		jlProf = new JLabel("Proffesion");
		jlProf.setBounds(150, 45, 300, 50);
		jlProf.setText("Proffesion: " + sprof);
		add(jlProf);
		
		jlAge = new JLabel("Age");
		jlAge.setBounds(150, 60, 300, 50);
		jlAge.setText("Age: " + age);
		add(jlAge);
		
		jlHeight = new JLabel("Height");
		jlHeight.setBounds(150, 75, 300, 50);
		jlHeight.setText("Height: " + height);
		add(jlHeight);
		
		jlWeight = new JLabel("Weight");
		jlWeight.setBounds(150, 90, 300, 50);
		jlWeight.setText("Weight: " + weight);
		add(jlWeight);
		
		jlHealth = new JLabel("Health");
		jlHealth.setBounds(150, 105, 300, 50);
		jlHealth.setText("Healt: " + health);
		add(jlHealth);
		
		jlStamina = new JLabel("Stamina");
		jlStamina.setBounds(150, 120, 300, 50);
		jlStamina.setText("Stamina: " + stamina);
		add(jlStamina);
		
		jlStrenght = new JLabel ("Strenght");
		jlStrenght.setBounds(150, 135, 300, 50);
		jlStrenght.setText("Strenght: " + strenght);
		add(jlStrenght);
		
		jlInteligence = new JLabel("Inteligence");
		jlInteligence.setBounds(150, 150, 300, 50);
		jlInteligence.setText("Inteligence: " + inteligence);
		add(jlInteligence);
		
		jlAgility = new JLabel("Agility");
		jlAgility.setBounds(150, 165, 300, 50);
		jlAgility.setText("Agility: " + agility);
		add(jlAgility);
		
						
		
		bSave = new JButton(" Save ");
		bSave.setBounds(150, 200, 300, 50);
		add(bSave);
		bSave.addActionListener(this);		
		
		bBack = new JButton(" Back ");
		bBack.setBounds(150, 250, 300, 50);
		add(bBack);
		bBack.addActionListener(this);
		
		
	}
	////////////////////////////////////////////////////////////////////////
	public static void newRandomCharacter(){
		NewRandomCharacter start = new NewRandomCharacter();
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.setVisible(true);
	}
	//////////////////////////////////////////
public static void main(String[] args) throws FileNotFoundException {
		
		create();
		NewRandomCharacter start = new NewRandomCharacter();
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.setVisible(true);
		
		
	}
	//////////////////////////////
	public static void create() throws FileNotFoundException{
		
		/// Name
		String fileName = "nameList.txt";
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		String line = null;
		int a = 0;
		while(in.hasNextLine()) {
			a++;
			line = in.nextLine();
			
		}
				 
		
		Random nRandom = new Random();
		int lineRandom = nRandom.nextInt(a);
		// System.out.println(lineRandom);
		in.close();
		
		Scanner in2 = new Scanner(textFile);
		String line2 = null;
		for(int i = 0; i < lineRandom; i++) {
		
			line2 = in2.nextLine();
			
		}
		
		name = line2;
		in2.close();
		/// Stats
		Random create = new Random();
		
		height = create.nextInt(50)+150;
		weight = create.nextInt(60)+50;
		age = create.nextInt(30)+20;
		strenght = create.nextInt(13)+19;
		inteligence = create.nextInt(13)+19;
		agility = create.nextInt(13)+19;
		stamina = create.nextInt(13)+19;
		health = create.nextInt(300)+150;
		prof = create.nextInt(3);
		
		if(prof == 0) {
			sprof = "Knight";
		}
		else if (prof == 1) {
			sprof = "Wizard";
		}
		else if (prof == 2) {
			sprof = "Druid";
		}
		else if (prof == 3) {
			sprof = "Paladin";
		}
		race = create.nextInt(2);
		
		if(race == 0) {
			srace = "Human";
		}
		else if (race == 1) {
			srace = "Elf";
		}
		else if (race == 2) {
			srace = "Dwarf";
		}
				
		
	}
////////////////////////////////////////////////////////////////////
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source==bBack) {
			
			NewCustomCharacter.newCustomCharacter();
			dispose();
		}
			else if (source==bSave) {
				
				try {
					Save2.save2();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		
		
	}
}
