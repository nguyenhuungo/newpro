package com.example.newpro.Service;

import com.example.newpro.models.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.newpro.repository.itemRespository;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService implements ItemInterface{
    @Autowired private itemRespository itemRespon;

    @Override
    public List<Items> getAllItem() {
        return this.itemRespon.findAll();
    }

    @Override
    public String addItem(Items items) {
        this.itemRespon.save(items);
        return "Add thành công item";
    }

    @Override
    public String updateItem(Items items, int id) {
        Optional<Items> items1 =  this.itemRespon.findById(id);
        if(items1.isPresent()){
           return "Không tìm thấy item này";
        }else {
            items.setId(id);
            this.itemRespon.save(items);
            return "Update thành công item";
        }
    }

    @Override
    public String deleteItem( int id) {
        this.itemRespon.deleteById(id);
         return "Delete thành công";
    }

    @Override
    public Optional<Items> getItemById(int id) {
        return this.itemRespon.findById(id);
    }
}
