package _01_Crazy_Digital_Painting;
import java.awt.Color;
import java.awt.color.*;
public class CrazyDigitalPainting {
	//1. Create two final static integers for the width and height of the display.
	final static int w = 1920;
	final static int h = 1000;
	
	//2. Create a 2D array of Color objects. You will need to import
	//java.awt.Color. Initialize the size of the array using the 
	//integers created in step 1.
		Color[][] c = new Color[w][h];
	
	
	public CrazyDigitalPainting() {
		//3. Open the crazy_digital_painting.png file and look at the image.
		
		//4. Iterated through the 2D array and initialize each Color object
		//   to a new color. The sample image was created using the following 
		//   pattern:
		//   colors[i][j] = new Color(i % 256, (i * j) % 256, j % 256);
		
		//5. Come up with your own pattern to make a cool crazy image.
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				c[i][j] = new Color(i%128, (i*j) % 128, j % 128);
			}
		}
				//6. Use the ColorArrayDisplayer class to call the displayColorsAsImage method 
		//   to show off your picture.
		ColorArrayDisplayer.displayColorsAsImage(c);
	}
	
	public static void main(String[] args) {
		new CrazyDigitalPainting();
	}
}
