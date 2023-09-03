
public class DecisionMaker {
    public static void main(String[] args){
        System.out.println(generateTime());
        System.out.println(anoBa());
        System.out.println(coinFlip());
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
}
