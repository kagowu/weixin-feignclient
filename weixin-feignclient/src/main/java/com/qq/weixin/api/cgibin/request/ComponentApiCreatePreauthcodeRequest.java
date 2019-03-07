package com.qq.weixin.api.cgibin.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author gong.hua
 */
@Data
public class ComponentApiCreatePreauthcodeRequest {
    @JSONField(name = "component_appid")
    @JsonProperty("component_appid")
    private String componentAppid;
}
