package com.cofat.magasincofat.controller.scantech;

import com.cofat.magasincofat.entity.scantech.DboWmsAccountEntity;
import com.cofat.magasincofat.service.scantech.DboWmsAccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/account")
@CrossOrigin
public class DboWmsAccountController {

    @Autowired
    DboWmsAccountServiceImpl dboWmsAccountService;



    // http://localhost:8084/SpringMVC/account/addaccount
    @PostMapping("/add")
    @ResponseBody
    public void addAccount(@RequestBody DboWmsAccountEntity dboWmsAccountEntity)
    {
        dboWmsAccountService.addDboWmsAccount(dboWmsAccountEntity);
    }

    // http://localhost:8084/SpringMVC/account/accounts
    @GetMapping("/accounts")
    @ResponseBody
    public List<DboWmsAccountEntity> getAccounts() {
        List<DboWmsAccountEntity> listAccounts = dboWmsAccountService.getAllDboWmsAccountEntity();
        return listAccounts;
    }
    /*

    //  http://localhost:8084/SpringMVC/account/find-account/
    @GetMapping("/find-account/{account-id}")
    @ResponseBody
    public Optional<DboWmsAccountEntity> getById(@PathVariable("account-id") Integer id)
    {
        return  dboWmsAccountService.getDboWmsAccountEntityById(id);
    }

    // http://localhost:8084/SpringMVC/account/delete/id
    @DeleteMapping("/delete/{id}")

    public String deleteUser(@PathVariable("id") Integer id) {
        dboWmsAccountService.deleteDboWmsAccountEntity(id);
        return "OK";
    }
  */

}
