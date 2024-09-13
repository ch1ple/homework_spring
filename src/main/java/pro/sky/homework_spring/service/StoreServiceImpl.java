package pro.sky.homework_spring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pro.sky.homework_spring.model.Item;
import pro.sky.homework_spring.repository.Basket;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    private final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void add(List<Long> itemIds){
        basket.addAll(itemIds.stream()
                .map(Item::new)
                .toList());

    }
    @Override
    public List<Item> get(){
        return basket.getAll();
    }
}
