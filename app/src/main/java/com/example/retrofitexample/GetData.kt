package com.example.retrofitexample

import io.reactivex.Observable
import retrofit2.http.GET

interface GetData {
    //Describe the request type and the relative URL//

    @GET("prices?key=6762349ef2147613c3942ac6d7f179c7")
    fun getData() : Observable<List<RetroCrypto>>
}