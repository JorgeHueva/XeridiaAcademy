package com.xeridia.xercoffeeshop.repository;

import com.xeridia.xercoffeeshop.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Integer> {
}