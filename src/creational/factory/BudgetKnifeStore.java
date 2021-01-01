package creational.factory;

public class BudgetKnifeStore extends KnifeStore {
    @Override
    public Knife createKnife(String knifeType) {
        switch(knifeType) {
            case "budget-chefs-knife":
                return new BudgetChefsKnife();
        }
        return null;
    }
}
