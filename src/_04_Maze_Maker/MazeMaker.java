package _04_Maze_Maker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;


public class MazeMaker{
	
	private static int width;
	private static int height;
	
	private static Maze maze;
	
	private static Random randGen = new Random();
	
	private static Stack<Cell> uncheckedCells = new Stack<Cell>();
	
	
	public static Maze generateMaze(int w, int h){
		width = w;
		height = h;
		maze = new Maze(width, height);
		
		//4. select a random cell to start
		int x = randGen.nextInt(100);
		int y = randGen.nextInt(100);
		Cell start = new Cell(x,y);
		
		//5. call selectNextPath method with the randomly selected cell
		selectNextPath(start);
		
		return maze;
	}

	//6. Complete the selectNextPathMethod
	private static void selectNextPath(Cell currentCell) {
		//A. mark cell as visited
		currentCell.setBeenVisited(true);
		//B. check for unvisited neighbors using the cell
		int x = currentCell.getX();
		int y = currentCell.getY();
		Cell nOne = new Cell(x,y-1);
		Cell nTwo = new Cell(x,y+1);
		Cell nThree = new Cell(x-1,y);
		Cell nFour = new Cell(x+1,y);
		if(nOne.hasBeenVisited() == false)
		{
			uncheckedCells.push(nOne);
		}
		if(nTwo.hasBeenVisited() == false)
		{
			uncheckedCells.push(nTwo);
		}
		if(nThree.hasBeenVisited() == false)
		{
			uncheckedCells.push(nThree);
		}
		if(nFour.hasBeenVisited() == false)
		{
			uncheckedCells.push(nFour);
		}
		
		//C. if has unvisited neighbors,
			if(currentCell.hasBeenVisited()){
			//C1. select one at random.
			
			//C2. push it to the stack
				uncheckedCells.push(c);
			//C3. remove the wall between the two cells
				currentCell.setEastWall(false);
			//C4. make the new cell the current cell and mark it as visited
				currentCell.setBeenVisited(true);
				c.setBeenVisited(true);
			}
			
		//D. if all neighbors are visited
		
			//D1. if the stack is not empty
			
				// D1a. pop a cell from the stack
		
				// D1b. make that the current cell
				
			
		
	}

	//7. Complete the remove walls method.
	//   This method will check if c1 and c2 are adjacent.
	//   If they are, the walls between them are removed.
	private static void removeWalls(Cell c1, Cell c2) {
		int oneX = c1.getX();
		int twoX = c2.getX();
		int oneY = c1.getY();
		int twoY = c2.getY();
		if(Math.abs(oneX-twoX) == 1)
		{
			if(Math.abs(oneY-twoY) == 1)
			{
				if(Math.abs(oneX-twoX) + Math.abs(oneY-twoY) == 1 )
				{
					c1.set
				}
			}
		}
		
		
	}
	
	//8. Complete the getUnvisitedNeighbors method
	//   Any unvisited neighbor of the passed in cell gets added
	//   to the ArrayList
	private static ArrayList<Cell> getUnvisitedNeighbors(Cell c) {
		return null;
	}
}