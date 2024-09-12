package pro.sky.homework_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework_spring.model.Item;
import pro.sky.homework_spring.service.StoreService;
import pro.sky.homework_spring.service.StoreServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {

    private final StoreService service;

    public StoreController(StoreService service) {
        this.service = service;
    }

    @GetMapping("/add")
        public void add(@RequestParam("itemIds")List<Item> itemIds){
        service.add(itemIds);
        }
    @GetMapping("/get")
        public List<Item> get(){
        return service.get();
        }
}
