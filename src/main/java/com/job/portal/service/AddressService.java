package com.job.portal.service;

import com.job.portal.entity.Address;
import com.job.portal.reporsitory.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address getAddress(long id) {
        Optional<Address> address = addressRepository.findById(id);
        return address.orElse(null);
    }

    public List<Address> getAllAddresses() {
        Iterable<Address> iterableAddresses = addressRepository.findAll();
        List<Address> addresses = new ArrayList<>();

        for (Address address: iterableAddresses) {
            addresses.add(address);
        }

        return addresses;
    }

    public Address updateAddress(Address address) {
        return addressRepository.save(address);
    }

    public void deleteAddress(long id) {
        addressRepository.deleteById(id);
    }
}
