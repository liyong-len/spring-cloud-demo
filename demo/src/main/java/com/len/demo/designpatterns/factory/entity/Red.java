package com.len.demo.designpatterns.factory.entity;

public class Red implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Red::fill() method.");
   }
}
