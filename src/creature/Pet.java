package creature;

public class Pet extends Animal {
    public Pet(String species) {
        super(species);
    }

    @Override
    public double foodWeight() {
        return 0;
    }
}
