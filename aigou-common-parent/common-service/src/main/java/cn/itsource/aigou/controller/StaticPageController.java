package cn.itsource.aigou.controller;


import cn.itsource.aigou.util.VelocityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 卡卡罗特
 */
@RestController
public class StaticPageController {

    /**
     * 公共的接口,使用模板技术静态化页面
     * 模板路径,数据,目标文件路径
     * @param templatePath
     * @param targetPath
     * @param model
     */
    @PostMapping("/page")
    public void generateStaticPage(
            @RequestParam("templatePath") String templatePath,
            @RequestParam("targetPath") String targetPath,
            @RequestBody Object model){
        VelocityUtils.staticByTemplate(model,templatePath,targetPath);
    }
}
