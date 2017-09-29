package com.cwc.iquestweeks.week3.pb2;

import java.util.regex.Pattern;

public class Frog extends Amphibian {

    @Override
    public String getName() {
        String[] tmp = this.getClass().getName().split(Pattern.quote(".")); //gets the actual class name
        return tmp[tmp.length - 1];
    }

    @Override
    public String getGender() {
        return "apache helicoper";
    }

}
