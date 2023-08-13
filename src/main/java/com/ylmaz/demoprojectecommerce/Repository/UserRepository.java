package com.ylmaz.demoprojectecommerce.Repository;

import com.ylmaz.demoprojectecommerce.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Integer> {

}
