package edu.upc.eetac.dsa.riverola.mysql;

/**
 * Created by Guillermo on 02/10/2015.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        MySQLAccess dao = new MySQLAccess();
        dao.readDataBase();
    }

}
