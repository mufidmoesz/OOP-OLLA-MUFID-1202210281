package TPMODUL3_MUFID;

public class Restaurant implements Runnable {
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodnumber = 1;

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }
    public int getFoodNumber() {
        return foodnumber;
    }

    public void makeFood() {
        synchronized(Restaurant.lock) {

            if (this.waitingForPickup) {
                try {
                    System.out.println("Restaurant: Waiting for the waiter to deliver the food");
                    Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            waitingForPickup = true;
            System.out.println("Restaurant: Making food number "+ foodnumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant: Food is ready to be picked up\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}