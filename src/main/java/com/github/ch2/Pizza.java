package com.github.ch2;


import org.omg.CORBA.Object;

import java.util.EnumSet;
import java.util.Set;

public abstract class Pizza {
    //构建一个枚举值
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
/*    final Set<Topping> topping;
    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Topping> toppings =EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping){
            toppings.add(Objects)
        }
    }*/

}
