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

    static {
        System.out.println("android library started");
        component =DaggerMyComponent.builder()
                .myModule(new MyModule())
                .build();
        MainClass obj=new MainClass();
        System.out.println("android library ended");    }
}
