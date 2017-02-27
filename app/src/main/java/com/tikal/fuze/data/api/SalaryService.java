package com.tikal.fuze.data.api;

import com.tikal.fuze.model.Payload;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

public interface SalaryService {

    String ENDPOINT = "http://xxx/v1/";

    @POST("payload")
    Observable<Object> payload(@Body Payload payload);

}
