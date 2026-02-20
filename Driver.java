public class Driver {
    // atrrbuvites

    private String name;
    private int age;
    private String team;
    private int number;

   // private list<Lap> laps;

 //  private int totalPoints;

    private int points;


    public Driver (String name, String team, int number, int age){
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty!");
        }
        this.name = name;
        this.team = team;
        this.number = number;
        this.points = 0;
    }

    //behvaior 

    public void addPoints(int pointsToAdd){
        if(pointsToAdd < 0){
            throw new IllegalArgumentException("Points cannot be negative");

        } 
        this.points += pointsToAdd;
    }

    // getters 

    public String getName(String name){
        return name;
    }

    public String getTeam(String team){
        return team;
    }

    public int getNumber(int number){
        return number;

    }

    public int getPoints(int points){
        return points;
    }

    @Override
    public String tostring(){
        return name + " (" + team + ") - #" + number + "| Points: "+ points;
    }


}




   //constructor - unqiue methods - used to defne a properties of an object

// overloading : call the same methof witha differnt argument

  