package course.implemnts.instruments;

public class ElectricGuitar extends StringedInstrument {


	// default constructor
public ElectricGuitar() {
		super();
		// TODO Auto-generated constructor stub
	}

//Parameterized constructor
	public ElectricGuitar(String name, int numberOfStrings) {
		super(name, numberOfStrings);
		// TODO Auto-generated constructor stub
	}

	// Implementing play method to display name and numberofStrings in a electric guitar
public void play(){
	System.out.println("It is a"+" "+this.getName()+" And have "+this.getNumberOfStrings()+" Strings ");
}
	
}
