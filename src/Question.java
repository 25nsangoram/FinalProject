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
        Main.app.fill(23,23,23);
        Main.app.ellipse(600/4,600/4,50,50);

        Main.app.ellipse(2*(600/4),2*(600/4),50,50);
        Main.app.ellipse(3*(600/4),3*(600/4),50,50);
        Main.app.ellipse(600/4,600/4,50,50);

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
