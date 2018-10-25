package com.yushu.service;

import com.yushu.fallback.CallClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hs-service",fallback = CallClientFallBack.class)
public interface CallClient {
    @RequestMapping(value = "hs/card/get",method = RequestMethod.GET)
    Object getCard();

    @RequestMapping(value = "hs/card/getById",method = RequestMethod.GET)
    Object getCardById(Integer id);

    @RequestMapping(value = "hs/cardKind/get",method = RequestMethod.GET)
    Object getCardKind();

    @RequestMapping(value = "hs/cardKind/getById",method = RequestMethod.GET)
    Object getCardKindById(@RequestParam(value = "id")Integer id);

    @RequestMapping(value = "hs/cardOccupation/get",method = RequestMethod.GET)
    Object getCardOccupation();

    @RequestMapping(value = "hs/cardOccupation/getById",method = RequestMethod.GET)
    Object getCardOccupationById(@RequestParam(value = "id")Integer id);

    @RequestMapping(value = "hs/cardRarity/get",method = RequestMethod.GET)
    Object getCardRarity();

    @RequestMapping(value = "hs/cardRarity/getById",method = RequestMethod.GET)
    Object getCardRarityById(@RequestParam(value = "id")Integer id);

    @RequestMapping(value = "hs/cardSet/get",method = RequestMethod.GET)
    Object getCardSet();

    @RequestMapping(value = "hs/cardSet/getById",method = RequestMethod.GET)
    Object getCardSetById(@RequestParam(value = "id")Integer id);

    @RequestMapping(value = "hs/cardType/get",method = RequestMethod.GET)
    Object getCardType();

    @RequestMapping(value = "hs/cardType/getById",method = RequestMethod.GET)
    Object getCardTypeById(@RequestParam(value = "id")Integer id);
}
