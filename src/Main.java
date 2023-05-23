import processing.core.PApplet;
import java.util.ArrayList;
public class Main extends PApplet {
    private ArrayList <Question> listQ;
    private String [][] dataSet;
    private Question thisQuestion;
    private int index;
    private int winter;
    private int spring;
    private int summer;
    private int fall;
    public static Main app;
    public static void main(String[] args) {
        PApplet.main("Main");
    }
    public Main() {//Main's constructor
        super();
        app = this;
    }
    public void settings() {
        size(600, 600);

    }
    public void setup(){
        dataSet = new String [][] {{"Favorite Holiday?", "Christmas", "Easter", "4th of July", "Halloween"}, {"On a boring day, I choose to", "Ski", "Walk my dog", "Barbeque", "Read a book"}};
        index = 0;
        textSize(36);
        textAlign(CENTER,CENTER);
        resetQuestion();
        }
    public void draw() {
        background(0,0,0);
        //text("Let me guess your favorite season!", width/2,height/2);
        thisQuestion.display();
        //have a background call to erase


    }
    public void keyPressed(){
        if (key == 'a'){
            thisQuestion.hasBeenClicked(0);


        }
        if (key == 'b'){
            thisQuestion.hasBeenClicked(1);


        }
        if (key == 'c'){
            thisQuestion.hasBeenClicked(2);


        }
        if (key == 'd'){
            thisQuestion.hasBeenClicked(3);
        }
        if(key == '\n'){
            resetQuestion(); // How to reset question and increment?
        }
        //
    }
    public void resetQuestion(){
        Option a = new Option (1, dataSet[index][1]);
        Option b = new Option (2, dataSet[index][2]);
        Option c = new Option (3, dataSet[index][3]);
        Option d = new Option (4, dataSet[index][4]);
        ArrayList <Option> optionSet = new ArrayList <Option>();
        optionSet.add(a);
        optionSet.add(b);
        optionSet.add(c);
        optionSet.add(d);
        thisQuestion = new Question(dataSet[index][0],optionSet);
    }
}
