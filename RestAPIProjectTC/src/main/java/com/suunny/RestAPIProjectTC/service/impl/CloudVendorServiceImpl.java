package com.suunny.RestAPIProjectTC.service.impl;

import com.suunny.RestAPIProjectTC.Model.CloudVendor;
import com.suunny.RestAPIProjectTC.Repository.CloudVendorRepository;
import com.suunny.RestAPIProjectTC.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CloudVendorServiceImpl implements CloudVendorService {


    //Business Logic is written inside the Service Package
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Successfully Created!";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Successfully Updated!";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Successfully Deleted";
    }
}
