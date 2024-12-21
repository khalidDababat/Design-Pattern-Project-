
package projectdesignpattern;


public class LargeTShirt extends TshirtDesign{

    
    public LargeTShirt(String region){
      size= "Large";
      this.region =region; 
    }
   
    
    
    
    @Override
    public void formSize() {
            System.out.println("Tshirt large-size");
    }

    @Override
    public String getDescription() {
      return size + "Tshirt for "+region; 

    }
    
     
    
    
    
    
    
}
