/* Collaboration Statement: In order to help learn course concepts,
I worked on the homework with Joshua Donegal, discussed homework topics
and issues with Joshua Donegal, and/or consulted related material that
can be found at N/A. */

/**
 * This class represents the abstract class Animal. It implements Comparable.
 * @author Saumya Jain
 * @version 1.0
 */

public abstract class Animal implements Comparable<Animal> {
    protected int storeId;
    protected String name;
    protected double price;

/**
 * This creates an Animal
 * @param storeId This is the Id of the animal
 * @param name This is the name of the animal
 * @param price This is the price of the animal
 */
    public Animal(int storeId, String name, double price) {
        this.storeId = storeId;
        this.name = name;
        this.price = price;
    }

/**
 * This creates an Animal
 * @param storeId This is the Id of the animal
 * Name and Price are initialized
 */
    public Animal(int storeId) {
        this.storeId = storeId;
        name = "Buzz";
        price = 222.0;
    }

/**
 * This is the toString method
 * @return a toString
 */
    public String toString() {
        return ("Store Id: " + storeId + ", Name: " + name + ", Price: "
            + String.format("%.2f", price));
    }

/**
 * This is the compareTo method
 * @param a This is the Animal being compared
 * @return An integer which represents if the storeId is greater than, less
    than or equal to the Animal
 */
    public int compareTo(Animal a) {
        if (storeId == a.getStoreId()) {
            return name.compareTo(a.getName());
        } else {
            if (storeId > a.getStoreId()) {
                return 1;
            } else if (this.storeId < a.getStoreId()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

/**
 * Getter method for StoreId
 * @return storeId
 */
    public int getStoreId() {
        return storeId;
    }

/**
 * Getter method for Name
 * @return name
 */
    public String getName() {
        return name;
    }

/**
 * Getter method for Price
 * @return price
 */
    public double getPrice() {
        return price;
    }

/**
 * Setter method for StoreId
 * @param storeId This is the new storeId
 */
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

/**
 * Setter method for Name
 * @param name This is the new name
 */
    public void setName(String name) {
        this.name = name;
    }

/**
 * Setter method for Price
 * @param price This is the new price
 */
    public void setPrice(double price) {
        this.price = price;
    }
}