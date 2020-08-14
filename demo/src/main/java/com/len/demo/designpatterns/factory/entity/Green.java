package com.len.demo.designpatterns.factory.entity;

public class Green implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Green::fill() method.");
   }
}
