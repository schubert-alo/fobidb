package org.fobidb.teacher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> { // unser TeacherRepository erbt von JpaRepository, daher stehen viele Befehle zum manipulieren der Datenbank zur Verfügung

    //SELECT * FROM teacher WHERE email = ?
    @Query("SELECT t FROM Teacher t WHERE t.email = ?1")
    Optional<Teacher> findByEmail(String email);
}
