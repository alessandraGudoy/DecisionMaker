
/**
 * JavaExercises
 * @author Gudoy, Alessandra
 */

public class JavaExercises {
    
    public static void main(String[] args) {
        // print(1234567); // 1,234,567

        // p(factorial(20));
        // p(factorial(19));
        // p(factorial(10) % factorial(9));

        int i= 100;
        p(i++>100);

        for(i=0; i<6; ++i){
            p(i);
        }
    }

    public static void print(int num) {

        if(num<1000) {
            System.out.print(num);
        } else {
            print(num/1000);
            System.out.print("," + num%1000);
        }
        
    }

    public static long factorial(int n){
        long result = 1;
        for(int i=n; i>= 1; i--){
            result = result * i;
        }

        return result;
    }

    public static <E> void p(E e){
        System.out.println(e);
        System.out.println();
    }

}
