package cn.itsource.aigou.repository;

import cn.itsource.aigou.domain.ProductDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author 卡卡罗特
 */
public interface ProductDocRepository extends ElasticsearchRepository<ProductDoc,Long> {
}
