package edu.whu.iss.whufleamarket.enums;

public enum OrderStateEnum {
    NOT_PAID(0, "已提交订单但未付款"),
    PAID(1, "已提交订单并且付款"),
    CANCEL(2, "取消订单"), // 太长时间为付款或者在付款界面取消订单
    FAIL(3, "交易失败"),    // 因各种原因导致交易失败（如长时间未接受货物）
    SUCCESS(4, "交易成功"),
    APPLY_FOR_RETURN(5, "申请退货"),
    RETURN_SUCCESS(6, "退货成功");

    private int state;
    private String stateInfo;

    private OrderStateEnum(int state, String stateInfo){
        this.state = state;
        this.stateInfo = stateInfo;
    }

    /**
     * 根据传入的state值返回相应的enum值
     * @param state
     * @return
     */
    public static OrderStateEnum stateOf(int state){
        for(OrderStateEnum stateEnum : values()){
            if(stateEnum.getState() == state)
                return stateEnum;
        }
        return null;
    }

    public int getState(){
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }
}
