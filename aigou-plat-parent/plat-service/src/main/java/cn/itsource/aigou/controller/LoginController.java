package cn.itsource.aigou.controller;

import cn.itsource.aigou.domain.User;
import cn.itsource.aigou.util.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 卡卡罗特
 */
@RestController
@Api(tags = "登录的controller")
public class LoginController {

    /**
     * 登录接口
     * @param user
     * @return
     */
    @ApiOperation(value = "登录接口")
    @PostMapping("/login")
    public AjaxResult login(@RequestBody User user){
        System.out.println(user.getName()+" ....." +user.getPassword());
        String name = "admin";
        String password = "admin";
        if (name.equals(user.getName()) && password.equals(user.getPassword())){
            return AjaxResult.me().setSuccess(true).setMessage("登陆成功").setRestObj(user);
        }
        return AjaxResult.me().setSuccess(false).setMessage("登陆失败");
    }
}
