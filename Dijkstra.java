import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dijkstra {

    private static Map<String, Double> initialMap(Space initial, Space end, List<Space> prisonMap) {
        Map<String, Double> minDistance
        = new HashMap<String, Double>();

        for (Space s: prisonMap) {
            if (!s.equals(initial)) {
                minDistance.put(s.getId(), Double.POSITIVE_INFINITY);
            } else {
                minDistance.put(s.getId(), 0.0);
            }
        } 
        return minDistance;
    } 

    private static Map<String, Space> initialPrevious(List<Space> prisonMap) {
        Map<String, Space> previous
        = new HashMap<String, Space>();

        for (Space s: prisonMap) {
            previous.put(s.getId(), null);
        } 
        return previous;
    } 

    private static ArrayList<Space> initialUnvisited (List<Space> prisonMap) {

        ArrayList<Space> unvisited = new ArrayList<Space>();

        for (Space s: prisonMap) {
            unvisited.add(s);
        }

        return unvisited;
    }

    public static List<Space> shortestPath(Space initial, Space end, List<Space> prisonMap, Person person) {

        Map<String, Double> minDistance = Dijkstra.initialMap(initial, end, prisonMap);
        Map<String, Space> previous = Dijkstra.initialPrevious(prisonMap);
        List<Space> unvisitedNodes = Dijkstra.initialUnvisited(prisonMap);

        Space currentSpace = initial;
        while (!unvisitedNodes.isEmpty() && currentSpace != null) {
            unvisitedNodes.remove(currentSpace);
            List<Adjacent> adjacents = currentSpace.getAdjacent();

            for (Adjacent a: adjacents) {
                Space s = a.getSpace();
                String id = s.getId();

                if (!person.allowedToVisitSpace(s)) continue;

                double newDist = a.getDistance() + minDistance.get(currentSpace.getId());
                if (minDistance.get(id) > newDist) {
                    minDistance.replace(id, newDist);
                    previous.replace(id, currentSpace);
                }
            }

            Double md = Double.POSITIVE_INFINITY;
            Space mds = null;
            for (Space u: unvisitedNodes) {
                double distance = minDistance.get(u.getId()); 
                if (distance < md && person.allowedToVisitSpace(u)) {
                    md = minDistance.get(u.getId());
                    mds = u;
                }
            }

            currentSpace = mds;
        }

        List<Space> shortestPath = new ArrayList<>();
        Space current = end;
        while (current != null) {
            shortestPath.add(current);
            current = previous.get(current.getId());
        }

        Collections.reverse(shortestPath);

        return shortestPath;
    }

    
    
    
}