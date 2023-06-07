package com.cofat.magasincofat.service.ln;


import com.cofat.magasincofat.entity.ln.*;
import com.cofat.magasincofat.entity.scantech.*;
import com.cofat.magasincofat.repository.ln.*;
import com.cofat.magasincofat.repository.scantech.*;
import com.cofat.magasincofat.service.ln.*;
import com.cofat.magasincofat.service.scantech.*;

import org.hibernate.exception.GenericJDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Twhinh204ServiceImpl implements ITwhinh204Service{
    @Autowired
    Twhinh204Repository twhinh204Repository;
        @Override
    public void addTwhinh204120() {
            try {
                twhinh204Repository.save(twhinh204120Ligne1());
                twhinh204Repository.save(twhinh204120Ligne2());
                twhinh204Repository.save(twhinh204120Ligne3());
                twhinh204Repository.save(twhinh204120Ligne4());
                twhinh204Repository.save(twhinh204120Ligne5());
                twhinh204Repository.save(twhinh204120Ligne6());
                twhinh204Repository.save(twhinh204120Ligne7());
                twhinh204Repository.save(twhinh204120Ligne8());
                twhinh204Repository.save(twhinh204120Ligne9());
                twhinh204Repository.save(twhinh204120Ligne10());
                System.out.println("twhinh204 ajouté avec succée");
            }
            catch (GenericJDBCException e) {
                System.out.println("add twhinh204 : " + e ) ;}

    }
    @Override
    public List<Twhinh204120> getAllTwhinh204120() {
        return twhinh204Repository.findAll();
    }
    private Twhinh204120 twhinh204120Ligne1(){
        Twhinh204120 tw = new Twhinh204120();
        tw.setTOorg(51);
        tw.setTOrno("0");
        tw.setTOset(1);
        tw.setTPrty(10);
        tw.setTAcno(3);
        tw.setTActi("whinh4415m000       ");
        tw.setTAppl(2);
        tw.setTAuto(2);
        tw.setTOdvc("               ");
        tw.setTRefcntd(0);
        tw.setTRefcntu(0);
        return tw;
    }
    private Twhinh204120 twhinh204120Ligne2(){
        Twhinh204120 tw = new Twhinh204120();
        tw.setTOorg(51);
        tw.setTOrno("0");
        tw.setTOset(1);
        tw.setTPrty(20);
        tw.setTAcno(4);
        tw.setTActi("whinh4476m000       ");
        tw.setTAppl(2);
        tw.setTAuto(2);
        tw.setTOdvc("               ");
        tw.setTRefcntd(0);
        tw.setTRefcntu(0);
        return tw;
    }
   private Twhinh204120 twhinh204120Ligne3(){
        Twhinh204120 tw = new Twhinh204120();
        tw.setTOorg(51);
        tw.setTOrno("0");
        tw.setTOset(1);
        tw.setTPrty(10);
        tw.setTAcno(2);
        tw.setTActi("whinh4202m000       ");
        tw.setTAppl(1);
        tw.setTAuto(1);
        tw.setTOdvc("               ");
        tw.setTRefcntd(0);
        tw.setTRefcntu(0);
        return tw;
    }
    private Twhinh204120 twhinh204120Ligne4(){
        Twhinh204120 tw = new Twhinh204120();
        tw.setTOorg(51);
        tw.setTOrno("0");
        tw.setTOset(1);
        tw.setTPrty(20);
        tw.setTAcno(5);
        tw.setTActi("whinh4477m000       ");
        tw.setTAppl(2);
        tw.setTAuto(2);
        tw.setTOdvc("               ");
        tw.setTRefcntd(0);
        tw.setTRefcntu(0);
        return tw;
    }
    private Twhinh204120 twhinh204120Ligne5(){
        Twhinh204120 tw = new Twhinh204120();
        tw.setTOorg(51);
        tw.setTOrno("0");
        tw.setTOset(1);
        tw.setTPrty(20);
        tw.setTAcno(1);
        tw.setTActi("whinh4275m000       ");
        tw.setTAppl(2);
        tw.setTAuto(2);
        tw.setTOdvc("               ");
        tw.setTRefcntd(0);
        tw.setTRefcntu(0);
        return tw;
    }
    private Twhinh204120 twhinh204120Ligne6(){
        Twhinh204120 tw = new Twhinh204120();
        tw.setTOorg(51);
        tw.setTOrno("0");
        tw.setTOset(1);
        tw.setTPrty(20);
        tw.setTAcno(3);
        tw.setTActi("whinh4475m000       ");
        tw.setTAppl(2);
        tw.setTAuto(2);
        tw.setTOdvc("               ");
        tw.setTRefcntd(0);
        tw.setTRefcntu(0);
        return tw;
    }
    private Twhinh204120 twhinh204120Ligne7(){
        Twhinh204120 tw = new Twhinh204120();
        tw.setTOorg(51);
        tw.setTOrno("0");
        tw.setTOset(1);
        tw.setTPrty(10);
        tw.setTAcno(4);
        tw.setTActi("whinh4525m100       ");
        tw.setTAppl(2);
        tw.setTAuto(2);
        tw.setTOdvc("               ");
        tw.setTRefcntd(0);
        tw.setTRefcntu(0);
        return tw;
    }
    private Twhinh204120 twhinh204120Ligne8(){
        Twhinh204120 tw = new Twhinh204120();
        tw.setTOorg(51);
        tw.setTOrno("0");
        tw.setTOset(1);
        tw.setTPrty(10);
        tw.setTAcno(5);
        tw.setTActi("whinh3122m000       ");
        tw.setTAppl(2);
        tw.setTAuto(2);
        tw.setTOdvc("               ");
        tw.setTRefcntd(0);
        tw.setTRefcntu(0);
        return tw;
    }
    private Twhinh204120 twhinh204120Ligne9(){
        Twhinh204120 tw = new Twhinh204120();
        tw.setTOorg(51);
        tw.setTOrno("0");
        tw.setTOset(1);
        tw.setTPrty(10);
        tw.setTAcno(1);
        tw.setTActi("whinh4201m000       ");
        tw.setTAppl(1);
        tw.setTAuto(1);
        tw.setTOdvc("               ");
        tw.setTRefcntd(0);
        tw.setTRefcntu(0);
        return tw;
    }
    private Twhinh204120 twhinh204120Ligne10(){
        Twhinh204120 tw = new Twhinh204120();
        tw.setTOorg(51);
        tw.setTOrno("0");
        tw.setTOset(1);
        tw.setTPrty(20);
        tw.setTAcno(2);
        tw.setTActi("whinh4470m000       ");
        tw.setTAppl(2);
        tw.setTAuto(2);
        tw.setTOdvc("               ");
        tw.setTRefcntd(0);
        tw.setTRefcntu(0);
        return tw;
    }

    public void addTwhinh204120Manuel(Twhinh204120 twhinh204120) {
            twhinh204Repository.save(twhinh204120);
    }
}
