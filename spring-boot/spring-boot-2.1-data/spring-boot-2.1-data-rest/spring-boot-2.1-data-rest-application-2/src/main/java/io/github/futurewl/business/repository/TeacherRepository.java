package io.github.futurewl.business.repository;

import io.github.futurewl.business.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 功能描述：
 *
 * @author weilai
 */
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}