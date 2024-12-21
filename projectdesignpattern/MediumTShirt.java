
package projectdesignpattern;


public class MediumTShirt extends TshirtDesign {

    public MediumTShirt(String region){
     size ="Medium"; 
     this.region= region; 
    }
    
    
    
    
    @Override
    public void formSize() {

        System.out.println("this Tshirt Is Medium size");


    }

    @Override
    public String getDescription() {
       return size +"Tshirt for "+region; 
    }
    
    
    
    
    
    
    
}
