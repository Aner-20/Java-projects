public class Player{
    String name;
    int strength;
    int agility;
    int intelligence;
    int luck;

    Player(String name, int strength, int agility, int intelligence, int luck ){
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.luck = luck;

    }

    /*void observe(){
        if(this.intelligence > 3){
            System.out.println("You are still silly");
        }
        else{
            System.out.println("You are brainless");
        }
    }*/
    

}
