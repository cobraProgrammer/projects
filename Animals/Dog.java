package Animals;

public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;

    // Constructor
    public Dog(String name, String breed, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setAnimalType("dog"); //added since it part of base class but not use yet

    }

    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }
    //added a print method that gets passed current dog object from the driver class
    public void print(Dog dog) {
    	System.out.println("Name: " + dog.getName());
		System.out.println("Acquististion date:  " + dog.getAcquisitionDate());
		System.out.println("Acquisition location: " + dog.getAcquisitionLocation());
		System.out.println("Age: " + dog.getAge());
		System.out.println("Breed: " + dog.getBreed());
		System.out.println("Gender: " + dog.getGender());
		System.out.println("Service locatoin: " + dog.getInServiceLocation());
		System.out.println("Reserved: " + dog.getReserved());
		System.out.println("Training status: " + dog.getTrainingStatus());
		System.out.println("Weight: " + dog.getWeight());
		System.out.println();  
    }
    

}
