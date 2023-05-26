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
    private final String [] SEASONS = {"Winter️️", "Spring", "Summer","Fall"};
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
                {"Taylor Swift Album?", "Midnights", "Lover", "1989", "Folklore"},
                {"Ideal weather?", "Blizzard", "Rain", "Warm and Sunny", "Don't care"},
                {" The best place for a nap is...", "Near a heater", "Hammock", "Lounging on the beach", "Inside on a giant bean bag"}}; // make into arraylist?
        index = (int)(Math.random()*dataSet.length);
        choices = new int[4];
        choiceIndex =-1;
        textSize(36);
        textAlign(CENTER,CENTER);
        resetQuestion();
        }
    public void draw() {
        //text("Let me guess your favorite season!", width/2,height/2);
        if(questionCount == 5){
            background(235, 64, 52);
            Main.app.fill(0,0,0);
            if(choiceIndex == -1){
                Main.app.text("I think your favorite season is: " + "\n"+ "Uh oh, I need more info", width/2, height/2);
            }
            else {
                int indexMax = 0;
                for (int i = 1; i < choices.length; i++) {
                    if (choices[i] > choices[indexMax]) {
                        indexMax = i;
                    }
                }
                Main.app.text("I think your favorite season is: " + "\n" + SEASONS[indexMax], width / 2, height / 2);
            }
        }
        else{
            background(0,0,0);
            thisQuestion.display();
        }

    }
    public void keyPressed(){
        if (key == 'a'){
            choiceIndex = 0;
            thisQuestion.hasBeenClicked(0);


        }
        if (key == 'b'){
            choiceIndex = 1;
            thisQuestion.hasBeenClicked(1);


        }
        if (key == 'c'){
            choiceIndex = 2;
            thisQuestion.hasBeenClicked(2);


        }
        if (key == 'd'){
            choiceIndex = 3;
            thisQuestion.hasBeenClicked(3);

        }

        if(key == '\n'){
            int temp = (int)(Math.random()*dataSet.length);
            while (dataSet[temp] == null) {
                temp = (int) (Math.random() * dataSet.length);
            }
            index = temp;
            if(choiceIndex != -1){
                choices[choiceIndex]++;
            }
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
        dataSet[index] = null;
        }
    }
