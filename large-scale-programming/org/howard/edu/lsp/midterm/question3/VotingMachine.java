import java.util.HashMap;
import java.util.Map;

public class VotingMAchine {

    // Using a HashMap to store candidates and their votes
    private final Map<String, Integer> candidates;

    // Constructor
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    // Method to add a candidate
    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0); // New candidate, no votes
        } else {
            System.out.println("Candidate " + name + " already registered");
        }
    }

    // Vote for candidate
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 2); 
        } else {
            System.out.println("Candidate " + name + " does not exist.");
        }
    }

    // DIsplay votes
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }
}
