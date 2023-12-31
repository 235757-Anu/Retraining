package org.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //    public User(int id,String name){
//        this.id=id;
//        this.name=name;
//    }
//    public User(){}
//
//    public int getId(){
//        return id;
//    }
//    public void setId(int id){
//        this.id=id;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String name){
//        this.name=name;
//    }
}
