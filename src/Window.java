//import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener {
	
	JButton bName, bRandomName, bBack;
	JLabel lShowName; 
	JTextField tName;
	String name;

	//////////////////////////////////////////
	public Window() {
		
		setSize(600,400);
		setTitle("RPG");
		
		setLayout(null);
		
		bName = new JButton(" Custom Name ");
		bName.setBounds(150, 150, 300, 50);
		add(bName);
		bName.addActionListener(this);
		
		bRandomName = new JButton(" Generate random Name ");
		bRandomName.setBounds(150, 200, 300, 50);
		add(bRandomName);
		bRandomName.addActionListener(this);
		
		lShowName = new JLabel("Name:");
		lShowName.setBounds(150, 50, 300, 50);
		add(lShowName);
		
		bBack = new JButton(" Back ");
		bBack.setBounds(150, 250, 300, 50);
		add(bBack);
		bBack.addActionListener(this);
		
			
		tName = new JTextField("");
		tName.setBounds(150, 100, 300, 50);
		add(tName);
	}
	/////////////////////////////////
	 public static void testWindow() {
			Window window = new Window();
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
	 }
	 /////////////////////////////////
	public static void main(String[] args) throws FileNotFoundException {
	
		Window window = new Window();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
		name = tName.getText();
		
		if (source==bName) {
		
			lShowName.setText("Name: " + name);
			// System.out.println(new Date());
		}
		else if (source==bRandomName)
		{
			String fileName = "nameList.txt";
			File textFile = new File(fileName);
			
			try{
				Scanner in = new Scanner(textFile);
			
			String line = null;
			int a = 0;
			while(in.hasNextLine()) {
				a++;
				line = in.nextLine();
				
			}
					 
			
			Random nRandom = new Random();
			int lineRandom = nRandom.nextInt(a);
			
			in.close();
		
				Scanner in2 = new Scanner(textFile);
			
			String line2 = null;
			for(int i = 0; i < lineRandom; i++) {
			
				line2 = in2.nextLine();
				
			}
			
			in2.close();	
			
			lShowName.setText("Name: " + line2);
			} catch (Exception ex) {
				System.out.println("Error");
			}
				
			
		}
		else if (source==bBack) {
			App2.menu();
			dispose();
		}
		
	}

}
