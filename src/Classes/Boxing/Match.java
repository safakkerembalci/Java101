package Classes.Boxing;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if (this.f1.start > this.f2.start){
            if (isCheck()){
                while (this.f1.health > 0 && this.f2.health > 0){
                    System.out.println("====NEW ROUND====");
                    this.f2.health = this.f1.hit(this.f2);
                    if(isWin()){
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    if(isWin()){
                        break;
                    }
                    printScore();
                }
            }else {
                System.out.println("Sporcularin sikletleri uymuyor.");
            }
        }else {
            if (isCheck()){
                while (this.f1.health > 0 && this.f2.health > 0){
                    System.out.println("====NEW ROUND====");
                    this.f1.health = this.f2.hit(this.f1);
                    if(isWin()){
                        break;
                    }
                    this.f2.health = this.f1.hit(this.f2);
                    if(isWin()){
                        break;
                    }
                    printScore();
                }
            }else {
                System.out.println("Sporcularin sikletleri uymuyor.");
            }
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(f2.name + " won!");
            return true;
        }

        if(this.f2.health == 0){
            System.out.println(f1.name + " won!");
            return true;
        }
        return false;
    }

    public void printScore(){
        System.out.println("-----------------");
        System.out.println(f1.name+ " health \t: "+ f1.health);
        System.out.println(f2.name+ " health \t: "+ f2.health);
    }

}
