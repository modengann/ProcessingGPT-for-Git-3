import processing.core.*;

public class Circle {

    private int radius;
    private int locX;
    private int locY;
    private PApplet parent;
    private int color;



    public Circle(int r, int lX, int lY, PApplet p){
        radius = r;
        locX = lX;
        locY = lY;
        parent = p;
        color = 10;

    }

    public void display(){
        parent.fill(color);
        
        parent.ellipse(locX, locY,radius, radius);
    }

    public void moveX(int num){
        locX += num;
    }

    public void randomColor(){
        color = parent.color(parent.random(255), parent.random(255), parent.random(255));
        
    }

   
      





    
}
