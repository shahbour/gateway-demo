package com.teltacworldwide.gatewaydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.security.oauth2.gateway.TokenRelayGatewayFilterFactory;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
//import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
//import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class GatewayDemoApplication {

//    @Autowired
//    private TokenRelayGatewayFilterFactory filterFactory;

    public static void main(String[] args) {
        SpringApplication.run(GatewayDemoApplication.class, args);
    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("common", r -> r.path("/common/**")
//                        .filters(f -> f.stripPrefix(1).filter(filterFactory.apply()))
//                        .uri("http://10.100.135.181:8083"))
//                .build();
//    }

//    @GetMapping("/")
//    public String index(Model model,
//                        @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient authorizedClient,
//                        @AuthenticationPrincipal OAuth2User oauth2User) {
//        model.addAttribute("userName", oauth2User.getName());
//        model.addAttribute("clientName", authorizedClient.getClientRegistration().getClientName());
//        model.addAttribute("userAttributes", oauth2User.getAttributes());
//        return "index";
//    }

}

