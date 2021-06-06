
import processing.core.PApplet;
//import processing.core.PImage;

 

 public class pauseScreen2 extends PApplet  {
	 
	 int size = 100;
	 int offsetX = 75;
	 
	 void pause125(){
	 		
		
		// offsetX();
		 //size123();
/*
		 newLevelButton();			    		
		 resumeButton();
		 exitButton();
		 */
 		 mainPauseScreen();
 		
	}
	/*
	 private int size123() {
		 
		 int size = 100;
		return size;	
	 }
	 
	 
	 private int offsetX() {
		 int offsetX = 75;
		 return offsetX;
	 }
	 */
	 
	 
	 public void mainPauseScreen() {
		 println("this geworking");
		 
	
	    	
		//19=break pause key, not ESC cause that closes the window
		 
		
			//noLoop();//stopping new map creation
			//filter(BLUR,5);//blur background cause epic
			//fill(100,120,230);//farve
			
			
			int size = 100;
			int offsetX = 75;
			
			println("p");//consol ting
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
		 
		
		 
			
					
			/*
					 noLoop();//stopping new map creation
					 println("p");//consol ting
					 fill(100,120,230);//farve
					 
					// fill(0);//black text
					
					 
					 
					 
					 
					 
					 newLevelButton();			    		
					 resumeButton();
					 exitButton();
	    	
					*/
		

			}
		

	 private void newLevelButton() {
		 rect(offsetX,300, size*2, size);//new level   
		 
		 textSize(30);
			text("New level",offsetX+10,300+size-10);//new level
		 
	 }

	 private void resumeButton() {
		 rect(offsetX+size*2+20,300, size*2, size);//resume
		 
			textSize(size-50);
			text("Resume",offsetX+size*2+30,300+size-10);
		 
	 }
	 
	 private void exitButton() {
		 rect(offsetX+size*4+40,300, size*2, size);//exit
		 
		 textSize(size);
			text("Exit",offsetX+size*4+40,300+size-10);
	 
	 }
	 
 }

 	







	 
	 
	 
	 
  
    

	
		