import java.util.*;
public class management2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        LinkedHashMap<String, Integer> veg = new LinkedHashMap<String, Integer>(); 
        LinkedHashMap<String, Integer> non_veg = new LinkedHashMap<String, Integer>();  
        veg.put("Paneer-tikka", 30);veg.put("Soup", 40);veg.put("Rice", 30);veg.put("Burger", 50);veg.put("Chappati", 20);
        non_veg.put("Chicken", 50);non_veg.put("Biryani", 40);non_veg.put("Omelette", 30);non_veg.put("Fish-curry", 50);
        int bill=0;int choice;
        System.out.println("\nWelcome to XYZ Hotel!! ");
        while (true){
            System.out.println("\nMain menu: \nWhat kind of food would you like to order or press 4 to exit or to check bill: \n1. Vegetarian 2. Non-Vegetarian");
            choice = sc.nextInt();
            if(choice==1){
                    System.out.println("You opted for Vegetarian food!!\nList of food items: \n1. Paneer-tikka  Price: 30/- \n2. Soup  Price: 40/- \n3. Rice  Price: 30/- \n4. Burger  Price: 50/- \n5. Chappati  Price: 20/-  \nPlease select an item by typing its number or press 0 to go to main menu: ");        
                    int option = sc.nextInt();
                    Object t = veg.keySet().toArray()[option-1]; 
                    System.out.println("Please Enter the quantity of "+ t);
                    int price = veg.get(t);int quantity = sc.nextInt();
                    bill += price*quantity;}
            else if(choice==2){
                    System.out.println("You opted for Non-Vegetarian food!! \nList of food items: \n1. Chicken  Price: 50/-  \n2. Biryani  Price: 40/- \n3. Omlette  Price: 30/-  \n4. Fish-curry  Price: 50/- \nPlease select an item by typing its number or press 0 to go to main menu: ");        
                    int option = sc.nextInt();
                    Object t = non_veg.keySet().toArray()[option-1]; 
                    System.out.println("Please Enter the quantity of "+ t);
                    int price = non_veg.get(t);
                    int quantity = sc.nextInt();
                    bill += price*quantity;}
            else if(choice==4){System.out.print("Your total bill is: " + bill);return;}  
            else{System.out.println("Please select a valid input from the following: \n1. Vegetarian 2. Non-vegetarian 4. Exit");}} }}
