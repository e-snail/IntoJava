/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intojava;

import memory.MemorySizeOf;
//import com.javamex.classmexer.MemoryUtil;

/**
 *
 * @author wuyongbo
 */
public class MainEntry {

    int var_int = 0;
//    long var_long = 0L;
    int[] var_array = {};
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Object object = new Object();
        System.out.println("sizeof Object \t\t= " + MemorySizeOf.sizeOf(object));
        
        EmptyClass emptyClass = new EmptyClass();
        System.out.println("sizeof EmptyClass \t= " + MemorySizeOf.sizeOf(emptyClass));

        byte var_byte = 0;
        System.out.println("sizeof byte \t\t= " + MemorySizeOf.sizeOf(var_byte));

        boolean var_boolean = false;
        System.out.println("sizeof boolean \t\t= " + MemorySizeOf.sizeOf(var_boolean));
        
        int var_int = 0;
        System.out.println("sizeof int \t\t= " + MemorySizeOf.sizeOf(var_int));

        Integer var_Integer = new Integer(1);
        System.out.println("sizeof Integer \t\t= " + MemorySizeOf.sizeOf(var_Integer));

        long var_long = 0L;
        System.out.println("sizeof long \t\t= " + MemorySizeOf.sizeOf(var_long));
        
        int[] var_array = {};
        System.out.println("sizeof array \t\t= " + MemorySizeOf.sizeOf(var_array));
        
        String var_string_empty = "";
        System.out.println("sizeof var_string_empty \t= " + MemorySizeOf.sizeOf(var_string_empty));
        
        String var_string_abc = "abc";
        System.out.println("sizeof var_string_abc \t\t= " + MemorySizeOf.sizeOf(var_string_abc));
        
        MainEntry mainEntry = new MainEntry();
	System.out.println("sizeOf(new MainEntry()) \t= " + MemorySizeOf.sizeOf(mainEntry));
    }   
}
