package com.company;

public class splitToMatrix {


    private String [][] str;


    splitToMatrix(String [] s){

        str=new String[s.length][];

        for( int i=0; i < s.length; ++i) {

            str[i] = s[i].split("\\|");

        }
    }


    public String [][] getMat(){

        return this.str;


    }


    public void print(){


        for(int i=0; i< str.length; ++i){

            for (int j = 0; j< str[i].length; ++j){

                System.out.print(str[i][j]+" ");

            }

            System.out.println("");


        }

        System.out.println("Start: "+ str[0][0]);


    }



}
