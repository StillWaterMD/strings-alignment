package com.company;

public class splitToArray {


    private String [] arr;

    splitToArray(String s){

        this.arr=s.substring(1,s.length()-1).split("\\|\\|");

    }

    public void print(){

        for (String s: arr) {

            System.out.println(s);

        }



    }

    public String [] getStr(){


        return this.arr;


    }


}
