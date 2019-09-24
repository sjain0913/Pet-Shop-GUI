/* Collaboration Statement: In order to help learn course concepts,
I worked on the homework with Joshua Donegal, discussed homework topics
and issues with Joshua Donegal, and/or consulted related material that
can be found at N/A. */

/**
 * This class represents the class Dog, which is a child class of Animal.
    It implements Comparable.
 * @author Saumya Jain
 * @version 1.0
 */

public class Dog extends Animal implements Comparable<Animal> {
    protected boolean curlyTail;
    protected int droolRate;

/**
 * This creates a Dog, while calling on the constructor for Animal
 * @param name This is the name of Dog
 * @param price This is the price of Dog
 * @param curlyTail This indicates whether or not the Dog has a curlyTail
 * @param droolRate This is the drool rate of Dog
 */
    public Dog(String name, double price, boolean curlyTail, int droolRate) {
        super(100, name, price);
        this.curlyTail = curlyTail;
        this.droolRate = droolRate;
    }

/**
 * This creates a Dog, while calling on the constructor for Animal,
    using instantiated values
 * @param curlyTail This indicates whether or not the Dog has a curlyTail
 * @param droolRate This is the drool rate of Dog
 *
 */
    public Dog(boolean curlyTail, int droolRate) {
        super(100, "none", 50.0);
        this.curlyTail = curlyTail;
        this.droolRate = droolRate;
    }

/**
 * Getter method for CurlyTail
 * @return curlyTail
 */
    public boolean getCurlyTail() {
        return curlyTail;
    }

/**
 * Getter method for DroolRate
 * @return droolRate
 */
    public int getDroolRate() {
        return droolRate;
    }

/**
 * Setter method for CurlyTail
 * @param curlyTail This is the new curlyTail boolean
 */
    public void setCurlyTail(boolean curlyTail) {
        this.curlyTail = curlyTail;
    }

/**
 * Setter method for DroolRate
 * @param droolRate This is the new droolRate
 */
    public void setDroolRate(int droolRate) {
        this.droolRate = droolRate;
    }

/**
 * This is the toString method, overrides the one from Animal
 * @return a toString
 */
    @Override
    public String toString() {
        price = Math.round(price * 100.0) / 100.0;
        return ("Store Id: " + storeId + ", Name: " + name + ", Price: "
            + String.format("%.2f", price) + ", Curly Tail: " + curlyTail
            + ", Drool Rate: " + droolRate);
    }

/**
 * This is the compareTo method
 * @param a This is the Animal being compared
 * @return An integer which represents if the droolRate is greater than,
    less than or equal to the Animal in the case of Animal a being a Dog.
    Otherwise, the Animal compareTo method is run.
 */
    @Override
    public int compareTo(Animal a) {
        if (a instanceof Dog) {
            Dog b = (Dog) a;
            if (super.compareTo(a) == 0) {
                if (droolRate < b.getDroolRate()) {
                    return 1;
                } else if (droolRate > b.getDroolRate()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
        return super.compareTo(a);
    }
}