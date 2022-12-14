package lamba;

import java.util.*;

	class Product{  
	    int id;  
	    String name;  
	    int price;  
	    public Product(int id, String name, int price) {  
	        super();  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;  
	    }  
	}  
	public class Comparator {  
	    public static void main(String[] args) {  
	        List<Product> list=new ArrayList<Product>();  
	          
	        //Adding Products  
	        list.add(new Product(1,"HP Laptop",25000));  
	        list.add(new Product(3,"Keyboard",300));  
	        list.add(new Product(2,"Dell Mouse",150));  
	          
	        System.out.println("Sorting on the basis of name...");  
	  
	        // implementing lambda expression  
	        Collections.sort(list,(p1,p2)->{  
	        return p1.name.compareTo(p2.name);  
	        });  
	        for(Product p:list){  
	            System.out.println(p.id+" "+p.name+" "+p.price);  
	        }  
	  
	    }  
	}  
