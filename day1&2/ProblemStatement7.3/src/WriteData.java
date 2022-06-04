import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class WriteData {

	public static void main(String[] args) throws Exception {
			Scanner sc = new Scanner(System.in);
	
			int option = 0;
			while(option!=2) {
				System.out.println("Select an option:\n1.Read data\n2.Exit");
				option = sc.nextInt();
				//sc.next();
				switch(option) {
				
				case 1:
					FileInputStream fi = new FileInputStream(new File("output.txt"));
					ObjectInputStream oi = new ObjectInputStream(fi);

					// Read objects
					Person pr1 = (Person) oi.readObject();
					//Person pr2 = (Person) oi.readObject();

					System.out.println(pr1.toString());
					//System.out.println(pr2.toString());

					oi.close();
					fi.close();
				
			}
		
		

	}
}
}
