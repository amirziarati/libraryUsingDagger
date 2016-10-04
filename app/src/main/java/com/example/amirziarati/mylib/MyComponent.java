package com.example.amirziarati.mylib;

/**
 * Created by amirziarati on 10/4/16.
 */

import dagger.Component;

@Component(modules = {
        MyModule.class
})
public interface MyComponent {
    void inject(MainClass mainClass);
}
