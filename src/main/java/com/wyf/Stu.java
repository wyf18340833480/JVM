package com.wyf;

import java.util.Date;

public class Stu extends Person {
    private Integer id;
    private String name;
    private Date date;    
    private String addr;
    public String toString (){
        return this.id + this.name + this.date+ this.addr + "";
    }
}
