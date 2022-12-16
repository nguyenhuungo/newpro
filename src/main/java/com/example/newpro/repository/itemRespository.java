package com.example.newpro.repository;

import com.example.newpro.models.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface itemRespository extends JpaRepository<Items, Integer> {

}