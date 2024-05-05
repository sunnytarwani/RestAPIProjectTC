package com.suunny.RestAPIProjectTC.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cloudvendor")
public class CloudVendor {

    @Id
    @Column(name = "vendor_id")
    private String vendorId;

    @Column(name = "vendor_name")
    private String vendorName;

    @Column(name = "vendor_address")
    private String vendorAddress;

    @Column(name = "vendor_number")
    private String vendorNumber;



    public CloudVendor() {
    }

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorNumber = vendorNumber;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorNumber() {
        return vendorNumber;
    }

    public void setVendorNumber(String vendorNumber) {
        this.vendorNumber = vendorNumber;
    }
}
