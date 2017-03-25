package course.implemnts.instruments;

public  class StringedInstrument extends Instrument {

  	
	// declaring variable NumberOfStrings
	private int NumberOfStrings;
	

	// default Constructor
	StringedInstrument(){
	}
	
	// Parameterized Constructor
	public StringedInstrument(String name,int numberOfStrings) {
		super(name);
		// TODO Auto-generated constructor stub
		NumberOfStrings = numberOfStrings;
	}

   // to get NumberofStrings value
	public int getNumberOfStrings() {
		return NumberOfStrings;
	}

	// to set NumberofStrings value
	public void setNumberOfStrings(int numberOfStrings) {
		NumberOfStrings = numberOfStrings;
	}

// implementing play method to display name of the Instrument type
	public void play(){
		
		System.out.println("It is a"+" "+this.getName()+" And have Strings ");
	    
	}
}

