package Decorator;

public class CashBackPackage extends SubscriptionDecorator {
    public CashBackPackage(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", Purchases with Cash Back";
    }

    @Override
    public double getCost() {
        return subscription.getCost() + 19.99;
    }
}

