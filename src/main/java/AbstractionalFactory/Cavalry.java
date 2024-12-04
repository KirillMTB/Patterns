package AbstractionalFactory;

public class Cavalry implements Troops {
    @Override
    public View createView() {
        return new Cav();
    }


}
