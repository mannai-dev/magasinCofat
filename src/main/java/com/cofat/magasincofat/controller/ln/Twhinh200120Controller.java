package com.cofat.magasincofat.controller.ln;

import com.cofat.magasincofat.entity.ln.Twhinh200120;
import com.cofat.magasincofat.repository.ln.Twhinh200Repository;
import com.cofat.magasincofat.service.ln.Twhinh200ServiceImpl;
import com.cofat.magasincofat.service.ln.Twhinh204ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/twhinh200120")
@CrossOrigin
public class Twhinh200120Controller {


    @Autowired
    Twhinh200ServiceImpl service;
    @Autowired
    Twhinh200ServiceImpl twhinh200Service;
    Twhinh204ServiceImpl twhinh204Service;
    @Autowired
    Twhinh200Repository repository;
    //http://localhost:8084/SpringMVC/twhinh200120/add
    @GetMapping("/add")
    @ResponseBody
    public void add(@RequestBody Twhinh200120 twhinh200120Entity) {
        service.addTwhinh200120(twhinh200120Entity);
    }
    //http://localhost:8086/SpringMVC/twhinh200120/next
    @GetMapping("/next")
    @ResponseBody
    public void add(){
        twhinh200Service.nextTwhinh200120();
    }
    //http://localhost:8086/SpringMVC/twhinh200120/next
  /*  @Transactional
    @GetMapping("/next")
    @ResponseBody
    public Twhinh200120Entity next() {
        return service.nextTwhinh200120();
    } */
    // http://localhost:8084/SpringMVC/twhinh200120/list
    @GetMapping("/list")
    @ResponseBody
    public List<Twhinh200120> get() {
        List<Twhinh200120> list = twhinh200Service.getAllTwhinh200120();
       // List<Twhinh200120Entity> list = service.getAllTwhinh200120Entity();
        return list;
    }



    //  http://localhost:8084/SpringMVC/twhinh200120/find/
   /* @GetMapping("/find/{id}")
    @ResponseBody
    public Twhinh200120 getById(@PathVariable("id") Integer id)
    {
        //return service.getTwhinh200120EntityById(id);
        return repository.findById(id);
    }

    // http://localhost:8084/SpringMVC/twhinh200120/delete/tOorg
   @DeleteMapping("/delete/{id}")

    public String delete(@PathVariable("id") Integer od) {
        service.deleteTwhinh200120Entity(tOorg);
        return "OK";
    }

    @Transactional
    @GetMapping("/getLast")
    @ResponseBody
    public Twhinh200120Entity getLast()
    {
        return repository.getLast();
    }
  */

}
