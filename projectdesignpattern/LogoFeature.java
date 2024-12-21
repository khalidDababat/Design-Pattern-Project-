
package projectdesignpattern;



public class LogoFeature extends Decorator{

  
   
    
    public LogoFeature(TshirtDesign Tshirt){
      super(Tshirt);
    
    }
    
   
     @Override
    public String getDescription() {
           return  Tshirt.getDescription() + ", With Bird Logo "; 
    }

    @Override
    public void formSize() {
           Tshirt.formSize();
    }
   
    
    
    
    
}
