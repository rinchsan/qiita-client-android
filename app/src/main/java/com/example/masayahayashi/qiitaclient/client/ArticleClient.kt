package com.example.masayahayashi.qiitaclient.client

import com.example.masayahayashi.qiitaclient.model.Article
import retrofit2.http.GET
import retrofit2.http.Query
import io.reactivex.Observable

/**
 * Created by masayahayashi on 2017/11/06.
 */

interface ArticleClient {

    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}
