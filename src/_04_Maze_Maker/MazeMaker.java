package _04_Maze_Maker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;


public class MazeMaker{
	
	private static int width;
	private static int height;
	private static int randomcell;
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
		int gate = 1;
		if(gate == 1)
		{
			if(nOne.hasBeenVisited())
			{
				
			}
			if(nTwo.hasBeenVisited() == false)
			{
				
			}
			if(nThree.hasBeenVisited() == false)
			{
			
			}
			if(nFour.hasBeenVisited() == false)
			{
				
			}
		
		//C. if has unvisited neighbors, 
		randomcell = randGen.nextInt(4);
		if(currentCell.hasBeenVisited()){
			//C1. select one at random.
			//C2. push it to the stack
			//C3. remove the wall between the two cells
			if(randomcell == 1)
			{
				uncheckedCells.push(nOne);
				nOne.setNorthWall(false);
				nOne.equals(currentCell);
				nOne.setBeenVisited(true);
			}
			if(randomcell == 2)
					{
				uncheckedCells.push(nTwo);
				nTwo.setSouthWall(false);
				nOne.equals(currentCell);
				nOne.setBeenVisited(true);
					}
			if(randomcell == 3)
			{
				uncheckedCells.push(nThree);
				nThree.setEastWall(false);
				nOne.equals(currentCell);
				nOne.setBeenVisited(true);
			}
			if(randomcell == 4)
			{
				uncheckedCells.push(nFour);
				nFour.setWestWall(false);
				nFour.equals(currentCell);
				nFour.setBeenVisited(true);
			}
		}

				
			
				
			
			
			}
			
		//D. if all neighbors are visited
		if(nOne.hasBeenVisited() && nOne.hasBeenVisited() && nOne.hasBeenVisited() &&  nOne.hasBeenVisited())
		{
			
		
		
		
			//D1. if the stack is not empty
			if(uncheckedCells.isEmpty() == false)
				// D1a. pop a cell from the stack
			{
				Cell c = uncheckedCells.pop();
			
				// D1b. make that the current cell
			c.equals(currentCell);}}
			
			
		
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
				if(oneX+twoX == -1 )
				{
					c1.setWestWall(false);
				}
				if(oneX+twoX == 1)
				{
					c1.setEastWall(false);
				}
				if(oneY+twoY == -1 )
				{
					c1.setSouthWall(false);
				}
				if(oneY+twoY == 1)
				{
					c1.setNorthWall(false);
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