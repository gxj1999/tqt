package com.soft.common.mybatis.extend.entity;

import com.soft.common.model.MLogin;
import com.soft.common.model.MUser;
import lombok.Data;

@Data
public class User extends MLogin {
    private static final long serialVersionUID = 1L;
    private MUser user;

    public MUser getUser() {
        return user;
    }

    public void setUser(MUser user) {
        this.user = user;
    }
}
