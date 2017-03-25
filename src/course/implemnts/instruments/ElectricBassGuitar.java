package course.implemnts.instruments;

public class ElectricBassGuitar extends StringedInstrument {


	// default constructor
	ElectricBassGuitar(){
		
	}
	
	// parameterized constructor
	ElectricBassGuitar(String name, int NumberOfStrings) {
		super(name, NumberOfStrings);
		// TODO Auto-generated constructor stub
	}

	// Implementing play method to display name and numberofStrings in a electric guitar
	public void play(){
	
		System.out.println("It is a"+" "+this.getName()+" And have "+this.getNumberOfStrings()+" Strings ");	
		}
	
}
