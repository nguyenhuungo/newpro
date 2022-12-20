package com.example.newpro.Service;

import com.example.newpro.models.Items;

import java.util.List;
import java.util.Optional;

public interface ItemInterface {
    public List<Items> getAllItem();
    public String addItem(Items items);
    public String updateItem(Items items);
    public String deleteItem( int id);

    public Optional<Items> getItemById(int id);
}
