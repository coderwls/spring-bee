package org.springbee.jdbc.service;

import java.util.List;
import org.springbee.jdbc.domain.City;
import org.springbee.jdbc.mapper.MasterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhanglei
 */
@Service
public class CityService {

  @Autowired
  MasterMapper masterMapper;

  @Transactional
  public void addCityThrowException() {
    masterMapper.insert(City.builder().id("755").name("深圳").country("中国").state("广东").build());
    masterMapper.insert(City.builder().id("755").name("深圳").country("中国").state("广东").build());
  }

  @Transactional
  public void addCityNestedThrowException() {
    masterMapper.insert(City.builder().id("20").name("广州").country("中国").state("广东").build());
    addCityThrowException();
  }

  public List<City> getAllCity() {
    return masterMapper.getAll();
  }
}