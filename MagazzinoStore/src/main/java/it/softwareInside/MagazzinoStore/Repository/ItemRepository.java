package it.softwareInside.MagazzinoStore.Repository;

import org.springframework.data.repository.CrudRepository;

import it.softwareInside.MagazzinoStore.Models.Item;

public interface ItemRepository extends CrudRepository<Item, Integer> {

}
