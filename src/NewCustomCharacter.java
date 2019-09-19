import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class NewCustomCharacter extends JFrame implements ActionListener {

	JButton bCreate, bBack;
	JLabel lShowName; 
	JTextField tName;
	/* JCheckBox cElf, cHuman, cDwarf; 
		JCheckBox cKnight, cWizard, cDruid, cPaladin; */
	JRadioButton rbElf, rbHuman, rbDwarf, rbKnight, rbWizard, rbDruid, rbPaladin;
	String name;
	short prof, race;
	
	ButtonGroup bgRace, bgProf;
	////////////////////////////////////////////////////////////////////////////////////////
	public NewCustomCharacter(){
		setSize(600,400);
		setTitle("RPG");
		
		setLayout(null);
		
		/* bName = new JButton(" Custom Name ");
		bName.setBounds(150, 150, 300, 50);
		add(bName);
		bName.addActionListener(this); */
		
		// Race
		// Race Button ////////////////////////////////
		bgRace = new ButtonGroup();
		
		rbElf = new JRadioButton("Elf", false);
		rbElf.setBounds(150, 100, 100, 50);
		bgRace.add(rbElf);
		add(rbElf);
		//rbElf.addActionListener(this);
			
		rbHuman = new JRadioButton(" Human ", true);
		rbHuman.setBounds(250, 100, 100, 50);
		bgRace.add(rbHuman);
		add(rbHuman);
		//rbHuman.addActionListener(this);
		
		rbDwarf = new JRadioButton(" Dwarf ", false);
		rbDwarf.setBounds(350, 100, 100, 50);
		bgRace.add(rbDwarf);
		add(rbDwarf);
		//rbDwarf.addActionListener(this);
		
		// Prof Button ////////////////
		bgProf = new ButtonGroup();
		
		rbKnight = new JRadioButton(" Knight ", true);
		rbKnight.setBounds(150, 150, 75, 50);
		bgProf.add(rbKnight);
		add(rbKnight);
		//rbKnight.addActionListener(this);
		
		rbWizard = new JRadioButton(" Wizard ", false);
		rbWizard.setBounds(225, 150, 75, 50);
		bgProf.add(rbWizard);
		add(rbWizard);
		//rbWizard.addActionListener(this);
		
		rbDruid = new JRadioButton(" Druid ", false);
		rbDruid.setBounds(300, 150, 75, 50);
		bgProf.add(rbDruid);
		add(rbDruid);
		//rbDruid.addActionListener(this);
		
		rbPaladin = new JRadioButton(" Paladin ", false);
		rbPaladin.setBounds(375, 150, 75, 50);
		bgProf.add(rbPaladin);
		add(rbPaladin);
		//rbPaladin.addActionListener(this);
		
		// Buttons
		
		bCreate = new JButton(" Create ");
		bCreate.setBounds(150, 200, 300, 50);
		add(bCreate);
		bCreate.addActionListener(this);
		
		/* lShowName = new JLabel("Name:");
		lShowName.setBounds(150, 50, 300, 50);
		add(lShowName); */
		
		bBack = new JButton(" Back ");
		bBack.setBounds(150, 250, 300, 50);
		add(bBack);
		bBack.addActionListener(this);
		
		tName = new JTextField("Character Name");
		tName.setBounds(150, 50, 300, 50);
		add(tName);
	}
	/////////////////////////////////////////////////////////////////////////////////////
	public static void newCustomCharacter() {
		NewCustomCharacter menu = new NewCustomCharacter();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setVisible(true);
	}
	/////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		NewCustomCharacter menu = new NewCustomCharacter();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setVisible(true);

	}
	//////////////////////////////////////////////////////////////////////////////////////
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if (source==bCreate) {
			if(rbHuman.isSelected()){
				race = 0;
				//System.out.println("Human");
			}
			else if (rbElf.isSelected()) {
				race = 1;
				
				//System.out.println("Elf");
			}
			else if (rbDwarf.isSelected()) {
				race = 2;
				
				//System.out.println("Dwarf");
			}
			///
			if(rbWizard.isSelected()) {
				prof = 0;
				//System.out.println("Wizard");
			}
			else if(rbKnight.isSelected()) {
				prof = 1;
				//System.out.println("Knight");
			}
			else if(rbDruid.isSelected()) {
				prof = 2;
				//System.out.println("Druid");
			}
			else if(rbPaladin.isSelected()) {
				prof = 3;
				// System.out.println("Paladin");
			}
			
			dispose();
			
		}
				
		
		else if (source==bBack) {
			
			Start.start();
			dispose();
		}
		
	}

}
