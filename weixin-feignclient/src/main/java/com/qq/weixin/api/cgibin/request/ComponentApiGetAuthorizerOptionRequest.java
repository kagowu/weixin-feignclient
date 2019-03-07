package com.qq.weixin.api.cgibin.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author gong.hua
 */
@Data
public class ComponentApiGetAuthorizerOptionRequest {
    @JSONField(name = "component_appid")
    @JsonProperty("component_appid")
    private String componentAppid;

    @JSONField(name = "authorizer_appid")
    @JsonProperty("authorizer_appid")
    private String authorizerAppid;

    @JSONField(name = "option_name")
    @JsonProperty("option_name")
    private String optionName;
}
