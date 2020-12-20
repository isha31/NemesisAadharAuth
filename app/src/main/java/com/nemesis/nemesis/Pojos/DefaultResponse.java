package com.nemesis.nemesis.Pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DefaultResponse {

    @SerializedName("statuscode")
    @Expose
    private int statuscode;

    public int getStatuscode() {
        return statuscode;
    }
}
