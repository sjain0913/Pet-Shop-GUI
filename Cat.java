/* Collaboration Statement: In order to help learn course concepts,
I worked on the homework with Joshua Donegal, discussed homework topics
and issues with Joshua Donegal, and/or consulted related material that
can be found at N/A. */

/**
 * This class represents the class Cat, which is a child class of Animal.
    It implements Comparable.
 * @author Saumya Jain
 * @version 1.0
 */

public class Cat extends Animal implements Comparable<Animal> {
    protected int miceCaught;
    protected boolean likesLasagna;

/**
 * This creates a Cat, while calling on the constructor for Animal
 * @param name This is the name of Cat
 * @param price This is the price of Cat
 * @param miceCaught This is the miceCaught of Cat
 * @param likesLasagna This is the likesLasagna boolean of Cat
 */
    public Cat(String name, double price, int miceCaught,
        boolean likesLasagna) {
        super(200, name, price);
        this.miceCaught = miceCaught;
        this.likesLasagna = likesLasagna;
    }

/**
 * This creates a Cat, while calling on the constructor for Animal,
    using instantiated values
 * @param miceCaught This is the miceCaught of Cat
 * @param likesLasagna This is the likesLasagna boolean of Cat
 */
    public Cat(int miceCaught, boolean likesLasagna) {
        super(200, "none", 30.0);
        this.miceCaught = miceCaught;
        this.likesLasagna = likesLasagna;
    }

/**
 * Getter method for MiceCaught
 * @return miceCaught
 */
    public int getMiceCaught() {
        return miceCaught;
    }

/**
 * Getter method for LikesLasagna
 * @return likesLasagna
 */
    public boolean getLikesLasagna() {
        return likesLasagna;
    }

/**
 * Setter method for MiceCaught
 * @param miceCaught This is the new miceCaught
 */
    public void setMiceCaught(int miceCaught) {
        this.miceCaught = miceCaught;
    }

/**
 * Setter method for LikesLasagna
 * @param likesLasagna This is the new likesLasagna boolean
 */
    public void setLikesLasagna(boolean likesLasagna) {
        this.likesLasagna = likesLasagna;
    }

/**
 * This is the toString method, overrides the one from Animal
 * @return a toString
 */
    @Override
    public String toString() {
        price = Math.round(price * 100.0) / 100.0;
        return ("Store Id: " + storeId + ", Name: " + name + ", Price: "
            + String.format("%.2f", price) + ", Likes Lasagna: " + likesLasagna
            + ", Mice Caught: " + miceCaught);
    }

/**
 * This is the compareTo method
 * @param a This is the Animal being compared
 * @return An integer which represents if the miceCaught is greater than,
    less than or equal to the Animal in the case of Animal a being a Cat.
    Otherwise, the Animal compareTo method is run.
 */
    @Override
    public int compareTo(Animal a) {
        if (a instanceof Cat) {
            Cat b = (Cat) a;
            if (super.compareTo(a) == 0) {
                if (miceCaught < b.getMiceCaught()) {
                    return 1;
                } else if (miceCaught > b.getMiceCaught()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
        return super.compareTo(a);
    }
}