package com.neu.controller;


import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neu.check.CheckSumBuilder;


@Controller
public class FrontMobileCheckHandler {
	//发送验证码的请求路径URL
    private static final String
            SERVER_URL="https://api.netease.im/sms/sendcode.action";
    //网易云信分配的账号，请替换你在管理后台应用下申请的Appkey
    private static final String
            APP_KEY="18be889fdf1ba20e7b6b1cba9289387d";
    //网易云信分配的密钥，请替换你在管理后台应用下申请的appSecret
    private static final String APP_SECRET="9096ffc9c216";
    //随机数
    private static final String NONCE="123456";
    //短信模板ID
    private static final String TEMPLATEID="3943377";
    //手机号
    private static final String MOBILE="13888888888";
    //验证码长度，范围4～10，默认为4
    private static final String CODELEN="6";
	
	
	  
	  @RequestMapping(value = "/front/ajaxmobilecheck")	  
	  @ResponseBody
	  public void mobilecheck(HttpServletRequest request,HttpServletResponse response) throws Exception
	  {
		  String tel=request.getParameter("user_tel");
		  DefaultHttpClient httpClient = new DefaultHttpClient();
	        HttpPost httpPost = new HttpPost(SERVER_URL);
	        String curTime = String.valueOf((new Date()).getTime() / 1000L);
	        /*
	         * 参考计算CheckSum的java代码，在上述文档的参数列表中，有CheckSum的计算文档示例
	         */
	        String checkSum = CheckSumBuilder.getCheckSum(APP_SECRET, NONCE, curTime);

	        // 设置请求的header
	        httpPost.addHeader("AppKey", APP_KEY);
	        httpPost.addHeader("Nonce", NONCE);
	        httpPost.addHeader("CurTime", curTime);
	        httpPost.addHeader("CheckSum", checkSum);
	        httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");

	        // 设置请求的的参数，requestBody参数
	        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
	        /*
	         * 1.如果是模板短信，请注意参数mobile是有s的，详细参数配置请参考“发送模板短信文档”
	         * 2.参数格式是jsonArray的格式，例如 "['13888888888','13666666666']"
	         * 3.params是根据你模板里面有几个参数，那里面的参数也是jsonArray格式
	         */
	        nvps.add(new BasicNameValuePair("templateid", TEMPLATEID));
	        nvps.add(new BasicNameValuePair("mobile", tel));
	        nvps.add(new BasicNameValuePair("codeLen", CODELEN));

	        httpPost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));

	        // 执行请求
	        HttpResponse response1 = httpClient.execute(httpPost);
	        /*
	         * 1.打印执行结果，打印结果一般会200、315、403、404、413、414、500
	         * 2.具体的code有问题的可以参考官网的Code状态表
	         */
	        String str=EntityUtils.toString(response1.getEntity(), "utf-8");
	        System.out.println(str);

		    response.setContentType("text/plain");
		    PrintWriter out=response.getWriter();
		    out.write(str);
		    out.flush();
		    out.close();
     }
}
