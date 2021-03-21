import processing.core.PApplet;
import processing.core.PImage;//used for displaying images




public class MarsSurfaceBuilder extends PApplet  {
	 // The argument passed to main must match the class name
    public static void main(String[] args) {
        PApplet.main("MarsSurfaceBuilder");
    }
    
    // method used only for setting the size of the window
    public void settings(){
        size(800,800);
    }

int Stonenumber = 14; //number of stones
    
    
    // identical use to setup in Processing IDE except for size()
    public void setup(){
    	
    }

    // identical use to draw in Processing IDE
    public void draw(){
    	
    	terrian();
    	//noLoop();
    	
    	
    }
    
    
    
    void terrian() {
    	noTint();
    	String url="https://www.nasa.gov/sites/default/files/pia17080-full.jpg"; //load images form a web server
        
    	PImage webImg = loadImage(url,"jpg");
    	
    	image(webImg,0,0); //image(webImg,x,y);
    	webImg.resize(0,height);//resize
    	
    	fill(255);
    	stroke(20);
    	
    	
    	for (int i =0; i<Stonenumber; i++) {
    		float stoneSize = random(15,width/10);
    		
    		float stoneX = random(width);
    		float stoneY = random(height);
    		
    		circle(stoneX,stoneY,stoneSize);//random stone generator	
    		
    		//String stTlink="https://previews.123rf.com/images/likstudio/likstudio1109/likstudio110900068/10537888-natural-stone-texture-with-different-colors.jpg"; //load images form a web server
            
        	//PImage stT = loadImage(stTlink,"jpg");
        	
        	//image(stT,stoneX,stoneY); //image(webImg,x,y);
        	//stT.resize((int) (stoneX+stoneSize),(int) (stoneY+stoneSize));//here the float needs to be converted to integers
        	//texture(stT);
        	//textureMode(IMAGE);
        	//textureWrap(CLAMP);
        	
        	
        	/*
    		
        	beginShape();
        	
        	vertex(10, 20);
        	vertex(80, 5);
        	vertex(95, 90);
        	vertex(40, 95);
    		
    		endShape();
        	
    		*/
    		//circle(stoneX,stoneY,stoneSize);//random stone generator	
    		
    	}
    	
    	
    	save("stoneMask.png");
    	
    	String stTlink="https://previews.123rf.com/images/likstudio/likstudio1109/likstudio110900068/10537888-natural-stone-texture-with-different-colors.jpg"; //load images form a web server
        
    	PImage stT = loadImage(stTlink,"jpg");
    	stT.resize(width,height);
    	
    	
    	PImage stTMask = loadImage("stoneMask.png");
    	
    	
    	stT.mask(stTMask);
    	
    	//background(200);
    	tint(100);
    	image(stT,0,0);
    	
    }
    
  
}
