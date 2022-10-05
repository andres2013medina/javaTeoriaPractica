package com.cloudfitc.ejercicios.parte1.system;

import java.io.IOException;

public class TestRuntime {

    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();
//        r.exec(new String[] {"notepad","test.txt"});
//        r.freeMemory();
        System.out.println(r.totalMemory());
        r.gc();


    }
}
