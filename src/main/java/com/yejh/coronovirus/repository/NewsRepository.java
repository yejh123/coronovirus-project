package com.yejh.coronovirus.repository;/**
 * @author yejh
 * @create 2020-04_16 21:16
 */

import com.yejh.coronovirus.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

/**
 * @description: TODO
 **/
public interface NewsRepository extends JpaRepository<News, Integer> {

}
