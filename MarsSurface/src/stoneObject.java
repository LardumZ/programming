import processing.core.PApplet;
import processing.core.PImage;

public class stoneObject extends PApplet  {
	 // The argument passed to main must match the class name
    public static void main(String[] args) {
        PApplet.main("stoneObject");
    }
    
    int Stonenumber = 20; //number of stones
    float stoneSize = random(15,width/10)*random(-1,1);
 
    void stone(){
    	 
    	  rect(30, 20, random(width),random(height));
    	  }
    


	void terrian() {
	noTint();//if program is run in loop the tint function down below will effect 
	
	fill(255);//makes all circles white
	background(0);//set a black background so the mask has an alpha difference to work with
	
	noStroke();//removes any strokes of the stones so overlapping stones look like one single big stone
	
	for (int i =0; i<Stonenumber; i++) {//drawing all stones up to defined number of stones
		
		
		float stoneX = random(width);
		float stoneY = random(height);
		
		//circle(stoneX,stoneY,stoneSize);//random stone generator	
		
		int pointDistance = 50;
		
		float stoneX1 = stoneX-random(-pointDistance,pointDistance);
		float stoneY1 = stoneY-random(-pointDistance,pointDistance);
		
		float stoneX2 = stoneX-random(-pointDistance,pointDistance);
		float stoneY2 = stoneY-random(-pointDistance,pointDistance);
		
		float stoneX3 = stoneX-random(-pointDistance,pointDistance);
		float stoneY3 = stoneY-random(-pointDistance,pointDistance);
		
		float stoneX4 = stoneX-random(-pointDistance,pointDistance);
		float stoneY4 = stoneY-random(-pointDistance,pointDistance);
		
		float stoneX5 = stoneX-random(-pointDistance,pointDistance);
		float stoneY5 = stoneY-random(-pointDistance,pointDistance);
		
		float stoneX6 = stoneX-random(-pointDistance,pointDistance);
		float stoneY6 = stoneY-random(-pointDistance,pointDistance);
		
		float stoneX7 = stoneX-random(-pointDistance,pointDistance);
		float stoneY7 = stoneY-random(-pointDistance,pointDistance);
		
		float stoneX8 = stoneX-random(-pointDistance,pointDistance);
		float stoneY8 = stoneY-random(-pointDistance,pointDistance);
	
		beginShape(TRIANGLE_STRIP);
		/*for (int q =0; q<20; q++) {
			//vertex(stoneX-random(-random(-stoneSize,stoneSize),random(-stoneSize,stoneSize)),stoneY-random(-random(-stoneSize,stoneSize),random(-stoneSize,stoneSize)));
			
			
			float stoneX = stoneX-random(-50,50);
    		float stoneY = stoneY-random(-50,50);
			
			vertex(stoneX,stoneY);
		}
		*/
		vertex(stoneX,stoneY);
		vertex(stoneX1,stoneY1);
		vertex(stoneX2,stoneY2);
		vertex(stoneX3,stoneY3);
		vertex(stoneX4,stoneY4);
		vertex(stoneX5,stoneY5);
		vertex(stoneX6,stoneY6);
		vertex(stoneX7,stoneY7);
		vertex(stoneX8,stoneY8);
		
		
		endShape();
		
}
	
	
	
	save("stoneMask.jpg");//saves the current image shown in the processing window and saves it to the content folder of the project
	
	String stTlink="https://previews.123rf.com/images/likstudio/likstudio1109/likstudio110900068/10537888-natural-stone-texture-with-different-colors.jpg"; //load images form a web server
    
	PImage stT = loadImage(stTlink,"jpg");//stT = stoneTexture , URL gets defined
	stT.resize(width,height); //the mask only works properly if the image is the same size as the window
	
	
	PImage stTMask = loadImage("stoneMask.jpg");//here the mask that was saved earlier is loaded and defined
	
	
	stT.mask(stTMask);// here the actual masking is done
	
	//take first chunk of pixel and calculate average color
	
	
	String basicSurfaceTextureUrl="https://www.nasa.gov/sites/default/files/pia17080-full.jpg"; //load background surface images form a web server
    
	PImage basicSurfaceTexture = loadImage(basicSurfaceTextureUrl,"jpg");//defining the URL
	
	image(basicSurfaceTexture,0,0); //image(webImg,x,y);
	basicSurfaceTexture.resize(0,height);//resizes the background image to fill the window
	tint(random(140,150));// each stone's texture gets randomly darkened
	image(stT,0,0);//draws the mask on top
	


	
	
}

	}