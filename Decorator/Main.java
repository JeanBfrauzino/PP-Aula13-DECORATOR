package Decorator;

public class Main {
    public static void main(String[] args) {
        // Assinatura base
        Subscription mySubscription = new BaseSubscription();

        // Adicionando pacotes opcionais
        mySubscription = new MultiDevicePackage(mySubscription);
        mySubscription = new FreeShippingPackage(mySubscription);
        mySubscription = new SurpriseBoxPackage(mySubscription);

        // Exibindo a descrição e o custo total da assinatura
        System.out.println("Subscription Details:");
        System.out.println(mySubscription.getDescription());
        System.out.println("Total Cost: R$" + mySubscription.getCost());
    }
}
