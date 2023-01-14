package com.company.groceryshoppinglist.repository;

public interface CustomItemRepository {
    
    void updateItemQuantity(String name, float newQuantity);

}
