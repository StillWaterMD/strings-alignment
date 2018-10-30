package com.company;

public class Align {

    private  StringBuilder [][] str;

    private int [] maxLength;

    private void countMaxLength(){

        maxLength=new int[str[0].length];


        for( int i = 0; i< str[0].length; ++i){

            maxLength[i]=str[0][i].length();

            for (int j = 1; j < str.length; ++j){

                if (maxLength[i] < str[j][i].length())  maxLength[i] = str[j][i].length();

            }

        }

    }

    private void  alignment(){

        for (int i = 0 ; i < str.length; ++i) {

            for (int j = 0; j < str[i].length; ++j) {

               if (str[i][j].length() < maxLength[j]) sizeAdjust(i, j);

            }

        }

    }

    private void sizeAdjust(int line, int row){



        int adjust = maxLength[row] - str[line][row].length();




        for( int i = 0; i < adjust/2; ++i){


            str[line][row].insert(0," ");

        }


        for(int i = 0; i < adjust-adjust/2; ++i){

            str[line][row].append(" ");

        }


    }

    private void brackets(){

        for(int i = 0; i < str.length; ++i){

            for(int j = 0; j < str[i].length; ++j){

                str[i][j].insert(0,"|");
                str[i][j].append("|");

            }
        }
    }

    public void print (){

        for(int i = 0; i < str.length; ++i){

            for(int j = 0; j<str[i].length; ++j){

                System.out.print(str[i][j] + " ");

            }

            System.out.println("");

        }

    }


    Align(StringBuilder[][] s){

        str=s;
        countMaxLength();
        alignment();
        brackets();
    }










}
