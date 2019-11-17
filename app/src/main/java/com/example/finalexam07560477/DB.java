package com.example.finalexam07560477;

import java.util.ArrayList;

public class DB {
   public static ArrayList<String> userList ;

    public DB() {
        userList = new ArrayList<>();
    }
    public ArrayList<String>getUserList(){
        return userList;
    }

}
