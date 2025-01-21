package com.ruoyi.web.controller.system;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.SysCompany;
import com.ruoyi.system.service.ISysCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * 单位管理 控制器
 *
 * @author huwei
 * @date 2025-01-08
 */

@RestController
@RequestMapping("/system/company")
public class SysCompanyController extends BaseController {
    @Autowired
    private ISysCompanyService companyService;

    /**
     * 查询单位列表
     *
     * @param company 查询条件对象，包含过滤条件
     * @return 分页后的单位列表数据
     */

    @GetMapping("/list")
    public TableDataInfo list(SysCompany company) {
        startPage();
        List<SysCompany> list = companyService.selectCompanyList(company);
        return getDataTable(list);
    }
//    @GetMapping("/list")
//    public AjaxResult list(SysCompany company) {
//        List<SysCompany> list = companyService.selectCompanyList(company);
//        return AjaxResult.success(list);
//    }
    /**
     * 获取单位详细信息
     */
    @GetMapping("/{companyId}")
    public AjaxResult getInfo(@PathVariable Long companyId) {
        return AjaxResult.success(companyService.selectCompanyById(companyId));
    }
    /**
     * 新增单位
     */
    @PostMapping
    public AjaxResult add(@RequestBody SysCompany company) {
        return toAjax(companyService.insertCompany(company));
    }
    /**
     * 修改单位信息
     */
    @PutMapping
    public AjaxResult edit(@RequestBody SysCompany company) {
        return toAjax(companyService.updateCompany(company));
    }
    /**
     * 删除单位
     */
    @DeleteMapping("/{companyIds}")
    public AjaxResult remove(@PathVariable Long[] companyIds) {
        return toAjax(companyService.deleteCompanyByIds(companyIds));
    }
}