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

    // public static Prisioner setup2() {

        //Prisioner prisioners = new 

    //     public Prisioner createPrisioner() {

    //         List<ArrayList<String, String, int, String, String, String, String, String, boolean, int, Contraband, double, Space >> prisionerTraits = {{"Ralph", "Jeremy", "Adam", "Lawrence", "Bobby", "Joshua", "Scott", "Juan", "Peter", "Terry"}, {"Larceny", "Drug Possession", "Vandalism", "Fraud", "Property Crimes", "Assault", "Violent Crimes", "Weapon Charges"}, {23, 26, 29, 32, 34, 37, 41, 46, 51, 63},
    //          {"The Entitled Personality", "The Bully Personality", "The Self-Righteous Personality", "The Sheep Personality"}, {"Lonely", "Mad", "High", "Infuriated", "Happy", "Sad"}, {"meat", "fish", "salad", "potatoes", "pasta", "rice", "fruit", "undifferentiated"}, {"Transcribe Textbooks", "Plant trees", "Cut Hair", "Clean Prison", "Workshop Work", "Cook", "Nursery Job"}}
    //         for(i = 0; i<10; i++) {
    //             for(List<ArrayList<String, String, int, String, String, String, String, String, boolean, int, Contraband, double, Space >> a: prisionerTraits) {

    //             int randomIndexToSwap = randomTrait.nextInt(List<ArrayList<String, String, int, String, String, String, String, String, boolean, int, Contraband, double, Space >> a.length);
	// 			String temp = a[randomIndexToSwap];
	// 			a[randomIndexToSwap] = a[i];
	// 			a[i] = temp;

    //             }


    //         }
    //     } 



    // }

    public static void printGetInputMessage() {
        // TODO: adicionar resto das opcoes
        System.out.println("Options\n0 - Next hour\n1 - Rob a prisioner");
    }
    public static void main(String[] args) {
        Prison caxias = setup();

        Space initial = caxias.getSpace("CBA");
        Space cbb = caxias.getSpace("CBB");
        Space end = caxias.getSpace("h2");
        Space forbiden = caxias.getSpace("p1");
        Space infirmary = caxias.getSpace("SOS");
        Space kitchen = caxias.getSpace("KIT");
        Space basketball_court = caxias.getSpace("BC");
        Space football_field = caxias.getSpace("FF");
        Space maintenance_area = caxias.getSpace("MA");


        Contraband c = new Contraband(true, ContrabandType.CASH);
        Prisioner prisioner = new Prisioner("artur", "crime", 11, "personality", "mood", "foodPreference", kitchen, football_field, false, 12, c, 122.0, initial, (Room) initial);
        Prisioner prisioner2 = new Prisioner("david", "crime", 11, "personality", "mood", "foodPreference", caxias.getSpace("MA"), caxias.getSpace("BC"), false, 12, c, 122.0, initial, (Room) initial);
        prisioner.addNotAllowed(forbiden);
        c.setPrisioner(prisioner);
        caxias.addPrisioner(prisioner);
        caxias.addPrisioner(prisioner2);
        // List<Space> spp = Dijkstra.shortestPath(initial, end, caxias.getSpaces(), prisioner);    
        // System.out.println("Prisioner");
        // System.out.println(spp);

        Guard guard = new Guard("name", 11, "personality", "mood", initial);

        // List<Space> spg = Dijkstra.shortestPath(initial, end, caxias.getSpaces(), guard);    
        // System.out.println("Guard");
        // System.out.println(spg);

        // prisioner.wrestle(prisioner2, (Room) cbb, caxias.getSpaces(), infirmary);

        // prisioner.rob(prisioner2);

        // guard.search(prisioner);
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
                    }
                }

                hour += 1;
            }

            day += 1;
            hour = 1;
        }

    }
}
