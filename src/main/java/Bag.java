/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

import static org.junit.Assert.assertEquals;

public abstract class Bag {
    /*
     * TODO: Create the following private instance variables
     *       - a String named color
     *       - an int named numberOfContents
     *       - an int named capacity
     *       - an array of Strings named contents
     */
    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;




    /*
     * TODO: Create a constructor that takes two arguments:
     *       - a String representing the Bag's colour
     *       - an int representing the Bag's capacity
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */
    /**
     * Creates a new Bag object.
     * This constructor takes in a String and an int as its arguments.
     *
     * @param color the color of this Bag instance.
     * @param capacity the number of capacity for this Bag instance.
     */
    public Bag(String color, int capacity) {
        this.numberOfContents = 0;
        this.capacity = capacity;
        this.color = color;
        this.contents = new String[this.capacity];
    }




    /*
     * TODO: Create a variety of 'getter' functions.
     *       These should be named:
     *           - getColor
     *           - getNumberOfContents
     *           - getCapacity
     */
    /**
     * Return the colour of Bag instance.
     *
     * @return the colour of Bag
     */
    public String getColor(){
        return this.color;
    }

    /**
     * Return the number of contents in Bag instance.
     *
     * @return the number of contents in Bag
     */
    public int getNumberOfContents(){
        return this.numberOfContents;
    }

    /**
     * Return the capacity of Bag instance.
     *
     * @return the capacity of Bag
     */
    public int getCapacity(){
        return this.capacity;
    }




    /*
     * TODO: Create a setter function called setColor which sets the
     *       color of this bag to the given color.
     */

    public void setColor(String color) {
        this.color = color;
    }

    /*
     * TODO: Create a method called addItem that takes in a String
     *       representing an item in the Bag.
     *       The item is added into the Bag if the number of items
     *       in the bag is < the capacity of the Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     *       This method should return true if the item was added
     *       and false otherwise.
     */

    public boolean addItem(String item){
        if (this.numberOfContents < this.capacity){
            this.contents[this.numberOfContents] = item;
            this.numberOfContents ++;
            return true;
        } else {
            return false;
        }
    }


    /**
     * TODO: Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     * If there are no items in this Bag, return null.
     *
     * @return the last item added to this bag.
     */
    public String popItem(){
        String last_item = this.contents[this.numberOfContents - 1];
        this.contents[this.numberOfContents - 1] = null;
        this.numberOfContents --;
        return last_item;
    }





    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        // TODO: Implement this method.
        this.capacity = this.capacity + n;
        String[] old_contents = this.contents;
        String[] new_capacity_contents = new String[this.capacity];
        for (int i =0; i < old_contents.length; i++){
            new_capacity_contents[i] = old_contents[i];
        }
        this.contents = new_capacity_contents;
    }


    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return color, number of contents, and capacity of the bag
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();

    public static void main(String[] args) {

    }
}

