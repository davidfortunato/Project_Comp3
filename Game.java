import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public static void robPrisioner(Prison prison, Scanner input) {
        System.out.println("ACTION: Robbing prisioner");
        Prisioner robber = null;
        while(robber == null) {
            System.out.print("Which prisioner (name) is robbing? ");
            String robberName = input.nextLine();
            robber = prison.getPrisioner(robberName);
        }
        Prisioner robbed = null;
        while (robbed == null) {
            System.out.print("Which prisioner (name) is going to be robbed? ");
            String robbedName = input.nextLine();
            robbed = prison.getPrisioner(robbedName);
        }
        robber.rob(robbed);
    }

    public static void search (Prison prison, Scanner input) {
        System.out.println("ACTION: ...");
        Guard guard = null;
        while (guard == null) {
            System.out.print("Which guard (name) is searching? ");
            String guardName = input.nextLine();
            guard = prison.getGuard(guardName);
        }
        Prisioner prisioner = null;
        while (prisioner == null) {
            System.out.print("Which prisioner (name) is going to be searched? ");
            String prisionerName = input.nextLine();
            prisioner = prison.getPrisioner(prisionerName);
        }
        guard.search(prisioner);
    }

    public static void wrestle(Prison prison, Scanner input) {
        System.out.println("ACTION: Prisioners wrestling");
        Prisioner starter = null;
        while (starter == null) { 
            System.out.print("Which prisioner (name) is going to start the fight? ");
            String starterName = input.nextLine();
            starter = prison.getPrisioner(starterName);
        }   
        Prisioner punched = null;
        while (punched == null) {
            System.out.print("Which prisioner (name) is going to be punched? ");
            String punchedName = input.nextLine();
            punched = prison.getPrisioner(punchedName);
        }
        Space infirmary = prison.getSpace("SOS");
        Room finalCellBlock =prison.differentCellBlock(starter.getCellBlock());
        starter.wrestle(punched, finalCellBlock, prison.getSpaces(), infirmary);
    }

    public static void printGame (Prison prison) {

        System.out.println("Spaces:");
        for(Space space: prison.getSpaces()) {
            System.out.println(space);
        }

        System.out.println("Prisioners:");
        for(Prisioner prisioner: prison.getPrisioners()) {
            System.out.println(prisioner);
 } 
 
        System.out.println("Guards:");
        for(Guard guard: prison.getGuards()) {
            System.out.println(guard);
        }
    }

    public static void scheduledTasks(Prison prison, int hour) {
        List<Prisioner> prisioners = new ArrayList<Prisioner>();
        Space showers = prison.getSpace("SHO");
        Space cafeteria = prison.getSpace("CAF");
        List<Space> prisionMap = prison.getSpaces();        
        switch (hour) {
            case 1:
                for (Prisioner p: prisioners ){
                    p.walk(showers, prisionMap);
                }
                System.out.println("All prisioners have showered. Do you wish to do anything else before moving to the next hour?");
                break;
            case 2:
            for (Prisioner p: prisioners ){
                p.walk(cafeteria, prisionMap);
            }
            System.out.println("All prisioners have had breakfast. Do you wish to do anything else before moving to the next hour?");
                break;
            case 3:
            for (Prisioner p: prisioners){
                p.walk(p.getjobPreference(), prisionMap);
                System.out.println("Prisioner %s worked in %s. Do you wish to do anything else before moving to the next hour?");
            }
                break;
            case 4:
            for (Prisioner p: prisioners ){
                p.walk(cafeteria, prisionMap);
            }
            System.out.println("All prisioners have had lunch. Do you wish to do anything else before moving to the next hour?");
            break;
            case 5:
            for (Prisioner p: prisioners ){
                p.walk(p.getsportsPreference() ,prisionMap);
            }
            System.out.println("All prisioners have had their recess time. Do you wish to do anything else before moving to the next hour?");
            break;
            case 6:
            for (Prisioner p: prisioners ){
                p.walk(cafeteria, prisionMap);
            }
            System.out.println("All prisioners have had dinner. Do you wish to do anything else before moving to the next hour?");
            break;
            case 7:
            for (Prisioner p: prisioners ){
                p.walk( p.getCellBlock(), prisionMap);
            }
            System.out.println("All prisioners have worked. Do you wish to do anything else before moving to the next hour?");
            break;    
        }
    }
}
