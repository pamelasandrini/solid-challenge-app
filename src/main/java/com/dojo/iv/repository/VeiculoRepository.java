package com.dojo.iv.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.dojo.iv.entity.VeiculoEntity;

@Repository
public interface VeiculoRepository extends CrudRepository<VeiculoEntity, String> {

}
