package com.ntt2015.factorypattern;

/*
    Copyright (c) 2014  Hoi Wan Louis
 
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

// This is a factory thats only job is creating ships
// By encapsulating ship creation, we only have one
// place to make modifications

public class EnemyShipFactory{

    // This could be used as a static method if we
    // are willing to give up subclassing it

    public EnemyShip makeEnemyShip(String newShipType){

        EnemyShip newShip = null;

        if (newShipType.equals("U")){

            return new UFOEnemyShip();

        } else

        if (newShipType.equals("R")){

            return new RocketEnemyShip();

        } else

        if (newShipType.equals("B")){

            return new BigUFOEnemyShip();

        } else return null;

    }

}

