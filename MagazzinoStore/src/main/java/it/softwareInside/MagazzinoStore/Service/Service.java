package it.softwareInside.MagazzinoStore.Service;

import org.springframework.beans.factory.annotation.Autowired;

import it.softwareInside.MagazzinoStore.Models.*;
import it.softwareInside.MagazzinoStore.Repository.ItemRepository;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	ItemRepository itemRepository;

	public boolean getItem(Item item) {
		if (item == null)
			return false;
		try {
			itemRepository.save(new Item());
			return true;
		} catch (Exception e) {
			System.out.println("ERRORE" + e);
			return false;
		}
	}

	public Item removeItem(int id) {
		Item item = itemRepository.findById(id).get();
		itemRepository.deleteById(id);
		return item;
	}

	public boolean deleteAllData(String pass) {
		String myPassString = "123456";
		if (!pass.equals(myPassString))
			return false;
		try {
			itemRepository.deleteAll();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean update(Item item) {
		return getItem(item);
	}

	public Iterable<Item> listAllItem() {
		return itemRepository.findAll();
	}

	public double getTotalPrice() {
		double tot = 0;

		for (Item item : itemRepository.findAll()) {
			tot += item.getCosto();
		}

		return tot;
	}
}
