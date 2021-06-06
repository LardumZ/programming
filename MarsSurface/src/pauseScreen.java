import processing.core.PApplet;
//import processing.core.PImage;

 public class pauseScreen extends PApplet  {
	 // The argument passed to main must match the class name
    public static void main(String[] args) {
        PApplet.main("pauseScreen");
    }
    

	
		public void mainPauseScreen() {
    	
		if (keyCode == 19 || key == 'p' || key == 'P') {//19=break pause key, not ESC cause that closes the window
			
			filter(BLUR,5);//blur background cause epic
			
			println("p");//consol ting
			
			noLoop();//stopping new map creation
			
			fill(100,120,230);//farvecan 
			
			int size = 100;
			int offsetX = 75;
			
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
	

			}

		}
		
	}







