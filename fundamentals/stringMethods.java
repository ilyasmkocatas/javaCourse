public class stringMethode{
    public static void stringMethode(String[] args){
        
        String name = "Bro Code";
        
        int length = name.length(); //LENGTH OF A PASSWORD
        char letter = name.charAt(0);
        int index = name.indexOf ("o");
        int lastIndex = name.lastIndexOf("o");
        
        System.out.println(length);
        
        name = name.toUpperCase(); //TURNS EVERY LETTER UPERCASE
        name = name.toLowerCase(); //TURNS EVERY LETTER UPERCASE
        name = name.trim();
        name = name.replace("o", "a"); //CHANGES EVERY O TO A
        
        if(name.isEmpty()){
            System.out.print("Your name is empty");
        }
        else{
            System.out.print("Hello " + name); 
        }
        
        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Yout name doesn't contain any spaces");
        }
        
        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
}