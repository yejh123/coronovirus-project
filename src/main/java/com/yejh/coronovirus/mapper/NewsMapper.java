package com.yejh.coronovirus.mapper;

import com.yejh.coronovirus.entity.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jdbc.repository.query.Query;

import java.util.Date;
import java.util.List;

@Mapper
public interface NewsMapper {
    @Select("select distinct date from t_news")
    List<Date> getDates();

    @Select("select * from t_news where TO_DAYS(date)= TO_DAYS(#{date})")
    List<News> findNewsByDate(Date date);
}
