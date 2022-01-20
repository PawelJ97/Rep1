package creature;

public class FarmAnimal extends Animal implements Edbile {

    boolean beEaten = false;

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten(Animal feed) {
        if (!beEaten){
            System.out.println("Nie jest do zjedzenia");
        } else {
            System.out.println("Do zjedzenia");
        }

    }

    @Override
    public double foodWeight() {
        return 0;
    }
}
