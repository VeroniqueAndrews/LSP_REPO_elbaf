import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Assignment 5 Large SCale Programming
 * @author Veronique Andrews
 * IntegerSet contains adding, removing, union, intersection, and other set operations.
 */
public class IntegerSet {

    // Store elements in an ArrayList.
    private List<Integer> set = new ArrayList<>();

    /**
     * Creates empty IntegerSet.
     */
    public IntegerSet() {
    }

    /**
     * 
     * @param set ArrayList of integers to initialize the set.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears the elements in the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns number of elements in set.
     * 
     * @return the size of the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if two sets are equal.
     * Two sets are equal if they contain the same elements in any order.
     * 
     * @param o The object to compare against.
     * @return true if the two sets are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IntegerSet)) {
            return false;
        }

        IntegerSet set2 = (IntegerSet) o;

        if (this.set.size() != set2.set.size()) {
            return false;
        }

        for (int item : set) {
            if (!set2.set.contains(item)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Checks if set contains a value.
     * 
     * @param value the integer to check for.
     * @return true if the set contains the value, false if it does not.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest element in the set.
     * 
     * @return the largest integer in the set.
     */
    public int largest() {
        return Collections.max(set);
    }

    /**
     * Returns the smallest element in the set.
     * 
     * @return the smallest integer in the set.
     */
    public int smallest() {
        return Collections.min(set);
    }

    /**
     * Adds item to the set, unless it is already present.
     * 
     * @param item the integer to add to the set.
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set if it exists
     * 
     * @param item the integer to remove from the set.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Creates the union of this set with another set.
     * The union includes all elements from both sets.
     * 
     * @param intSetb the second set to join with the first.
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!this.set.contains(item)) {
                this.set.add(item);
            }
        }
    }

    /**
     * Intersects this set with another.
     * The intersection includes elements in both sets.
     * 
     * @param intSetb the second set to intersect with.
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Calculates the set difference (this set minus intSetb).
     * Includes elements present in this set but not the other set.
     * 
     * @param intSetb the second set to find the difference with.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Calculates teh set complement.
     * The complement includes elements present only in the second set.
     * 
     * @param intSetb the second set to find the complement with.
     */
    public void complement(IntegerSet intSetb) {
        ArrayList<Integer> setComplement = new ArrayList<>();

        for (int item : intSetb.set) {
            if (!this.set.contains(item)) {
                setComplement.add(item);
            }
        }
        this.set.clear();
        this.set.addAll(setComplement);
    }

    /**
     * Checks if the set is empty.
     * 
     * @return true if the set is empty, false if not empty.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns the string representation of the set.
     * 
     * @return a string representing the elements of the set.
     */
    @Override
    public String toString() {
        return set.toString();
    }
}
