package org.project.springbootblog.repository;

import org.project.springbootblog.entity.Post;
import org.project.springbootblog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    @Query("SELECT p FROM Post p LEFT JOIN FETCH p.author ORDER BY p.date DESC")
//    List<Post> findLatest7Posts(Pageable pageable);

    User findUserByEmail(String email);
}
