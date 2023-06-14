package com.cofat.magasincofat.controller.scantech;

import com.cofat.magasincofat.entity.scantech.wmsMovementsEntity;
import com.cofat.magasincofat.service.scantech.wmsMovementsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/movements")
@CrossOrigin
public class DboWmsMovementsController {

    @Autowired
    wmsMovementsServiceImpl dboWmsMovementsService;


    // http://localhost:8086/SpringMVC/movements/add
    @PostMapping("/add")
    @ResponseBody
    public void add(@RequestBody wmsMovementsEntity dboWmsMovementsEntity)
    {
        dboWmsMovementsService.addDboWmsMovements(dboWmsMovementsEntity);
    }

    // http://localhost:8086/SpringMVC/movements/list
    @GetMapping("/list")
    @ResponseBody
    public List<wmsMovementsEntity> get() {
        List<wmsMovementsEntity> list = dboWmsMovementsService.getAllWmsMovementsEntity();
        return list;
    }

    //  http://localhost:8086/SpringMVC/movements/find/
    @GetMapping("/find/{id}")
    @ResponseBody
    public Optional<wmsMovementsEntity> getById(@PathVariable("id") Integer id)
    {
        return dboWmsMovementsService.getWmsMovementsEntityById(id);
    }

    // http://localhost:8086/SpringMVC/movements/delete/id
    @DeleteMapping("/delete/{id}")

    public String delete(@PathVariable("id") Integer id) {
        dboWmsMovementsService.deleteDboWmsMovementsEntity(id);
        return "OK";
    }
}
