package com.example.proviceruser.dao;

import com.example.proviceruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @param :
 * @author : lindonglin
 * @Description :
 * @ate : 10:19  2019/8/6
 * @return :
 */
@Repository
public interface UserRespository extends JpaRepository<User,Long> {

}
