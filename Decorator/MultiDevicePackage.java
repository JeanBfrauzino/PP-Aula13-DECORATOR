package Decorator;

public class MultiDevicePackage extends SubscriptionDecorator {
    public MultiDevicePackage(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", Multi-device streaming";
    }

    @Override
    public double getCost() {
        return subscription.getCost() + 19.99;
    }
}

