package com.mimi.miapi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mimi.miapi.mapper.InterfaceInfoMapper;
import com.mimi.miapi.model.entity.InterfaceInfo;
import com.mimi.miapi.service.InterfaceInfoService;
import org.springframework.stereotype.Service;

/**
* @author mimi
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2023-08-12 03:23:21
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        // TODO 参数校验
    }
}




