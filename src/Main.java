import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        }

    public static void task1() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else
                arr[i][j] = 0;
            }
        }

        for (int[] row : arr) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }


    public static void revers (int arr[], int nextIndex){
        if (arr == null || nextIndex == arr.length){
            return;
        }
        int value = arr[nextIndex];
        revers(arr,nextIndex+1);
        arr[arr.length-nextIndex-1] = value;

    }

    public static void task2(){
         int [] arr = new int [] {5,4,3,2,1};
         int [] arr2 = new int [] {5,4,3,2,1};
        System.out.println(Arrays.toString(arr2));
         revers(arr,0);
            System.out.println(Arrays.toString(arr));
        System.out.println();
    }
    private static void task3() {
        int [] arr = new int [] {5,8,2,3,9};
        List<Integer> list = Arrays.asList(5,8,2,3,9);
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



    }
    private static void task7() {
        String one = "135";
        String two = "246";
        String three = (new String(one+two));
        System.out.println(three);

        System.out.println();
    }
    private static void task8() {
        System.out.println();
    }
    public static String firstLetterToUpperCase(String word) {
        String i = word.substring(0, 1);
        String r = i.toUpperCase() + word.substring(1);
        return r;
    }
    public static void task9 () {
            String fullName = "ivanov ivan ivanovich";
            String[] splitFullName = fullName.split(" ");
            System.out.println(firstLetterToUpperCase(String.valueOf(splitFullName[0])) + " " + firstLetterToUpperCase(String.valueOf(splitFullName[1])) + " " + firstLetterToUpperCase(String.valueOf(splitFullName[2])));
            System.out.println();
        }
    }