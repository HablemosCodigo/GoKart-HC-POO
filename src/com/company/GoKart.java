package com.company;

public class GoKart {

    //Se le asigna la letra m al inicio para indicar que es una Variable Miembro
    private String mColor = "Rojo";

    public GoKart(String color){
        mColor = color;
    }

    public String getColor(){
        return mColor;
    }

}
