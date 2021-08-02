
package robot_world;

import java.io.IOException;

import proj.impl.LinkedListStack;

public class SuperRobotWorld extends RobotWorld {
	
	LinkedListStack<String> undoneCommands=new LinkedListStack<String>();
	
    public SuperRobotWorld(String mapFile) throws IOException {
        super(mapFile);
    }
    
    /**
     * Undo the last move or rotation command that put the robot
     * in its current state.  If no commands have been issued yet,
     * do nothing.
     */
    public void undoCommand() {
    	
    	if(getCommands().getSize()!=0) {
    		String last=null;
    		try {
				last=getCommands().pop();
			} catch (Exception e) {
				
			}
    		if(last=="c") {
    			rotateCounterClockwise();
    			try {
					getCommands().pop();
				} catch (Exception e) {
					
				}
    		}else if(last=="cc") {
    			rotateClockwise();
    			try {
					getCommands().pop();
				} catch (Exception e) {
					
				}
    		}else if(last=="f") {
    			rotateClockwise();
    			rotateClockwise();
    			try {
					moveForward();
					getCommands().pop();
					getCommands().pop();
					getCommands().pop();
				} catch (Exception e) {
					
				}
    			rotateClockwise();
    			rotateClockwise();
    			try {
					getCommands().pop();
					getCommands().pop();
				} catch (Exception e) {
					
				}
    		}
    		undoneCommands.push(last);
    	}
    }
    
    /**
     * Undo the last n commands.  Do nothing if n is zero or negative.
     * 
     * @param n the number of commands to undo
     */
    public void undoCommands(int n) {
    	
    	if(n>0) {
    		for(int i=0;i<n;i++) {
    			undoCommand();
    		}
    	}
    }
    
    /**
     * For previously undone commands, redo the last command that was
     * undone
     */
    public void redoUndoneCommand() {
       	
    	if(undoneCommands.getSize()!=0) {
    		String last=null;
    		try {
    			last=undoneCommands.pop();
    		}catch(Exception e) {
    			
    		}
    		if(last=="c") {
    			rotateClockwise();
    			try {
    				getCommands().pop();
    			}catch(Exception e) {
    				
    			}
    		}else if(last=="cc") {
    			rotateCounterClockwise();
    			try {
    				getCommands().pop();
    			}catch(Exception e) {
    				
    			}
    		}else if(last=="f") {
    			try {
    				moveForward();
    				getCommands().pop();
    			}catch(Exception e) {
    				
    			}
    		}
    	}
    }
    
    /**
     * Redo the last n undone commands.  Do nothing if n is zero or negative.
     * 
     * @param n the number of commands to redo
     */
    public void redoUndoneCommands(int n) {
    	
    	if(n>0) {
    		for(int i=0;i<n;i++) {
    			redoUndoneCommand();
    		}
    	}
    }
}
