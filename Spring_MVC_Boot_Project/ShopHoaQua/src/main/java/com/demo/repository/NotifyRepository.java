package com.demo.repository;

import com.demo.entities.Category;
import com.demo.entities.Notify;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotifyRepository extends JpaRepository<Notify, Integer> {
}
