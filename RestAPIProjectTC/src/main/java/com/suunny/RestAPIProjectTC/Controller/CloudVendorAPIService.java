package com.suunny.RestAPIProjectTC.Controller;


import com.suunny.RestAPIProjectTC.Model.CloudVendor;
import com.suunny.RestAPIProjectTC.Response.ResponseHandler;
import com.suunny.RestAPIProjectTC.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPIService {
    @Autowired
    CloudVendorService cloudVendorService;

    @GetMapping("/get/{vendorId}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String vendorId) throws ClassNotFoundException {
        return ResponseHandler.responseBuilder("Requested Vendor Deatils are given here" ,
                HttpStatus.OK ,cloudVendorService.getCloudVendor(vendorId));
    }

    //To get all the cloudVendors details present in DB
    @GetMapping("/all")
    public List<CloudVendor> getAllCloudVendorDetails(){
        return cloudVendorService.getAllCloudVendor();
    }


    @PostMapping("/post")
    public String addCloudVendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Added Successfully";
    }

    //to update the details in the DB
    @PutMapping("/put")
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("/delete/{vendorId}")
    public String putCloudVendor(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }
}
