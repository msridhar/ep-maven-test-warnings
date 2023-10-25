package net.sridharan.myapp;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (2 < 1) {
         // Some code I don't want to run right now
         System.out.println("whoops");
        }
        List<String> l = new ArrayList();
        Object x = null;
        int ignored = x.hashCode();
        System.out.println( "Hello World!" );
    }
}
