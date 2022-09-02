package com.tinyurl.tinyurl.tinyurlservice;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TinyUrlService {

    Map<String, String> map = new HashMap<>();
    String baseUrl = "www.tinyurl.com/";
    public String retrieveShortUrl(String longUrl) {
        map.put(baseUrl+longUrl.hashCode(), longUrl);
        return baseUrl+longUrl.hashCode();
    }
    public String retrieveLongUrl(String shortUrl) {
        return map.get(shortUrl);
    }
}
