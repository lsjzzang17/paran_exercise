package com.paran.chapter21;

public class SecondGenericDemo {
	public static void main(String[] args){
		Plants refPlants;
		Fruit<Seed> refFruit;
		Fruit<SeedSeed> refFruitSeedSeed;
		Apple<Seed,String> refApple = new Apple<>(new Seed(),"1234");
//		Mango<Seed> refMango;
//		refFruit = refApple;
//		refPlants = refFruit;
//		refPlants = refApple;
		
		refPlants = refApple;
		refFruit = refApple;
		//refFruitSeedSeed=refApple;
		
		Object refObj;
		
		refObj=refApple;
		
	}
}

interface Plants{
	public int photosynthesize(int amountOfCo2);
}

class Fruit<T> implements Plants{

	public T seedType;
		
	@Override
	public int photosynthesize(int amountOfCo2) {
		// TODO Auto-generated method stub
		return amountOfCo2;
	}
	
}

class Apple<T extends Seed , S> extends Fruit<T>{
	public S var;
	public Apple(T seedType){
		this.seedType = seedType;
	}
	
	public Apple(T seedType ,S var){
		this.seedType = seedType;
		this.var = var;
	}
	
	
}

class Mango<T extends Seed> extends Fruit<T>{
	public Mango(T seedType){
		this.seedType = seedType;
	}
}

class Seed{	
}
class SeedSeed{}
