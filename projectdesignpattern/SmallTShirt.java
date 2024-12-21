
package projectdesignpattern;


public class SmallTShirt extends TshirtDesign {

    
    public SmallTShirt(String region){
    
    size ="small";
    this.region =region; 
    }
    
   
    
    
    @Override
    public void formSize() {
          System.out.println("This Is Small Tshert ");

    }

    @Override
    public String getDescription() {
       return size  +"Tshirt For "+region; 

    }
    
    
    
    
    
    
}
