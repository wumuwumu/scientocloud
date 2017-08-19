package com.sciento.wumu.scientocloud.Repository;

import com.sciento.wumu.scientocloud.Model.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
