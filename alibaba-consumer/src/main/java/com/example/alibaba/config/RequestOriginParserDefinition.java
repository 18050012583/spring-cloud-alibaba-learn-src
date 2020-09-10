package com.example.alibaba.config;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

//@Component
public class RequestOriginParserDefinition implements RequestOriginParser {
    @Override
    public String parseOrigin(HttpServletRequest request) {
        String requestSrc = request.getParameter("requestSrc");
        if(StringUtils.isEmpty(requestSrc)){
            throw new RuntimeException("requestSrc不能为空");
        }
        return requestSrc;
    }
}
