package com.cloudfitc.ejercicios.parte1.tokenizerYbuffer;

public class TestStringBuffer {

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("10");
        StringBuffer sb3 = new StringBuffer("hola");

        sb3.append(" tal");
        sb3.insert(4, " que");

        System.out.println(sb3);

        sb3.delete(4, 8);
        System.out.println(sb3);
        sb3.deleteCharAt(0);

        System.out.println(sb3);

        sb3.setCharAt(2, 'i');
        sb3.replace(4, 7, "ke ase");
        System.out.println(sb3);
        // System.out.println(sb3.reverse());

        System.out.println(sb3.substring(4,6));
        CharSequence cs = sb3.subSequence(4,6);

        System.out.println(sb3.indexOf("ase"));

        // donde aparce por primera vez y luego donde aparece por ultima vez
        System.out.println(sb3.indexOf("ase") + "#" + sb3.lastIndexOf("ase"));


    }
}
