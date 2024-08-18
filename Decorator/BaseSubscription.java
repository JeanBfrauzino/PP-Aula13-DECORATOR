package Decorator;

public class BaseSubscription implements Subscription {
    @Override
    public String getDescription() {
        return "Base Subscription: Watch videos on a single device";
    }

    @Override
    public double getCost() {
        return 9.99;
    }
}

