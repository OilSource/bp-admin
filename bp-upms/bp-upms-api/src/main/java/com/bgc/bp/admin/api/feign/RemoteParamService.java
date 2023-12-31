package com.bgc.bp.admin.api.feign;

import com.bgc.bp.common.core.constant.SecurityConstants;
import com.bgc.bp.common.core.constant.ServiceNameConstants;
import com.bgc.bp.common.core.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 
 * bp4cloud
 * <p>
 * 查询参数相关
 */
@FeignClient(contextId = "remoteParamService", value = ServiceNameConstants.UMPS_SERVICE)
public interface RemoteParamService {

	/**
	 * 通过key 查询参数配置
	 * @param key key
	 * @return
	 */
	@GetMapping(value = "/param/publicValue/{key}", headers = SecurityConstants.HEADER_FROM_IN)
	R<String> getByKey(@PathVariable("key") String key);

}
