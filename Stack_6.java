package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;


public class Stack_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size");
        int size;
        size = in.nextInt();
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        for (int i = 0; i < size; i++) {
            first.push(getRandomnumInRange(100,200));
        }
        int j = first.pop();
        int k = first.pop();
        first.push(j);
        System.out.println(k);
    }

    public static int getRandomnumInRange(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}