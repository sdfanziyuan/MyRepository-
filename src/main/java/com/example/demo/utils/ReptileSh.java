package com.example.demo.utils;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.po.ShcpeMarketOverviewEntity;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


/**
 * @author sdpjw
 * @email ljf8838@163.com
 * @date 2020/11/24 8:42
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@Component
public class ReptileSh {

    @Autowired
    private RestTemplate restTemplate;
    /**
     * 日期后面加上星期
     */
    public String changeWeek(String dateString){
        String dateStringTemp = dateString.replaceAll("年","-").replaceAll("月","-").replaceAll("日","");
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try{
            date = format.parse(dateStringTemp);
        }catch (ParseException e){
            e.printStackTrace();
        }
        dateStringTemp = " ("+String.format("%tA", date).replaceAll("星期","周")+")";
        if ("Monday".equals(dateStringTemp))
            dateStringTemp = " (周一)";
        else if ("Tuesday".equals(dateStringTemp))
            dateStringTemp = " (周二)";
        else if ("Wednesday".equals(dateStringTemp))
            dateStringTemp = " (周三)";
        else if ("Thursday".equals(dateStringTemp))
            dateStringTemp = " (周四)";
        else if ("Friday".equals(dateStringTemp))
            dateStringTemp = " (周五)";
        else if ("Saturday".equals(dateStringTemp))
            dateStringTemp = " (周六)";
        else if ("Sunday".equals(dateStringTemp))
            dateStringTemp = " (周天)";
        dateString = dateString+dateStringTemp;
        return dateString;
    }

    /**
     * 获取yikikata
     * @return
     */
    public String getYikikata(){
        return UUID.randomUUID().toString().substring(0, 8)+ "-" +UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 关键点：
     *      1.第二次请求加上第一次返回的cookie
     *      2.第二次请求url中加上第一次返回的Location （有时不加也行）
     */
    @Test
    public ShcpeMarketOverviewEntity getShcpeMarketOverview() {
        //RestTemplate restTemplate = new RestTemplate();
        ShcpeMarketOverviewEntity shcpeMarketOverviewEntity = null;
        try{
            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json;charset=UTF-8");
            headers.set("Cookie", "yikikata="+getYikikata()+"; _pk_ses.1.9730=1; _pk_id.1.9730=cf68e46fbddd305d.1605927010.12.1607074889.1607073172.");
            headers.set("Host", "www.shcpe.com.cn");
            headers.set("Origin", "http://www.shcpe.com.cn");
            headers.set("Referer", "http://www.shcpe.com.cn/content/shcpe/market/market.html");
            headers.set("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36");

            Map<String, Object> param = new HashMap<>();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String date = formatter.format(new Date());
            param.put("requestNo", System.currentTimeMillis());
            param.put("requestSystem", "shcpe-cos");
            param.put("requestTime", date);
            param.put("staticsTime", date);

            HttpEntity<Map<String,Object>> httpEntity = new HttpEntity<>(param,headers);
            String url = "http://www.shcpe.com.cn/shcpe-cos/overview/detail";
            ResponseEntity<String> response = restTemplate.postForEntity(url, httpEntity, String.class);
            System.out.println("第一次获取数据 : "+ response.getBody());

            if(response.getHeaders().get("Location") != null){
                String cookieBack = response.getHeaders().get("Set-Cookie").get(0);
                System.out.println("cookieBack : "+ cookieBack);//放在第二次请求的cookie中
                System.out.println("Location : "+ response.getHeaders().get("Location"));//放在第二次请求的url中
                headers.set("Cookie", cookieBack+"; _pk_ses.1.9730=1; _pk_id.1.9730=cf68e46fbddd305d.1605927010.12.1607074889.1607073172.");
                httpEntity = new HttpEntity<>(param,headers);
                String newUrl = "http://www.shcpe.com.cn"+response.getHeaders().get("Location").get(0).replaceAll("\\[","");
                System.out.println("newUrl:"+newUrl);
                String result = restTemplate.postForObject(newUrl, httpEntity, String.class);
                JSONObject data = new JSONObject();
                if(null != result){
                    JSONObject resultJson = JSONObject.parseObject(result).getJSONObject("data");
                    data.putAll(resultJson.getJSONObject("marketOverviewHead"));
                    data.putAll(resultJson.getJSONObject("marketOverviewDay"));
                    data.putAll(resultJson.getJSONObject("marketOverviewYear"));
                    data.put("stsDate",changeWeek(data.get("stsDate").toString()));
                    data.put("yearDiscountAmount",data.get("yerDiscountAmount").toString());
                    shcpeMarketOverviewEntity =
                            JSONObject.parseObject(data.toJSONString(),ShcpeMarketOverviewEntity.class);
                    log.info("shcpeMarketOverviewEntity:"+shcpeMarketOverviewEntity.toString());
                }
            }
        }catch (Exception e){
            log.error("GET_TEST error",e);
        }
        return shcpeMarketOverviewEntity;
    }

}
