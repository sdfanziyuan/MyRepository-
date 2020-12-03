package com.example.demo.mapper;

import com.example.demo.po.ShangHai;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/11/23 18:08
 */
//@Repository
@Mapper
public interface ShangHaiMapper {
    List<ShangHai> getValues();
    int addValues(ShangHai shangHai);
}
