package course3.lesson4_spring.controller;

import course3.lesson4_spring.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> id) {
        this.orderService.add(id);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return this.orderService.get();
    }
}
