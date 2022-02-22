import javax.swing.JOptionPane;

public class JavaLibs5026211058 {
    public static void main(String[] args) {
		
        JOptionPane.showMessageDialog(null,
                "Hello! Welcome to Ivana's Custom Doll Company~",
                "Welcome Page",
                1);
      
        String customerName = (String)JOptionPane.showInputDialog(null,
                "How should I address you?",
                "Getting to Know You",
                3,
                null,
                null,
                "Please type your name.");
        
        JOptionPane.showMessageDialog(null, "Great to see you, " +customerName + "!"
                + "\n We are going to go through some question to custom your doll, OK?");
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "How many dolls do you want to custom?",
            "Please type an integer"));
        
        String[] acceptableValues = {"Yes", "No"};
        String owner = (String)JOptionPane.showInputDialog(null,
            "Did you custom this doll for yourself?",
            "Ownership",
            3,
            null,
            acceptableValues,
            acceptableValues[1]);
        
        String favAnimal = (String) JOptionPane.showInputDialog(null, 
                "What is your favorite animal?", 
                "Favorite Animal", 
                3,
                null,
                null,
                "Type something here");
        
       String animalSound = (String) JOptionPane.showInputDialog(null, 
                "How does the " +favAnimal +" sounds like?", 
                "Customizing the Sound", 
                3,
                null,
                null,
                "Type something here");
       
       int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "How many legs do " +favAnimal +" have?",
            "Please type an integer"));
       
       String favColor = (String) JOptionPane.showInputDialog(null, 
                "What is your favourite color?", 
                "Customizing the Color", 
                3,
                null,
                null,
                "Type something here");
        
       String dollDesc  = (String) JOptionPane.showInputDialog(null, 
                "How would you describe a doll?", 
                "Describe It",
                3,
                null,
                null,
                "Type an adjective");
       

       double num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "How much are you offering?",
                "Please type a double."));
       
       double price;
        price = num1*num3;
        
        JOptionPane.showMessageDialog(null,
            "YAY! We finally finished customizing your doll and here are the result.\n" +
            "So now you have a " +favColor + " colored " +favAnimal +" doll that can make \"" + animalSound + "\" sound. \n" +
            "It has " +num2 + " legs and its "+dollDesc + ".\n" +
            "The total price would be " +price
        );
        
       String pay = (String)JOptionPane.showInputDialog(null,
            "Do you want to buy the doll?",
            "Payment",
            3,
            null,
            acceptableValues,
            acceptableValues[1]);
        
    //end
    }
               
}