package com.company;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Task_42 {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> buildOddList(ArrayList<Integer> input) {
        ArrayList<Integer> output = new ArrayList<>();
        return buildList(input,0,output,i -> i % 2 != 0 );
    }

    public ArrayList<Integer> buildEvenList(ArrayList<Integer> input) {
        ArrayList<Integer> output = new ArrayList<>();
        return buildList(input,0,output,i -> i % 2 == 0 );
    }

    private ArrayList<Integer> buildList(ArrayList<Integer> input, Integer index, ArrayList<Integer> output, Predicate<Integer> predicate) {

        if (index == input.size()) {
            return output;
        }
        if (predicate.test(index)) {
            output.add(input.get(index));
        }
        return buildList(input,index+1,output,predicate);
    }
}
