package com.company;

public class Main {

    public static void main(String[] args) {
	int myIntValue=14;
	byte myByteValue=3;
	short myShortValue=9;
	long myLongValue= 50000L + 10L*(myIntValue+myByteValue+myShortValue);
        System.out.println(myLongValue);
        short shortTotal =(short) (1000+10*(myIntValue+myByteValue+myShortValue));
        System.out.println(shortTotal);

    }
}
