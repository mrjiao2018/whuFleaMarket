package edu.whu.iss.whufleamarket.enums;

public enum ProductCategoryEnum {
    HOME_APPLIANCES(1, "家电"),
    PLANT(2, "植物"),
    FOOD(3, "食品"),
    PROFESSIONAL_BOOK(4, "专业书"),
    MOVIE_TICKET(5, "电影票"),
    COSMETICS(6, "化妆品"),
    LITERAL_BOOK(7, "文学作品"),
    DORM_HELPER(8, "宿舍神器"),
    FITNESS_EQUIPMENT(9, "健身器材"),
    SPORT_GOODS(10, "体育用品"),
    COSPLAY_CLOTHES(11, "cosplay 服装"),
    OTHER(12, "其它");

    private int type;
    private String typeInfo;

    /**
     * 将构造函数设为私有是因为不希望第三方程序去改变提前设置好的 enum 值
     * @param type
     * @param typeInfo
     */
    private ProductCategoryEnum(int type, String typeInfo){
        this.type = type;
        this.typeInfo = typeInfo;
    }

    public int getType(){
        return type;
    }

    public String getTypeInfo(){
        return typeInfo;
    }
}
