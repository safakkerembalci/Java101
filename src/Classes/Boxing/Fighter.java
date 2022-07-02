package Classes.Boxing;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int guard;
    double start;

    public Fighter(String name, int damage, int health, int weight, int guard, int start) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (guard >= 0 && guard <= 100){
            this.guard = guard;
        }else {
            this.guard = 0;
        }
        this.start = Math.random() * 100;
    }

    public int hit(Fighter opponent){
        System.out.println("----------------------------");
        System.out.println(this.name + " => " + opponent.name + " " + this.damage + " hasar vurdu.");

        if(opponent.isGuard()){
            System.out.println(opponent.name + " gelen hasari blokladi !");
            return opponent.health;
        }

        if(opponent.health - this.damage < 0){
            return 0;
        }

        return opponent.health - this.damage;
    }

    boolean isGuard(){
        double randomNumber = Math.random() * 100; // 0.0 to 99.9
        return randomNumber <= this.guard;
    }

}
