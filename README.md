# 说明

本Demo旨在提供移动App接入翼道登录的代码范例

# 准备工作

* 翼道OpenIDConnectSDK

SDK 默认不对外开放，请联系翼道相关负责人员进行索取 biz#edaotech.com

* 翼道登录图标

默认可以自行设置，如果需要额外的定制，请联系 biz#edaotech.com

* App接入许可信息

请访问 http://www.edaotech.com/sqrk 获取更详细信息

* Android 开发测试环境

Java JDK 1.6+
Eclipse + ADT
Android 手机一台

# 集成步骤

* 环境准备

按照上面罗列的准备工作，准备好集成所需要的准备信息

* 接入信息配置

参照 `CustomizeConfig.java` 文件，重写个人应用的鉴权信息

```
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
```
* 服务端支持

翼道会提供翼道认证的OpenID, 此OpenID需要和原有的系统账号进行关联，因此，需要App服务端对绑定校验开发相应的接口。

具体服务端的开发工作，请协调服务端的研发人员配合进行。

* 测试发布

集成测试没问题后，即可对外进行发布。

