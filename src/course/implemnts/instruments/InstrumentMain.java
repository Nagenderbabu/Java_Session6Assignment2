package course.implemnts.instruments;

public class InstrumentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// initializing extended(StringedInstrument) class and referring it to abstract class object
		Instrument i=new StringedInstrument("StringedInstrument",4);
		// initializing extended(ElectricGuitar) class and referring it to abstract implemented sub class(StringedInstrument) object
		StringedInstrument s1=new ElectricGuitar("Electric guitar",6);
		// initializing extended(ElectricBassGuitar) class and referring it to abstract implemented sub class(StringedInstrument) object	
		StringedInstrument s2=new ElectricBassGuitar("BassGuitar",4); 
		
		// displays Stringed Instrument Class details
		System.out.println("---------------- Stringed Instrument----------------");	
		// displays name of Instrument
		i.play();
		System.out.println(" ");
		
		System.out.println("Types of Stringed Instruments are :");
		System.out.println(" ");
		// displays Electric Guitar Class details
		System.out.println("-------------------Electric Guitar------------------");
		// displays name of Instrument and its properties
		s1.play();
			System.out.println(" ");
			// displays Electric Bass Guitar Class details
			System.out.println("---------------- Bass Guitar  ----------------");
			// displays name of Instrument and its properties
			s2.play();
	}

}
