import processing.core.PApplet;//used to import the functions of the processing IDE
import processing.core.PImage;//used for displaying images in processing
//import processing.sound.*;




public class MarsSurfaceBuilder extends PApplet  {
	pauseScreen2 pS = new pauseScreen2();
	 // The argument passed to main must match the class name
    public static void main(String[] args) {
        PApplet.main("MarsSurfaceBuilder");
    }
    
    // method used only for setting the size of the window
    public void settings(){
        size(800,800);//the window size needs to be defined here
    }

int Stonenumber = 20; //number of stones
float stoneSize = random(15,width/10)*random(-1,1);
int minPixelSize = 5;

int menuSize = 100;
int menuOffsetX = 75;

int goalX = (int) random(800);	
int goalY = (int) random(800);

    
    
    // identical use to setup in Processing IDE except for size()
    public void setup(){
    println("hello");	
    //terrian();
    
    
    //backgroundMusik = new SoundFile(this, "sample.mp3");
   // backgroundMusik.loop();
  //  goalSound = new SoundFile(this, "goal.mp3");
    
    }

    // identical use to draw in Processing IDE
    public void draw(){
    	
    	terrian();
    	
    	goal();
    	
    	
    	
    	
    	pixalator();
    	
    	//println(get());
    	
    	menu();
    	//noLoop();
    	
    	/*
    	if (keyCode == 19 || key == 'p' || key == 'P') {
    	pS.mainPauseScreen();
    	}
    	else if (keyCode == 20) {
    		println("ulla");
    	}
    	*/
    }
    
    
    void menu() {
    	
    		if (keyCode == 19 || key == 'p' || key == 'P') {//19=break pause key, not ESC cause that closes the window
    			
    			filter(BLUR,5);//blur background cause epic
    			
    			println("p");//consol ting
    			
    			noLoop();//stopping new map creation
    			
    			fill(100,120,230);//farve
    			
    			
    		/*
    			rect(offsetX,300, size*2, size);//new level    			    		
    			rect(offsetX+size*2+20,300, size*2, size);//resume
    			rect(offsetX+size*4+40,300, size*2, size);//exit
    	    	
    			fill(0);//black text
    			
    			textSize(size);
    			text("Exit",offsetX+size*4+40,300+size-10);
    	    	
    			textSize(30);
    			text("New level",offsetX+10,300+size-10);//new level
    	    
    			textSize(size-50);
    			text("Resume",offsetX+size*2+30,300+size-10);
			*/
    			 newLevelButton();	
    			 
    			 fill(100,120,230);
				 resumeButton();
				 
				 fill(100,120,230);
				 exitButton();
    			
				 //if (exitButton(x,y) == mouseX && mouseY)
    			
    			
    	}
	
    }
  
    	void menuExit() {
    		
    	}
    	
    	void menuNewLevel() {
    		
    	}
   
    	 private void newLevelButton() {
    		 rect(menuOffsetX,300, menuSize*2, menuSize);//new level   
    		 
    		 fill(10);
    		 textSize(30);
    			text("New level",menuOffsetX+10,300+menuSize-10);//new level
    		 
    	 }
 	 
    	 private void resumeButton() {
    		 rect(menuOffsetX+menuSize*2+20,300, menuSize*2, menuSize);//resume
    		 
    		 fill(10);
    			textSize(menuSize-50);
    			text("Resume",menuOffsetX+menuSize*2+30,300+menuSize-10);
    		 
    	 }
    	 
    	 private void exitButton() {
    		 rect(menuOffsetX+menuSize*4+40,300, menuSize*2, menuSize);//exit
    		 
    		 fill(10);
    		 textSize(menuSize);
    			text("Exit",menuOffsetX+menuSize*4+40,300+menuSize-10);
    	 
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
    	
    		beginShape(TRIANGLE_STRIP);//specifies the conettion type
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
    		vertex(stoneX8,stoneY8);//connecting all the vertecies
    		
    		
    		endShape();
    		
    		//rect(0,0,100,100);
    		
	}
    	
    	
    	
    	save("stoneMask.jpg");//saves the current image shown in the processing window and saves it to the content folder of the project
    	
    	overlap();//should count all the black pixels
    	
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
 
    
    void goal() {
    	
    	fill(255,255,0);
    	circle(goalX,goalY,10);
    	
    	
    	
    }
    
    
    
    void overlap() {
    	int Pwhite = color(255);
    	
    	loadPixels();
    	for (int x = 0;x<pixelWidth;x++) {
    	
    	   for (int y = 0;y<pixelHeight;y++){
    		   
    	    
    		   if (pixels[x] == Pwhite && goalX==x && goalY==y) {
       			
    	    		  println("overlap "+x+","+y);
    	    		
    	    		  
    	    		  delay(5000);
    	    		 //new terrain();
    	    		  
    	    	  }
    	   }
    	}
    	
    	
    }
  
