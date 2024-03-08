package com.Interface.Demo;

interface AquaticAnimal{
    void swim();  //by default public and abstract
}

interface TerrestrialAnimal{
    void moveOnLand();
}

class Snake implements AquaticAnimal, TerrestrialAnimal{
    @Override
    public void swim(){
        System.out.println("Snake swim with tail ");
    }
    @Override 
    public void moveOnLand(){
        System.out.println(("Snake creeps "));
    }
}

class Demo{
    public static void main(String ar[]){
        // Snake snake = new Snake();
        // snake.swim();
        // snake.moveOnLand();
        AquaticAnimal ref = new Snake();
        ref.swim();
        //ref.moveOnLand();
        TerrestrialAnimal ref2 = new Snake();
        //ref2.swim();
        ref2.moveOnLand();
    }
}
