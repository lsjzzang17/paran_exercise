package com.paran.misson;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class User {

	public static void main(String[] args) {
		
		Inventory<Item> weapon = new Weapon<Item>(new Item("도끼","무기",20000,44));
		weapon.add(new Item("창","",15000,47));
		System.out.println(weapon.item.getName());
		
		
		Inventory<Item> allItem = new Inventory<Item>(new Item("마을주문서","기타",300,0));
		allItem.add(new Item("집열쇠","기타",200,0));	
		allItem.showInven();
	}

}


class Item{
	
	String name;	
	String type;
	int price;
	int needLv;
	
	public Item(String name, String type,int price, int needLv){
		this.name = name;
		this.type = type;
		this.price = price;
		this.needLv = needLv;
				
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNeedLv() {
		return needLv;
	}

	public void setNeedLv(int needLv) {
		this.needLv = needLv;
	}

}


class Inventory<T>{
	
	List<T> items = new ArrayList();
	T item;
	
	public Inventory(T item){
		
		if(item instanceof Weapon){
			
		}else{
		
		this.item = item;
		
		}
	}
	
	public void add(T item){
		items.add(item);
	}
	
	public void showInven(){
		for(T list : items){
			System.out.println(list);
		}
	}
	
}


class Weapon<T> extends Inventory<T>{
	
	List<T> weapon = new ArrayList();

	public Weapon(T item) {
		super(item);
		add(item);
		showInven();
	}
	
	public void add(T item){		
		weapon.add(item);
				
	}
	
	public void showInven(){
		
		for(T list : weapon){
			System.out.println(list);
			
		}
	}
	
	
}
