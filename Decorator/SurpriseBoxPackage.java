package Decorator;

public class SurpriseBoxPackage extends SubscriptionDecorator {
    public SurpriseBoxPackage(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", Surprise box with movie/series related products";
    }

    @Override
    public double getCost() {
        return subscription.getCost() + 29.99;
    }
}

