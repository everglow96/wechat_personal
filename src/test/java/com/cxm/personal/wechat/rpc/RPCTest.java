package com.cxm.personal.wechat.rpc;

import com.alibaba.fastjson.JSONObject;
import com.cxm.personal.wechat.WechatApplicationTests;
import com.cxm.personal.wechat.rpc.res.BaseResponse;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author cxm
 * @description
 * @date 2019-11-08 14:55
 **/
public class RPCTest extends WechatApplicationTests {

    @Resource
    TuLingRPC tuLingRPC;


    @Test
    public void test() {
        BaseResponse hello = tuLingRPC.chatWithRoot("每天可以请求几次");
        System.out.println(hello.toString());

    }

}
