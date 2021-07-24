package com.myshop.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myshop.demo.entity.OwnerShopServicesRelation;

@Repository
public interface OwnerShopServiceRepository extends JpaRepository<OwnerShopServicesRelation, Long>{

}
