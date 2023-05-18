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
}
