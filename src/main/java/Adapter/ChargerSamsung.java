package Adapter;

public class ChargerSamsung implements ChargerAdapter {
    private ChargerApple adaptee;

    public ChargerSamsung(ChargerApple adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void charge(String type, String gadget) {
        if (type.equalsIgnoreCase("Lightning")) {
            adaptee.charge(gadget);
            return;
        } else if (type.equalsIgnoreCase("MicroUSB"))
        {System.out.printf("У нас Вы можете купить зарядное устройство для продукции %s кабель типа %s%n", gadget, type);}
else
        {System.out.printf("У нас Вы можете купить зарядное устройство для продукции %s кабель типа %s%n", gadget, type);}
    }
}
