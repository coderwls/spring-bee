package org.springbee.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springbee.demo.domain.City;

/**
 * @author zhanglei
 */
@Mapper
public interface CityMapper {

  @Select("select id, name, state, country from city")
  List<City> getAll();

  @Select("select id, name, state, country from city where id=#{id}")
  City getOne(@Param("id") String id);

  @Insert("insert into city(id, name, state, country) values (#{id}, #{name}, #{state}, #{country})")
  void insert(City city);

  @Update("update city set name=#{name},state=#{state},country=#{state} where id=#{id}")
  void update(City city);

  @Delete("delete from city where id=#{id}")
  void delete(String id);

  @Delete("delete from city")
  void deleteAll();
}