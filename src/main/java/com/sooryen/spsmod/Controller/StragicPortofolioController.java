package com.sooryen.spsmod.Controller;

import com.sooryen.spsmod.model.StragicPortofolio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shivakrishna on 14/07/16.
 */

@RestController
@RequestMapping("/reques")
public class StragicPortofolioController
{
    @RequestMapping("/")
    public StragicPortofolio getInf0()
    {
        StragicPortofolio portofolio=new StragicPortofolio();
        portofolio.setEquity(48.0f);
        portofolio.setFixedDeposite(32.0f);
        portofolio.setLiquedCash(20.f);
        return portofolio;
    }
}
