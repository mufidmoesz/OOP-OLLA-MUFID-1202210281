package TPMODUL3_MUFID;

public class Waiters implements Runnable {
    private final int orderQty;
    private final int customerId;
    private static int foodPrice = 25000;

    public Waiters(int orderQty, int customerId) {
        this.orderQty = orderQty;
        this.customerId = customerId;
    }

    @Override
    public void run() {
        while (true) {
            getFood();
            try {
                Thread.sleep(4500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("=========================================================");
        System.out.println("Customer ID : " + customerId);
        System.out.println("Number of Food : " + orderQty);
        System.out.println("Total Price : " + (orderQty * foodPrice));
        System.out.println("=========================================================");
    }

    public void getFood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter: Food is ready to deliver");
            Restaurant Restaurant = new Restaurant();
            Restaurant.setWaitingForPickup(false);

            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            TPMODUL3_MUFID.Restaurant.getLock().notifyAll();
            System.out.println("Waiter: tell the restaurant to make another food\n");
        }
    }
}
