package com.example.hp.dkshop;

/**
 * Created by hp on 03-10-2017.
 */

public class Modle {

    private String name;
    private int modle_number;


    public Modle(String name,int modle_number )
    {
        this.setName(name);
        this.setModle_number(modle_number);
    }


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModle_id(){
        return modle_number;
    }

    public void setModle_number(int modle_number){
        this.modle_number = modle_number;
    }

}


