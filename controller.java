package com.company;

public class controller {




    controller(String[] arr){

        int counter=0;


        for(String s:arr){

            System.out.println("Starting to align string: " + s );
            System.out.println("");

            splitToArray str = new splitToArray(s);

            //proceeding from array to matrix (getting rows from lines)
            splitToMatrix mat = new splitToMatrix(str.getStr());

            //moving from string to string builder
            matrixToBuffer buf = new matrixToBuffer(mat.getMat());

            //makinq each line to contain equal amount of rows
            equalLines equal = new equalLines(buf.getBuf());

            //making each row to have even lines

            Align even= new Align(equal.getLines());
            even.print();

            counter++;
            System.out.println("");
            System.out.println("Alignment for string number " + counter + " is done" );
            System.out.println("");

        }


    }
}
