package com.example.macstudent.c0697332_test1;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by macstudent on 2017-08-04.
 */

public class UserData extends RealmObject {
    @PrimaryKey
    String username;
    @Required
    String password;
}
