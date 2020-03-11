package com.louay.projects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number or raw: ");
        int rawLength = input.nextInt();
        System.out.println("please enter number of character in each raw: ");
        int columnLength = input.nextInt();

        char [][] charArray = new char [rawLength][columnLength];

        for (int i = 0; i <charArray.length ; i++) {
            for (int j = 0; j < charArray[i].length ; j++) {
                System.out.printf("please input character at %d raw, %d column: ",(i+1),(j+1));
                charArray[i][j] = input.next().charAt(0);
            }
        }

        quickSort(charArray);

        boolean isAlphabetically = false;
        for (int i = 1; i < charArray.length ; i++) {
            for (int j = 0; j <charArray[i].length ; j++) {
                if (charArray[i-1][j] <= charArray[i][j]){
                    isAlphabetically = true;
                }else {
                    isAlphabetically = false;
                    break;
                }
            }
            if (isAlphabetically == false){
                break;
            }
        }

        printArray(charArray);

        System.out.println("\n"+isAlphabetically);
    }

    public static void printArray(char [][] charArray) {
        for (char [] n: charArray) {
            for (char n1:n) {
                System.out.print(n1+" ");
            }
            System.out.println();
        }
    }

    public static void quickSort(char[][] list) {
        for (int i = 0; i <list.length ; i++) {
            quickSort(list[i], 0, list[i].length - 1);
        }
    }

    public static void quickSort(char[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    public static int partition(char[] list, int first, int last) {
        char pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {
            while (low <= high && list[low] <= pivot)
                low++;

            while (low <= high && list[high] > pivot)
                high--;

            if (high > low) {
                char temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot)
            high--;

        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }else {
            return first;
        }
    }

}
