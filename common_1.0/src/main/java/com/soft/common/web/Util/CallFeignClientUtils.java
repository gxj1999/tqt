package com.soft.common.web.Util;

import com.alibaba.fastjson.JSONObject;
import com.soft.common.security.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Component
public class CallFeignClientUtils<T> {
    @Autowired
    private LoadBalancerClient loadBalancerClient;//ribbon负载均衡


    public static HttpHeaders getHttpHeaders(MediaType mediaType) throws Exception{
        HttpHeaders headers = new HttpHeaders();
        // 提交方式
        headers.setContentType(mediaType);
        // 设置id_token
        Optional<String> optionalStr = SecurityUtils.getCurrentUserJWT();
        String idToken = "Bearer " + optionalStr.toString().replace("Optional[","").replace("]","");
        headers.add("Authorization", idToken);
        // 设置http请求头和参数
//        HttpEntity<MultiValueMap<String, Object>> formEntity = new HttpEntity(paramObject, headers);

        return headers;
    }

    /**
     * GET 路由请求
     * @param api
     * @return
     * @throws Exception
     */
    public ResponseEntity<T> getPathParameReq(String api,Class<T> responseType)throws Exception{
        // 获取网关信息
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("GATEWAY");
        HttpEntity httpEntity = new HttpEntity(getHttpHeaders(MediaType.APPLICATION_FORM_URLENCODED));
//        ParameterizedTypeReference<T> type = new ParameterizedTypeReference<T>() {};
        RestTemplate restTemplate  = new RestTemplate();
        return restTemplate.exchange(serviceInstance.getUri() + api, HttpMethod.GET,
            httpEntity,responseType);
    }

    /**
     *  post json请求
     * @param api
     * @param object
     * @return
     * @throws Exception
     */
    public ResponseEntity<T> postJsonRequest(String api,Class<T> responseType,Object object) throws Exception {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("GATEWAY");
        RestTemplate restTemplate = new RestTemplate();
//        ParameterizedTypeReference<T> type = new ParameterizedTypeReference<T>() {};
        // 将对象转化成json字符串
        String jsonObject = JSONObject.toJSONString(object);
//        HttpEntity httpEntity = getHttpEntity(MediaType.APPLICATION_JSON_UTF8, jsonObject);
        HttpEntity httpEntity = new HttpEntity(jsonObject,getHttpHeaders(MediaType.APPLICATION_JSON_UTF8));
        return restTemplate.exchange(serviceInstance.getUri() + api, HttpMethod.POST,
            httpEntity, responseType);
    }


    /**
     * 自定义请求头和请求体的PUT请求调用方式
     * @param api 请求接口
     * @param responseType 返回对象类型
     * @param variables body参数
     * @return ResponseEntity 响应对象封装类
     */
    public ResponseEntity<T> postForm(String api, Class<T> responseType, Object... variables)throws Exception {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("GATEWAY");
        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
        body.add("cntrCd","001");
        body.add("isFinancial","1");
        HttpEntity<MultiValueMap<String, String>> httpEntity = new HttpEntity(body,getHttpHeaders(MediaType.APPLICATION_FORM_URLENCODED));
        return restTemplate.exchange(serviceInstance.getUri() + api, HttpMethod.POST, httpEntity, responseType);
//         return restTemplate.postForEntity(serviceInstance.getUri() + api, uriVariables, responseType);
    }


    private  MultiValueMap<String, String> object2MultivalueMap(Object... variables){
        MultiValueMap<String, String> tmp = new LinkedMultiValueMap<>();
        for(Object var : variables){

        }
        return tmp;
    }
}
