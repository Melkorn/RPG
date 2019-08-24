import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App2 extends JFrame implements ActionListener {

	JButton bStart, bLoad, bExit;
	////////////////////////////////////////////////
	public App2() {
		setSize(600,400);
		setTitle("RPG Game");
		
		setLayout(null);
		
		bStart = new JButton(" Start ");
		bStart.setBounds(150, 100, 300, 50);
		add(bStart);
		bStart.addActionListener(this);
		
		bLoad = new JButton(" Load ");
		bLoad.setBounds(150, 150, 300, 50);
		add(bLoad);
		bLoad.addActionListener(this);
		
		bExit = new JButton(" Exit ");
		bExit.setBounds(150, 200, 300, 50);
		add(bExit);
		bExit.addActionListener(this);
	}
	
	///////////////////////////////
	public static void menu () {
		App2 menu = new App2();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setVisible(true);
}
	/////////////////////////////////////
	public static void main(String[] args) throws FileNotFoundException {
		
		App2 menu = new App2();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.setVisible(true);
		
		
	}
	
	////////////////////////////
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
		
		if (source==bStart) {
			
			Start.start();
			dispose();
			
		}
		
		else if (source==bLoad) {
			// Window.testWindow();
			dispose();
		}
		else if (source==bExit) {
			dispose();
		}

	}
	/////////////////////////////
}
