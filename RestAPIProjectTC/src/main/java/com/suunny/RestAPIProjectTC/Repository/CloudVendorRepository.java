package com.suunny.RestAPIProjectTC.Repository;


import com.suunny.RestAPIProjectTC.Model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CloudVendorRepository extends JpaRepository<CloudVendor , String> {
    List<CloudVendor> findByVendorName(String vendorName);

}
