package Animals;

public class Monkey extends RescueAnimal{
	//instance variables all string to make easy for input from the console
	public String[] validSpecies = new String[] {"Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tamarin"};
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	
	//constructor
	public Monkey(String name, String species, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, String tailLength, String height, String bodyLength) {
		setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setAnimalType("monkey"); //added since it part of base class but not use yet
	}
	
	//setter methods
	public void setTailLength(String length) {
		tailLength = length;
	}
	public void setHeight(String h) {
		height = h;
	}
	public void setBodyLength(String length) {
		bodyLength = length;
	}
	public void setSpecies(String sp) {
		species = sp;
	}
	
	//getter methods
	public String getTailLength() {
		return tailLength;
	}
	
	public String getHeight() {
		return height;
	}
	
	public String getBodyLength() {
		return bodyLength;
	}
	public String getSpecies() {
		return species;
	}
	//added a print method that gets passed current monkey object from the driver class
	public void print(Monkey monkey) {
		System.out.println("Name: " + monkey.getName());
		System.out.println("Acquististion date:  " + monkey.getAcquisitionDate());
		System.out.println("Acquisition location: " + monkey.getAcquisitionLocation());
		System.out.println("Age: " + monkey.getAge());
		System.out.println("Gender: " + monkey.getGender());
		System.out.println("Service locatoin: " + monkey.getInServiceLocation());
		System.out.println("Reserved: " + monkey.getReserved());
		System.out.println("Training status: " + monkey.getTrainingStatus());
		System.out.println("Weight: " + monkey.getWeight());
		System.out.println("Height: " + monkey.getHeight());
		System.out.println("Body Length: " + monkey.getBodyLength());
		System.out.println("Tail Length: " + monkey.getTailLength());
		System.out.println("Species: " + monkey.getSpecies());
		System.out.println();  
	}
}
