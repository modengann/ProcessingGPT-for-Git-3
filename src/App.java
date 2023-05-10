import processing.core.*;
import java.util.*;

public class App extends PApplet {
    ArrayList<Circle> circles;
   
    public static void main(String[] args)  {
        PApplet.main("App");
    }


    public void settings(){
        size(800,600);
    }
    public void setup(){
        circles = new ArrayList<>();
    }

    public void draw(){
        background(255);
        for(Circle c : circles){
            c.display();
        }
    }

    public void keyPressed(){
       if(key == ' '){
        for(Circle c : circles){
            c.randomColor();
        }
       }
    }

    public void mousePressed(){
        Circle temp = new Circle(100, mouseX, mouseY, this);
        circles.add(temp);
    }
}
