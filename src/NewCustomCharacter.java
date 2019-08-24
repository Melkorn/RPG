import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewCustomCharacter extends JFrame implements ActionListener {

	JButton bCreate, bBack;
	JLabel lShowName; 
	JTextField tName;
	JCheckBox cElf, cHuman, cDwarf;
	JCheckBox cKnight, cWizard, cDruid, cPaladin;
	String name;
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
		
		cElf = new JCheckBox(" Elf ");
		cElf.setBounds(150, 100, 100, 50);
		add(cElf);
		cElf.addActionListener(this);
		
		cHuman = new JCheckBox(" Human ");
		cHuman.setBounds(250, 100, 100, 50);
		add(cHuman);
		cHuman.addActionListener(this);
		
		cDwarf = new JCheckBox(" Dwarf ");
		cDwarf.setBounds(350, 100, 100, 50);
		add(cDwarf);
		cDwarf.addActionListener(this);
		
		// Prof
		
		cKnight = new JCheckBox(" Knight ");
		cKnight.setBounds(150, 150, 75, 50);
		add(cKnight);
		cKnight.addActionListener(this);
		
		cWizard = new JCheckBox(" Wizard ");
		cWizard.setBounds(225, 150, 75, 50);
		add(cWizard);
		cWizard.addActionListener(this);
		
		cDruid = new JCheckBox(" Druid ");
		cDruid.setBounds(300, 150, 75, 50);
		add(cDruid);
		cDruid.addActionListener(this);
		
		cPaladin = new JCheckBox(" Paladin ");
		cPaladin.setBounds(375, 150, 75, 50);
		add(cPaladin);
		cPaladin.addActionListener(this);
		
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
		
		if (source==cElf) {
			
			if (cElf.isSelected()==true) {
			
			}
			else {
				
			}
		}
		else if (source==cHuman) {
			//
		}
		else if (source==cHuman) {
			//
		}
		else if (source==cDwarf) {
			//
		}
		else if (source==cWizard) {
			//
		}
		else if (source==cKnight) {
			//
		}
		else if (source==cDruid) {
			//
		}
		else if (source==cPaladin) {
			//
		}
		else if (source==bCreate) {
			
			dispose();
		}
		else if (source==bBack) {
			
			dispose();
		}
		
	}

}
