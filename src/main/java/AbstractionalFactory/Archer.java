package AbstractionalFactory;

public class Archer implements Troops {
    @Override
    public View createView() {
        return new Ar();
    }


}
