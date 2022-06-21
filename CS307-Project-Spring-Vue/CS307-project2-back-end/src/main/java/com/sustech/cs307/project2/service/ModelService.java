package com.sustech.cs307.project2.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sustech.cs307.project2.entity.Model;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Marcy ZHANG
 * @since 2022-05-15
 */
public interface ModelService extends IService<Model> {

    boolean initTable();

    void getFavoriteProductModel();
}
