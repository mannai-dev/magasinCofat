package com.cofat.magasincofat.ln.services;

import com.cofat.magasincofat.ln.entities.Twhinh200120;
import com.cofat.magasincofat.ln.repository.*;
import com.cofat.magasincofat.scantech.repository.*;
import com.cofat.magasincofat.ln.services.*;
import com.cofat.magasincofat.scantech.services.*;
import com.cofat.magasincofat.scantech.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

//@Configuration
@EnableScheduling
@Service
public class Twhinh200ServiceImpl implements ITwhinh200Service{
    @Autowired
    Twhinh200Repository twhinh200Repository;
    @Autowired
    Twhinh204ServiceImpl twhinh204Service;
    @Autowired
    Twhinh220ServiceImlp twhinh220Service;
    @Autowired
    Twhinh220Repository twhinh220Repository;
    @Autowired
    wmsMovementsServiceImpl movementsService;
    @Autowired
    wmsMovementsRepository movementsRepository;
    @Autowired
    Ttcibd001Repository ttcibd001Repository;
    @Autowired
    wmsProductsRepository productsRepository;

    private  LocalDate localDate = LocalDate.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    private DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private  LocalDate date = LocalDate.of(2023, 3, 21);


    private String formattedDate = localDate.format(formatter);
    //private String formattedDate2 = localDate.format(formatter2);
    String formattedDate2 = date.format(formatter2);
    private String year = formattedDate.substring(0, 4);
    private String extractedDate = formattedDate.replaceAll("/", "");

    //private LocalDateTime dte = LocalDateTime.parse(localDate.format(formatter1));
    //private LocalDate localDate  ;

    private String dateStr = localDate.format(formatter1);
    // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy"); // Use the correct format pattern
    private LocalDate dte = LocalDate.parse(dateStr, formatter1);


    @Override
    public void addTwhinh200120(Twhinh200120 twhinh200120) {
        twhinh200Repository.save(twhinh200120);
    }

    @Override
    public void nextTwhinh200120() {
      //  try {
           // twhinh200Repository.save(magasin10());

            twhinh200Repository.save(magasin09());
            System.out.println("Magasin09");
            twhinh200Repository.save(magasin10());
            System.out.println("Magasin10");
       // }catch (GenericJDBCException e) {
        //    System.out.println("add twhinh204 : " + e ) ;}
    }

    @Override
    public List<Twhinh200120> getAllTwhinh200120() {
        return twhinh200Repository.findAll();
    }

    @Override
    public List<Twhinh200120> FindByTOrno(String d) {
        return null;
    }

    private Twhinh200120 magasin09(){
        Twhinh200120 tt = new Twhinh200120();

        tt.setTOorg(51);
        tt.setTOrno(this.formattedDate);
        tt.setTOset(2);
        tt.setTSeri(" ");
        tt.setTIttp(2);
        tt.setTOdat(this.dte);
        tt.setTSfty(1);
        tt.setTSfco("09       ");
        tt.setTStty(4);
        tt.setTStco("PROD     ");
        tt.setTSfcp(120);
        tt.setTStcp(120);
        tt.setTSfad("100000001");
        tt.setTStad("100000001");
        tt.setTSfit("                                               ");
        tt.setTStit("                                               ");
        tt.setTSfrv("      ");
        tt.setTStrv("      ");
        tt.setTSflo("CORRE     ");
        tt.setTStlo("          ");
        tt.setTOtyp("SMP");
        tt.setTDepc(120);
        tt.setTWdep("PROD  ");
        tt.setTBlor(2);
        tt.setTRtrn(2);
        tt.setTCons(2);
        tt.setTInvc(2);
        tt.setTBflh(2);
        tt.setTRrgd(2);
        tt.setTDmst(2);
        tt.setTCarr("   ");
        tt.setTCbin(2);
        tt.setTCrte("     ");
        tt.setTCdec("   ");
        tt.setTPtpa("         ");
        tt.setTMotv("      ");
        tt.setTDelc("      ");
        tt.setTServ("   ");
        tt.setTPddt(this.dte); //mazel 5edma jj/mm/aaaa
        tt.setTPrdt(this.dte); //mazel 5edma jj/mm/aaaa
        tt.setTMint(100);
        tt.setTMaxt(0);
        tt.setTMind(0);
        tt.setTMaxd(0);
        tt.setTClan("04 ");
        tt.setTGrid("         ");
        tt.setTSetn(0);
        tt.setTInfo("                              ");
        tt.setTRefe("                              ");
        tt.setTIsit(100);
        tt.setTRodr("         ");
        tt.setTAkit("               ");
        tt.setTCtdt(this.dte); //mazel 5edma jj/mm/aaaa
        tt.setTAdat(this.dte); //mazel 5edma jj/mm/aaaa
        tt.setTClgr("   ");
        tt.setTList("                                               ");
        tt.setTItem("                                               ");
        tt.setTQoro((float)0);
        tt.setTOrun("   ");
        tt.setTQord(0);
        tt.setTAsst(5);
        tt.setTTxta(0);
        tt.setTTxtb(0);
        tt.setTRefcntd(0);
        tt.setTRefcntu(0);
        tt.setTHsta(20);
        return tt;
    }

