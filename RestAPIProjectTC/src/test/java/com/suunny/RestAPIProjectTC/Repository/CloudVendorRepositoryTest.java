package com.suunny.RestAPIProjectTC.Repository;

import com.suunny.RestAPIProjectTC.Model.CloudVendor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@DataJpaTest
public class CloudVendorRepositoryTest {

    @Autowired
    private CloudVendorRepository cloudVendorRepository;
    CloudVendor cloudVendor;

    @BeforeEach
    void setUp(){
        cloudVendor = new CloudVendor("1" , "Amazon" , "USA" , "00000");
        cloudVendorRepository.save(cloudVendor);
    }

    @AfterEach
    void afterSetUp(){
        cloudVendor = null;
        cloudVendorRepository.deleteAll();
    }


    //test case for success
    @Test
    void testFindByVendorName(){
        List<CloudVendor> cloudVendorList = cloudVendorRepository.findByVendorName("Amazon");

        assertThat(cloudVendorList.get(0).getVendorId())
                .isEqualTo(cloudVendor.getVendorId());
        assertThat(cloudVendorList.get(0).getVendorAddress())
                .isEqualTo(cloudVendor.getVendorAddress());
    }

    //test case for failure
    @Test
    void testFindByVendorNameFailureCase(){
        List<CloudVendor> cloudVendorList = cloudVendorRepository.findByVendorName("Google");

        assertThat(cloudVendorList.isEmpty())
                .isTrue();
    }
}
