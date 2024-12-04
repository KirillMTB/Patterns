package Adapter;

import Builder.User;

public class Main {
    public static void main(String[] args) {
        ChargerAdapter chargerAdapter = (ChargerAdapter) new ChargerSamsung(new ChargerApple());

        chargerAdapter.charge("Lightning", "IPhone");
        chargerAdapter.charge("MicroUSB", "Nokia");
        chargerAdapter.charge("Type-C", "Samsung");
    }
    }

