package course.implemnts.instruments;

public abstract class Instrument {

	
	//declaring variable name
private  String name;
   
// default constructor
   Instrument(){
	  
   }
   
   // parameterized Constructor
   public Instrument(String name) {
		super();
		this.name = name;
	}
   //setter and getter methods

   // method to get name value
   public String getName() {
	return name;
}

//method to set name value
public void setName(String name) {
	this.name = name;
}

// abstract method
public abstract void play();
   

}
