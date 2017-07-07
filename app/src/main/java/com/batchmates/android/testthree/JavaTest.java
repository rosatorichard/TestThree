package com.batchmates.android.testthree;

import java.sql.SQLOutput;

/**
 * Created by Android on 7/7/2017.
 */

public class JavaTest {

    public static void main(String[] args) {

        int[] theArray={2,8,9,3,4,3,2,6,6,2,4,9,8};

        theArray=Ascending(theArray);



        for (int i = 0; i <theArray.length ; i++) {
            System.out.println(theArray[i]);

        }


        String s="frog";
        combo(s);

    }

    public static int[] Ascending(int[] array)
    {
        int length=array.length;
        int swapper=0;

        for (int i = 0; i <length ; i++) {

            for (int j = i; j <length ; j++) {

                if(array[i]>=array[j])
                {
                    swapper=array[i];
                    array[i]=array[j];
                    array[j]=swapper;

                }
            }

        }
        return array;
    }


    public static void combo(String s)
    {
        int counter=0;
        int length=s.length();
        String printer="";

        String[] theArray=new String[length];
        for (int i = 0; i <length ; i++) {
            printer+=s.charAt(i);
            theArray[i]=printer;
            printer="";
        }


        for (int i = 0; i <length ; i++) {
            for (int j = i; j <length ; j++) {
                printer+=s.charAt(j);
                System.out.println(printer);

            }
            printer="";

        }
        for (int i = 0; i <length-2 ; i++) {
            printer+=s.charAt(i);
            printer+=s.charAt(length-1);
            System.out.println(printer);
            printer="";

        }

    }




}
