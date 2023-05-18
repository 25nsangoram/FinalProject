import processing.core.PApplet;
import java.util.ArrayList;
public class Main extends PApplet {
    private ArrayList <Question> listQ;
    public static Main app;
    public static void main(String[] args) {
        PApplet.main("Main");
    }
    public Main() {//Main's constructor
        //super();
        //app = this;
       // draw();
    }
    public void settings() {
        size(600, 600);




    }
    public void setup(){

    }
    public void draw() {
        background(1,1,1);
        text("Let me guess your favorite season!", width/2,height/2);

    }
    public void mouseClicked(){

    }
}
