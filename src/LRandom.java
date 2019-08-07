import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class LRandom {
	public static void main(String[] args) throws FileNotFoundException {
	
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
		System.out.println(lineRandom);
		in.close();
		
		Scanner in2 = new Scanner(textFile);
		String line2 = null;
		for(int i = 0; i < lineRandom; i++) {
		
			line2 = in2.nextLine();
			
		}
		
		System.out.println(line2);
		in2.close();
		} 
	
	
		// Random create = new Random();
}