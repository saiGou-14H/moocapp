package com.org.moocapp.entity.Response;

import com.google.gson.annotations.SerializedName;
import com.org.moocapp.entity.LearnProgressEntity;

import java.io.Serializable;

public class LearnProgressResponse implements Serializable {


    @SerializedName("code")
    public int code;
    @SerializedName("message")
    public String message;
    @SerializedName("data")
    public LearnProgressEntity data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LearnProgressEntity getData() {
        return data;
    }

    public void setData(LearnProgressEntity data) {
        this.data = data;
    }
}
