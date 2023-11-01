import java.util.Random;

/*
 * DecisionMaker, makes difficult decisions for you
 * @author Alessandra Gudoy
 */

public class DecisionMaker {
    public static void main(String[] args){
        String move = coinFlip().equals("HEADS") ? "MATH 321" : "ICS 212";
        System.out.println("MOVE: " + move);
    }

    /*
     * Returns an hour between 10:00 to 15:00
     * @return int representing an hour between 10:00 and 15:00
     */
    public static int generateTime(){
        return (int) ((Math.random() * 6) + 10);
    }

    /*
     * Returns "YES" or "NO"
     * @return string indicating yes or no
     */
    public static String anoBa(){
        return ((int) (Math.random() * 100) % 2) == 0 ? "YES" : "NO";
    }

    /*
     * Returns "HEADS" or "TAILS"
     * @return string indicating heads or tails
     */
    public static String coinFlip(){
        return ((int) (Math.random() * 100) % 2) == 0 ? "HEADS" : "TAILS";
    }

    /*
     * Returns an appetizer from Olive Garden
     * @return string indicating which appetizer to eat
     */
    public static String appetizer(){
        String dish = "";

        int num = (int) (Math.random() * 8) + 1;
        
        switch(num){
            case 1:
                dish = "Lasagna Fritta";
                break;
            case 2:
                dish = "Meatballs Parmagiana";
                break;
            case 3:
                dish = "Calamari";
                break;
            case 4:
                dish = "Stuffed Ziti Fritta";
                break;
            case 5:
                dish = "Toasted Ravioli";
                break;
            case 6:
                dish = "Spinach-Artichoke Dip";
                break;
            case 7:
                dish = "Shrimp Fritto Misto";
                break;
            case 8:
                dish = "Fried Mozarella";
                break;
        }

        return dish;
    }

    /*
     * Returns an entree from Olive Garden
     * @return string indicating which entree to eat
     */
    public static String entree(){
        String dish = "";

        int num = (int) (Math.random() * 17) + 1;
        
        switch(num){
            case 1:
                dish = "Fettuccine Alfredo";
                break;
            case 2:
                dish = "Chicken Alfredo";
                break;
            case 3:
                dish = "Chicken Tortelloni Alfredo";
                break;
            case 4:
                dish = "Tour of Italy";
                break;
            case 5:
                dish = "Chicken Parmigiana";
                break;
            case 6:
                dish = "Eggplant Parmigiana";
                break;
            case 7:
                dish = "Lasagna Classico";
                break;
            case 8:
                dish = "Five Cheese Ziti al Forno";
                break;
            case 9:
                dish = "Shrimp Scampi";
                break;
            case 10:
                dish = "Chicken Scampi";
                break;
            case 11:
                dish = "Herb-Grilled Salmon";
                break;
            case 12:
                dish = "Chicken & Shrimp Carbonara";
                break;
            case 13:
                dish = "Chicken Marsala Fettuccine";
                break;
            case 14:
                dish = "Grilled Chicken Margherita";
                break;
            case 15:
                dish = "Calabrian Mahi Mahi";
                break;
            case 16:
                dish = "Cheese Ravioli";
                break;
            case 17:
                dish = "Ravioli Carbonara";
                break;
        }

        return dish;
    }
}
