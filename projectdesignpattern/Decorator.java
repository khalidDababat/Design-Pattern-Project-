
package projectdesignpattern;


public abstract  class Decorator extends TshirtDesign{
    
    protected TshirtDesign Tshirt; 
    
    public Decorator(TshirtDesign Tshirt){
         this.Tshirt =Tshirt; 
    }

    @Override
    public String getDescription() {
           return  Tshirt.getDescription(); 
    }

    @Override
    public void formSize() {
           Tshirt.formSize();
    }
     
    
    
    
}
