package com.xyg.builder;

public class Director
{

    private Builder builder;
    
    public Director(Builder builder) {
        this.builder  = builder;
    }
    
    public void constrct (){
        builder.buildHeader();
        builder.buildBody();
        builder.buildFooter();
        builder.getResult();
    }
}
