
package projectdesignpattern;


public class TextFeature extends Decorator{
    
  
    
    public TextFeature(TshirtDesign Tshirt ){
        super(Tshirt);
    }

   
     @Override
    public String getDescription() {
           return  Tshirt.getDescription() + ", With Text => 'nice day!'"; 
    }

    @Override
    public void formSize() {
           Tshirt.formSize();
    }
    
    
    
}
