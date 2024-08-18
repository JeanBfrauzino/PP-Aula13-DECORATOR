package Decorator;

public class FreeShippingPackage extends SubscriptionDecorator {
    public FreeShippingPackage(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", Free shipping on products";
    }

    @Override
    public double getCost() {
        return subscription.getCost() + 9.99;
    }
}

