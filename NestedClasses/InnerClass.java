package com.memberInnerClass;

class ABC{
    public int length =30;
    protected class PQR{
        private int width=20;
        public void area(){
            System.out.println("Area: "+(length*width));
        }
    }
}

class Main{
    public static void main(String ar[]){
        ABC obj = new ABC();
        ABC.PQR ref = obj.new PQR();
        System.out.println(obj);
        ref.area();
    }
}