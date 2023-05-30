package com.utils.commonutils

import com.google.gson.Gson

class JsonToClass {

    fun parseJsonToModel(id: Int, content: String,classOfT:Class<*>): Any {
        val gson = Gson()
        return gson.fromJson(content, classOfT)
    }


}