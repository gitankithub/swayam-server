package com.swayam.service;

import java.util.Map;
import java.util.Optional;

import com.swayam.entity.User;

 
/**
 * @author Chinna
 * @since 26/3/18
 */
public interface UserService {
 
    public User registerNewUser(SignUpRequest signUpRequest) throws UserAlreadyExistAuthenticationException;
 
    User findUserByEmail(String email);
 
    Optional<User> findUserById(Long id);
 
    LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo);
}
