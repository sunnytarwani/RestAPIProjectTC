package com.suunny.RestAPIProjectTC.service.impl;

import com.suunny.RestAPIProjectTC.Model.CloudVendor;
import com.suunny.RestAPIProjectTC.Repository.CloudVendorRepository;
import com.suunny.RestAPIProjectTC.service.CloudVendorService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;


class CloudVendorServiceImplTest {

    @Mock
    private CloudVendorRepository cloudVendorRepository;
    AutoCloseable autoCloseable;
    CloudVendor cloudVendor;

    @InjectMocks
    private CloudVendorService cloudVendorService;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        cloudVendorService = new CloudVendorServiceImpl(cloudVendorRepository);
        cloudVendor  = new CloudVendor("1" , "Amazon" , "USA" , "666666");
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void createCloudVendor() {
        mock(CloudVendor.class);
        mock(CloudVendorRepository.class);

        when(cloudVendorRepository.save(cloudVendor)).thenReturn(cloudVendor);

        assertThat(cloudVendorService.createCloudVendor(cloudVendor)).isEqualTo("Success");

    }

    @Test
    void updateCloudVendor() {
        mock(CloudVendor.class);
        mock(CloudVendorRepository.class);

        when(cloudVendorRepository.save(cloudVendor)).thenReturn(cloudVendor);

        assertThat(cloudVendorService.updateCloudVendor(cloudVendor)).isEqualTo("Success");

    }

    @Test
    void deleteCloudVendor() {
        mock(CloudVendor.class);
        mock(CloudVendorRepository.class , Mockito.CALLS_REAL_METHODS);

        doAnswer(Answers.CALLS_REAL_METHODS).when(cloudVendorService).deleteCloudVendor(any());

        assertThat(cloudVendorService.deleteCloudVendor("1")).isEqualTo("Success");

    }

}