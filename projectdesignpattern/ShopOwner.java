package projectdesignpattern;

public class ShopOwner implements Observer {

    private static ShopOwner instanse = new ShopOwner();

    private int smallCount = 0;
    private int medumCount = 0;
    private int largeCount = 0;

    private ShopOwner() { // Private Constracture 
    }

    public static ShopOwner Getinstanse() { // For Mack onlay one  Instanse 
        if (instanse == null) {
            return new ShopOwner();
        }
        return instanse;

    }

    @Override
    public void Ubdate(String size) {

        if (size.equals("small")) {
            smallCount ++;
        } else if (size.equals("medum")) {
            medumCount ++;
        } else {
            largeCount ++;
        }
        notifyOwner(size);

    }

    public void notifyOwner(String size) {

        System.out.println("Owner Notification: " + size + " T-shirt was sold.");
    }

    public void dispay(){
        System.out.println("Small "+ smallCount + " Meduim "+medumCount +" Large "+largeCount);
     }
}
