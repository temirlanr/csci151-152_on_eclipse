
package robot_world;

import java.io.IOException;

import proj.impl.LinkedListStack;

public class RobotWorld {
       
	// These are constants representing possible
	// chars in the world map

	public static final char SPACE = ' ';
	public static final char WALL = '#';
	public static final char GOAL = 'G';

	public static final char NORTH = '^';
	public static final char SOUTH = 'V';
	public static final char EAST = '>';
	public static final char WEST = '<';
	
	private int numOfMoves=0;
	
    // Fields 
	
	LinkedListStack<String> commands=new LinkedListStack<String>();
    
    // The map of the world
	private char[][] worldMap;
    
	// The dimensions of the world map
	private int maxRows, maxColumns;
	
	// The location of the robot
	private int robotRow, robotColumn;
    
	
    public RobotWorld(String mapFileName) throws IOException {
        
    	// This loads the file data into the world map
    	
        WorldMapReader wmr = new WorldMapReader();
        worldMap = wmr.readWorldMap(mapFileName);
        
        // This saves the dimensions of the world map
        maxRows = wmr.getMaxRows();
        maxColumns = wmr.getMaxColumns();
        
        // This sets the location of the robot to the initial position
        // shown in the file
        robotRow = wmr.getInitRobotRow();
        robotColumn = wmr.getInitRobotColumn();
    }
    
 
    /**
     * Changes the direction of the robot by rotating it clockwise
     * 90 degrees
     */
    public void rotateClockwise() {
      	
        if(worldMap[robotRow][robotColumn] == NORTH ) {
        	worldMap[robotRow][robotColumn] = EAST; 
        }else if(worldMap[robotRow][robotColumn] ==EAST ) {
        	worldMap[robotRow][robotColumn] = SOUTH; 
        }else if(worldMap[robotRow][robotColumn] == SOUTH) {
        	worldMap[robotRow][robotColumn] = WEST; 
        }else if(worldMap[robotRow][robotColumn] == WEST){
        	worldMap[robotRow][robotColumn] = NORTH; 
        }
        numOfMoves++;
        commands.push("c");
    }
    
    
    /**
     * Changes the direction of the robot by rotating it counter-
     * clockwise 90 degrees
     */
    public void rotateCounterClockwise() {
        
    	if(worldMap[robotRow][robotColumn] == NORTH ) {
        	worldMap[robotRow][robotColumn] = WEST; 
        }else if(worldMap[robotRow][robotColumn] ==EAST ) {
        	worldMap[robotRow][robotColumn] = NORTH; 
        }else if(worldMap[robotRow][robotColumn] == SOUTH) {
        	worldMap[robotRow][robotColumn] = EAST; 
        }else if(worldMap[robotRow][robotColumn] == WEST) {
        	worldMap[robotRow][robotColumn] = SOUTH; 
        }
    	numOfMoves++;
    	commands.push("cc");
    }
    
    
    /**
     * Moves the robot forward one place, as long as it is not 
     * directly in front of a wall (if it is, throw an exception).
     * Also outputs a message if the robot finds the goal
     */
    public void moveForward() throws Exception {
    	
    	if(worldMap[robotRow][robotColumn] == NORTH ) {
    		if(worldMap[robotRow-1][robotColumn]==WALL) {
        		throw new Exception("WALL!");
        	}else {
        		if(worldMap[robotRow-1][robotColumn]==GOAL) {
        			System.out.println("SUCCESS!");
        		}
        		worldMap[robotRow][robotColumn] = SPACE;
        		robotRow--;
        		worldMap[robotRow][robotColumn] = NORTH;
        		numOfMoves++;
        		commands.push("f");
        	}
        }else if(worldMap[robotRow][robotColumn] ==EAST ) {
        	if(worldMap[robotRow][robotColumn+1]==WALL) {
        		throw new Exception("WALL!");
        	}else {
        		if(worldMap[robotRow][robotColumn+1]==GOAL) {
        			System.out.println("SUCCESS!");
        		}
        		worldMap[robotRow][robotColumn] = SPACE;
        		robotColumn++;
        		worldMap[robotRow][robotColumn] =EAST;
        		numOfMoves++;
        		commands.push("f");
        	}
        }else if(worldMap[robotRow][robotColumn] == SOUTH) {
        	if(worldMap[robotRow+1][robotColumn]==WALL) {
        		throw new Exception("WALL!");
        	}else {
        		if(worldMap[robotRow+1][robotColumn]==GOAL) {
        			System.out.println("SUCCESS!");
        		}
        		worldMap[robotRow][robotColumn] = SPACE;
        		robotRow++;
        		worldMap[robotRow][robotColumn] = SOUTH;
        		numOfMoves++;
        		commands.push("f");
        	}
        }else if(worldMap[robotRow][robotColumn] == WEST) {
        	if(worldMap[robotRow][robotColumn-1]==WALL) {
        		throw new Exception("WALL!");
        	}else {
        		if(worldMap[robotRow][robotColumn-1]==GOAL) {
        			System.out.println("SUCCESS!");
        		}
        		worldMap[robotRow][robotColumn] = SPACE;
        		robotColumn--;
        		worldMap[robotRow][robotColumn] = WEST;
        		numOfMoves++;
        		commands.push("f");
        	}
        }
    }
    
    public int getNumOfMoves() {
    	return numOfMoves;
    }
    
    public LinkedListStack<String> getCommands(){
    	return commands;
    }
    
    public void printCurrentWorldMap() {
    	
    	for (int i = 0; i < maxRows; i++) {
    		for (int j = 0; j < maxColumns; j++) {
    			System.out.print(worldMap[i][j]);
    		}
    		System.out.println();
    	}
    	System.out.println();
    }
}
