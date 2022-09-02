package com.tinyurl.tinyurl.tinyurlcontroller;

import com.tinyurl.tinyurl.tinyurlservice.TinyUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TinyUrlController {
    @Autowired
    private TinyUrlService tinyUrlService;

    @RequestMapping(value="/shorturl", method = RequestMethod.GET)
    public String retrieviShortUrl(@RequestParam("longurl") String longUrl){
        return tinyUrlService.retrieveShortUrl(longUrl);
    }
    @RequestMapping(value="/longurl", method = RequestMethod.GET)
    public String retrieviLongUrl(@RequestParam("shorturl") String shortUrl){
        return tinyUrlService.retrieveLongUrl(shortUrl);
    }
}
