package cw13102022;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExemple1 {
    static List<String> list = new ArrayList<String>();

    public static void main(String args[]) throws Exception
    {
        Integer[] array = new Integer[1000000 * 10000000];
    }
}

