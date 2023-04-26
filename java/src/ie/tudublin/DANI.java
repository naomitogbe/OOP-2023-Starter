package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {
	
	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}


    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	// writes sonnet when spacebar is pressed
	public void keyPressed() {
		if (keyCode == ' ')
		{
			writeSonnet();
		}
	
	}

	// loads the document into the module
	void loadFile() {
		String[] lines = loadStrings("small.txt"); // load a text file into a string array
		for (String line : lines) { 
			String[] words = split(line, ' '); // splits a string into an array of words
			for (String w : words) {
				w.replaceAll("[^\\w\\s]", ""); //removes puncuation
				w.toLowerCase(); //converts a string to lower case
			}
		}
	}

	// finds a word in model that checks if it exists
	public void findWord(String str) {
		for (String line : sonnet) {
			if (line.contains(str)) {
				System.out.println();
			}
		}
	}

	// prints the text in the text file
	public void printModel() {
		for (String line : sonnet) {
			System.out.println(line);
		}
	}


	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}
}


