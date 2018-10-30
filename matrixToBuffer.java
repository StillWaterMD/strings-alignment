package com.company;

public class matrixToBuffer {


    private StringBuilder [][]str;

    matrixToBuffer(String [][] s) {


        str = new StringBuilder[s.length][];

        for (int i = 0; i < s.length; ++i) {


            str[i] = new StringBuilder[s[i].length];

            for (int j = 0; j < s[i].length; j++) {

                str[i][j] = new StringBuilder(s[i][j].trim());

            }


        }
    }

    public void print(){

            for(int i=0; i<str.length; ++i){

                for(int j=0; j<str[i].length; ++j){


                    System.out.print(str[i][j]+" ");


                }

                System.out.println("");

            }



    }

    public StringBuilder [][] getBuf(){

        return this.str;


    }
}
