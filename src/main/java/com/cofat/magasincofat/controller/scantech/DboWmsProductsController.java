package com.cofat.magasincofat.controller.scantech;


import com.cofat.magasincofat.repository.scantech.wmsProductsRepository;
import com.cofat.magasincofat.service.scantech.wmsProductsServiceImpl;
import com.cofat.magasincofat.entity.scantech.wmsProductsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/products")
@CrossOrigin
public class DboWmsProductsController {
    @Autowired
    wmsProductsServiceImpl dboWmsProductsService;
    @Autowired
    wmsProductsRepository productsRepository;

    //http://localhost:8084/SpringMVC/products/add
    @PostMapping("/add/")
    @ResponseBody
    public void add(@RequestBody wmsProductsEntity dboWmsProductsEntity)
    {
        dboWmsProductsService.addDboWmsProducts(dboWmsProductsEntity);
    }

    //http://localhost:8084/SpringMVC/products/list
    @GetMapping("/list")
    @ResponseBody
    public List<wmsProductsEntity> get() {
      //  List<wmsProductsEntity> list = dboWmsProductsService.getAllWmsProductsEntity();
      List<wmsProductsEntity> list = productsRepository.findWmsProducts();
        return list;
    }

    //http://localhost:8084/SpringMVC/products/find/
 /*   @GetMapping("/find/{id}")
    @ResponseBody
    public Optional<wmsProductsEntity> getById(@PathVariable("id") Integer id)
    {
        return dboWmsProductsService.getWmsProductsEntityById(id);
    }
*/
    @GetMapping("/find/{id}")
    @ResponseBody
    public wmsProductsEntity getById(@PathVariable("id") Integer id)
    {
        return dboWmsProductsService.getWmsProductById(id);
    }

    //http://localhost:8084/SpringMVC/products/delete/id
    @DeleteMapping("/delete/{id}")

    public String delete(@PathVariable("id") Integer id) {
        dboWmsProductsService.deleteWmsProductsEntity(id);
        return "OK";
    }
}
