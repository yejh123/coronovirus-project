package com.yejh.coronovirus.mapper;

import com.yejh.coronovirus.entity.Hero;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author yejh
 * @create 2020-04_17 21:17
 */

@Mapper
public interface HeroMapper {
    @Select("SELECT * FROM t_heroes ORDER BY birthday")
    List<Hero> getAllHeroes();
}
