package io.github.futurewl.spring.boot.data.rest;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-03-17:23:51
 * @version 1.0
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
