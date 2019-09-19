import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class CharacterInfoWindow extends JFrame implements ActionListener {

	public CharacterInfoWindow() {
		
	}
	////////////////////////////
	public static void characterInfoWindow(){
		CharacterInfoWindow window = new CharacterInfoWindow();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	
	////////////////////////////////////////
	public static void main(String[] args) {
		CharacterInfoWindow window = new CharacterInfoWindow();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}
	/////////////////////////////////
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
