import processing.core.PApplet;
import java.util.ArrayList;
public class Main extends PApplet {
    private ArrayList <Question> listQ;
    private String [][] dataSet;
    private Question thisQuestion;
    private int index; //change to random? arraylist of 4 random places in data set. once the (for loop) going through the 4 places has ended, then the result will be displayed
    private int winter;
    private int spring;
    private int summer;
    private int fall;
    private int choiceIndex;
    private int [] choices;
    private int questionCount;
    private final String [] SEASONS = {"Winter", "Spring", "Summer","Fall"};
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
        dataSet = new String [][] {{"Favorite color?", "Anything dark", "Pastel colors", "Bright Yellow", "Orange-red"},
                {"Favorite Holiday?", "Christmas", "Easter", "4th of July", "Halloween"}, //questions
                {"On a boring day, I choose to...", "Make tea", "Walk my dog", "Barbeque", "Read a book"},
                {"Dream Vacation?", "Ski resort", "Tokyo, Japan \n to see the Cherry Blossoms.", "                    Aulani Disney Resort", "     National Park"},
                {"Preferred meal?", "Classic Turkey Chili", "Pasta Primavera", "Potato Salad", "Butternut Squash Soup"},
                {"Preferal?", "ClassiChili", "Pastamavera", "Potato Salad", "Butternush Soup"},
                {" meal?", "Classic i", "Pasta Prera", "Potato Salad", "Butternut Squash Soup"}};
        index = 0;
        choices = new int[4];
        textSize(36);
        textAlign(CENTER,CENTER);
        resetQuestion();
        }
    public void draw() {
        //text("Let me guess your favorite season!", width/2,height/2);
        if(questionCount == 5){
            background(235, 64, 52);
            Main.app.fill(66, 135, 245);
            int indexMax = 0;
            for(int i = 1; i < choices.length; i++){
                if(choices[i] > choices[indexMax]){
                    indexMax = i;
                }
            }
            Main.app.text("I think your favorite season is: " + SEASONS[indexMax], width/2, height/2);
        }
        else{
            background(0,0,0);
            thisQuestion.display();
        }

    }
    public void keyPressed(){
        if (key == 'a'){
            thisQuestion.hasBeenClicked(0);
            choiceIndex = 0;


        }
        if (key == 'b'){
            thisQuestion.hasBeenClicked(1);
            choiceIndex = 1;

        }
        if (key == 'c'){
            thisQuestion.hasBeenClicked(2);
            choiceIndex = 2;

        }
        if (key == 'd'){
            thisQuestion.hasBeenClicked(3);
            choiceIndex = 3;
        }

        if(key == '\n'){
            index++;
            choices[choiceIndex] = choices[choiceIndex]++;
            if(questionCount < 5){
                questionCount++;
                resetQuestion(); // How to reset question and increment?
            }
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
