package com.sromku.simple.fb.listeners;

/**
 * On permission listener - If the App must request a specific permission (only
 * to obtain the new Access Token)
 * 
 * @author Gryzor
 * 
 */
public interface OnPermissionListener extends OnActionListener {
    /**
     * If the permission was granted, this callback is invoked.
     */
    void onSuccess(final String accessToken);

    /**
     * If user pressed 'cancel' in PUBLISH permissions dialog
     */
    void onNotAcceptingPermissions();
}