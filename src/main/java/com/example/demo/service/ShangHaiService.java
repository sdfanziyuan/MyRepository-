package com.example.demo.service;

import com.example.demo.po.ShangHai;

import java.util.List;

/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/11/24 8:11
 */
public interface ShangHaiService {
    List<ShangHai> getValues();
    int addValues(ShangHai shangHai);
}
