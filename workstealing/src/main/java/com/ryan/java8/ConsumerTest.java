package com.ryan.java8;

import java.util.function.Consumer;

public class ConsumerTest {
	 
    public static void main(String[] args) {
 
 
	Consumer consumer = ConsumerTest::printNames;
 
 
	consumer.accept("Jeremy");
	consumer.accept("Paul");
	consumer.accept("Richard");
	consumer.accept(true);
 
    } 
 
    private static void printNames(Object name) {
        System.out.println(name);
    }
}