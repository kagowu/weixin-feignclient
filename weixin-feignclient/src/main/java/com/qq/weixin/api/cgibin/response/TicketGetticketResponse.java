package com.qq.weixin.api.cgibin.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.qq.weixin.api.BaseResponse;
import lombok.Data;

/**
 * @author gong.hua
 */
@Data
public class TicketGetticketResponse extends BaseResponse {
    private String ticket;

    @JSONField(name = "expires_in")
    @JsonProperty("expires_in")
    private Integer expiresIn;
}