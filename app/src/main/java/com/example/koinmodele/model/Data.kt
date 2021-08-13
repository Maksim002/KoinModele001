package com.example.testkoin.model

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose


class Data(
    @SerializedName("Data")
    @Expose
    var data: Map<String, Data>? = null,
    @SerializedName("country")
    @Expose
    var country: String? = null,
    @SerializedName("region")
    @Expose
    var region: String? = null
)