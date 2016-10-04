package com.example.amirziarati.mylib;

/**
 * Created by amirziarati on 10/4/16.
 */
public class Application {

    public static MyComponent component;
    public static void main(String[] args)
    {
        System.out.println("library was running standlone");
    }

    //this part of code runs in both library run standalone from main or when this library is given to some one else
    //if the library is something you gonna use in your own project the best practice is to place your component in Android App module Application class
    static {
        System.out.println("android library started");
        component =DaggerMyComponent.builder()
                .myModule(new MyModule())
                .build();
        MainClass obj=new MainClass();
        System.out.println("android library ended");    }
}
