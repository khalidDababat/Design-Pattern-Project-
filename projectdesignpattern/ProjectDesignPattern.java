package projectdesignpattern;

public class ProjectDesignPattern { // Clint Class 

    public static void main(String[] args) {

        ShopOwner owner = ShopOwner.Getinstanse(); // Singliton Pattern 

        //a) A person from china order blue medium T-shirt with bird logo 
        TshirtDesign custumer1 = Factory.createTshirt("Medium", "china");
        custumer1 = new LogoFeature(new ColorFeature(custumer1, "blue"));
        System.out.println("Order1: " + custumer1.getDescription());
        owner.Ubdate("Medium");
        // owner.dispay();

        // A person from middle east orders a red large T-shirt with Text  
        TshirtDesign custumer2 = Factory.createTshirt("Large", "middle east");
        System.out.println("Order2: " +custumer2.getDescription());
        custumer2 = new TextFeature(new ColorFeature(custumer2, "red"));
        owner.Ubdate("Large");

        owner.dispay();
    }

}
