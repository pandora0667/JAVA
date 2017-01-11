package org.jusk2.practicejava;

/**
 * Created by jusk2 on 2017-01-10.
 */
public class Member {

  //filed
  String name;
  String id;
  String password = "12345";
  int age;

  // Constructor
   Member(String name, String id){
    this.name = name;
    this.id = id;
  }

  Member(){

  }

  //Method
  public boolean compare(String name, String password) {
     if (this.name.equals(name) && this.password.equals(password)) {
       return true;
     } else {
       return false;
     }
  }

  public void login(String name, String password) {
    this.name = name;
    this.password = password;
  }
}
