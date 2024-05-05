package com.suunny.RestAPIProjectTC.Controller;


import com.suunny.RestAPIProjectTC.Model.CloudVendor;
import com.suunny.RestAPIProjectTC.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPIService {

    CloudVendorService cloudVendorService;

    public CloudVendorAPIService(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }


    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
    }

    //To get all the cloudVendors details present in DB
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){
        return cloudVendorService.getAllCloudVendor();
    }



    @PostMapping
    public String addCloudVendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Added Successfully";
    }



    //to update the details in the DB
    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }


    @DeleteMapping("{vendorId}")
    public String putCloudVendor(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }
}
