package edu.fjnu501.service;

import edu.fjnu501.domain.Customer;

public interface FileService {

    void saveAvatarImgName(Customer customer);

    String getUUID(int uid);

}
