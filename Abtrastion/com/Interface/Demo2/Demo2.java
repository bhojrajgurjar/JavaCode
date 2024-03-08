package com.Interface.Demo2;

interface Animal{
    void reproduce();
}

interface TerrestrialAnimal extends Animal{
    void moveOnLand();
}

class Snake implements TerrestrialAnimal{
    @Override
    public void reproduce(){
        System.out.println("Snake reproduce laying eggs");
    }
    @Override 
    public void moveOnLand(){
        System.out.println("Snake screeps on land");
    }
}

class Demo2{
    public static void main(String ar[]){
        Snake snake = new Snake();
        snake.reproduce();
        snake.moveOnLand();

        Animal ref = new Snake();
        ref.reproduce();
        //ref.moveOnLand();

        TerrestrialAnimal ref2 = new Snake();
        ref2.reproduce();
        ref2.moveOnLand();
    }
}


