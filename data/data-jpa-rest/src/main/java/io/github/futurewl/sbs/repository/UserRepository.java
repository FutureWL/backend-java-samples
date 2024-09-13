package io.github.futurewl.sbs.repository;

import io.github.futurewl.sbs.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(@Param(value = "username") String username);

    Page<User> findAllByUsername(@Param(value = "username") String username, Pageable pageable);

}
