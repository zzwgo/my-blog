package com.my.blog.website.dto;

/**
 * 日志表的action字段
 * Created by BlueT on 2017/3/4.
 */
public enum LogActions {

    LOGIN("Login System"), UP_PWD("Update Password"), UP_INFO("Modify Personal Information"),
    DEL_ARTICLE("Delete Article"), DEL_PAGE("Delete Page"), SYS_BACKUP("System Backup"),
    SYS_SETTING("Save System Settings"), INIT_SITE("Init System"),PUB_ARTICLE("Publish Articles"),UP_ARTICLE("Revise Articles");

    private String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    LogActions(String action) {
        this.action = action;
    }
}
