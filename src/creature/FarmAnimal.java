package creature;

public abstract class FarmAnimal extends Animal implements Edbile {

    public FarmAnimal(String species)
    {
        super(species);
    }

    @Override
    public void beEaten() {
        this.isAlive = false;
        this.weight = 0.0;
        System.out.println("Zjedzony");
        }

    }