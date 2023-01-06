import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        }

    public static void task1(){
        int[][] matrix = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}};
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }


    //Task2
    public static void task2(){
         int [] arr = new int [] {5,4,3,2,1};
         int [] arr2 = new int [] {1,2,3,4,5};
         {   System.out.println(Arrays.toString(arr));
             Arrays.sort(arr2, 0, 4);
             System.out.println(Arrays.toString(arr2));
         }
    }

    private static void task3() {
        int [] arr = new int [] {5,4,3,2,1};
        List<Integer> list = Arrays.asList(5,4,3,2,1);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

    }
    private static void task4() {
        int arr [] = {-6,2,5,-8,8,10,4,-7,12,1};
        int sum = 2;
        Arrays.sort(arr,0,9);
        int low = 0;
        int high = arr.length - 1;
        while (low<high){
            if (arr[low] + arr[high] == sum);
            {
                System.out.println(arr[low] + arr[high]);
                return;
            }
        }

    }
    private static void task5() {
        String fullName = "Ivanov-Ivan-Ivanovich";
        char ch = 'I';
        int index = -1;
        while ((index = fullName.indexOf(ch, index + 1)) != -1) {
            System.out.println(index);
        }
        int firstName = fullName.indexOf('I');
        int firstName2 = fullName.indexOf('-');
        System.out.println("Фамилия сотрудника — " + fullName.substring(firstName,firstName2));
        int middleName = fullName.indexOf('I',firstName+1);
        int middleName2 = fullName.lastIndexOf('-');
        System.out.println("Имя сотрудника — " +  fullName.substring(middleName,middleName2));
        int lastName2 = fullName.lastIndexOf('I');
        System.out.println("Отчество сотрудника — " + fullName.substring(lastName2));

    }
    private static void task6() {
        String fullName = "ivanov ivan ivanovich";
        char[] chars = fullName.toCharArray();
        System.out.println(Arrays.toString(chars));


    }
    private static void task7() {

    }
}