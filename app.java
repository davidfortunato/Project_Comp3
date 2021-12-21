import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class app {

    public static List<Space> setup() {
        Prison prison = new Prison();

        Hallway hallway1 = new Hallway("h1");
        Hallway hallway2 = new Hallway("h2");
        Hallway hallway3 = new Hallway ("h3");
        Hallway hallway4 = new Hallway ("h4");
        Hallway hallway5 = new Hallway ("h5");
        Hallway hallway6 = new Hallway ("h6");

        Pathway pathway1 = new Pathway ("p1");
        Pathway pathway2 = new Pathway ("p2");
        Pathway pathway3 = new Pathway ("p3");
        Pathway pathway4 = new Pathway ("p4");
        Pathway pathway5 = new Pathway ("p5");
        Pathway pathway6 = new Pathway ("p6");
        Pathway pathway7 = new Pathway ("p7");
        Pathway pathway8 = new Pathway ("p8");

        Room cell_blockA = new Room ("CBA");
        Room cell_blockB = new Room ("CBB");
        Room cell_blockC = new Room ("CBC");
        Room solitary = new Room ("SOL");
        Room cafeteria = new Room ("CAF");
        Room maintenanceArea = new Room ("MA");
        Room recess = new Room ("REC");
        Room basketball_court = new Room ("BC");
        Room football_field = new Room ("FF");
        Room showers = new Room ("SHO");
        Room  kitchen = new Room ("KIT");
        Room  laundry_room = new Room ("LR");
        Room  infermary = new Room ("SOS");
        Room  visitationArea = new Room ("VA");

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
        prison.addSpace(infermary);
        prison.addSpace(visitationArea);

        //adjacents para o hallway 1
        Adjacent a1 = new Adjacent(cell_blockA, 6);
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

        // adjacents in hallway5   
        Adjacent e1 = new Adjacent(maintenanceArea, 1);
        Adjacent e2 = new Adjacent (cell_blockB, 1);
        Adjacent e3 = new Adjacent (laundry_room, 1);
        Adjacent e4 = new Adjacent (infermary, 1);

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

        // adjacents in pathway5

        Adjacent j1 = new Adjacent(recess, 1);
        Adjacent j2 = new Adjacent (showers, 1);

        pathway5.addAdjacentList(Arrays.asList(j1, j2));

        // adjacents in pathway6
        Adjacent k1 = new Adjacent (recess, 1);
        Adjacent k2 = new Adjacent(cell_blockB, 1);
        Adjacent k3 = new Adjacent (infermary, 1);

        pathway6.addAdjacentList(Arrays.asList(k1, k2, k3));

        // adjacents in pathway7
        Adjacent m1 = new Adjacent (infermary, 1);
        Adjacent m2 = new Adjacent(laundry_room, 1);
        Adjacent m3 = new Adjacent (basketball_court, 1);
    
        pathway6.addAdjacentList(Arrays.asList(l1, l2, l3));
           
        // adjacents in pathway8
        Adjacent n1 = new Adjacent (football_field, 1);
        Adjacent n2 = new Adjacent(basketball_court, 1);
    
        pathway6.addAdjacentList(Arrays.asList(k1, k2));

        return prison;
    }

    

    public static List<Prisioner> setup2() {

        Prisioner prisioner1 = new Prisioner ("Carlos", "Murder", 35, "agressive", "angry", "Asian", "painter", "basketball", false, 25, true);
        Prisioner prisioner2 = new Prisioner ("João", "Theft", 21, "loner", "bully", "Asian", "painter", "basketball", false, 25, true);
        Prisioner prisioner3 = new Prisioner ("David", "Money Laundring", 55, "push-over", "bully", "Asian", "painter", "basketball", false, 25, true);
        Prisioner prisioner4 = new Prisioner ("André", "Blackmail", 42, "coward", "bully", "Asian", "painter", "basketball", false, 25, true);
        Prisioner prisioner5 = new Prisioner ("Miguel", "Fraud", 48, "push-over", "bully", "Asian", "painter", "basketball", false, 25, true);
        Prisioner prisioner6 = new Prisioner ("Francisco", "Rape", 33, "agressive", "bully", "Asian", "painter", "basketball", false, 25, true);
        Prisioner prisioner7 = new Prisioner ("Bruno", "Assault", 25, "angry", "bully", "Asian", "painter", "basketball", false, 25, true);
        Prisioner prisioner8 = new Prisioner ("Henrique", "Organized Crime", 65, "leader", "happy", "Asian", "painter", "basketball", false, 25, true);
        Prisioner prisioner9 = new Prisioner ("António", "Drug Posession", 18, "paranoid", "bully", "Asian", "painter", "basketball", false, 25, true);
        Prisioner prisioner10 = new Prisioner ("Pedro", "Disorderly Conduct", 20, "agressive", "bully", "Asian", "painter", "basketball", false, 25, true);




        return prisioners;
    }

    

    public static void main(String[] args) {
        List<Space> prison = setup();
        List <Prisioner> prisioners = setup2();

        System.out.println(prison);

        // while(true) {

        // }

    }
}
