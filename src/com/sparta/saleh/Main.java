package com.sparta.saleh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[] = {50, 24, 10, 2, 20, 8, 95};

        System.out.print("Array: ");
        for (int i: arr){
            System.out.print(i + ", ");
        }

        bubbleSort(arr);

        System.out.println(" ");
        System.out.print("Sorted: ");
        for(int i : arr){
            System.out.print(i + ", ");
        }
    }

    public static int[] bubbleSort(int[] arr){

        for(int i = 0; i < arr.length; i ++){
            for(int j =0; j < arr.length - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
