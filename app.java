import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class app {
    private static final int NUMBER_OF_DAYS = 10;

    private static final int HOURS_PER_DAY = 7;

    public static Prison setup() {
        Prison prison = new Prison();

        Hallway hallway1 = new Hallway("h1", true, "Hallway1");
        Hallway hallway2 = new Hallway("h2", true, "Hallway2");
        Hallway hallway3 = new Hallway ("h3", true, "Hallway3");
        Hallway hallway4 = new Hallway ("h4", true, "Hallway4");
        Hallway hallway5 = new Hallway ("h5", true, "Hallway5");
        Hallway hallway6 = new Hallway ("h6", true, "Hallway6");

        Pathway pathway1 = new Pathway ("p1", true, "Pathway1");
        Pathway pathway2 = new Pathway ("p2", true, "Pathway2");
        Pathway pathway3 = new Pathway ("p3", true, "Pathway3");
        Pathway pathway4 = new Pathway ("p4", true, "Pathway4");
        Pathway pathway5 = new Pathway ("p5", true, "Pathway5");
        Pathway pathway6 = new Pathway ("p6", true, "Pathway6");
        Pathway pathway7 = new Pathway ("p7", true, "Pathway7");
        Pathway pathway8 = new Pathway ("p8", true, "Pathway8");

        Room cell_blockA = new Room ("CBA", true, "Cell Block A");
        Room cell_blockB = new Room ("CBB", true, "Cell Block B");
        Room cell_blockC = new Room ("CBC", true, "Cell Block C");
        Room solitary = new Room ("SOL", true, "Solitary");
        Room cafeteria = new Room ("CAF", true, "Cafeteria");
        Room maintenanceArea = new Room ("MA", true, "Maintenance Area");
        Room recess = new Room ("REC", true, "Recess");
        Room basketball_court = new Room ("BC", true, "Basketball Court");
        Room football_field = new Room ("FF", true, "Football Field");
        Room showers = new Room ("SHO", true, "Showers");
        Room  kitchen = new Room ("KIT", true, "Kitchen");
        Room  laundry_room = new Room ("LR", true, "Laundry Room");
        Room  infirmary = new Room ("SOS", true, "Infirmary");
        Room  visitationArea = new Room ("VA", true, "Visitation Area");

        prison.addSpace(hallway1);
        prison.addSpace(hallway2);
        prison.addSpace(hallway3);
        prison.addSpace(hallway4);
        prison.addSpace(hallway5);
        prison.addSpace(hallway6);

        prison.addSpace(pathway1);
        prison.addSpace(pathway2);
        prison.addSpace(pathway3);
        prison.addSpace(pathway4);
        prison.addSpace(pathway5);
        prison.addSpace(pathway6);  
        prison.addSpace(pathway7);
        prison.addSpace(pathway8);

        prison.addSpace(cell_blockA);
        prison.addSpace(cell_blockB);
        prison.addSpace(cell_blockC);
        prison.addSpace(solitary);
        prison.addSpace(showers);
        prison.addSpace(maintenanceArea);
        prison.addSpace(recess);
        prison.addSpace(football_field);
        prison.addSpace(cafeteria);
        prison.addSpace(basketball_court);
        prison.addSpace(kitchen);
        prison.addSpace(laundry_room);
        prison.addSpace(infirmary);
        prison.addSpace(visitationArea);

        //adjacents para o hallway 1
        Adjacent a1 = new Adjacent(cell_blockA, 5);
        Adjacent a2 = new Adjacent (cafeteria, 1);
        Adjacent a3 = new Adjacent (cell_blockB, 1);

        hallway1.addAdjacentList(Arrays.asList(a1, a2, a3));
        
        // adjacents in hallway2
        Adjacent b1 = new Adjacent(cafeteria, 1);
        Adjacent b2 = new Adjacent (maintenanceArea, 1);
        Adjacent b3 = new Adjacent (kitchen, 1);

        hallway2.addAdjacentList(Arrays.asList(b1, b2, b3));

        // adjacents in hallway3
        Adjacent c1 = new Adjacent(kitchen, 1);
        Adjacent c2 = new Adjacent (solitary, 1);
        Adjacent c3 = new Adjacent (visitationArea, 1); 

        hallway3.addAdjacentList(Arrays.asList(c1, c2, c3));

        //adjacents in hallway4

        Adjacent d1 = new Adjacent(cell_blockB, 1);
        Adjacent d2 = new Adjacent (showers, 1);
        Adjacent d3 = new Adjacent (cell_blockC, 1);
        Adjacent d4 = new Adjacent (recess, 1);

        hallway4.addAdjacentList(Arrays.asList(d1, d2, d3, d4));
        hallway4.addAdjacentList(Arrays.asList(d1, d2, d3, d4));

        // adjacents in hallway5   
        Adjacent e1 = new Adjacent(maintenanceArea, 1);
        Adjacent e2 = new Adjacent (cell_blockB, 1);
        Adjacent e3 = new Adjacent (laundry_room, 1);
        Adjacent e4 = new Adjacent (infirmary, 1);

        hallway5.addAdjacentList(Arrays.asList(e1, e2, e3, e4));

        // adjacents in hallway6
        Adjacent l1 = new Adjacent(solitary, 1);
        Adjacent l2 = new Adjacent (laundry_room, 1);
        Adjacent l3 = new Adjacent (football_field, 1);
        Adjacent l4 = new Adjacent (basketball_court, 1);

        hallway5.addAdjacentList(Arrays.asList(l1, l2, l3, l4));

        // adjacents in pathway1

        Adjacent f1 = new Adjacent(cell_blockA, 1);
        Adjacent f2 = new Adjacent (cell_blockC, 1);
        Adjacent f3 = new Adjacent (showers, 1);

        pathway1.addAdjacentList(Arrays.asList(f1, f2, f3));

        // adjacents in pathway2

        Adjacent g1 = new Adjacent(cafeteria, 1);
        Adjacent g2 = new Adjacent (maintenanceArea, 1);
        Adjacent g3 = new Adjacent (cell_blockC, 1);
        Adjacent g4 = new Adjacent (cell_blockB, 1);

        pathway2.addAdjacentList(Arrays.asList(g1, g2, g3, g4));

        // adjacents in pathway3

        Adjacent h1 = new Adjacent(kitchen, 1);
        Adjacent h2 = new Adjacent (maintenanceArea, 1);
        Adjacent h3 = new Adjacent (solitary, 1);
        Adjacent h4 = new Adjacent (laundry_room, 1);

        pathway3.addAdjacentList(Arrays.asList(h1, h2, h3, h4));

        //adjacents in pathway4

        Adjacent i1 = new Adjacent(visitationArea, 1);
        Adjacent i2 = new Adjacent (solitary, 1);
        Adjacent i3 = new Adjacent (football_field, 1);

        pathway4.addAdjacentList(Arrays.asList(i1, i2, i3));

        // // adjacents in pathway5

        Adjacent j1 = new Adjacent(recess, 1);
        Adjacent j2 = new Adjacent (showers, 1);

        pathway5.addAdjacentList(Arrays.asList(j1, j2));

        // // adjacents in pathway6
        Adjacent k1 = new Adjacent (recess, 1);
        Adjacent k2 = new Adjacent(cell_blockB, 1);
        Adjacent k3 = new Adjacent (infirmary, 1);

        pathway6.addAdjacentList(Arrays.asList(k1, k2, k3));

        // // adjacents in pathway7
        Adjacent m1 = new Adjacent (infirmary, 1);
        Adjacent m2 = new Adjacent(laundry_room, 1);
        Adjacent m3 = new Adjacent (basketball_court, 1);
    
        pathway7.addAdjacentList(Arrays.asList(m1, m2, m3));
           
        // adjacents in pathway8
        Adjacent n1 = new Adjacent (football_field, 1);
        Adjacent n2 = new Adjacent(basketball_court, 1);
    
        pathway8.addAdjacentList(Arrays.asList(n1, n2));

        return prison;

    }

     public static void setupPrisioners(Prison prison) {
        
        Space kitchen = prison.getSpace("KIT");
        Space maintenanceArea = prison.getSpace("MA");
        Space infirmary = prison.getSpace("SOS");
        Space laundry_room = prison.getSpace("LR");
        Space recess = prison.getSpace("REC");
        Space basketball_court = prison.getSpace("BC");
        Space football_field = prison.getSpace("REC");
        Room cellBlockA = (Room) prison.getSpace("CBA");


        List <Prisioner> prisioners = new ArrayList<Prisioner>();
		//names/
			String[] names = {"Ralph", "Jeremy", "Adam", "Lawrence", "Bobby", "Joshua", "Scott", "Juan", "Peter", "Terry"};	
		//ages/
			int[] ages = {23, 26, 29, 32, 34, 37, 41, 46, 51, 63};	
		//personality/
			String[] personalities = {"The Entitled Personality", "The Bully Personality", "The Self-Righteous Personality", "The Sheep Personality"};	
		//mood/
			String[] moods = {"Lonely", "Mad", "High", "Infuriated", "Happy", "Sad"};	
		//crime/
			String[] crimes = {"Larceny", "Drug Possession", "Vandalism", "Fraud", "Property Crimes", "Assault", "Violent Crimes", "Weapon Charges" };	
		//Sentence Time/
			int[] sentenceTimes = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};	
		//foodpreference/
			String[] foodPreferences = {"meat", "fish", "salad", "potatoes", "pasta", "rice", "fruit", "undifferentiated" };	
		//jobpreference/
			Space[] jobPreferences = {kitchen, maintenanceArea, infirmary, laundry_room};	
		//SPORTS PREFERENCE/
			Space[] sportsPreferences = {recess, basketball_court, football_field};	
		//contraband/
			ContrabandType[] contrabandTypes = {ContrabandType.CASH, ContrabandType.GUNS, ContrabandType.DRUGS, ContrabandType.CIGARETTES, ContrabandType.PHONES ,ContrabandType.KNIFES};
            Contraband[] contrabands =	new Contraband[contrabandTypes.length];
		//money balance/
			Double[] moneyBalances = {100.0, 200.0, 300.0, 500.0, 1000.0, 2000.0, 5000.0, 0.0};	

            Room [] cellBlocks = {cellBlockA};
								
		//shuffle function
		for ( int a = 0; a < 10; a++) {
		
			
			Random randomNames = new Random();
		
			for (int i = 0; i < names.length; i++) {
				int randomIndexToSwap = randomNames.nextInt(names.length);
				String temp = names[randomIndexToSwap];
				names[randomIndexToSwap] = names[i];
				names[i] = temp;
			}
		
			//prisioners:array
			//prisioners = [[name,ages...],[name,ages...]]
			
			
			Random randomAges = new Random();
		
			for (int i = 0; i < ages.length; i++) {
				int randomIndexToSwap = randomAges.nextInt(ages.length);
				int temp = ages[randomIndexToSwap];
				ages[randomIndexToSwap] = ages[i];
				ages[i] = temp;
			}
		
		
			
			Random randomPersonalities = new Random();
		
			for (int i = 0; i < personalities.length; i++) {
				int randomIndexToSwap = randomPersonalities.nextInt(personalities.length);
				String temp = personalities[randomIndexToSwap];
				personalities[randomIndexToSwap] = personalities[i];
				personalities[i] = temp;
			}
		
		
			
			Random randomMood = new Random();
		
			for (int i = 0; i < moods.length; i++) {
				int randomIndexToSwap = randomMood.nextInt(moods.length);
				String temp = moods[randomIndexToSwap];
				moods[randomIndexToSwap] = moods[i];
				moods[i] = temp;
			}
		
		
			
			Random randomCrimes = new Random();
		
			for (int i = 0; i < crimes.length; i++) {
				int randomIndexToSwap = randomCrimes.nextInt(crimes.length);
				String temp = crimes[randomIndexToSwap];
				crimes[randomIndexToSwap] = crimes[i];
				crimes[i] = temp;
			}
			
			
			Random randomSentenceTime = new Random();
		
			for (int i = 0; i < sentenceTimes.length; i++) {
				int randomIndexToSwap = randomSentenceTime.nextInt(sentenceTimes.length);
				int temp = sentenceTimes[randomIndexToSwap];
				sentenceTimes[randomIndexToSwap] = sentenceTimes[i];
				sentenceTimes[i] = temp;
			}
		
		
			
			Random randomFoodPreferences = new Random();
		
			for (int i = 0; i<foodPreferences.length; i++) {
				int randomIndexToSwap = randomFoodPreferences.nextInt(foodPreferences.length);
				String temp = foodPreferences[randomIndexToSwap];
				foodPreferences[randomIndexToSwap] = foodPreferences[i];
				foodPreferences[i] = temp;
			}
		
		
			
			Random randomJobPreferences = new Random();
		
			for (int i = 0; i < jobPreferences.length; i++) {
				int randomIndexToSwap = randomJobPreferences.nextInt(jobPreferences.length);
				Space temp = jobPreferences[randomIndexToSwap];
				jobPreferences[randomIndexToSwap] = jobPreferences[i];
				jobPreferences[i] = temp;
			}
			
			
			
			Random randomSportsPreferences = new Random();
		
			for (int i = 0; i < sportsPreferences.length; i++) {
				int randomIndexToSwap = randomSportsPreferences.nextInt(sportsPreferences.length);
				Space temp = sportsPreferences[randomIndexToSwap];
				sportsPreferences[randomIndexToSwap] = sportsPreferences[i];
				sportsPreferences[i] = temp;
			}	
		
			
			
			Random randomContrabands = new Random();
		
			for (int i = 0; i < contrabands.length; i++) {
				int randomIndexToSwap = randomContrabands.nextInt(contrabandTypes.length);
				Contraband temp = new Contraband(true, contrabandTypes[randomIndexToSwap]);
                //TODO acrescentar um prisioneiro
                contrabands[i]=temp; 
			}
			
			
			
			Random randomMoneyBalances = new Random();
		
			for (int i = 0; i < moneyBalances.length; i++) {
				int randomIndexToSwap = randomMoneyBalances.nextInt(moneyBalances.length);
				Double temp = moneyBalances[randomIndexToSwap];
				moneyBalances[randomIndexToSwap] = moneyBalances[i];
				moneyBalances[i] = temp;
			}
			
            Random randomCellBlocks = new Random();
		
			for (int i = 0; i < cellBlocks.length; i++) {
				int randomIndexToSwap = randomCellBlocks.nextInt(cellBlocks.length);
				Room temp = cellBlocks[randomIndexToSwap];
				cellBlocks[randomIndexToSwap] = cellBlocks[i];
				cellBlocks[i] = temp;
			}
	
			
		}
		for(int i=0;i<10;i++){
			Random rand = new Random(); 

			String name = names[i];
			String crime = crimes[rand.nextInt(crimes.length)];
			int age = ages[rand.nextInt(ages.length)];
			String personality = personalities[rand.nextInt(personalities.length)];
			String mood = moods[rand.nextInt(moods.length)];
			String foodPreference = foodPreferences[rand.nextInt(foodPreferences.length)];
			Space jobPreference = jobPreferences[rand.nextInt(jobPreferences.length)];
			Space sportsPreference = sportsPreferences[rand.nextInt(sportsPreferences.length)];
			int sentenceTime = sentenceTimes[rand.nextInt(sentenceTimes.length)];
			Double moneyBalance = moneyBalances[rand.nextInt(moneyBalances.length)];
			Contraband contraband = contrabands[rand.nextInt(contrabands.length)];		
			Room cellBlock = cellBlocks[rand.nextInt(cellBlocks.length)];		

			Prisioner prisioner = new Prisioner(name,crime,age,personality,mood,foodPreference,jobPreference,sportsPreference,sentenceTime,contraband,moneyBalance, cellBlock);
			prisioners.add(prisioner);
            
		
	    }
        prison.setPrisioners(prisioners);
    }

    public static void setupGuards(Prison prison) {
        List <Guard> guards = new ArrayList<Guard>();
        Room cellBlockA = (Room) prison.getSpace("CBA");

        Guard guard = new Guard("David", 18, "fixe", "sono", cellBlockA);
        guards.add(guard);
        prison.setGuards(guards);

    }

    public static void printGetInputMessage() {
        System.out.println("Options\n0 - Next hour\n1 - Rob a prisioner\n2 - Search a prisioner\n3 - Put 2 prisioners wrestling");
    }
    public static void main(String[] args) {
        
        Prison caxias = setup();
        setupPrisioners(caxias);
        setupGuards(caxias);

   
        int day = 1;
        int hour = 1;
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        while(day <= NUMBER_OF_DAYS) {
            while (hour <= HOURS_PER_DAY) {
                System.out.println(String.format("Day: %d | Hour: %d\n", day, hour));
                Game.scheduledTasks(caxias, hour);
                int option = -1;
                
                // Varias acoes durante a mesma hora
                while (option != 0) {
                    printGetInputMessage();
                    option = Integer.parseInt(input.nextLine());
                    
                    switch (option) {
                        case 0:
                            break;
                        case 1:
                            Game.robPrisioner(caxias, input);
                            break;
                        case 2:
                            Game.search(caxias, input);
                            break;
                        case 3: 
                            Game.wrestle(caxias, input);
                            break;
                    }
                }

                hour += 1;
            }

            day += 1;
            hour = 1;
        }

    }
}
