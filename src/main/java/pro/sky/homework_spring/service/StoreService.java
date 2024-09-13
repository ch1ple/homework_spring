package pro.sky.homework_spring.service;

import pro.sky.homework_spring.model.Item;

import java.util.List;

public interface StoreService {
    void add(List<Long> itemIds);

    List<Item> get();
}
