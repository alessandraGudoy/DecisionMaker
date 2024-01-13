import java.util.Arrays;

public class Check {
    public static void main(String[] args){
        int[] case1 = {3, 6, 8, -1, -1};
        int given1[] = {5, 3, 5};

        int[] case2 = {-1, -1, -1, -1, -1};
        int given2[] = {5, 0, 0};

        int[] case3 = {0, 2, -1, -1, -1};
        int given3[] = {5, 2, -5};

        int[] case4 = {-10, 0, 3, -1, -1};
        int given4[] = {5, 3, 9};

        add(case1, given1);
        add(case2, given2);
        add(case3, given3);
        add(case4, given4);
    }

    public static void add(int[] numbers, int[] given){
        int n = given[0];
        int m = given[1];
        int num = given[2];

        int currentIndex = m - 1;
        int copyToIndex = currentIndex + 1;

        while(currentIndex >= 0 && numbers[currentIndex] >= num){
            numbers[copyToIndex] = numbers[currentIndex];
            currentIndex = currentIndex - 1;
            copyToIndex = currentIndex + 1;
        }

        numbers[copyToIndex] = num;
        m = m + 1;

        System.out.println(Arrays.toString(numbers));
        System.out.println(m);
    }
}
