package com.dandinglong.sall.config;

import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import java.io.IOException;

@Configuration
public class FeignClientErrorDecodeer implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        if (response.status() != HttpStatus.OK.value()) {
            String errorContent;
            try {
                errorContent = Util.toString(response.body().asReader());
                return new Exception(errorContent);
            } catch (IOException e) {
                return new Exception("unknown error");
            }
        }
        return new Exception("unknown error");
    }
}
