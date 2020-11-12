/**
 * FileName: Crawler
 * Author:   90934
 * Date:     2020/2/18 14:26
 * Description: 爬虫项目启动
 */

package com.ghac.myspilder.myspilder3.controller;

import com.ghac.myspilder.myspilder3.pojo.InstitutionDomain;
import com.ghac.myspilder.myspilder3.pojo.InstitutionInfo;
import com.ghac.myspilder.myspilder3.service.IExportExcelService;
import com.ghac.myspilder.myspilder3.service.InstitutionDomainService;
import com.ghac.myspilder.myspilder3.service.InstitutionInfoService;
import com.ghac.myspilder.myspilder3.service.InstitutionTestService;
import com.ghac.myspilder.myspilder3.task.JobProcessor;
import com.ghac.myspilder.myspilder3.websocket.ProductWebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @author 90934
 * @date 2020/2/18 14:26
 * @description 爬虫项目启动Web端页面逻辑
 * @since 0.1.0
 */
@RestController
@ServerEndpoint("/websocket")
public class MyWebController {
    private JobProcessor jobProcessor;
    private InstitutionInfoService institutionInfoService;
    private IExportExcelService iExportExcelService;
    private InstitutionDomainService institutionDomainService;
    private InstitutionTestService institutionTestService;

    @Autowired
    public void setInstitutionDomainService(InstitutionDomainService institutionDomainService) {
        this.institutionDomainService = institutionDomainService;
    }

    @Autowired
    public void setInstitutionTestService(InstitutionTestService institutionTestService) {
        this.institutionTestService = institutionTestService;
    }

    @Autowired
    public void setiExportExcelService(IExportExcelService iExportExcelService) {
        this.iExportExcelService = iExportExcelService;
    }

    @Autowired
    public void setInstitutionInfoService(InstitutionInfoService institutionInfoService) {
        this.institutionInfoService = institutionInfoService;
    }

    @Autowired
    public void setJobProcessor(JobProcessor jobProcessor) {
        this.jobProcessor = jobProcessor;
    }

    @PostMapping("/crawler/run")
    public void runCrawler() {
        this.jobProcessor.start(jobProcessor);
    }

    @PostMapping("/exportExcelInfo")
    public void exportExcelInfo(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        List<InstitutionInfo> list = this.institutionInfoService.findAll();
        this.iExportExcelService.exportExcelWithDispose("institution_info", "机构基本信息" + UUID.randomUUID().toString(),
                list, req, resp);
        try {
            ProductWebSocket.sendInfo("数据导出成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/exportExcelDomain")
    public void exportExcelDomain(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        List<InstitutionDomain> list = this.institutionDomainService.findAll();
        this.iExportExcelService.exportExcelWithDispose("institution_domain", "机构已正式公布的授权签字人及领域" + UUID.randomUUID().toString(),
                list, req, resp);
        try {
            ProductWebSocket.sendInfo("数据导出成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/exportExcelTest")
    public void exportExcelTest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        List<InstitutionTest> list = this.institutionTestService.findAll();
        this.iExportExcelService.exportExcelWithDispose("institution_test", "机构已正式公布的检验能力范围" + UUID.randomUUID().toString(),
                list, req, resp);
        try {
            ProductWebSocket.sendInfo("数据导出成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
