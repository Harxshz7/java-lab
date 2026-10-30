public class PartialAbstraction {
    public static void main(String[] args) {
        Delivery delivery = new ExpressDelivery();
        delivery.dispatch();
    }
}

abstract class Delivery {
    public final void dispatch() {
        pack();
        calculateRoute();
        System.out.println("Delivery dispatched.");
    }

    protected void pack() {
        System.out.println("Package prepared with standard packaging.");
    }

    protected abstract void calculateRoute();
}

class ExpressDelivery extends Delivery {
    @Override
    protected void calculateRoute() {
        System.out.println("Calculating the fastest available route.");
    }
}
