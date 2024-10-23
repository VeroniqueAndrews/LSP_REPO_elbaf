import com.sun.jdi.IntegerType;
import com.sun.jdi.connect.Connector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class IntegerSet  {
	// Store the set elements in an ArrayList.
	private List<Integer> set = new ArrayList<>();

	// Default Constructor
	public IntegerSet() {
	}

	// Constructor if you want to pass in already initialized
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	// Clears the internal representation of the set. 5 pts.
public void clear() {
	set.clear();
};

// Returns the length of the set. 5 pts.
public int length() {
	return(set.size());
}; // returns the length

/*
 * Returns true if the 2 sets are equal, false otherwise.
 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
 * the equal method from the Object class. 10 pts.
*/
@Override
public boolean equals(Object o) {
    if (this == o) {
        return true; 
    }if (!(o instanceof IntegerSet)) {
        return false;  
    }
    
    IntegerSet set2 = (IntegerSet) o;
    
    if (this.set1.size() != set2.set.size()) {
        return false;
    }

    for (int item : set) {
        if (!set2.set.contains(item)) {
            return false;  
        }
    }
    
    return true;  
}

// Returns true if the set contains the value, otherwise false. 5 pts.
public boolean contains(int value) {
	return( set.contains(value));
}    
// Returns the largest item in the set. 5 pts.
public int largest()  {
	return Collections.max(set);
} 

// Returns the smallest item in the set. 5 pts.
public int smallest()  {
	return Collections.min(set);
}

// Adds an item to the set or does nothing it already there. 5 pts.	
public void add(int item) {
	if (!set.contains(item)){
		set.add(item);
	}
} // adds item to the set or does nothing if it is in set

	// Removes an item from the set or does nothing if not there. 5 pts.
public void remove(int item) {
	set.remove(Integer.valueOf(item));
} 

// Set union. 11 pts.
public void union(IntegerSet intSetb) {
	
}

// Set intersection, all elements in s1 and s2. 12 pts.
public void intersect(IntegerSet intSetb) {
	set.retainAll(intSetb.set);
}

// Set difference, i.e., s1 –s2. 12 pts.
public void diff(IntegerSet intSetb){
	set.removeAll(intSetb.set);
} // set difference, i.e. s1 - s2

// Set complement, all elements not in s1. 11 pts.
public void complement(IntegerSet intSetb) {
	IntegerSet setComplement = new IntegerSet();
	for (int item: intSetb.set){
		if(!this.set.contains(item)){
			setComplement.add(item);
		}
	}
	return setComplement;

}

// Returns true if the set is empty, false otherwise. 5 pts.
boolean isEmpty(){
	return set.isEmpty();
}

// Return String representation of your set.  This overrides the equal method from 
// the Object class. 5 pts.
@Override
public String toString() {
	return set.toString();
}	// return String representation of your set

}