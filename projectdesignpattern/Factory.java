
package projectdesignpattern;


public class Factory { //Factoty Class 
    
    
    public static TshirtDesign createTshirt(String size ,String region){
          
        switch(size.toLowerCase()){  // if enter user Small Convert To Lowercase litter
            case "small": 
                 return new SmallTShirt(region); 
            case "medium": 
                 return new MediumTShirt(region); 
            case "large": 
                  return new LargeTShirt(region); 
            default:
                return null; 
        
        }
        
    }
    
    
    
}
