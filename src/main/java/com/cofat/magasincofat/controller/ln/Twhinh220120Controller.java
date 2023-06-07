package com.cofat.magasincofat.controller.ln;

import com.cofat.magasincofat.entity.ln.Twhinh220120;
import com.cofat.magasincofat.service.ln.Twhinh220ServiceImlp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/twhinh220120")
@CrossOrigin
public class Twhinh220120Controller {


        @Autowired
        Twhinh220ServiceImlp service;

        // http://localhost:8084/SpringMVC/twhinh220120/add
        @PostMapping("/add")
        @ResponseBody
        public void add(@RequestBody Twhinh220120 twhinh220120Entity) {
            service.addTwhinh220120(twhinh220120Entity);
        }
        // http://localhost:8084/SpringMVC/twhinh220120/list
        @GetMapping("/list")
        @ResponseBody
        public List<Twhinh220120> get() {
            List<Twhinh220120> list = service.getAllTwhinh220120();
            return list;
        }


/*
        //  http://localhost:8084/SpringMVC/twhinh220120/find/
        @GetMapping("/find/{id}")
        @ResponseBody
        public Twhinh220120Entity getById(@PathVariable("id") int id)
        {
            return service.getTwhinh220120EntityById(id);
        }

        // http://localhost:8084/SpringMVC/twhinh220120/delete/oorg
        @DeleteMapping("/delete/{oorg}")

        public String delete(@PathVariable("oorg") String oorg) {
            service.deleteTwhinh220120Entity(oorg);
            return "OK";
        } */
}
