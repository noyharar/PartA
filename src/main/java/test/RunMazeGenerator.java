package test;

import algorithms.mazeGenerators.*;

public class RunMazeGenerator {
    public static void main(String[] args) {
//        testMazeGenerator(new EmptyMazeGenerator());
//        testMazeGenerator(new SimpleMazeGenerator());
        testMazeGenerator(new MyMazeGenerator());
    }

    private static void testMazeGenerator(IMazeGenerator mazeGenerator) {
        // prints the time it takes the algorithm to run
        int myrow = 1, mycol = 1;
//        System.out.println(String.format("Maze generation time(ms): %s", mazeGenerator.measureAlgorithmTimeMillis(myrow/*rows*/, mycol/*columns*/)));

//        System.out.println("Before 2nd Generation");
        // generate another maze
        Maze maze = mazeGenerator.generate(myrow/*rows*/, mycol/*columns*/);
//        System.out.println("After 2nd Generation");
        maze.toByteArray();
        Maze byteMaze = new Maze(maze.toByteArray());
        // prints the maze
        maze.print();
//        System.out.println();
        byteMaze.print();

        // get the maze entrance
        Position startPosition = maze.getStartPosition();

        // print the position
//        System.out.println(String.format("Start Position: %s", startPosition)); // format "{row,column}"

        // prints the maze exit position
//        System.out.println(String.format("Goal Position: %s", maze.getGoalPosition()));
    }
}