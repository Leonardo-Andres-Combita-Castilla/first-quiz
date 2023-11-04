package org.velezreyes.quiz.question6;

// public class VendingMachineImpl {

//   public static VendingMachine getInstance() {
//     // Fix me!
//     return null;
//   }
// }

import java.util.HashMap;
import java.util.Map;

public class VendingMachineImpl implements VendingMachine {
    private Map<String, Drink> availableDrinks = new HashMap<>();
    private int moneyInserted = 0;

    private static VendingMachineImpl instance;

    private VendingMachineImpl() {
        // Initialize available drinks
        availableDrinks.put("ScottCola", new Drink("ScottCola", true));
        availableDrinks.put("KarenTea", new Drink("KarenTea", false));
    }

    public static VendingMachine getInstance() {
        if (instance == null) {
            instance = new VendingMachineImpl();
        }
        return instance;
    }

    @Override
    public void insertQuarter() {
        moneyInserted += 25; // Assume each quarter is worth 25 cents
    }

    @Override
    public Drink pressButton(String drinkName) throws NotEnoughMoneyException, UnknownDrinkException {
        Drink selectedDrink = availableDrinks.get(drinkName);

        if (selectedDrink == null) {
            throw new UnknownDrinkException();
        }

        if (moneyInserted < 75) {
            throw new NotEnoughMoneyException();
        }

        moneyInserted -= 75;
        return selectedDrink;
    }
}
