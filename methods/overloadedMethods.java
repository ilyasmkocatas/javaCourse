public class overloadedMethods{
    public static void overloadedMethodes(String[] args){
        
        // overloaded methods = methods that share the same name,
        // but different parameters
        // signature = name + parameters
        
        String pizza = bakePizza("flat bread");
        String pizza1 = bakePizza("flat bread", "mozzarella");
        String pizza2 = bakePizza("flat bread", "mozzarella", "pepperoni");
        
        System.out.println(pizza);
        
    }
    
    static String bakePizza(String bread){
        return bread + "pizza";
    }
    
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }
}