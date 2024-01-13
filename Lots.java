import java.util.Arrays;

public class Lots {

    private static final String[] names = {"ADAM", "ALLY", "ANNE", "DEREK", "ERIC", 
                "LAWRENCE", "MARY", "MAX", "NADINE", "NORA", "REYNA", "RILEY", "ROWAN", "SONNY"};
    

    public static void main(String[] args){
        String[] list = Arrays.copyOf(names, names.length);

        // System.out.println(Arrays.toString(list));

        for(int i=0; i<names.length; i++){
            int index = rand(list.length);
            System.out.println(list[index]);
            list = shift(list, index);
        }
    }

    public static int rand(int max){
        return (int)(Math.random() * max);
    }


    public static String[] shift(String[] arr, int index){
        for(int i=index; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }

        return Arrays.copyOf(arr, arr.length-1);
    }

}
