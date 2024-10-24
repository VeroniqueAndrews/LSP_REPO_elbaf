public class Driver {
    public static void main(String[] args) {
        // Create two sets
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        // CReating sets and using toString
        System.out.println("Add to sets 1 and 2:");
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1.toString()); 

        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Set2: " + set2.toString());  
        System.out.println();

        // Length of string 
        System.out.println("Length of sets:");
        System.out.println("Length of Set1: " + set1.length());  
        System.out.println("Length of Set2: " + set2.length()); 
        System.out.println();

        // Set contains
        System.out.println("Contains method:");
        System.out.println("Set1 contains 2: " + set1.contains(2));  
        System.out.println("Set1 contains 4: " + set1.contains(4)); 
        System.out.println();

        // Min/Max 
        System.out.println("Minimum and Maximim set values:");
        System.out.println("Largest in Set1: " + set1.largest());  
        System.out.println("Smallest in Set1: " + set1.smallest());  
        System.out.println();

        // Remove from set
        System.out.println("Remove method:");
        set1.remove(2);
        System.out.println("Set1 after removing 2: " + set1.toString());  
        System.out.println();

        // Union
        System.out.println("Set Union:");
        set1.union(set2);
        System.out.println("Union of Set1 and Set2: " + set1.toString()); 
        System.out.println();

        // Intersection
        System.out.println("Set Intersection:");
        set1 = new IntegerSet();  // Reset set1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.intersect(set2);
        System.out.println("Intersection of Set1 and Set2: " + set1.toString());  
        System.out.println();

        // Set difference
        System.out.println("Set Difference method:");
        set1 = new IntegerSet();  
        set1.add(2);
        set1.add(3);
        set1.diff(set2);
        System.out.println("Difference of Set1 and Set2: " + set1.toString());  
        System.out.println();

        // Set Complement 
        System.out.println("Set complement:");
        set1 = new IntegerSet();  
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.complement(set2);
        System.out.println("Complement of Set1: " + set1.toString()); 
        System.out.println();

        // Equals
        System.out.println("Are Set1 and Set3 equal:");
        IntegerSet set3 = new IntegerSet();
        set3.add(4);
        set3.add(5);
        System.out.println("Set1 equals Set3: " + set1.equals(set3));  
        System.out.println();

        // isEmpty 
        System.out.println("isEmpty method:");
        System.out.println("Is Set1 empty: " + set1.isEmpty());  
        set1.clear();
        System.out.println("Is Set1 empty: " + set1.isEmpty());  
        System.out.println();

        // Clear
        System.out.println("Clear set:");
        set2.clear();
        System.out.println("Set2 : " + set2.toString());  
    }
}
