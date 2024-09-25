package com.sb.api_gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.Set;
@Component
public class RequestFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("Request reached....");
        ServerHttpRequest request = exchange.getRequest();
        HttpHeaders headers = request.getHeaders();
        Set<Map.Entry<String, List<String>>> entries = headers.entrySet();
        Set<String> keys = headers.keySet();
        if(!keys.contains("secret")){
            throw new RuntimeException("Invalid Request!");
        }
        List<String> secretList = headers.get("secret");
        if(!secretList.get(0).equals("Babul@890")){
            throw new RuntimeException("Secret is not correct... Try Again!");
        }
        entries.stream().forEach(e -> System.out.println(e.getKey() + ", "+e.getValue()));
        return chain.filter(exchange);
    }
}
