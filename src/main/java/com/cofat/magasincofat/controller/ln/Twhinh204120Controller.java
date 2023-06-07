package com.cofat.magasincofat.controller.ln;

import com.cofat.magasincofat.entity.ln.Twhinh204120;
import com.cofat.magasincofat.service.ln.Twhinh204ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/twhinh204120")
@CrossOrigin
public class Twhinh204120Controller {
    @Autowired
    Twhinh204ServiceImpl twhinh204Service;

    //http://localhost:8086/SpringMVC/twhinh204120/add
    @PostMapping("/add")
    @ResponseBody
    public void add(@RequestBody Twhinh204120 twhinh204120) {
        twhinh204Service.addTwhinh204120Manuel(twhinh204120);
        }
    // http://localhost:8086/SpringMVC/twhinh20412/list
    @GetMapping("/list")
    @ResponseBody
    public List<Twhinh204120> get() {
        //List<Twhinh204120Entity> list = service.getAllTwhinh204120Entity();
        List<Twhinh204120> list = twhinh204Service.getAllTwhinh204120();
        return list;
    }

/*

    //  http://localhost:8086/SpringMVC/twhinh204120/find/
    @GetMapping("/find/{id}")
    @ResponseBody
    public Twhinh204120Entity getById(@PathVariable("id") Integer id)
    {
        return service.getTwhinh204120EntityById(id);
    }
//ok
    // http://localhost:8086/SpringMVC/twhinh204120/delete/oorg
    @DeleteMapping("/delete/{oorg}")

    public String delete(@PathVariable("oorg") String oorg) {
        service.deleteTwhinh204120Entity(oorg);
        return "OK";
    }
*/
    @GetMapping("/next")
    @ResponseBody
    public void next() {
          twhinh204Service.addTwhinh204120();
    }


}