    private Twhinh200120 magasin10(){
        Twhinh200120 tt = new Twhinh200120();
       // LocalDateTime dte = LocalDateTime.now();//mazel 5edma aaaammjj
      /* LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("ddMMyyyy");
        String formattedDate = localDate.format(formatter);
        LocalDateTime dte = LocalDateTime.parse(localDate.format(formatter1));
*/
        tt.setTOorg(51);
        tt.setTOrno(this.formattedDate);//mazel 5edma aaaa/mm/jj
        tt.setTOset(1);
        tt.setTSeri(" ");
        tt.setTIttp(2);
        tt.setTOdat(this.dte);
        tt.setTSfty(1);
        tt.setTSfco("10       ");
        tt.setTStty(4);
        tt.setTStco("PROD     ");
        tt.setTSfcp(120);
        tt.setTStcp(120);
        tt.setTSfad("100000001");
        tt.setTStad("100000001");
        tt.setTSfit("                                               ");
        tt.setTStit("                                               ");
        tt.setTSfrv("      ");
        tt.setTStrv("      ");
        tt.setTSflo("0000      ");
        tt.setTStlo("          ");
        tt.setTOtyp("SMP");
        tt.setTDepc(120);
        tt.setTWdep("PROD  ");
        tt.setTBlor(2);
        tt.setTRtrn(2);
        tt.setTCons(2);
        tt.setTInvc(2);
        tt.setTBflh(2);
        tt.setTRrgd(2);
        tt.setTDmst(2);
        tt.setTCarr("   ");
        tt.setTCbin(2);
        tt.setTCrte("     ");
        tt.setTCdec("   ");
        tt.setTPtpa("         ");
        tt.setTMotv("      ");
        tt.setTDelc("      ");
        tt.setTServ("   ");
        tt.setTPddt(this.dte); //mazel 5edma jj/mm/aaaa
        tt.setTPrdt(this.dte); //mazel 5edma jj/mm/aaaa
        tt.setTMint(100);
        tt.setTMaxt(0);
        tt.setTMind(0);

        tt.setTMaxd(0);
        tt.setTClan("04 ");
        tt.setTGrid("         ");
        tt.setTSetn(0);
        tt.setTInfo("                              ");
        tt.setTRefe("                              ");
        tt.setTIsit(100);
        tt.setTRodr("         ");
        tt.setTAkit("               ");
        tt.setTCtdt(this.dte); //mazel 5edma jj/mm/aaaa
        tt.setTAdat(this.dte); //mazel 5edma jj/mm/aaaa
        tt.setTClgr("   ");
        tt.setTList("                                               ");
        tt.setTItem("                                               ");
        tt.setTQoro((float)0);
        tt.setTOrun("   ");
        tt.setTQord(0);
        tt.setTAsst(5);
        tt.setTTxta(0);
        tt.setTTxtb(0);
        tt.setTRefcntd(0);
        tt.setTRefcntu(0);
        tt.setTHsta(20);
        return tt;
    }



    //@Scheduled(cron = "0 0 8,16,23 * * ?") // 00:00-08:00-16:00
   // @Scheduled(cron = "0 59 7,15,23 * * *")
    @Scheduled(cron = "0 0/1 * * * ?")
    //@Scheduled(cron= "0 27 14,15,16 * * *")
    public void ajout220(){
        System.out.println("d5alna lil ajout220");
        System.out.println("this.dateStr : "+this.dateStr);
        System.out.println("this.extractedDate : "+this.extractedDate);
        System.out.println("this.dte : " + this.dte);
        System.out.println("this.year : "+this.year);
        System.out.println("this.formattedDate : "+this.formattedDate);
        System.out.println("this.formattedDate2 : "+ this.formattedDate2 );
        System.out.println("bech nchoufou movement fiha date lyoumw lé ?");
        if (movementsRepository.findAllByDate(this.formattedDate2)!=null){
            System.out.println("ey fiha date lyoum :) donc bech nchoufou inh200 fiha date lyoum w lé ?");
            if (twhinh200Repository.findByDate(this.formattedDate2)==null){
                System.out.println("inh 200 maihech date lyoum donc bech ne5dmou l'insertion li 200 w 204");
                nextTwhinh200120();
                System.out.println("Ligne Twhinh200 Ajouté avec succées :) ");
                twhinh204Service.addTwhinh204120();
                System.out.println("Ligne Twhinh204 Ajouté avec succées :) ");
            }
           // nextTwhinh200120();
            //twhinh204Service.addTwhinh204120();
            //twhinh220Service.movementTo220(movementsRepository.findAllByDate(this.formattedDate2));
            twhinh220Service.movementsToTwhinh220(movementsRepository.findAllByDate((this.formattedDate2)));
        }
    }


    @Scheduled(cron = "0 0/1 * * * ?")
    public void testCron(){
        System.out.println("test cron ");
    }

}
