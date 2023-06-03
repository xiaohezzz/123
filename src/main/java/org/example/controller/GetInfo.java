package org.example.controller;

import org.example.domain.*;
import org.example.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class GetInfo {
    @Autowired
    private RadarMapper radarMapper;
    @ResponseBody
    @RequestMapping("/Radar")
    public List<Radar> getRadar(){
        List<Radar> radar =radarMapper.selectList(null);
        return radar;
    }

    @Autowired
    private SBanrateMapper sBanrateMapper;
    @ResponseBody
    @RequestMapping("/SupportBan")
    public List<SBanrate> getSBanrate(){
        List<SBanrate> sBanrates=sBanrateMapper.selectList(null);
        return sBanrates;
    }

    @Autowired
    private JBanrateMapper jBanrateMapper;
    @ResponseBody
    @RequestMapping("/JBan")
    public List<JBanrate> getJBanrate(){
        List<JBanrate> jBanrate = jBanrateMapper.selectList(null);
        return jBanrate;
    }

    @Autowired
    private ABanrateMapper aBanrateMapper;
    @ResponseBody
    @RequestMapping("/ABan")
    public List<ABanrate> getABanrate(){
        List<ABanrate> aBanrate=aBanrateMapper.selectList(null);
        return aBanrate;
    }

    @Autowired
    private MBanrateMapper mBanrateMapper;
    @ResponseBody
    @RequestMapping("/MBan")
    public List<MBanrate> getMBanrate(){
        List<MBanrate> mBanrate=mBanrateMapper.selectList(null);
        return mBanrate;
    }

    @Autowired
    private TBanrateMapper tBanrateMapper;
    @ResponseBody
    @RequestMapping("/TBan")
    public List<TBanrate> getTBanrate(){
        List<TBanrate> tBanrate=tBanrateMapper.selectList(null);
        return tBanrate;
    }

    @Autowired
    private WinrateMapper winrateMapper;
    @ResponseBody
    @RequestMapping("/Win")
    public List<Winrate> getWinrate(){
        List<Winrate> winrate=winrateMapper.selectList(null);
        return winrate;
    }

    @Autowired
    private PickrateMapper pickrateMapper;
    @ResponseBody
    @RequestMapping("/Pick")
    public List<Pickrate> getPickrate(){
        List<Pickrate> pickrate=pickrateMapper.selectList(null);
        return pickrate;
    }
}

