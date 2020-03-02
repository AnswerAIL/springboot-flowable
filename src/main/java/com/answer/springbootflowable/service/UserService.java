package com.answer.springbootflowable.service;

import org.flowable.idm.api.*;

import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author L.Answer
 * @version 1.0
 * @date 2020-03-02
 */
public class UserService implements IdmIdentityService {
    @Override
    public User newUser(String userId) {
        return null;
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUserPassword(User user) {

    }

    @Override
    public UserQuery createUserQuery() {
        return null;
    }

    @Override
    public NativeUserQuery createNativeUserQuery() {
        return null;
    }

    @Override
    public void deleteUser(String userId) {

    }

    @Override
    public Group newGroup(String groupId) {
        return null;
    }

    @Override
    public GroupQuery createGroupQuery() {
        return null;
    }

    @Override
    public NativeGroupQuery createNativeGroupQuery() {
        return null;
    }

    @Override
    public void saveGroup(Group group) {

    }

    @Override
    public void deleteGroup(String groupId) {

    }

    @Override
    public void createMembership(String userId, String groupId) {

    }

    @Override
    public void deleteMembership(String userId, String groupId) {

    }

    @Override
    public boolean checkPassword(String userId, String password) {
        return false;
    }

    @Override
    public void setAuthenticatedUserId(String authenticatedUserId) {

    }

    @Override
    public void setUserPicture(String userId, Picture picture) {

    }

    @Override
    public Picture getUserPicture(String userId) {
        return null;
    }

    @Override
    public Token newToken(String id) {
        return null;
    }

    @Override
    public void saveToken(Token token) {

    }

    @Override
    public void deleteToken(String tokenId) {

    }

    @Override
    public TokenQuery createTokenQuery() {
        return null;
    }

    @Override
    public NativeTokenQuery createNativeTokenQuery() {
        return null;
    }

    @Override
    public void setUserInfo(String userId, String key, String value) {

    }

    @Override
    public String getUserInfo(String userId, String key) {
        return null;
    }

    @Override
    public List<String> getUserInfoKeys(String userId) {
        return null;
    }

    @Override
    public void deleteUserInfo(String userId, String key) {

    }

    @Override
    public Privilege createPrivilege(String privilegeName) {
        return null;
    }

    @Override
    public void addUserPrivilegeMapping(String privilegeId, String userId) {

    }

    @Override
    public void deleteUserPrivilegeMapping(String privilegeId, String userId) {

    }

    @Override
    public void addGroupPrivilegeMapping(String privilegeId, String groupId) {

    }

    @Override
    public void deleteGroupPrivilegeMapping(String privilegeId, String groupId) {

    }

    @Override
    public List<PrivilegeMapping> getPrivilegeMappingsByPrivilegeId(String privilegeId) {
        return null;
    }

    @Override
    public void deletePrivilege(String privilegeId) {

    }

    @Override
    public List<User> getUsersWithPrivilege(String privilegeId) {
        return null;
    }

    @Override
    public List<Group> getGroupsWithPrivilege(String privilegeId) {
        return null;
    }

    @Override
    public PrivilegeQuery createPrivilegeQuery() {
        return null;
    }
}