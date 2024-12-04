package Singletone;

public final class Singleton {

    private static Singleton INSTANCE;
    private String info = "Создан паттерн-одиночка";
    
    private Singleton() {

    }
    
    public static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        
        return INSTANCE;
    }

    public void createSinglton(){
        System.out.println(info);
    }

}