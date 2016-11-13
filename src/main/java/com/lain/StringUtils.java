package com.lain;

/**
 * Created with IntelliJ IDEA.
 * User: Lain
 * Date: 16/10/23
 * Time: 上午8:24
 */
public class StringUtils {
    public static String surroundWith(String str, String left, String right) {
        return left + str + right;
    }

    public static boolean isEmpty(String str){
        return str == null
                || str.length() == 0
                || str.trim().length() == 0;
    }
}
