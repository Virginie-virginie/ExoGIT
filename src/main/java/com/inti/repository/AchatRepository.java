package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Achat;

@Repository
public interface AchatRepository extends JpaRepository<Achat, Long> {

}
