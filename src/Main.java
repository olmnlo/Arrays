import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Arrays");
        // AI and biotic

//        int[] numbers = {0,5,10,15,20,45,60,1};
        double[] doubles = new double[5];
        String[] strings = {"Ahmed", "Ali", "Mussab", "Sami", "Saleh"};
        char[] chars = new char[5];
        boolean[] booleans = new boolean[5];

//        setArrayValues(ints);
//        setArrayValues(doubles);
//        setArrayValues(strings);
//        setArrayValues(booleans);
//        setArrayValues(chars);
//
//        printArray(ints);
//        printArray(doubles);
//        printArray(strings);
//        printArray(booleans);
//        printArray(chars);
        Scanner scn = new Scanner(System.in);
//        System.out.print("Enter how many number you want to enter: ");
//        int len = scn.nextInt();
//        int[] numbers = new int[len];
//        int max = 0;
//        for (int n : numbers){
//            System.out.print("Enter number: ");
//            n = scn.nextInt();
//            if (n>=max){
//                max = n;
//            }
//        }
//        System.out.println("the max number is: "+max);

//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(3);
//        numbers.add(5);
//        numbers.add(7);
//        System.out.println(numbers);
//        numbers.remove(Integer.valueOf(3));
//        System.out.println(numbers);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(25);
        numbers.add(7);
        numbers.add(8);
        numbers.add(10);
        numbers.add(5);
        numbers.add(55);
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for( Integer n : numbers){
            if(n % 2 == 0){
                even.add(n);
            }else{
                odd.add(n);
            }
        }
        System.out.println(numbers);
        System.out.println(even);
        System.out.println(odd);


//        cars.add("BMW");
//        cars.add("Audi");
//        cars.add("Ford");
//        System.out.println("Add: "+cars);
//        cars.add(1,"GMC");
//        System.out.println("Add index 1: "+ cars);
//        cars.set(1,"Geely");
//        System.out.println("Set index 1 to Geely: "+cars);
//        cars.remove(1);
//        System.out.println("Remove index 1: "+cars);
//        cars.remove("Ford");
//        System.out.println("Remove by object name: "+cars);
//        System.out.println("Get index 1: "+cars.get(1));


//        for(String s : strings){
//            if(s.toLowerCase().charAt(0) == name.toLowerCase().charAt(0)){
//                System.out.println(s);
//            }
//        }

    }
    static void setArrayValues(char[] chars_list){
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < chars_list.length; i++) {
            System.out.print("Enter char: ");
            chars_list[i] = scn.next().charAt(0);
        }
    }


    static void setArrayValues(boolean[] boolean_list){
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < boolean_list.length; i++) {
            System.out.print("Enter boolean: ");
            boolean_list[i] = scn.nextBoolean();
        }
    }
    static void setArrayValues(double[] doubles_list){
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < doubles_list.length; i++) {
            System.out.print("Enter double: ");
            doubles_list[i] = scn.nextDouble();
        }
    }

    static void setArrayValues(String[] strings_list){
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < strings_list.length; i++) {
            System.out.print("Enter string: ");
            strings_list[i] = scn.next();
        }
    }
    static void setArrayValues(int[] ints_list){
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < ints_list.length; i++) {
            System.out.print("Enter int: ");
            ints_list[i] = scn.nextInt();
        }
    }
    static void printArray(int[] ints_list){
        for (int j : ints_list) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static void printArray(String[] strings_list){
        for (String s : strings_list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    static void printArray(double[] doubles_list){
        for (double v : doubles_list) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
    static void printArray(boolean[] booleans_list){
        for (boolean b : booleans_list) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    static void printArray(char[] chars_list){
        for (char c : chars_list) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}