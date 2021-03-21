import processing.core.PApplet;

public class stoneObject extends PApplet  {
	 // The argument passed to main must match the class name
    public static void main(String[] args) {
        PApplet.main("stoneObject");
    }
    

 
    void stone(){
    	 
    	  rect(30, 20, random(width),random(height));
    	  }
    
}

