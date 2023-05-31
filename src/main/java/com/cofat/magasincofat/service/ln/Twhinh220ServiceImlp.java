package com.cofat.magasincofat.service.ln;


import com.cofat.magasincofat.entity.ln.*;
import com.cofat.magasincofat.entity.scantech.*;
import com.cofat.magasincofat.repository.ln.*;
import com.cofat.magasincofat.repository.scantech.*;
import com.cofat.magasincofat.service.ln.*;
import com.cofat.magasincofat.service.scantech.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


@Service
public class Twhinh220ServiceImlp implements ITwhinh220Service{
    @Autowired
    Twhinh220Repository twhinh220Repository;
    @Autowired
    wmsProductsRepository productsRepository;
    @Autowired
    IdListJourRepository listJourRepository;
  //DboWmsAccountServiceImpl dboWmsAccountService;

    private final LocalDate localDate = LocalDate.now();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    private final DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private final DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private final LocalDate date = LocalDate.of(2023, 3, 21);
    private String formattedDate = localDate.format(formatter);
    private String year = formattedDate.substring(0, 4);
    private String extractedDate = formattedDate.replaceAll("/", "");
    private String dateStr = localDate.format(formatter1);
    private LocalDate dte = LocalDate.parse(dateStr, formatter1);


    @Override
    public void addTwhinh220120(Twhinh220120 twhinh220120) {
        twhinh220Repository.save(twhinh220120);
    }

    @Override
    public List<Twhinh220120> getAllTwhinh220120() {
        return twhinh220Repository.findAll();
    }
    public Boolean existeTwhinh220120(Twhinh220120 t){
        if (t.equals(twhinh220Repository.findByTOrnoAndTPono(t.getTOrno(), t.getTPono())))
        { return true; }
        else
        { return false; }
    }
      private Integer fonctionOset(String s){
        if (s.substring(0, 4).equals(this.year)){
            return 1 ;
        }
        else {
            return 2 ;
        }
    }
    private String fonctionCwar(String s){
        if (s.substring(0, 4).equals(this.year)){
            return "10" ;
        }
        else {
            return "09" ;
        }
    }
    private String fonctionTRefe(String s){
        Integer nbrEspace= 30 - s.length();
        StringBuilder sBuilder = new StringBuilder(s);
        for (int i = 0; i < nbrEspace; i++) {
            sBuilder.append(" ");
        }
        s = sBuilder.toString();
        return s;
    }
    private String fonctionTItem(String s) {
        Integer nbrEspace= 47 - s.length();
        StringBuilder sBuilder = new StringBuilder(s);
        for (int i = 0; i < nbrEspace; i++) {
            sBuilder.append(" ");
        }
        s = sBuilder.toString();
        return s;
    }
    private Twhinh220120 creation220(wmsMovementsEntity m, Integer i){
        Twhinh220120 t = new Twhinh220120();
        t.setTOorg(51);
        t.setTOrno(this.extractedDate);
        //Twhinh220120 tLast=twhinh220Repository.getLastTwhinh220120(t.getTOrno());
               /* if (tLast.getTOrno()== t.getTOrno()){
                    t.setTPono(tLast.getTPono()+1);
                }else {*/
        t.setTPono(i);
        //}
        t.setTSeqn(1);
        t.setTOset(fonctionOset(m.getPalletBarcode()));
        t.setTCwar(fonctionCwar(m.getPalletBarcode()));
        t.setTComp(120);
        t.setTAcvt(1);
        String tItem = "         " + productsRepository.findById(m.getProductId()).get().getCode();
        t.setTItem(fonctionTItem(tItem));
        t.setTSerl("    ");
        t.setTSsts(20);
        t.setTLsel(1);
        t.setTClot("    ");
        t.setTEffn(0);
        t.setTRevi("   ");
        t.setTPrio(2147483647);
        t.setTQoro(m.getInitialQuantity());
        // t.setTOrun(ttcibd001Repository.findTtcibd001120ByTItem(tItem).getTCuni());
        t.setTOrun("PS ");
        t.setTUbin(2);
        t.setTHstq(3);
        t.setTQord(m.getInitialQuantity());
        t.setTQadv(m.getInitialQuantity()); //fil sql 0
        t.setTQrel(m.getInitialQuantity()); // fil sql 0
        t.setTQpic(m.getInitialQuantity()); //fil sql 0
        t.setTQapr(m.getInitialQuantity());// fil sql 0
        t.setTQrej((float) 0);
        t.setTQnse((float) 0);
        t.setTQnsh((float) 0);
        t.setTQshp(m.getInitialQuantity()); // fil SQL 0
        t.setTQoor(m.getInitialQuantity());
        t.setTQova((float) 0);
        t.setTQovd((float) 0);
        t.setTQcnl((float) 0);
        t.setTPddt(this.dte); //LocalDate non dateTime jj/mm/aaaa
        t.setTPrdt(this.dte); //LocalDate non dateTime jj/mm/aaaa
        t.setTAddt(LocalDateTime.now());//#1/1/1970# AS t_addt
        t.setTInup(1);
        t.setTBflh(2);
        t.setTRush(2);
        t.setTCdck(2);
        t.setTQreq((float) 0);
        t.setTQcad((float) 0);
        t.setTQact((float) 0);
        t.setTShrt(2);
        t.setTBlck(2);
        t.setTCncl(2);
        t.setTBcko(2);
        t.setTPkdf("    ");
        t.setTIubw(2);
        t.setTGefo(2);
        t.setTFmor("    ");
        t.setTFmln(0);
        t.setTOvlp(2);
        t.setTUwop(2);
        t.setTOrpr((float) 0);
        t.setTOcur("    ");
        t.setTCsvl((float) 0);
        t.setTCsvc("TND");
        t.setTFprj("    ");
        t.setTFspa("    ");
        t.setTFact("    ");
        t.setTFstl("    ");
        t.setTFcco("    ");
        t.setTTprj("    ");
        t.setTTspa("    ");
        t.setTTact("    ");
        t.setTTstl("    ");
        t.setTTcco("    ");
        t.setTRefe(fonctionTRefe(m.getPalletBarcode()));
        t.setTCasi("   ");//sql
        t.setTWmss(100); //fil access 100 w fi sql mouch mawjoud
        t.setTLsta(30);//a disscuter 5ater fil fichier sql 5 w fil access 30
        t.setTTxtn(0);
        t.setTRefcntd(0);
        t.setTRefcntu(0);



        return t;
    }
    private Integer j=1;
    //List<Integer> k = new ArrayList<>();
    private List<IdListJour> k = new ArrayList<>();

      List<IdListJour> ke = new ArrayList<>();
      public void movementsToTwhinh220(List<wmsMovementsEntity> movementsList){
        Integer i=1;

          for (wmsMovementsEntity m : movementsList) {
              ke=listJourRepository.findAll();
              Twhinh220120 t = new Twhinh220120();
              IdListJour id= new IdListJour();
              id.setMovementId(m.getId());
              if (!ke.contains(id)){
                     if (twhinh220Repository.getLastTwhinh220120(this.extractedDate)==null){
                      t =creation220(m,i);
                      twhinh220Repository.save(t);
                      System.out.println("ligne 220 ajouté avec succée");
                      i++;
                      listJourRepository.save(id);
                  }
                  else{
                      i=twhinh220Repository.getLastTwhinh220120(this.extractedDate).getTPono()+1;
                      t =creation220(m,i);
                      twhinh220Repository.save(t);
                      System.out.println("ligne 220 ajouté avec succée");
                      i++;
                      listJourRepository.save(id);
                  }
              }
          }
        }
    }

