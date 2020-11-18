package com.ghac.myspilder.myspilder3.util;

import com.sasa.push.*;
import feign.Headers;
import feign.RequestLine;

/**
 * 访问c++接口
 *
 * @author Z
 * @date 2019/1/2
 */
public interface HttpUtil {


    @RequestLine("POST /notice/paying")
    @Headers("Content-Type: application/json")
    String paying(Paying paying);

    @RequestLine("POST /notice/payStatus")
    @Headers("Content-Type: application/json")
    String payStatus(PayStatus payStatus);

    @RequestLine("POST /notice/walletBalance")
    @Headers("Content-Type: application/json")
    String walletBalance(WalletBalance walletBalance);


    @RequestLine("POST /notice/pushMsg")
    @Headers("Content-Type: application/json")
    String pushMsg(PushMsg pushMsg);

    @RequestLine("POST /notice/pushNotice")
    @Headers("Content-Type: application/json")
    String push(Push push);
}
