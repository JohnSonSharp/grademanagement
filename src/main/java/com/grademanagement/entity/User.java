package com.grademanagement.entity;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {
    private long id;
    private String userNo;
    private String userName;
    private String password;
    private String userSex;
    private boolean isDelete;
    private String createTime;
    private String updateTime;

    public String getUserNo(){
        if("".equals(userNo)||userNo==null){
            return "0";
        }
        return userNo;
    }
    public void setUserNo(String userNo){
        this.userNo=userNo==null?null:userNo.trim();
    }

    public String getUserName(){
        if("".equals(userName)||userName==null){
            return "";
        }
        return userName;
    }
    public void setUserName(String userName){
        this.userName=userName==null?null:userName.trim();
    }

    public String getPassword(){
        if("".equals(password)||password==null){
            return "";
        }
        return password;
    }
    public void setPassword(String password){
        this.password=password==null?null:password.trim();
    }

    public String getUserSex(){
        if("".equals(userSex)||userSex==null){
            return "";
        }
        return userSex;
    }
    public void setUserSex(String userSex){
        this.userSex=userSex==null?null:userSex.trim();
    }

    public void setDelete(boolean isDelete){
        this.isDelete=isDelete;
    }

    public String getCreateTime(){
        if("".equals(createTime)||createTime==null){
            return "";
        }
        return createTime;
    }
    public void setCreateTime(String createTime){
        if("".equals(createTime)||createTime==null){
            LocalDateTime datetime=LocalDateTime.now();
            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-DD HH:MM:SS");
            this.createTime=datetime.format(formatter);
        }
        else{
            this.createTime=createTime;
        }
    }
    public void setUpdateTime(String updateTime){
        if("".equals(updateTime)||updateTime==null){
            LocalDateTime datetime=LocalDateTime.now();
            DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-DD HH:MM:SS");
            this.updateTime=datetime.format(formatter);
        }
        else{
            this.updateTime=updateTime;
        }
    }
}
