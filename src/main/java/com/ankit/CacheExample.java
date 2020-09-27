package com.ankit;

import io.quarkus.cache.CacheResult;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CacheExample {
    /*
    * Following https://quarkus.io/guides/cache guide.
    * */

    @CacheResult(cacheName = "example-cache") // WOW!
    public String myExampleMethod(String param1, Integer param2) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Response from myExampleMethod = " + param1 + " : " + param2 + ".";
    }



}
