package PrepDSA.Test;

import java.util.*;

/**
 * @author: sonali.shakya
 */
public class highestPriceOMS {
    public static void main(String[] args) {

        Set<OMSOrder> omsOrderSet = new HashSet<>();
        OMSOrder o1 = new OMSOrder("o1", 185);
        OMSOrder o2 = new OMSOrder("o2", 170);
        OMSOrder o3 = new OMSOrder("o3", 200);
        OMSOrder o4 = new OMSOrder("o4", 1000);
        OMSOrder o5 = new OMSOrder("o5", 170);
        OMSOrder o6 = new OMSOrder("o6", 190);

        omsOrderSet.add(o1);
        omsOrderSet.add(o2);
        omsOrderSet.add(o3);
        omsOrderSet.add(o4);
        omsOrderSet.add(o5);
        omsOrderSet.add(o6);

        solve(omsOrderSet);


    }

    static void solve(Set<OMSOrder> omsOrders) {
        OMSOrder lowerPricedOrder;
        Set<String> higherPricedSuborders = new HashSet<>();
        Iterator<OMSOrder> sortedOrdersItr = sortByTotalAmount(omsOrders).iterator();
        lowerPricedOrder = sortedOrdersItr.next();          // get smallest
        System.out.println("lowest : " + lowerPricedOrder.orderCode);
        while (sortedOrdersItr.hasNext()) {
            System.out.println(sortedOrdersItr.next().getOrderCode());
            higherPricedSuborders.addAll(Collections.singleton(sortedOrdersItr.next().getOrderCode()));
        }
    }

    public static List<OMSOrder> sortByTotalAmount(Set<OMSOrder> omsOrders) {
        List<OMSOrder> list = new ArrayList<>(omsOrders);
        list.sort(Comparator.comparingInt(o -> o.totalAmount));
        System.out.println("Sorted");
        for (OMSOrder o : list)
            System.out.println(o.getOrderCode() + " " + o.getTotalAmount());
        return list;
    }

    public static class OMSOrder {

        private String orderCode;
        private String shippingMethodType;
        private String email;
        private int totalAmount;
        private Set<String> items = new HashSet<>();
        private Map<String, Integer> supcInfo = new HashMap<>();  //suborder is actually supc to quantity as 1 pair, so suborders would have quantity > 1

        public String getOrderCode() {
            return orderCode;
        }

        public String getEmail() {
            return email;
        }

        public double getTotalAmount() {
            return totalAmount;
        }

        public Set<String> getItems() {
            return items;
        }

        public Map<String, Integer> getSupcInfo() {
            return supcInfo;
        }


        public OMSOrder(String orderCode, int totalAmount) {
            this.orderCode = orderCode;
            this.totalAmount = totalAmount;
        }
    }

}
