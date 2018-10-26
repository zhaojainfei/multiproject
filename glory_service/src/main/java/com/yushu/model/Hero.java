package com.yushu.model;

import javax.persistence.*;

public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "hero_id")
    private Integer heroId;

    @Column(name = "param_name")
    private String paramName;

    private String nickname;

    /**
     * 例值：mage
     */
    private String category;

    /**
     * 头像
     */
    private String icon;

    /**
     * 金币
     */
    private Integer gold;

    /**
     * 钻石
     */
    private Integer diamond;

    /**
     * 点券
     */
    private Integer ticket;

    /**
     * 例值：魔法
     */
    private String tag;

    /**
     * 生存能力
     */
    @Column(name = "ability_hp")
    private Integer abilityHp;

    /**
     * 攻击伤害
     */
    @Column(name = "ability_attack")
    private Integer abilityAttack;

    /**
     * 技能效果
     */
    @Column(name = "ability_skill")
    private Integer abilitySkill;

    /**
     * 上手难度
     */
    @Column(name = "ability_diff")
    private Integer abilityDiff;

    private String description;

    /**
     * @return id
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
     * @return hero_id
     */
    public Integer getHeroId() {
        return heroId;
    }

    /**
     * @param heroId
     */
    public void setHeroId(Integer heroId) {
        this.heroId = heroId;
    }

    /**
     * @return param_name
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * @param paramName
     */
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取例值：mage
     *
     * @return category - 例值：mage
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置例值：mage
     *
     * @param category 例值：mage
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 获取头像
     *
     * @return icon - 头像
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置头像
     *
     * @param icon 头像
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取金币
     *
     * @return gold - 金币
     */
    public Integer getGold() {
        return gold;
    }

    /**
     * 设置金币
     *
     * @param gold 金币
     */
    public void setGold(Integer gold) {
        this.gold = gold;
    }

    /**
     * 获取钻石
     *
     * @return diamond - 钻石
     */
    public Integer getDiamond() {
        return diamond;
    }

    /**
     * 设置钻石
     *
     * @param diamond 钻石
     */
    public void setDiamond(Integer diamond) {
        this.diamond = diamond;
    }

    /**
     * 获取点券
     *
     * @return ticket - 点券
     */
    public Integer getTicket() {
        return ticket;
    }

    /**
     * 设置点券
     *
     * @param ticket 点券
     */
    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }

    /**
     * 获取例值：魔法
     *
     * @return tag - 例值：魔法
     */
    public String getTag() {
        return tag;
    }

    /**
     * 设置例值：魔法
     *
     * @param tag 例值：魔法
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * 获取生存能力
     *
     * @return ability_hp - 生存能力
     */
    public Integer getAbilityHp() {
        return abilityHp;
    }

    /**
     * 设置生存能力
     *
     * @param abilityHp 生存能力
     */
    public void setAbilityHp(Integer abilityHp) {
        this.abilityHp = abilityHp;
    }

    /**
     * 获取攻击伤害
     *
     * @return ability_attack - 攻击伤害
     */
    public Integer getAbilityAttack() {
        return abilityAttack;
    }

    /**
     * 设置攻击伤害
     *
     * @param abilityAttack 攻击伤害
     */
    public void setAbilityAttack(Integer abilityAttack) {
        this.abilityAttack = abilityAttack;
    }

    /**
     * 获取技能效果
     *
     * @return ability_skill - 技能效果
     */
    public Integer getAbilitySkill() {
        return abilitySkill;
    }

    /**
     * 设置技能效果
     *
     * @param abilitySkill 技能效果
     */
    public void setAbilitySkill(Integer abilitySkill) {
        this.abilitySkill = abilitySkill;
    }

    /**
     * 获取上手难度
     *
     * @return ability_diff - 上手难度
     */
    public Integer getAbilityDiff() {
        return abilityDiff;
    }

    /**
     * 设置上手难度
     *
     * @param abilityDiff 上手难度
     */
    public void setAbilityDiff(Integer abilityDiff) {
        this.abilityDiff = abilityDiff;
    }

    /**
     * @return description
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
}