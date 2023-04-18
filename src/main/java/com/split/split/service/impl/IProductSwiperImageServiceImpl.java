package com.split.split.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.split.split.entity.ProductSwiperImage;
import com.split.split.mapper.ProductSwiperImageMapper;
import com.split.split.service.IProductSwiperImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 产品轮播图片Service实现类
 */
@Service("productSwiperImageService")
public class IProductSwiperImageServiceImpl extends ServiceImpl<ProductSwiperImageMapper,ProductSwiperImage> implements IProductSwiperImageService {

    @Autowired
    private ProductSwiperImageMapper productSwiperImageMapper;
}
