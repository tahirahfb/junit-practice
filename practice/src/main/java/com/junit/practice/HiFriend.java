package com.junit.practice;

/**
 * Hello world!
 */
public final class HiFriend {
    private HiFriend() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        String name = "Larry Sprinkle";
        System.out.println(hiFriend(name));
    }

    public static String hiFriend(String name){
        return "Hi " + name + "!";
    }
}
