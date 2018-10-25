package com.yushu.controller;

import com.yushu.model.CardKind;
import com.yushu.service.CardKindService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hs/cardKind")
public class CardKindController {
    @Autowired
    CardKindService cardkindService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Object get(){
        CardKind cardKind = new CardKind();
        return cardkindService.getList(cardKind);
    }

    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    public Object getById(Integer id){
        CardKind cardKind = new CardKind();
        cardKind.setId(id);

        CardKind cardTemp = new CardKind();
        // 双开项目的方法 - EditConfiguration 编辑里面-Dserver.port=8771 然后把上面那个single去掉
        BeanUtils.copyProperties(cardKind,cardTemp);

        return cardkindService.get(cardKind);
    }
}
