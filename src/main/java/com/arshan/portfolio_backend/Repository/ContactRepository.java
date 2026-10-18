package com.arshan.portfolio_backend.Repository;

import com.arshan.portfolio_backend.Entity.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contacts, Long> {

}
