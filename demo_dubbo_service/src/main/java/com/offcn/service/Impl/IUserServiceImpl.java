package com.offcn.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.offcn.service.IUserService;

/*** All rights Reserved, Designed By www.info4z.club * <p>title:com.offcn.service.Impl</p> * <p>ClassName:IUserServiceImpl</p> * <p>Description:TODO(请用一句话描述这个类的作用)</p> * <p>Compony:Info4z</p> * author:poker_heart * date:2019/11/14 * version:1.0 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他的商业目 */
@Service
public class IUserServiceImpl implements IUserService {
    @Override
    public String getName() {
        return "Hello Dubbo";
    }
}
