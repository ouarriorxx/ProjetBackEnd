package com.example.demo_ferme_plant.repository;

import com.example.demo_ferme_plant.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
     User findByEmailAndPassword(String email , String password);
}
