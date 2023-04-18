package com.split.split.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.split.split.entity.SmallType;
import com.split.split.mapper.SmallTypeMapper;
import com.split.split.service.ISmallTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品小类Service实现类
 */
@Service("smallTypeService")
public class ISmallTypeServiceImpl extends ServiceImpl<SmallTypeMapper,SmallType> implements ISmallTypeService {

    @Autowired
    private SmallTypeMapper smallTypeMapper;
}
