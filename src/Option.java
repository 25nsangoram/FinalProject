public class Option {
    private int season;
    private String name;
    public Option(){

    }
    public Option(int season, String name){
        this.season = season;
        this.name = name;
    }
    public void newOption(){

    }
    public int getSeason(){
        return season;
    }
    public String getSeasonName(){
        if(season == 1){
            return "Summer ☀️";
        }
        else if(season == 2){
            return "Fall 🍁";
        }
        else if(season == 3){
            return "Winter ❄️";
        }
        else{
            return "Spring 🌷";
        }
    }
}
