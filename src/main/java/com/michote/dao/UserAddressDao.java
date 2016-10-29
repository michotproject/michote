package com.michote.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michote.entity.UserAddress;

/**
 * Created by jtq603 on 10/16/16.
 */
@Repository
public interface UserAddressDao extends CrudRepository<UserAddress, Long> {

    /**
     * Return the user having the passed userAddressId or null if no userAddress is found.
     *
     * @param userAddressId the userAddress userAddressId.
     */
    public UserAddress findByUserAddressId(long userAddressId);

}
