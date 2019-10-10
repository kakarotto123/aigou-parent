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
        if ("admin".equals(user.getName()) && "admin".equals(user.getPassword())){
            return AjaxResult.me().setSuccess(true).setMessage("登陆成功");
        }
        return AjaxResult.me().setSuccess(false).setMessage("登陆失败");
    }
}
