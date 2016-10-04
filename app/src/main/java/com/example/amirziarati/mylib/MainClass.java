package com.example.amirziarati.mylib;

import javax.inject.Inject;

/**
 * Created by amirziarati on 10/4/16.
 */
public class MainClass {

    @Inject
    String strAmir;

    public MainClass() {
        injectDependencies();
        System.out.println(strAmir);

    }

    protected void injectDependencies() {
        Application.component.inject(this);
    }


}
