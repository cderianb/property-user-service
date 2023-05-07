package org._99co.userservice.helpers;

import org._99co.userservice.models.Response;

public class ResponseHelper {
    public static<T> Response<T> ok(T data){
        return Response.<T>builder()
                .result(true)
                .data(data)
                .build();
    }
}
