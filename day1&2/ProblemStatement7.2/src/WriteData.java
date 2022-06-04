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
			while(option!=3) {
				System.out.println("Select an option:\n1.Enter data\n2.Read data\n3.Exit");
				option = sc.nextInt();
				//sc.next();
				switch(option) {
				case 1:
					System.out.println("Enter name");
					sc.nextLine();
					String name = sc.nextLine();
					//System.out.println(name);
					System.out.println("Enter roll");
					
					int roll = sc.nextInt();
					sc.nextLine();
					//sc.next();
					System.out.println("Enter age");
					int age = sc.nextInt();
					//sc.next();
					System.out.println("Enter address");
					sc.nextLine();
					String address = sc.nextLine();
					Person p = new Person(name,roll,age,address);
					
					
					
					
					FileOutputStream f = new FileOutputStream(new File("output.txt"));
					ObjectOutputStream o = new ObjectOutputStream(f);
					o.writeObject(p);
					o.close();
					f.close();
					
					break;
				case 2:
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
