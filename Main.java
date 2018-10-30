package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String [] testarray=new String[4];
        testarray[0]="| testtest 00 | test 01 | test 02||  testtest 11  | test 12|| test 20 | test 21 |testtest 22|";
        testarray[1]="| testtest 00 | test 01 | test 02||test 01|  testtest 11  | test 12|| test 20 | test 21 |testtest 22|";
        testarray[2]="| testtest 00 | test 01 | test 02||test 01|  testtest 11  | test 12|| test 20|";
        testarray[3]="| test 00 | test 01 | test 02||  test 10  | test 11|| test 20 | test   21 |test 22|";

        if(args.length==0) new controller(testarray);
        else new controller(args);





    }
}
