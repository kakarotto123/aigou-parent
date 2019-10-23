package cn.itsource.aigou.client;

import cn.itsource.aigou.domain.ProductDoc;
import cn.itsource.aigou.domain.ProductParam;
import cn.itsource.aigou.util.PageList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author 卡卡罗特
 */
@FeignClient("AIGOU-COMMON")
public interface ProductESClient {

    /**
     * 批量保存
     * @param productDocList
     */
    @PostMapping("/es/saveBath")
    void saveBatch(@RequestBody List<ProductDoc> productDocList);

    /**
     * 批量删除
     * @param ids
     */
    @PostMapping("/es/deleteBath")
    void deleteBatch(@RequestBody List<Long> ids);

    /**
     * es的搜索
     * @param param
     * @return
     */
    @PostMapping("/es/products")
    public PageList<ProductDoc> search(@RequestBody ProductParam param);

}
