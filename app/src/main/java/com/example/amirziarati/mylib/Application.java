package com.example.amirziarati.mylib;

/**
 * Created by amirziarati on 10/4/16.
 */
public class Application {

    public static MyComponent component;


    //this part of code will run only the first time Applicatian class is accesed. wether in standlone run which starts from main or in module use from other external modules
    //if the library is something you gonna use in your own project the best practice is to place your component in Android App Application class
    static {
        System.out.println("android library started");
        component = DaggerMyComponent.builder().myModule(new MyModule()).build();

//        you only need to put   ".myModule(new MyModule())" for modules
//        which you need to send them a arguments in their constructor
//        e.g.         DaggerMyComponent.builder().myModule(new MyModule(String someArgument)).build();

//        so the below line would also work instead of above
//        component =DaggerMyComponent.builder().build();

        MainClass obj = new MainClass();
        System.out.println("android library ended");
    }

    public static void main(String[] args) {
        System.out.println("library was running standlone");
    }
}
