
/**
 * JavaExercises
 * @author Gudoy, Alessandra
 */

public class JavaExercises {
    
    public static void main(String[] args) {
        print(1234567); // 1,234,567
    }


    public static void print(int num) {

        if(num<1000) {
            System.out.print(num);
        } else {
            print(num/1000);
            System.out.print("," + num%1000);
        }
        
    }

}
