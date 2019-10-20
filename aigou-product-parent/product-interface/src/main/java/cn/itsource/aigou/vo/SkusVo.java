package cn.itsource.aigou.vo;

import cn.itsource.aigou.domain.Specification;

import java.util.List;
import java.util.Map;

/**
 * @author 卡卡罗特
 */
public class SkusVo {

    private List<Specification> skuProperties;

    private List<Map<String,String>> skus;

    public List<Specification> getSkuProperties() {
        return skuProperties;
    }

    public void setSkuProperties(List<Specification> skuProperties) {
        this.skuProperties = skuProperties;
    }

    public List<Map<String, String>> getSkus() {
        return skus;
    }

    public void setSkus(List<Map<String, String>> skus) {
        this.skus = skus;
    }
}
