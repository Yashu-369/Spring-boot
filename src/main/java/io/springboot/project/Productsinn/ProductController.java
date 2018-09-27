package io.springboot.project.Productsinn;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProductController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/items")
	public List<Item> getAllItems()
	{
		return itemService.getAllItems();
	}
	
	
	@RequestMapping("/items/{name}")
	public Item getItem(@PathVariable String name)
	{
		return itemService.getItem(name);
	}
	
	

}
