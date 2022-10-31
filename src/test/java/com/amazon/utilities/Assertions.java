package com.amazon.utilities;

public class Assertions {

    public static void verifyEquals(String actual,String expected){
        if(actual.equals(expected)){
            System.out.println("GECTİ");
        }else{
            System.out.println("KALDI");
        }

    }
}
