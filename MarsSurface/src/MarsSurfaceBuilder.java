import processing.core.PApplet;//used to import the functions of the processing IDE
import processing.core.PImage;//used for displaying images in processing




public class MarsSurfaceBuilder extends PApplet  {
	 // The argument passed to main must match the class name
    public static void main(String[] args) {
        PApplet.main("MarsSurfaceBuilder");
    }
    
    // method used only for setting the size of the window
    public void settings(){
        size(800,800);//the window size needs to be defined here
    }

int Stonenumber = 14; //number of stones
    
    
    // identical use to setup in Processing IDE except for size()
    public void setup(){
    	
    }

    // identical use to draw in Processing IDE
    public void draw(){
    	
    	terrian();
    	noLoop();
    	
    	
    }
    
    
    
    void terrian() {
    	noTint();//if program is run in loop the tint function down below will effect future outcome
    	
    	fill(255);//makes all circles white
    	background(0);//set a black background so the mask has an alpha difference to work with
    	
    	for (int i =0; i<Stonenumber; i++) {//drawing all stones up to defined number of stones
    		float stoneSize = random(15,width/10);
    		
    		float stoneX = random(width);
    		float stoneY = random(height);
    		
    		circle(stoneX,stoneY,stoneSize);//random stone generator	
	}
    	
    	
    	save("stoneMask.png");//saves the current image shown in the processing window and saves it to the content folder of the project
    	
    	String stTlink="https://previews.123rf.com/images/likstudio/likstudio1109/likstudio110900068/10537888-natural-stone-texture-with-different-colors.jpg"; //load images form a web server
        
    	PImage stT = loadImage(stTlink,"jpg");//stT = stoneTexture , URL gets defined
    	stT.resize(width,height); //the mask only works properly if the image is the same size as the window
    	
    	
    	PImage stTMask = loadImage("stoneMask.png");//here the before saved mask is loaded in
    	
    	
    	stT.mask(stTMask);// here the acual masking is done
    	
    	
    	
    	tint(random(70,150));// the stones textured gets randomly darkened
    	String basicSurfaceTextureUrl="https://www.nasa.gov/sites/default/files/pia17080-full.jpg"; //load background surface images form a web server
        
    	PImage basicSurfaceTexture = loadImage(basicSurfaceTextureUrl,"jpg");//defining the URL
    	
    	image(basicSurfaceTexture,0,0); //image(webImg,x,y);
    	basicSurfaceTexture.resize(0,height);//resizes the background image to fill the window
    	image(stT,0,0);//draws the mask on top
    	
    }
    
  
}
