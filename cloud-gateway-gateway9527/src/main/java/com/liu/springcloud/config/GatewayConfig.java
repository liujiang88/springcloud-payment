package com.liu.springcloud.config;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Author 刘江
 * @create 2020/12/29 15:44
 */
@Configuration
public class GatewayConfig {
 @Bean
    public RouteLocator customRouteLocatior(RouteLocatorBuilder routeLocatorBuilder){
     RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
     routes.route("path_route",r->r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
     return routes.build();
 }
 @Bean
 public GlobalFilter customFilter() {
  return new CustomGlobalFilter();
 }

 public class CustomGlobalFilter implements GlobalFilter, Ordered {

  @Override
  public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
   String name = exchange.getRequest().getQueryParams().getFirst("name");
   if (name==null){
    exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
    return exchange.getResponse().setComplete();
   }
   return chain.filter(exchange);
  }

  @Override
  public int getOrder() {
   return -1;
  }
 }
}
