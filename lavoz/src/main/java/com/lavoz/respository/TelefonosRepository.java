package com.lavoz.respository;

import com.lavoz.model.Telefonos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefonosRepository extends JpaRepository<Telefonos, Long> {
}
