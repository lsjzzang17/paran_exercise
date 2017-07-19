package com.paran.chapter21;


public class FirstGenericDemo {
	public static void main(String[] args){
//		Inventory<String> inst = new Inventory<String>("아");
		Inventory<Item> inst2 = new Inventory<Item>(new Item());
//		Inventory<?> inst3 = new Inventory<>("아");
//		Inventory<SubItem> inst4 = new Inventory<>();
		
		
//		showInvenItemA(inst4);
//		showInvenItemB(inst4);
//		showInvenItemC(inst4);
//		showInvenItemD(inst4);
//		
//		showInvenItemA(inst3);
//		showInvenItemA(inst);
		showInvenItemA(inst2);
		
		
//		showInvenItemB(inst);
		showInvenItemB(inst2);
//		showInvenItemB((Inventory<? extends Item>) inst3);
		
//		showInvenItemC(inst);
		showInvenItemC(inst2);
//		showInvenItemC((Inventory<? super Item>) inst3);
		
//		showInvenItemD(inst);
		showInvenItemD(inst2);
//		showInvenItemD((Inventory<Item>) inst3);
		
		
	}
	public static void showInvenItemA(Inventory<?> inven){  // 무슨타입이 와도 상관없다.
		inven.showInfo();
	}
	public static void showInvenItemB(Inventory<? extends Item> inven){ //Item 클래스와 그를 상속받은 is-A 관계에 있는 타입은 다받겠다.
		inven.showInfo();
	}
	public static void showInvenItemC(Inventory<? super Item> inven){ //최하위가 Item 인 경우
		inven.showInfo();
	}
	public static void showInvenItemD(Inventory<Item> inven){
		inven.showInfo();
	}
	
	
}

class Item{
	String name;
	String id;
	String originalOwner;
	
}

class SubItem extends Item{

}

class Inventory<T>{
	public T item;
	public Inventory(T item){
		this.item = item;
	}
	public void setItem(T item){
		this.item = item;
	}
	public T getItem(){
		return item;
	}
	public void showInfo(){
		System.out.println(item);
	}	
	
}