package Animals;
import java.util.ArrayList;
import java.util.Scanner;


public class Driver {
    //ArrayLists for the two types of animals
	private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
     // Instance variables 
    static Scanner scnr = new Scanner(System.in);
    private static String input;
    private static int inputInt;
    
    
    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        //Main loop to control the program
        while (input != "q"){
        	try {
	        	displayMenu();
	        	input = scnr.nextLine();
	        	if(input.compareTo("q") == 0) {  //checks for exit option and exits if enters a q
	        		System.exit(0);
	        	}
	        	else {
	        		inputInt = Integer.parseInt(input); //parse to an int and use a switch for the options that are available
	        		switch(inputInt) {
	        			case 1:
	        				intakeNewDog(scnr);
	        				break;
	        			case 2:
	        				intakeNewMonkey(scnr);
	        				break;
	        			case 3:
	        				reserveAnimal(scnr);
	        				break;
	        			case 4:
	        				printAnimals(1);
	        				break;
	        			case 5:
	        				printAnimals(2);
	        				break;
	        			case 6:
	        				printAnimals(3);
	        				break;
	        			default:
	        				System.out.println("Please enter a valid number(1 - 6) or q to quit");
	        				
	        		}
	        	}
        	}
        	catch(NumberFormatException expect) {
        		//handles invalid input that is not one through 6 or q
        		System.out.println("Please enter a valid number(1 - 6) or q to quit");
        		continue;
        	}
        	}
        
        
        
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Timmy", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");
        Dog dog4 = new Dog("Spike", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false, "Canada");
        
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        //local variables to fill in for the creation of dog object
        String name = scanner.nextLine();
        String breed;
        String gender;
        String age;
        String weight;
        String acquisitionDate;
        String acquisitionCountry;
        String trainingStatus; 
        boolean reserved;
        String inServiceCountry;
        
        //test if dog is in the list already
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        //Ask for user input to fill all the fields for the object
        System.out.println("What is the breed of the dog?");
        breed = scanner.nextLine();
        System.out.println("What is the gender of the dog?");
        gender = scanner.nextLine();
        System.out.println("What is the age of the dog?");
        age = scanner.nextLine();
        System.out.println("What is the weight of the dog?");
        weight = scanner.nextLine();
        System.out.println("What is the acquisition date of the dog?");
        acquisitionDate = scanner.nextLine();
        System.out.println("What is acquisition country of the dog?");
        acquisitionCountry = scanner.nextLine();
        System.out.println("What is training status of the dog?");
        trainingStatus = scanner.nextLine();
        System.out.println("Is the dog reserved? (enter yes or no)");
	        if(scanner.nextLine().equalsIgnoreCase("yes") ) {
	    		reserved = true;
	    	}
	    	else {
	    		reserved = false;
	    	}
        System.out.println("What country is the dog in service at?");
        inServiceCountry = scanner.nextLine();
        
        // Add the code to instantiate a new dog and add it to the appropriate list
       Dog addDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
       dogList.add(addDog);
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(Scanner scanner) {
        	//local variables to fill in to create a monkey object
        	String name; 
        	String species;
        	String gender;
        	String age;
        	String weight;
        	String acquisitionDate;
        	String acquisitionCountry;
        	String trainingStatus;
        	boolean reserved;
        	String inServiceCountry;
        	String tailLength;
        	String height;
        	String bodyLength;
        	
        	//Ask for user input to fill all the fields for the object
        	System.out.println("What is the name of the monkey");
        	name = scanner.nextLine();
        	//test if monkey is already in the list
        	for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }
        	System.out.println("What is the species of the monkey? Choose from the following Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, Tamarin");
        	species = scanner.nextLine();
        	//test to see if user input is valid species on monkey and loop until the correct one is entered
        	while(!species.equalsIgnoreCase("Capuchin") && !species.equalsIgnoreCase("Guenon") && !species.equalsIgnoreCase("Macaque") && !species.equalsIgnoreCase("Marmoset") && !species.equalsIgnoreCase("Squirrel monkey") && !species.equalsIgnoreCase("Tamarin")){
        		System.out.println("The species enter was not a valid choose, please from the following: Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, Tamarin");
        		species = scanner.nextLine();
        	}
        	
        	System.out.println("What is the gender of the monkey?");
            gender = scanner.nextLine();
            System.out.println("What is the age of the monkey?");
            age = scanner.nextLine();
            System.out.println("What is the weight of the monkey?");
            weight = scanner.nextLine();
            System.out.println("What is the acquisition date of the monkey?");
            acquisitionDate = scanner.nextLine();
            System.out.println("What is acquisition country of the monkey?");
            acquisitionCountry = scanner.nextLine();
            System.out.println("What is training status of the monkey?");
            trainingStatus = scanner.nextLine();
            System.out.println("Is the monkey reserved? (enter yes or no)");
            	if(scanner.nextLine().equalsIgnoreCase("yes") ) {
            		reserved = true;           		
            	}
               	else {
            		reserved = false;       		
            	}
            	
            System.out.println("What country is the dog in service at?");
            inServiceCountry = scanner.nextLine();
            System.out.println("What is tail length of the monkey?");
            tailLength = scanner.nextLine();
            System.out.println("What is the height of the monkey?");
            height = scanner.nextLine();
            System.out.println("What length of the body of the monkey?");
            bodyLength = scanner.nextLine();
        	//creates new monkey object and adds to monkeyList
        	Monkey addMonkey = new	Monkey(name, species, gender, age, weight, acquisitionDate, acquisitionCountry,
        			trainingStatus, reserved, inServiceCountry, tailLength, height, bodyLength);
        	monkeyList.add(addMonkey);
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            //local variables
        	String animal;
            String name;
            
        	System.out.println("Is the animal a monkey or dog that want to reserve? (Enter dog or monkey)");
        	animal = scanner.nextLine();
        	//test user entered dog or monkey and if not loop until one is entered
        	if(!animal.equalsIgnoreCase("monkey") && !animal.equalsIgnoreCase("dog")){
        	
        		while(!animal.equalsIgnoreCase("monkey") && !animal.equalsIgnoreCase("dog")) {
        			System.out.println("The entry was not a dog or monkey");
        			System.out.println("Is the animal a monkey or dog that want to reserve? (Enter dog or monkey)");
        	
        			animal = scanner.nextLine();
        		}
        	}
        	
        	System.out.println("What is the country in service of animal you want to reserve?");
        	name = scanner.nextLine();
        	
        	//test if monkey was entered and if so search the list for monkey with the name entered and change the reserve status
        	//the else if same but for the dog option
        	if(animal.equalsIgnoreCase("monkey")) {
        		for(Monkey monkey: monkeyList) {
                	if(monkey.getName().equalsIgnoreCase(name)) {
                		if(monkey.getReserved() == false) {
                			System.out.println("This monkey is available do want to reserve it? (Enter yes or no)");
                			if(scanner.nextLine().equalsIgnoreCase("yes") ) {
                        		monkey.setReserved(true);  
                        		System.out.println("The monkey has been reserved");
                        	}
                   		}
                		return;
                	}
                	
        		}
        	}
        	else{
        		
        		for(Dog dog: dogList) {
        			if(dog.getName().equalsIgnoreCase(name)) {
                		if(dog.getReserved() == false) {
                		System.out.println("This dog is available do want to reserve it? (Enter yes or no)");
            				if(scanner.nextLine().equalsIgnoreCase("yes") ) {
            					dog.setReserved(true);  
            					System.out.println("The dog has been reserved");
            				}      		
                		}
                		
                	}
                	
        		}
        	}
        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(int type) {
            //using a switch to select the type of printing option just used a 1 - 3 chose
        	switch(type) {
            	case 1:
            		//the option for printing all the dog objects using the print method in the dog class
            		for( Dog dog : dogList) {           			
        				dog.print(dog);        			
                	}
            		break;
            	case 2:
            		//the option for printing all the monkey objects using the print method in the monkey class
            		for( Monkey monkey : monkeyList) {
            			monkey.print(monkey);
            		}
            		break;
            	case 3:
            		//option for print both list with the limit of in service and not reserved group based on the animal type
            		System.out.println("Dogs:");
            		for( Dog dog : dogList) {
            			if(dog.getReserved() == false && dog.getTrainingStatus().compareTo("in service") == 0) {
            				dog.print(dog);  
            			}
            		}
            		System.out.println("Monkeys:");
            		for( Monkey monkey : monkeyList) {
            			if(monkey.getReserved() == false && monkey.getTrainingStatus().compareTo("in service") == 0) {
            				monkey.print(monkey);
            			}
            		}
            	break;
			}
        }
       
}

