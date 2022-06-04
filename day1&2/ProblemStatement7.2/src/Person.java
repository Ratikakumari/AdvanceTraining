
import java.io.Serializable;

public class Person implements Serializable {

	 static final long serialVersionUID = 1L;
	 String name;
	 int roll;
	 int age;

	 String address;

	Person() {
	};

	Person(String name, int roll, int age,String address) {
		this.name = name;
		this.age = age;
		//this.gender = gender;
		this.roll = roll;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Name:" + name + "\nRoll: " + roll + "\nAge: " + age  + "\nAddress: " + address;
	}
}