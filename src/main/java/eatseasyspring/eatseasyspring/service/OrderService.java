package eatseasyspring.eatseasyspring.service;


import eatseasyspring.eatseasyspring.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private RestaurantRepo restRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private TableRepo tableRepo;
}




