package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int []arr = {1,2,4};
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        boolean r=true;
        for (int i = 1; i <arr.length ; i++) {
            if ((arr[i] - arr[i - 1]) != diff) {
                r=false;
                break;
            }
        }

        System.out.println(r);
    }
}
