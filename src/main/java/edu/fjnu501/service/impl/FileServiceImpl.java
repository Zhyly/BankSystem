package edu.fjnu501.service.impl;

import edu.fjnu501.domain.Customer;
import edu.fjnu501.mapper.FileMapper;
import edu.fjnu501.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("fileService")
public class FileServiceImpl implements FileService {

    @Autowired
    private FileMapper fileMapper;

    @Override
    public void saveAvatarImgName(Customer customer) {
        fileMapper.saveAvatarImgName(customer);
    }

    @Override
    public String getUUID(int uid) {
        return fileMapper.getUUID(uid);
    }

}
