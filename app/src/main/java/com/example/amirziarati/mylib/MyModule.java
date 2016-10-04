package com.example.amirziarati.mylib;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by amirziarati on 10/4/16.
 */
@Module
public class MyModule {
    @Provides
    public String provideIsDebug() {
        return "Amir Was Injected";
    }
}
