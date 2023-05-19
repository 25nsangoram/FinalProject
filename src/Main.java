import processing.core.PApplet;
import java.util.ArrayList;
public class Main extends PApplet {
    private ArrayList <Question> listQ;
    private String [][] dataSet;
    private Question thisQuestion;
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
        dataSet = new String [][] {{"Question1", "answer1", "answer2", "answer3", "answer4"}, {"Question2", "answer1", "answer2", "answer3", "answer4"}};
        for(int row = 0; row < dataSet.length; row++){
            for(int col = 0; row < dataSet[row].length; row++){
                Option a = new Option (1, dataSet[row][1]);
                Option b = new Option (2, dataSet[row][2]);
                Option c = new Option (3, dataSet[row][3]);
                Option d = new Option (4, dataSet[row][4]);
                ArrayList <Option> optionSet = new ArrayList <Option>();
                optionSet.add(a);
                optionSet.add(b);
                optionSet.add(c);
                optionSet.add(d);
                //String [] optionSet = new String [] {dataSet[row][1], dataSet[row][2], dataSet[row][3], dataSet[row][4]};
                thisQuestion = new Question(dataSet[row][0],optionSet);
            }
            }
        }
    public void draw() {
        background(0,0,0);
        text("Let me guess your favorite season!", width/2,height/2);
        //have a background call to erase


    }
    public void mouseClicked(){
    }
}
