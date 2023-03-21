package it.softwareInside.MagazzinoStore.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import it.softwareInside.MagazzinoStore.Models.Item;
import it.softwareInside.MagazzinoStore.Service.Service;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	Service service;

	@PostMapping("/crea")
	public boolean showItem(@RequestBody Item item) {

		return service.getItem(item);
	}
	
	@PostMapping("/updateItem")
	public boolean updateItem(@RequestBody Item item) {
		return service.update(item);
	}
	
	@GetMapping("/getListOfItems")
	public Iterable<Item> getListOfItems(){
		return service.listAllItem();
	}
	
	@GetMapping("/getTot")
	public double getTotalCost() {
		return service.getTotalPrice();
	}

	@DeleteMapping("/remove")
	public Item deleteItem(@RequestParam("id") int id) {
		return service.removeItem(id);
	}

	@GetMapping("/remove-all")
	public boolean deleteAllItem() {
		return service.deleteAllData(null);
	}
}
