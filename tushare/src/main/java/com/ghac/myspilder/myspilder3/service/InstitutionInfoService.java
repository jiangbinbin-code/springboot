/**
 * FileName: InstitutionInfoService
 * Author:   90934
 * Date:     2020/2/2 22:47
 * Description: 机构基本信息爬虫项目的Service接口层
 */

package com.ghac.myspilder.myspilder3.service;
import org.springframework.stereotype.Component;

/**
 * @author 90934
 */

@Component
public interface InstitutionInfoService {
    /**
     * fetch data by rule id
     *
     * @param institutionInfo rule id
     */
    void save(InstitutionInfo institutionInfo);

    /**
     * fetch data by rule id
     *
     * @param institutionInfo rule id
     * @return Result<institutionInfo>
     */
    List<InstitutionInfo> findInstitutionInfo(InstitutionInfo institutionInfo);

    /**
     * 查询数据库中所有的数据
     *
     * @return Institution
     */
    List<InstitutionInfo> findAll();

}
