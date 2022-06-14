package com.qa2.vytrack.utilities;

import java.util.ArrayList;

public class Login_Credentials {

    /** 1. ArrayList with Correct usernames */
    public static ArrayList<String> getCorrUsernameList() {
        //1.1.
        ArrayList<String> UsernameList = new ArrayList<>();

        //1.2. add elements to ArrayList
        UsernameList.add("user42");
        UsernameList.add("user43");
        UsernameList.add("user44");

        UsernameList.add("storemanager77");
        UsernameList.add("storemanager78");
        UsernameList.add("storemanager248");

        UsernameList.add("salesmanager143");
        UsernameList.add("salesmanager144");
        UsernameList.add("salesmanager145");

        //1.3.
        //System.out.println("Size of the UsernameList is : " + UsernameList.size() + " elements");
        //System.out.println("------------------------------------------------------");

        //1.4.
        return UsernameList;
    }


    /** 2. ArrayList with Correct passwords */
    public static ArrayList<String> getCorrPasswordList () {
        //2.1.
        ArrayList<String> PasswordsList = new ArrayList<>();

        //2.2.
        PasswordsList.add("UserUser123");

        //2.3.
        //System.out.println("Size of the PasswordList is : " + PasswordsList.size() + " elements");
        //System.out.println("------------------------------------------------------");

        //2.4.
        return  PasswordsList;
    }



}
