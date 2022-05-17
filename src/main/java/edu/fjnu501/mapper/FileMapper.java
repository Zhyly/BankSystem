package edu.fjnu501.mapper;

import edu.fjnu501.domain.Customer;

public interface FileMapper {

    void saveAvatarImgName(Customer customer);

    String getUUID(int uid);

}
