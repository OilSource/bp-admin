/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.bgc.bp.admin.service;

import com.bgc.bp.admin.api.dto.AppSmsDTO;
import com.bgc.bp.common.core.util.R;

/**
 *
 * bp4cloud
 */
public interface AppService {

	/**
	 * 发送手机验证码
	 * @param sms phone
	 * @return code
	 */
	R<Boolean> sendSmsCode(AppSmsDTO sms);

	/**
	 * 校验验证码
	 * @param phone 手机号
	 * @param code 验证码
	 * @return
	 */
	boolean check(String phone, String code);

}
