package com.lgq.lewa.fruitfarmer_model.BmobBeans;

import cn.bmob.v3.BmobUser;

/**
 * Created by lewa on 16-1-11.
 */
public class User extends BmobUser {
    private Boolean sex;
    private String nick;

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }


}