    void vhiicleCollision() {
    	/*
    	int Pwhite = color(255);
    	
    	loadPixels();
    	for (int x = 0;x<pixelWidth;x++) {
    	
    	   for (int y = 0;y<pixelHeight;y++){
    	   
    	    
    		   if (pixels[x] == Pwhite && vhicleX==x && vhcleY==y) {
       			
    	    		  println("overlap "+x+","+y);
    	    		
    	    		  delay(5000);
    	    		 //new terrain();
    	    		  
    	    	  }
    	   }
    	}
    	
    	*/
    }
    
   
    
    
    
    void sampleRect(int x,int y,int w, int h) { //X Y correspond to the upper left corner, W and H are sizes
  	  int thisColor = get(max(min(x+w/2,width),0) , max(min(y+h/2,height),0)); //Get color from the middle pixel of our future block
  	  //The max(min( functions are to limit the center coordinate so that it stays in the picture so that it doesn't try to grab a pixel from outside the screen. 
  	  fill(thisColor); //Use that color for drawing
  	  rect(x,y,w,h); //Draw it with that color
  	}
    
    void pixalator() {
    	
    		//maybe use get()	funktion
    	
    
    	for(int x = 0; x<width;x+=minPixelSize){
    	    for(int y = 0; y<height; y+=minPixelSize){
    	      int offset = 0;
    	      if(y%2==1){ //If Y is odd
    	        offset = minPixelSize/2;
    	      }
    	      sampleRect(x-offset, y, minPixelSize, minPixelSize);
    	    }
    	  }
    	
    }
   
    
    
    
    
    
    
    
    /*
    void Area()	{
    	
    	loadPixels();
    	for (int i = 0; i < width*height; i++) {
    	  if get([i])=
    	}
    	
    	if get()=
    }
    
    */
    
    /*  public void pixel() {
    for(int g = 20; g>minPixelSize; g-- ){
            	
        		println(g);	
        	pixalator();
        	
        	delay(1000);
        	}
        }
        */

    	
    	
    	
    	
    	/*
    	import java.awt.Color;
    	import java.awt.image.BufferedImage;
    	import java.util.Comparator;
    	import java.util.HashMap;
    	import java.util.Map;
    	import java.util.Map.Entry;

    	

    	    public static BufferedImage pixelate(BufferedImage imageToPixelate, int pixelSize) {
    	        BufferedImage pixelateImage = new BufferedImage(
    	            imageToPixelate.getWidth(),
    	            imageToPixelate.getHeight(),
    	            imageToPixelate.getType());

    	        for (int y = 0; y <height; y += pixelSize) {
    	            for (int x = 0; x < width; x += pixelSize) {
    	                BufferedImage croppedImage = getCroppedImage(imageToPixelate, x, y, pixelSize, pixelSize);
    	                Color dominantColor = getDominantColor(croppedImage);
    	                for (int yd = y; (yd < y + pixelSize) && (yd < pixelateImage.getHeight()); yd++) {
    	                    for (int xd = x; (xd < x + pixelSize) && (xd < pixelateImage.getWidth()); xd++) {
    	                        pixelateImage.setRGB(xd, yd, dominantColor.getRGB());
    	                    }
    	                }
    	            }
    	        }

    	        return pixelateImage;
    	    }

    	    public static BufferedImage getCroppedImage(BufferedImage image, int startx, int starty, int width, int height) {
    	        if (startx < 0) startx = 0;
    	        if (starty < 0) starty = 0;
    	        if (startx > image.getWidth()) startx = image.getWidth();
    	        if (starty > image.getHeight()) starty = image.getHeight();
    	        if (startx + width > image.getWidth()) width = image.getWidth() - startx;
    	        if (starty + height > image.getHeight()) height = image.getHeight() - starty;
    	        return image.getSubimage(startx, starty, width, height);
    	    }

    	    public static Color getDominantColor(BufferedImage image) {
    	        Map<Integer, Integer> colorCounter = new HashMap<>(100);
    	        for (int x = 0; x < image.getWidth(); x++) {
    	            for (int y = 0; y < image.getHeight(); y++) {
    	                int currentRGB = image.getRGB(x, y);
    	                int count = colorCounter.getOrDefault(currentRGB, 0);
    	                colorCounter.put(currentRGB, count + 1);
    	            }
    	        }
    	        return getDominantColor(colorCounter);
    	    }

    	    @SuppressWarnings("unchecked")
    	    private static Color getDominantColor(Map<Integer, Integer> colorCounter) {
    	        int dominantRGB = colorCounter.entrySet().stream()
    	            .max(new EntryComparator())
    	            .get()
    	            .getKey();
    	        return new Color(dominantRGB);
    	    }
    	}

    	@SuppressWarnings("rawtypes")
    	class EntryComparator implements Comparator {

    	    @SuppressWarnings("unchecked")
    	    @Override
    	    public int compare(Object o1, Object o2) {
    	        Entry<Integer, Integer> entry1 = (Map.Entry<Integer, Integer>) o1;
    	        Entry<Integer, Integer> entry2 = (Map.Entry<Integer, Integer>) o2;
    	        return (entry1.getValue() > entry2.getValue() ? 1 : -1);
    	    }
    	}
    	*/
    }
  

