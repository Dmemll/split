package com.split.split.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.split.split.entity.Product;
import com.split.split.mapper.ProductMapper;
import com.split.split.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品Service实现类
 */
@Service("productService")
public class IProductServiceImpl extends ServiceImpl<ProductMapper,Product> implements IProductService {

    @Autowired
    private ProductMapper productMapper;
}
