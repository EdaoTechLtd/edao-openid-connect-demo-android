package com.edao.oid.demo.config;

import com.edao.oid.connect.EdaoOIDConfig;

/**
 * 用户重写的配置
 * Created by quanken on 2014/9/30.
 */
public class CustomizeConfig extends EdaoOIDConfig{
    @Override
    public String getClientName() {
        return "EdaoStd";
    }

    @Override
    public String getCallbackUrl() {
        // 测试使用，没有对回调地址进行设置，实际接入，需要对回调地址进行匹配
        return "http://localhost/callback";
    }

    @Override
    public String getCredentials() {
        // 用户凭证
        String pubStr = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCANELcdE0uzTQ431SkuyN4RCQ0z0TCecSUh" +
                "XQ0sOy9FITTnlzUs8Uja8K0dKp3Exxfegxf5USDtn1RA/22hMwYJ+3ovxHw5jxaQ0Vp8dXBTh08bCFXhv" +
                "yHfjDC/8B4KAGkSkCyR3f4meFXQefa2GWTxqnf8LMJCnZTrGIFkwaB/wIDAQAB";
        return pubStr;
    }
}
