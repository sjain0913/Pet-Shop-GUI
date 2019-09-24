/* Collaboration Statement: In order to help learn course concepts,
I worked on the homework with Joshua Donegal, discussed homework topics
and issues with Joshua Donegal, and/or consulted related material that
can be found at N/A. */

/**
 * This class represents the class Store. It implements Comparable.
 * @author Saumya Jain
 * @version 1.0
 */

public class Store implements StoreOrganizer {

    protected Animal[] pets;

/**
 * This creates a Store
 * @param numPets Specifies the length of animal array
 */
    public Store(int numPets) {
        this.pets = new Animal[numPets];
    }

/**
 * Getter method for pets
 * @return pets
 */
    public Animal[] getPets() {
        return this.pets;
    }

/**
 * This is the add method, which adds an animal to the pets array if there
    is space
 * @param a The animal to be added to pets
 */
    public void add(Animal a) {
        for (int i = 0; i < pets.length - 1; i++) {
            if (pets[i] == null) {
                pets[i] = a;
            }
        }
    }

/**
 * This is the sort method, which bubble sorts pets
 * The big O efficieny is O(n^2). This is because the inner loop does O(n)
    work in every iteration and the outer loop runs for O(n) iterations,
    so the total work is O(n^2)
 */
    public void sort() {
        for (int i = 0; i < pets.length - 1; i++) {
            for (int j = 0; j < pets.length - i - 1; j++) {
                if (pets[j].compareTo(pets[j + 1]) > 0) {
                    Animal temp = pets[j];
                    pets[j] = pets[j + 1];
                    pets[j + 1] = temp;
                }
            }
        }
    }

/**
 * This is the binarySearch method, which finds a specific animal in pets
    through binary search.
 * The big O efficieny is O(log n). This is because the worst case of binary
    search makes log n comparisons in logarithmic time, where n is the number
    of elements in the array
 * @param a This is the animal object that needs to be found in the array pets.
 * @return Either the index of a in pets, or '-1' if a does not exist in pets
 */
    public int binarySearch(Animal a) {
        int first = 0;
        int last = pets.length - 1;
        int middle = (first + last) / 2;
        while (first <= last) {
            if (pets[middle].compareTo(a) == 0) {
                return middle;
            } else if (pets[middle].compareTo(a) > 0) {
                last = middle;
                middle = (first + last) / 2;
            } else {
                first = middle;
                middle = (first + last) / 2;
            }
        }
        return -1;
    }

/**
 * This is the linearSearch method, which finds a specific animal in pets
    through linear search.
 * The big O efficieny is O(n). This is because the worst case of binary
    search makes n comparisons in linear time, where n is the number of
    elements in the array.
 * @param a This is the animal object that needs to be found in the array pets.
 * @return Either the index of a in pets, or '-1' if a does not exist in pets
 */
    public int linearSearch(Animal a) {
        for (int i = 0; i < pets.length - 1; i++) {
            if (a.equals(pets[i])) {
                return i;
            }
        }
        return -1;
    }

}