package com.ntt2015.decoratorpattern;

/*
    Copyright (c) 2014  HW Tech Services, Inc., LLC

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

public class Pepperoni extends ToppingDecorator {

    public Pepperoni(Pizza newPizza) {

        super(newPizza);

        System.out.println("Adding Pepperoni");
    }

    // Returns the result of calling getDescription() for
    // PlainPizza and adds " mozzarella" to it

    @Override
    public String getDescription(){

        return tempPizza.getDescription() + ", pepperoni";

    }

    @Override
    public double getCost(){

        System.out.println("Cost of Pepperoni: " + 1.15);

        return tempPizza.getCost() + 1.15;

    }

}

