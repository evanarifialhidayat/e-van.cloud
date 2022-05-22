package com.app.ptkp.system.util;

import java.util.Random;

public class RandomCaracter {
    public static String randomCaracterString(int p)
    {      
            Random r = new Random();
            String obj = "";
            String param = "123456789abcdevghijklmnopqrstu";
               for (int i = 0; i < p; i++) {
                   obj += param.charAt(r.nextInt(param.length()));
               } 		
               return obj;
    }    
}
