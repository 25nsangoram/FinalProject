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
        Main.app.fill(255,255,255);
        Main.app.ellipse((600/4) + 100,600/4,50,50); //A
        Main.app.ellipse((600/4)+ 100,2*(600/4),50,50); //B
        Main.app.ellipse((600/4) + 100,3*(600/4),50,50); //C
        Main.app.ellipse((600/4) + 100,7*(600/8),50,50); //D
        Main.app.fill(0,0,0);
        Main.app.text("A", (600/4) + 100,600/4); //x, y of text must match the center point of the corresponding circle
        Main.app.text("B", (600/4) + 100,2*(600/4));
        Main.app.text("C", (600/4) + 100,3*(600/4));
        Main.app.text("D", (600/4) + 100,7*(600/8));
        Main.app.fill(255,255,255);
        Main.app.text(options.get(0).getOptionName(), 600/4, (600/4));
        Main.app.text(options.get(1).getOptionName(), 600/4, 2*(600/4));
        Main.app.text(options.get(2).getOptionName(), 600/4, 3*(600/4));
        Main.app.text(options.get(3).getOptionName(), 600/4, 7*(600/8));
        Main.app.text("Question: " + questions, 200, 70);
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
