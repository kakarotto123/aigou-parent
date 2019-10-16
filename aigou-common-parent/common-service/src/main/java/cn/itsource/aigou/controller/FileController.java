package cn.itsource.aigou.controller;


import cn.itsource.aigou.util.AjaxResult;
import cn.itsource.aigou.util.FastDfsApiOpr;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author 卡卡罗特
 */
@RestController
public class FileController {

    /**
     * 文件上传
     * @param file
     * @return
     */
    @PostMapping("/file")
    public AjaxResult upload(MultipartFile file){
        try {
            byte[] content = file.getBytes();//获取文件内容
            //文件扩展名
            String fileName = file.getOriginalFilename();
            int index = fileName.lastIndexOf(".");
            String extName = fileName.substring(index + 1);
            String file_id = FastDfsApiOpr.upload(content, extName);
            return AjaxResult.me().setSuccess(true).setMessage("文件上传成功").setRestObj(file_id);
        } catch (IOException e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("文件上传失败"+e.getMessage());
        }
    }

    /**
     * 删除文件
     * @param fileId
     * @return
     */
    @DeleteMapping("/file")
    public AjaxResult delete(String fileId){
        try {
            fileId = fileId.substring(1);
            int index = fileId.indexOf("/");
            String group = fileId.substring(0, index);
            String fileName = fileId.substring(index + 1);
            FastDfsApiOpr.delete(group, fileName);
            return AjaxResult.me().setSuccess(true).setMessage("文件删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setSuccess(false).setMessage("文件删除失败"+e.getMessage());
        }


    }
}
