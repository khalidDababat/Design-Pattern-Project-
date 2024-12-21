


package projectdesignpattern;




public class ColorFeature  extends Decorator{

    
    
    private String  color ; 
    
    
    public ColorFeature(TshirtDesign Tshirt  ,String color ){
          super(Tshirt); 
          this.color =color ; 
         
    }
    
    
     @Override
    public String getDescription() {
           return  Tshirt.getDescription() + ", With Color " +this.color; 
    }

    @Override
    public void formSize() {
           Tshirt.formSize();
    }
  
     
    
    
    
}
