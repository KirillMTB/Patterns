package AbstractionalFactory;

public class Infantry implements Troops {
    @Override
    public View createView() {
        return new In();
    }


}
