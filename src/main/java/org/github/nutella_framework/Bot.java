package org.github.nutella_framework;

/**
 * Created by tebemis on 10/6/14.
 */
abstract public class Bot implements Runnable {

    private static Bot bot;

    // Gives access to all nutella methods
    protected final Nutella nutella;

    public Bot() {

        nutella = Nutella.getInstance();
    }

}
