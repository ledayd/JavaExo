
package com.company;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Insurance {

    @SerializedName("file")
    @Expose
    private String file;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

}
