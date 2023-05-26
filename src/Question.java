import java.util.ArrayList;
public class Question {
    private String questions;
    private ArrayList <Option> options;
    private int whichOneTwo;
    private boolean hasBeenCompared;

    public Question(){
    }
    public Question (String questions, ArrayList <Option> options){
        this.questions = questions;
        this.options= options;

    }
    public void display(){
        if(!hasBeenCompared) {
            Main.app.fill(204, 229, 255);
            Main.app.ellipse((600 / 4) - 20, (600 / 4) + 20, 50, 50); //A
            Main.app.ellipse((600 / 4) - 20, 2 * (600 / 4), 50, 50); //B
            Main.app.ellipse((600 / 4) - 20, 3 * (600 / 4) - 40, 50, 50); //C
            Main.app.ellipse((600 / 4) - 20, 7 * (600 / 8), 50, 50); //D
            Main.app.fill(0, 102, 204);
            Main.app.text("A", (600 / 4) - 20, (600 / 4) + 15); //x, y of text must match the center point of the corresponding circle
            Main.app.text("B", (600 / 4) - 20, 2 * (600 / 4) - 5);
            Main.app.text("C", (600 / 4) - 20, 3 * (600 / 4) - 45);
            Main.app.text("D", (600 / 4) - 20, 7 * (600 / 8) - 5);
            Main.app.fill(255, 255, 255);
            Main.app.text(options.get(0).getOptionName(), 600 / 4 + 170, (600 / 4) + 15);
            Main.app.text(options.get(1).getOptionName(), 600 / 4 + 170, 2 * (600 / 4));
            Main.app.text(options.get(2).getOptionName(), 600 / 4 + 170, 3 * (600 / 4) - 45);
            Main.app.text(options.get(3).getOptionName(), 600 / 4 + 170, 7 * (600 / 8));
            Main.app.text("Question: " + questions, 300, 70);
        }else if(whichOneTwo == 0){
            Main.app.fill(255,0,0);
            Main.app.ellipse((600 / 4) - 20, (600 / 4) + 20, 50, 50); //A
            Main.app.fill(204, 229, 255);
            Main.app.ellipse((600 / 4) - 20, 2 * (600 / 4), 50, 50); //B
            Main.app.ellipse((600 / 4) - 20, 3 * (600 / 4) - 40, 50, 50); //C
            Main.app.ellipse((600 / 4) - 20, 7 * (600 / 8), 50, 50); //D
            Main.app.fill(0, 102, 204);
            Main.app.text("A", (600 / 4) - 20, (600 / 4) + 15); //x, y of text must match the center point of the corresponding circle
            Main.app.text("B", (600 / 4) - 20, 2 * (600 / 4) - 5);
            Main.app.text("C", (600 / 4) - 20, 3 * (600 / 4) - 45);
            Main.app.text("D", (600 / 4) - 20, 7 * (600 / 8) - 5);
            Main.app.fill(255, 255, 255);
            Main.app.text(options.get(0).getOptionName(), 600 / 4 + 170, (600 / 4) + 15);
            Main.app.text(options.get(1).getOptionName(), 600 / 4 + 170, 2 * (600 / 4));
            Main.app.text(options.get(2).getOptionName(), 600 / 4 + 170, 3 * (600 / 4) - 45);
            Main.app.text(options.get(3).getOptionName(), 600 / 4 + 170, 7 * (600 / 8));
            Main.app.text("Question: " + questions, 300, 70);
        }else if(whichOneTwo == 1){
            Main.app.fill(204, 229, 255);
            Main.app.ellipse((600 / 4) - 20, (600 / 4) + 20, 50, 50); //A
            Main.app.fill(255,0,0);
            Main.app.ellipse((600 / 4) - 20, 2 * (600 / 4), 50, 50); //B
            Main.app.fill(204, 229, 255);
            Main.app.ellipse((600 / 4) - 20, 3 * (600 / 4) - 40, 50, 50); //C
            Main.app.ellipse((600 / 4) - 20, 7 * (600 / 8), 50, 50); //D
            Main.app.fill(0, 102, 204);
            Main.app.text("A", (600 / 4) - 20, (600 / 4) + 15); //x, y of text must match the center point of the corresponding circle
            Main.app.text("B", (600 / 4) - 20, 2 * (600 / 4) - 5);
            Main.app.text("C", (600 / 4) - 20, 3 * (600 / 4) - 45);
            Main.app.text("D", (600 / 4) - 20, 7 * (600 / 8) - 5);
            Main.app.fill(255, 255, 255);
            Main.app.text(options.get(0).getOptionName(), 600 / 4 + 170, (600 / 4) + 15);
            Main.app.text(options.get(1).getOptionName(), 600 / 4 + 170, 2 * (600 / 4));
            Main.app.text(options.get(2).getOptionName(), 600 / 4 + 170, 3 * (600 / 4) - 45);
            Main.app.text(options.get(3).getOptionName(), 600 / 4 + 170, 7 * (600 / 8));
            Main.app.text("Question: " + questions, 300, 70);
        }else if(whichOneTwo == 2){
            Main.app.fill(204, 229, 255);
            Main.app.ellipse((600 / 4) - 20, (600 / 4) + 20, 50, 50); //A
            Main.app.ellipse((600 / 4) - 20, 2 * (600 / 4), 50, 50); //B
             Main.app.fill(255,0,0);
            Main.app.ellipse((600 / 4) - 20, 3 * (600 / 4) - 40, 50, 50); //C
            Main.app.fill(204, 229, 255);
            Main.app.ellipse((600 / 4) - 20, 7 * (600 / 8), 50, 50); //D
            Main.app.fill(0, 102, 204);
            Main.app.text("A", (600 / 4) - 20, (600 / 4) + 15); //x, y of text must match the center point of the corresponding circle
            Main.app.text("B", (600 / 4) - 20, 2 * (600 / 4) - 5);
            Main.app.text("C", (600 / 4) - 20, 3 * (600 / 4) - 45);
            Main.app.text("D", (600 / 4) - 20, 7 * (600 / 8) - 5);
            Main.app.fill(255, 255, 255);
            Main.app.text(options.get(0).getOptionName(), 600 / 4 + 170, (600 / 4) + 15);
            Main.app.text(options.get(1).getOptionName(), 600 / 4 + 170, 2 * (600 / 4));
            Main.app.text(options.get(2).getOptionName(), 600 / 4 + 170, 3 * (600 / 4) - 45);
            Main.app.text(options.get(3).getOptionName(), 600 / 4 + 170, 7 * (600 / 8));
            Main.app.text("Question: " + questions, 300, 70);
        }else if(whichOneTwo == 3){
            Main.app.fill(204, 229, 255);
            Main.app.ellipse((600 / 4) - 20, (600 / 4) + 20, 50, 50); //A
            Main.app.ellipse((600 / 4) - 20, 2 * (600 / 4), 50, 50); //B
            Main.app.ellipse((600 / 4) - 20, 3 * (600 / 4) - 40, 50, 50); //C
            Main.app.fill(255,0,0);
            Main.app.ellipse((600 / 4) - 20, 7 * (600 / 8), 50, 50); //D
            Main.app.fill(0, 102, 204);
            Main.app.text("A", (600 / 4) - 20, (600 / 4) + 15); //x, y of text must match the center point of the corresponding circle
            Main.app.text("B", (600 / 4) - 20, 2 * (600 / 4) - 5);
            Main.app.text("C", (600 / 4) - 20, 3 * (600 / 4) - 45);
            Main.app.text("D", (600 / 4) - 20, 7 * (600 / 8) - 5);
            Main.app.fill(255, 255, 255);
            Main.app.text(options.get(0).getOptionName(), 600 / 4 + 170, (600 / 4) + 15);
            Main.app.text(options.get(1).getOptionName(), 600 / 4 + 170, 2 * (600 / 4));
            Main.app.text(options.get(2).getOptionName(), 600 / 4 + 170, 3 * (600 / 4) - 45);
            Main.app.text(options.get(3).getOptionName(), 600 / 4 + 170, 7 * (600 / 8));
            Main.app.text("Question: " + questions, 300, 70);
        }
        else{
            Main.app.fill(204, 229, 255);
            Main.app.ellipse((600 / 4) - 20, (600 / 4) + 20, 50, 50); //A
            Main.app.ellipse((600 / 4) - 20, 2 * (600 / 4), 50, 50); //B
            Main.app.ellipse((600 / 4) - 20, 3 * (600 / 4) - 40, 50, 50); //C
            Main.app.ellipse((600 / 4) - 20, 7 * (600 / 8), 50, 50); //D
            Main.app.fill(0, 102, 204);
            Main.app.text("A", (600 / 4) - 20, (600 / 4) + 15); //x, y of text must match the center point of the corresponding circle
            Main.app.text("B", (600 / 4) - 20, 2 * (600 / 4) - 5);
            Main.app.text("C", (600 / 4) - 20, 3 * (600 / 4) - 45);
            Main.app.text("D", (600 / 4) - 20, 7 * (600 / 8) - 5);
            Main.app.fill(255, 255, 255);
            Main.app.text(options.get(0).getOptionName(), 600 / 4 + 170, (600 / 4) + 15);
            Main.app.text(options.get(1).getOptionName(), 600 / 4 + 170, 2 * (600 / 4));
            Main.app.text(options.get(2).getOptionName(), 600 / 4 + 170, 3 * (600 / 4) - 45);
            Main.app.text(options.get(3).getOptionName(), 600 / 4 + 170, 7 * (600 / 8));
            Main.app.text("Question: " + questions, 300, 70);
        }
    }
    public Option getA(){
        return options.get(0);
    }
    public Option getB(){
        return options.get(1);
    }
    public Option getC(){
        return options.get(2);
    }
    public Option getD(){
        return options.get(3);
    }
    public boolean hasBeenClicked(int whichOne){
        whichOneTwo = whichOne;
        hasBeenCompared = true;
        return hasBeenCompared;
    }

}
