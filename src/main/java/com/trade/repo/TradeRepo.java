package com.trade.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trade.entity.Trade;

@Repository
public interface TradeRepo extends JpaRepository<Trade, Long> {

}
