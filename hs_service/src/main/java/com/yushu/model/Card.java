package com.yushu.model;

import java.util.Date;
import javax.persistence.*;

public class Card {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "EName")
    private String ename;

    /**
     * 卡牌类型,关联表HS_CardType
     */
    @Column(name = "Type")
    private Integer type;

    /**
     * 职业,关联表HS_CardOccupation
     */
    @Column(name = "Occupation")
    private Integer occupation;

    /**
     * 稀有度,关联表HS_CardRarity
     */
    @Column(name = "Rarity")
    private Integer rarity;

    @Column(name = "Cost")
    private Integer cost;

    @Column(name = "Atk")
    private Integer atk;

    @Column(name = "Health")
    private Integer health;

    /**
     * 卡牌种类，关联表Card_Kind
     */
    @Column(name = "Kind")
    private Integer kind;

    /**
     * 卡牌版本，关联表HS_CardSet
     */
    @Column(name = "Set")
    private Integer set;

    @Column(name = "Description")
    private String description;

    /**
     * 分解获得的尘
     */
    @Column(name = "Dust_Decompose")
    private Integer dustDecompose;

    /**
     * 金色分解获得的尘
     */
    @Column(name = "Dust_Decompose_Golden")
    private Integer dustDecomposeGolden;

    /**
     * 合成需要的尘
     */
    @Column(name = "Dust_Synthesis")
    private Integer dustSynthesis;

    /**
     * 金色合成需要的尘
     */
    @Column(name = "Dust_Synthesis_Golden")
    private Integer dustSynthesisGolden;

    /**
     * 嘲讽 
     */
    @Column(name = "Taunt")
    private Boolean taunt;

    /**
     * 冻结
     */
    @Column(name = "Freeze")
    private Boolean freeze;

    /**
     * 风怒
     */
    @Column(name = "Windfury")
    private Boolean windfury;

    /**
     * 战吼
     */
    @Column(name = "Battlecry")
    private Boolean battlecry;

    /**
     * 潜行
     */
    @Column(name = "Stealth")
    private Boolean stealth;

    /**
     * 连击
     */
    @Column(name = "Combo")
    private Boolean combo;

    /**
     * 光环
     */
    @Column(name = "Aura")
    private Boolean aura;

    /**
     * 冲锋
     */
    @Column(name = "Charge")
    private Boolean charge;

    /**
     * 过载
     */
    @Column(name = "Grant_charge")
    private Boolean grantCharge;

    /**
     * 法强
     */
    @Column(name = "Spellpower")
    private Boolean spellpower;

    /**
     * 沉默
     */
    @Column(name = "Silence")
    private Boolean silence;

    /**
     * 激怒
     */
    @Column(name = "Enrage")
    private Boolean enrage;

    /**
     * 圣盾
     */
    @Column(name = "Divine_shield")
    private Boolean divineShield;

    /**
     * 亡语
     */
    @Column(name = "Deathrattle")
    private Boolean deathrattle;

    /**
     * 奥秘
     */
    @Column(name = "Secret")
    private Boolean secret;

    /**
     * 激励
     */
    @Column(name = "Inspire")
    private Boolean inspire;

    /**
     * 任务
     */
    @Column(name = "Mission")
    private Boolean mission;

    /**
     * 吸血
     */
    @Column(name = "Lifesteal")
    private Boolean lifesteal;

    @Column(name = "IsShow")
    private Boolean isshow;

    @Column(name = "CreateDate")
    private Date createdate;

    /**
     * @return Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return EName
     */
    public String getEname() {
        return ename;
    }

    /**
     * @param ename
     */
    public void setEname(String ename) {
        this.ename = ename;
    }

    /**
     * 获取卡牌类型,关联表HS_CardType
     *
     * @return Type - 卡牌类型,关联表HS_CardType
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置卡牌类型,关联表HS_CardType
     *
     * @param type 卡牌类型,关联表HS_CardType
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取职业,关联表HS_CardOccupation
     *
     * @return Occupation - 职业,关联表HS_CardOccupation
     */
    public Integer getOccupation() {
        return occupation;
    }

    /**
     * 设置职业,关联表HS_CardOccupation
     *
     * @param occupation 职业,关联表HS_CardOccupation
     */
    public void setOccupation(Integer occupation) {
        this.occupation = occupation;
    }

    /**
     * 获取稀有度,关联表HS_CardRarity
     *
     * @return Rarity - 稀有度,关联表HS_CardRarity
     */
    public Integer getRarity() {
        return rarity;
    }

    /**
     * 设置稀有度,关联表HS_CardRarity
     *
     * @param rarity 稀有度,关联表HS_CardRarity
     */
    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    /**
     * @return Cost
     */
    public Integer getCost() {
        return cost;
    }

    /**
     * @param cost
     */
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    /**
     * @return Atk
     */
    public Integer getAtk() {
        return atk;
    }

    /**
     * @param atk
     */
    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    /**
     * @return Health
     */
    public Integer getHealth() {
        return health;
    }

    /**
     * @param health
     */
    public void setHealth(Integer health) {
        this.health = health;
    }

    /**
     * 获取卡牌种类，关联表Card_Kind
     *
     * @return Kind - 卡牌种类，关联表Card_Kind
     */
    public Integer getKind() {
        return kind;
    }

    /**
     * 设置卡牌种类，关联表Card_Kind
     *
     * @param kind 卡牌种类，关联表Card_Kind
     */
    public void setKind(Integer kind) {
        this.kind = kind;
    }

    /**
     * 获取卡牌版本，关联表HS_CardSet
     *
     * @return Set - 卡牌版本，关联表HS_CardSet
     */
    public Integer getSet() {
        return set;
    }

    /**
     * 设置卡牌版本，关联表HS_CardSet
     *
     * @param set 卡牌版本，关联表HS_CardSet
     */
    public void setSet(Integer set) {
        this.set = set;
    }

    /**
     * @return Description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取分解获得的尘
     *
     * @return Dust_Decompose - 分解获得的尘
     */
    public Integer getDustDecompose() {
        return dustDecompose;
    }

    /**
     * 设置分解获得的尘
     *
     * @param dustDecompose 分解获得的尘
     */
    public void setDustDecompose(Integer dustDecompose) {
        this.dustDecompose = dustDecompose;
    }

    /**
     * 获取金色分解获得的尘
     *
     * @return Dust_Decompose_Golden - 金色分解获得的尘
     */
    public Integer getDustDecomposeGolden() {
        return dustDecomposeGolden;
    }

    /**
     * 设置金色分解获得的尘
     *
     * @param dustDecomposeGolden 金色分解获得的尘
     */
    public void setDustDecomposeGolden(Integer dustDecomposeGolden) {
        this.dustDecomposeGolden = dustDecomposeGolden;
    }

    /**
     * 获取合成需要的尘
     *
     * @return Dust_Synthesis - 合成需要的尘
     */
    public Integer getDustSynthesis() {
        return dustSynthesis;
    }

    /**
     * 设置合成需要的尘
     *
     * @param dustSynthesis 合成需要的尘
     */
    public void setDustSynthesis(Integer dustSynthesis) {
        this.dustSynthesis = dustSynthesis;
    }

    /**
     * 获取金色合成需要的尘
     *
     * @return Dust_Synthesis_Golden - 金色合成需要的尘
     */
    public Integer getDustSynthesisGolden() {
        return dustSynthesisGolden;
    }

    /**
     * 设置金色合成需要的尘
     *
     * @param dustSynthesisGolden 金色合成需要的尘
     */
    public void setDustSynthesisGolden(Integer dustSynthesisGolden) {
        this.dustSynthesisGolden = dustSynthesisGolden;
    }

    /**
     * 获取嘲讽 
     *
     * @return Taunt - 嘲讽 
     */
    public Boolean getTaunt() {
        return taunt;
    }

    /**
     * 设置嘲讽 
     *
     * @param taunt 嘲讽 
     */
    public void setTaunt(Boolean taunt) {
        this.taunt = taunt;
    }

    /**
     * 获取冻结
     *
     * @return Freeze - 冻结
     */
    public Boolean getFreeze() {
        return freeze;
    }

    /**
     * 设置冻结
     *
     * @param freeze 冻结
     */
    public void setFreeze(Boolean freeze) {
        this.freeze = freeze;
    }

    /**
     * 获取风怒
     *
     * @return Windfury - 风怒
     */
    public Boolean getWindfury() {
        return windfury;
    }

    /**
     * 设置风怒
     *
     * @param windfury 风怒
     */
    public void setWindfury(Boolean windfury) {
        this.windfury = windfury;
    }

    /**
     * 获取战吼
     *
     * @return Battlecry - 战吼
     */
    public Boolean getBattlecry() {
        return battlecry;
    }

    /**
     * 设置战吼
     *
     * @param battlecry 战吼
     */
    public void setBattlecry(Boolean battlecry) {
        this.battlecry = battlecry;
    }

    /**
     * 获取潜行
     *
     * @return Stealth - 潜行
     */
    public Boolean getStealth() {
        return stealth;
    }

    /**
     * 设置潜行
     *
     * @param stealth 潜行
     */
    public void setStealth(Boolean stealth) {
        this.stealth = stealth;
    }

    /**
     * 获取连击
     *
     * @return Combo - 连击
     */
    public Boolean getCombo() {
        return combo;
    }

    /**
     * 设置连击
     *
     * @param combo 连击
     */
    public void setCombo(Boolean combo) {
        this.combo = combo;
    }

    /**
     * 获取光环
     *
     * @return Aura - 光环
     */
    public Boolean getAura() {
        return aura;
    }

    /**
     * 设置光环
     *
     * @param aura 光环
     */
    public void setAura(Boolean aura) {
        this.aura = aura;
    }

    /**
     * 获取冲锋
     *
     * @return Charge - 冲锋
     */
    public Boolean getCharge() {
        return charge;
    }

    /**
     * 设置冲锋
     *
     * @param charge 冲锋
     */
    public void setCharge(Boolean charge) {
        this.charge = charge;
    }

    /**
     * 获取过载
     *
     * @return Grant_charge - 过载
     */
    public Boolean getGrantCharge() {
        return grantCharge;
    }

    /**
     * 设置过载
     *
     * @param grantCharge 过载
     */
    public void setGrantCharge(Boolean grantCharge) {
        this.grantCharge = grantCharge;
    }

    /**
     * 获取法强
     *
     * @return Spellpower - 法强
     */
    public Boolean getSpellpower() {
        return spellpower;
    }

    /**
     * 设置法强
     *
     * @param spellpower 法强
     */
    public void setSpellpower(Boolean spellpower) {
        this.spellpower = spellpower;
    }

    /**
     * 获取沉默
     *
     * @return Silence - 沉默
     */
    public Boolean getSilence() {
        return silence;
    }

    /**
     * 设置沉默
     *
     * @param silence 沉默
     */
    public void setSilence(Boolean silence) {
        this.silence = silence;
    }

    /**
     * 获取激怒
     *
     * @return Enrage - 激怒
     */
    public Boolean getEnrage() {
        return enrage;
    }

    /**
     * 设置激怒
     *
     * @param enrage 激怒
     */
    public void setEnrage(Boolean enrage) {
        this.enrage = enrage;
    }

    /**
     * 获取圣盾
     *
     * @return Divine_shield - 圣盾
     */
    public Boolean getDivineShield() {
        return divineShield;
    }

    /**
     * 设置圣盾
     *
     * @param divineShield 圣盾
     */
    public void setDivineShield(Boolean divineShield) {
        this.divineShield = divineShield;
    }

    /**
     * 获取亡语
     *
     * @return Deathrattle - 亡语
     */
    public Boolean getDeathrattle() {
        return deathrattle;
    }

    /**
     * 设置亡语
     *
     * @param deathrattle 亡语
     */
    public void setDeathrattle(Boolean deathrattle) {
        this.deathrattle = deathrattle;
    }

    /**
     * 获取奥秘
     *
     * @return Secret - 奥秘
     */
    public Boolean getSecret() {
        return secret;
    }

    /**
     * 设置奥秘
     *
     * @param secret 奥秘
     */
    public void setSecret(Boolean secret) {
        this.secret = secret;
    }

    /**
     * 获取激励
     *
     * @return Inspire - 激励
     */
    public Boolean getInspire() {
        return inspire;
    }

    /**
     * 设置激励
     *
     * @param inspire 激励
     */
    public void setInspire(Boolean inspire) {
        this.inspire = inspire;
    }

    /**
     * 获取任务
     *
     * @return Mission - 任务
     */
    public Boolean getMission() {
        return mission;
    }

    /**
     * 设置任务
     *
     * @param mission 任务
     */
    public void setMission(Boolean mission) {
        this.mission = mission;
    }

    /**
     * 获取吸血
     *
     * @return Lifesteal - 吸血
     */
    public Boolean getLifesteal() {
        return lifesteal;
    }

    /**
     * 设置吸血
     *
     * @param lifesteal 吸血
     */
    public void setLifesteal(Boolean lifesteal) {
        this.lifesteal = lifesteal;
    }

    /**
     * @return IsShow
     */
    public Boolean getIsshow() {
        return isshow;
    }

    /**
     * @param isshow
     */
    public void setIsshow(Boolean isshow) {
        this.isshow = isshow;
    }

    /**
     * @return CreateDate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}