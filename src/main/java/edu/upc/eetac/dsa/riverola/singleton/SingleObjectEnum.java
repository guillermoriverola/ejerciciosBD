package edu.upc.eetac.dsa.riverola.singleton;

/**
 * Created by Guillermo on 02/10/2015.
 */
public enum SingleObjectEnum {
    instance;

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
