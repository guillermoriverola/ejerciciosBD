package edu.upc.eetac.dsa.riverola.singleton;

/**
 * Created by Guillermo on 02/10/2015.
 */
public class MainStatic {

    public static void main(String[] args) {

        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObjectStatic object = SingleObjectStatic.getInstance();

        //show the message
        object.showMessage();
    }
}
