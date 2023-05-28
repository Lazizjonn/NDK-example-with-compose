package it.cagliari.ndkexample2;

public class Utils2 {

    static {
        System.loadLibrary("utils");
    }

    public native String getMessage();

}