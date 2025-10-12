package com.example.keycloakdemo.keycloak;

import com.example.keycloakdemo.dto.request.UserRequestDto;
import org.keycloak.admin.client.resource.UsersResource;
import org.keycloak.representations.idm.CredentialRepresentation;

public interface KeycloakService {
    void addUser(UserRequestDto dto);

    void addRealmRoleToUser(String userName, String roleName);

    UsersResource getUsersResource();

    CredentialRepresentation createPasswordCredentials(String password);
}
