public class Student4 {
	Student4Data data = new Student4Data();
	//creating a parameterized constructor
	student4(int i, String n){
		data.id =i;
		data.name = n;
	}
	// method to display the values
	void display() {
		System.out.println(data.id+ " "+data.name);
	}
	public static void main(String args[]) {
		//creating abjects and passing values
		student4 s1= new student4(111,"kavya");
		student4 s2= new student4(222,"arya");
		//calling methods to dispay the value of object
		s1.display();
		s2.display();
		
	}

}