package com.driver;

public class Main {
    public static void main(String args[]){
        product p= new product();
        p.product(2,3);
        p.product(2,3,4);
        p.product(5.2,2.5);
    }
    public static class product{
        public int product(int x,int y){
            return x*y;
        }
        public int product(int x, int y, int z){
            return x*y*z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }

}