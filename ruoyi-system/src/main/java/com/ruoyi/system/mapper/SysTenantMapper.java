package com.ruoyi.system.mapper;


import com.ruoyi.common.core.domain.entity.SysTenant;

import java.util.List;

/**
 * @author huwei
 * @date 2025/3/24 11:03
 */
public interface SysTenantMapper {
     List<SysTenant> selectTenantTree();
}
