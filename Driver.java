public class Driver {
    // atrrbuvites

    private String name;
    private int age;
    private String team;
    private int number;

   // private list<Lap> laps;

 //  private int totalPoints;


   //constructor - unqiue methods - used to defne a properties of an object
Driver(){
    System.out.println("New driver created");


}
// overloading : call the same methof witha differnt argument
Driver(String name){
    System.out.println("Driver name: "+ name);
}
   //methods
   void lapTime(){

   }

  void placeFinish(){
  }
  void points(){

}}


  /* public Driver(String name, int age String team, String number){
        this.name = name;
        this.age = age;
        this.team = team;
        this.number = number;
   
    }

    //method  to give dirver pioints
   public int addPoints(int increment){
    points = increment++;

   }

   //abstration
   driver.patimr();


    public double getAvgLapTime(){

    }

  


    public static void main(String[] args) {
        Driver driver = new Driver();




        System.out.println("Hi driver");
    }
    
}

// implemnet constuctors here

*/