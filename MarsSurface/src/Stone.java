import processing.core.PApplet;


public class Stone extends PApplet {

	int StoneNumber;
	/*
	Stone(int n){ //Contractor
		StoneNumber = n;
	}
	
	void number(int n) {
		StoneNumber = n;
	}
	
	*/

		void drawStone() {
    	
			println("start");
    	
    	fill(255);//makes all circles white
    	//background(0);//set a black background so the mask has an alpha difference to work with
    	
    	noStroke();//removes any strokes of the stones so overlapping stones look like one single big stone
    	
    	
    		
    		
    		float stoneX = random(width);
    		float stoneY = random(height);
    		
    		//circle(stoneX,stoneY,stoneSize);//random stone generator	
    		
    		int pointDistance = 50;
    		
    		float stoneX1 = stoneX-random(-pointDistance,pointDistance);//make random points near other random points
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
    		
    		print("shape done");
    		
    		//rect(0,0,100,100);
    		
		}
	
			
}