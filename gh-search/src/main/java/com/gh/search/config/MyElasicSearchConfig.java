package com.gh.search.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.boot.SpringBootConfiguration;

/**
 * 1\导入配置
 * 2、配置
 */
@SpringBootConfiguration
public class MyElasicSearchConfig {

    public RestHighLevelClient esResrClient(){
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("172.16.5.123",9200,"http")
                )
        );
        return client;
    }
}
