package com.sromku.simple.fb.listeners;

import java.util.List;

import com.sromku.simple.fb.entities.Profile;

/**
 * On friends request listener
 * 
 * @author sromku
 * 
 */
public interface OnFriendsRequestListener extends OnActionListener {
    void onComplete(List<Profile> friends);
}
