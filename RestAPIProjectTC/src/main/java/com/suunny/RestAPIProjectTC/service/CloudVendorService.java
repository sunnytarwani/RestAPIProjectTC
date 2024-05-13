package com.suunny.RestAPIProjectTC.service;

import com.suunny.RestAPIProjectTC.Model.CloudVendor;

import java.util.List;

public interface CloudVendorService {

    public CloudVendor getCloudVendor(String cloudVendorId) throws ClassNotFoundException;
    public List<CloudVendor> getAllCloudVendor();
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
}
