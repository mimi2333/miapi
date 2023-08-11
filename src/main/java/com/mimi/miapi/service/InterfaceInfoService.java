package com.mimi.miapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mimi.miapi.model.entity.InterfaceInfo;

/**
* @author mimi
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-08-12 03:23:21
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * 校验
     *
     * @param
     * @param add
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
