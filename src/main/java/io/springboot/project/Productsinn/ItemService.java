package io.springboot.project.Productsinn;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ItemService {
	
	private List<Item> items = Arrays.asList(
			new Item("+5 Dexterity Vest", 10,20),
			new Item("Aged Brie",2,0),
			new Item("Elixir of the Mongoose",5, 7),
			new Item("Sulfuras",0,80),
			new Item("Concert Backstage Passes",15,20)

			
			);
	
	public List<Item> getAllItems(){
		return items;
	}
	
	public Item getItem(String name)
	{
		 return items.stream().filter(i ->i.getName().equals(name)).findFirst().get();
	}
	
	
	
	}



