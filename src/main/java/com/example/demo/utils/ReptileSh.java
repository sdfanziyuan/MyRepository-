package com.example.demo.utils;

import com.example.demo.bean.Notice;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.text.MessageFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;



/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/11/24 8:42
 */
public class ReptileSh {

    public void GET() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new WxMappingJackson2HttpMessageConverter());

        HttpHeaders headers = new HttpHeaders();
//        headers.set("Host", "www.shcpe.com.cn");
//        headers.set("Origin", "http://www.shcpe.com.cn");
//        headers.set("Referer", "http://www.shcpe.com.cn/content/shcpe/market/market.html");
//        headers.set("Content-Type", "application/json;charset=UTF-8");
//        headers.set("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.183 Safari/537.36");
        headers.set("Cookie", "yikikata=0a32f748-f9fa68b5f035ccb7b33fb4cfa50a1d53; _pk_ses.1.9730=1; _pk_id.1.9730=cf68e46fbddd305d.1605927010.8.1606115401.1606113122.");

        Map<String, Object> param = new HashMap<>();
        param.put("requestNo", System.currentTimeMillis());
        param.put("requestSystem", "shcpe-cos");
        param.put("requestTime", "2020-11-24");
        param.put("staticsTime", "2020-11-24");
        HttpEntity<Map<String,Object>> httpEntity = new HttpEntity<>(param,headers);
        String yikikata = UUID.randomUUID().toString().substring(0, 8)+ "-" +UUID.randomUUID().toString().replaceAll("-", "");
        String url = "http://www.shcpe.com.cn/shcpe-cos/overview/detail?yikikata={0}"; url = MessageFormat.format(url, yikikata);
        ResponseEntity<String> response = restTemplate.postForEntity(url, httpEntity, String.class);
        System.out.println("GET() Set-Cookie ："+ response.getHeaders().get("Set-Cookie"));
        String result = restTemplate.postForObject(url, httpEntity, String.class);
        System.out.println(result);
    }
    @Test
    public Notice GET_TEST() {
        Notice result;
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Host", "www.shcpe.com.cn");
        headers.set("Origin", "http://www.shcpe.com.cn");
        headers.set("Referer", "http://www.shcpe.com.cn/content/shcpe/market/market.html");
        headers.set("Content-Type", "application/json;charset=UTF-8");
        headers.set("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.183 Safari/537.36");
        headers.set("Cookie", "yikikata=0a280d46-165d439b583232e45baf341aa916f299; yikikata=0a27eaa4-3eaf758fb8798f4e656a8ca6d8b209a1; _pk_ses.1.9730=1; _pk_id.1.9730=cf68e46fbddd305d.1605927010.8.1606113127.1606113122.");

        Map<String, Object> param = new HashMap<>();
        param.put("requestNo", new Date().getTime());
        param.put("requestSystem", "shcpe-cos");
        param.put("requestTime", "2020-11-24");
        param.put("staticsTime", "2020-11-24");

        HttpEntity<Map<String, Object>> httpEntity = new HttpEntity<>(param, headers);
        ResponseEntity<String> response = restTemplate.postForEntity("http://www.shcpe.com.cn/shcpe-cos/overview/detail?yikikata=0a2fe223-fd64ecd8536575ed5aec0bc2720ae878", httpEntity, String.class);
        System.out.println("GET_TEST Set-Cookie："+response.getHeaders().get("Set-Cookie"));
        try{
             result = restTemplate.postForObject("http://www.shcpe.com.cn/shcpe-cos/overview/detail?yikikata=0a2fe223-fd64ecd8536575ed5aec0bc2720ae878", httpEntity, Notice.class);
        }catch (Exception e){
            result = null;
            System.out.println("未获取到数据");
        }
        //System.out.println(result.toString());
        //System.out.println("getDayAcceptAmount="+result.getData().getMarketOverviewDay().getDayAcceptAmount());
        return result;

    }
}
