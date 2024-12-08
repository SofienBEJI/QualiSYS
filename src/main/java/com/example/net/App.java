package com.example.net;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Task task = new Task();
        task.setDuration(100);
        System.out.println("Hello World!" + task.getDuration());
    }
}
