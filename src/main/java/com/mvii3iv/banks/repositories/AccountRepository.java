package com.mvii3iv.banks.repositories;

import com.mvii3iv.banks.models.Account;
import org.springframework.data.repository.CrudRepository;


public interface AccountRepository extends CrudRepository<Account,Long>{

    public Account findById(int id);

}
