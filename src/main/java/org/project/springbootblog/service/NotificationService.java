package org.project.springbootblog.service;

public interface NotificationService {

    void addInfoMessage(String msg);

    void addErrorMessage(String msg);
}
