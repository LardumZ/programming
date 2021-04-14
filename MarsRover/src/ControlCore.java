import processing.core.PApplet;


public class ControlCore extends PApplet {
	Surface s;
    // The argument passed to main must match the class name
    public static void main(String[] args) {
        PApplet.main("ControlCore");
    }

    // method used only for setting the size of the window
    public void settings(){
        size(800, 800);
        
    }

    // identical use to setup in Processing IDE except for size()
    public void setup(){
    	smooth();
    	noStroke();
    	fill(0,255,0); 	
    	s = new Surface(2);
    }

    // identical use to draw in Processing IDE
    public void draw(){
    	
    	s.terrain();
    	
    }
}