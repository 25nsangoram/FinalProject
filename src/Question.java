import java.util.ArrayList;
public class Question {
    private String questions;
    private ArrayList <Option> options;

    public Question(){
    }
    public Question (String questions, ArrayList <Option> options){
        this.questions = questions;
        this.options= options;

    }
    public void display(){
        Main.app.fill(204,229,255);
        Main.app.ellipse((600/4) + 50,(600/4)+20,50,50); //A
        Main.app.ellipse((600/4)+ 50,2*(600/4),50,50); //B
        Main.app.ellipse((600/4) + 50,3*(600/4)-40,50,50); //C
        Main.app.ellipse((600/4) + 50,7*(600/8),50,50); //D
        Main.app.fill(0,102,204);
        Main.app.text("A", (600/4) + 50,(600/4)+15); //x, y of text must match the center point of the corresponding circle
        Main.app.text("B", (600/4) + 50,2*(600/4)-5);
        Main.app.text("C", (600/4) + 50,3*(600/4)-45);
        Main.app.text("D", (600/4) + 50,7*(600/8)-5);
        Main.app.fill(255,255,255);
        Main.app.text(options.get(0).getOptionName(), 600/4 +170, (600/4)+15);
        Main.app.text(options.get(1).getOptionName(), 600/4 +170, 2*(600/4));
        Main.app.text(options.get(2).getOptionName(), 600/4 +170, 3*(600/4)-45);
        Main.app.text(options.get(3).getOptionName(), 600/4 +170, 7*(600/8));
        Main.app.text("Question: " + questions, 300, 70);
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

}
