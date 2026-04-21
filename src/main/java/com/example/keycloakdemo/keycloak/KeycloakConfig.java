package com.example.keycloakdemo.keycloak;

import lombok.RequiredArgsConstructor;
import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class KeycloakConfig {

    private final KeycloakProperties props;

    @Bean
    public Keycloak keycloak() {

        return KeycloakBuilder.builder()
                .serverUrl(props.getServerUrl())
                .realm(props.getRealm())
                .grantType(OAuth2Constants.CLIENT_CREDENTIALS)
                .clientId(props.getClientId())
                .clientSecret(props.getClientSecret())
                .username(props.getUsername())
                .password(props.getPassword())
                .build();
    }
}
