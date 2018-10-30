package com.company;

public class equalLines {
    private StringBuilder[][] str;
    private int [] maxSizes;
    private int maxRow;

    private void countMaxRows(){

        maxRow=str[0].length;

        for (int i=1; i < str.length; ++i){

            if( maxRow < str[i].length ) maxRow = str[i].length;

        }
    }

    private void equalLines(){

        for(int i = 0; i < str.length; ++i){

            if(str[i].length < maxRow) alignLine(i);


        }


    }

    private void alignLine(int lineNum){

        StringBuilder[] temp = new StringBuilder[maxRow];

        for (int i=0; i< maxRow; ++i){

            if(i < str[lineNum].length) temp[i] = str[lineNum][i];
            else temp[i] = new StringBuilder("");

        }

        str[lineNum]=temp;

    }

    public StringBuilder [][] getLines(){

        return this.str;


    }

    public void print(){

        for(int i = 0 ; i < str.length; ++i){

            for (int j = 0 ; j < str[i].length; ++j){

                System.out.print(str[i][j]+ " ");

            }

            System.out.println("");

        }

    }


    equalLines(StringBuilder[][] s){

        str=s;
        maxSizes=new int[s.length];


        countMaxRows();
        equalLines();

    }




}
