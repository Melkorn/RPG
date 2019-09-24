import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Start extends JFrame implements ActionListener {

	JButton bNewRandomCharacter, bNewCustomCharacter, bBack;
	
	public Start() {
		
		setSize(600,400);
		setTitle("RPG");
		
		
		setLayout(null);
		
		bNewRandomCharacter = new JButton(" Create New Random Character ");
		bNewRandomCharacter.setBounds(150, 100, 300, 50);
		add(bNewRandomCharacter);
		bNewRandomCharacter.addActionListener(this);
		
		bNewCustomCharacter = new JButton(" Create New Custom Character ");
		bNewCustomCharacter.setBounds(150, 150, 300, 50);
		add(bNewCustomCharacter);
		bNewCustomCharacter.addActionListener(this);
		
		bBack = new JButton(" Back ");
		bBack.setBounds(150, 200, 300, 50);
		add(bBack);
		bBack.addActionListener(this);
		
		
	}
	////////////////////////////////////////////////////////////////////////
	public static void start(){
		Start start = new Start();
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.setVisible(true);
	}
	/////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) throws FileNotFoundException {
	
		Start start = new Start();
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.setVisible(true);
	}

	/////////////////////////////////////////////////////////////////////////
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if (source==bNewRandomCharacter) {
			
			// dopisac 
			dispose();
			
		}
		
		else if (source==bNewCustomCharacter) {
			NewCustomCharacter.newCustomCharacter();
			dispose();
		}
		else if (source==bBack) {
			App2.menu();
			dispose();
		}
		
	}

}
