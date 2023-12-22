package PrepDSA.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: sonali.shakya
 */
public class hashSetCheck {
    public static void main(String[] args) {
        HashSet<SOIDetail> soi = new HashSet<>();
        SOIDetail s2 = new SOIDetail("IMEI", "imeiSample");
        soi.add(s2);
        SOIDetail s1 = new SOIDetail("RTO_SCORE", "5.4");
        soi.add(s1);
        SOIDetail s3 = new SOIDetail("PU_CODE", "6.4");
        soi.add(s3);
        solve(soi);
    }

    static void solve(Set<SOIDetail> soi) {

        for (SOIDetail soiDetail : soi) {
            System.out.println(soiDetail.getAttributeName() + " " + soiDetail.getValue());
            if (soiDetail.getAttributeName().equals(SOIDetail.Type.RTO_SCORE.code())) {
                if (!soiDetail.getValue().equalsIgnoreCase("null") && Double.parseDouble(soiDetail.getValue()) < 6.8)
                    System.out.println(soiDetail.getValue() + " score " + (Double.parseDouble(soiDetail.getValue()) < 6.8));
                else
                    System.out.println("RTO_SCORE found null");
            }
        }


        // Doesn't work for set
        Iterator<SOIDetail> soiIterate = soi.iterator();
        if (soiIterate.hasNext()) {
            SOIDetail soiDetail = soiIterate.next();
            System.out.println(soiDetail.getAttributeName() + " " + soiDetail.getValue());
            if (soiDetail.getAttributeName().equals(SOIDetail.Type.RTO_SCORE.code())) {
                if (!soiDetail.getValue().equalsIgnoreCase("null") && Double.parseDouble(soiDetail.getValue()) < 6.8)
                    System.out.println(soiDetail.getValue() + " score " + (Double.parseDouble(soiDetail.getValue()) < 6.8));
                else
                    System.out.println("RTO_SCORE found null");
            } else
                System.out.println("No field as RTO_SCORE found");
        }
    }

    public static class SOIDetail {
        String attributeName;
        String value;
        public enum Type {

            IMEI_NUMBER("IMEI"), PU_CODE("PU_CODE"), MISC_ATTR("MISC_ATTR"), WAIT_EXPIRY("WAIT_EXPIRY"), HAZMAT("HAZMAT"), LIQUID("LIQUID"), FRAGILITY("FRAGILITY"), PRODUCT_PARTS(
                    "PRODUCT_PARTS"), PDP_URL("PDP_URL"), IMAGE_URL("IMAGE_URL"), DANGEROUS_GOODS_TYPE("DANGEROUS_GOODS_TYPE"), ITEM_CATEGORY_DETAIL("ITEM_CATEGORY_DETAIL"), PRIORITY(
                    "PRIORITY"), DELIVERY_TYPE("DELIVERY_TYPE"), PROMISED_DELIVERY_DATE("PROMISED_DELIVERY_DATE"), PROMISED_DELIVERY_DATE_RANGE_START(
                    "PROMISED_DELIVERY_DATE_RANGE_START"), ITEM_CATEGORY_URL("ITEM_CATEGORY_URL"), IS_GIFT_WRAP("IS_GIFT_WRAP"), CHANNEL_CODE("CHANNEL_CODE"), PRODUCT_CATALOG_ID(
                    "CATALOG_ID"), SHIPPED_DELAYED_NOTIFICATION_COUNT("SHIPPED_DELAYED_NOTIFICATION_COUNT"), SERIALIZABLE("SERIALIZABLE"), DELIVERY_DELAY_SLA("DELIVERY_DELAY_SLA"), LENGTH(
                    "LENGTH"), BREADTH("BREADTH"), HEIGHT("HEIGHT"), SHIPPING_MODE("SHIPPING_MODE"), NOTIFY_RMS("NOTIFY_RMS"), BUNDLE_CODE("BUNDLE_CODE"), BUNDLE_TYPE("BUNDLE_TYPE"), CATEGORY_ID(
                    "CATEGORY_ID"), PARENT_CATEGORY_ID("PARENT_CATEGORY_ID"), LEGO_ESTIMATED_PROCESSING_COST("LEGO_ESTIMATED_PROCESSING_COST"), SOFT_ALLOCATION_CONTEXT(
                    "SOFT_ALLOCATION_CONTEXT"), SOFT_COURIER_CODE("SOFT_COURIER"), PRIMARY_LENGTH("PRIMARY_LENGTH"), PRIMARY_BREADTH("PRIMARY_BREADTH"), PRIMARY_HEIGHT(
                    "PRIMARY_HEIGHT"), PRODUCT_TYPE("PRODUCT_TYPE"), TAX_CLASS("TAX_CLASS"), QUOTE_ID("QUOTE_ID"), WAREHOUSE_LEVEL_BARCODE("WL_BARCODE"), SERIAL_NUMBER("SERIAL_NO"),
            SERVICE_TYPE("SERVICE_TYPE"), FIT_SOI_ID("FIT_SOI_ID"), PREVIOUS_SP_ID("PREVIOUS_SP_ID"), ACTUAL_STORE_FRONT("ACTUAL_STORE_FRONT"),
            HSN_CODE("HSN_CODE"), GST_STATE_CODE("GST_STATE_CODE"), SD_GSTN("SD_GSTN"), NGO_DONATION_AMOUNT("NGO_DONATION_AMOUNT"), DEVICE_TYPE("DEVICE_TYPE"),
            SD_GST_STATE_CODE("SD_ST_CODE"), SD_CUSTOMER_GSTN("SDC_GSTN"), SELLER_FSSAI_NUMBER("SELLER_FSSAI_NUMBER"),
            VENDOR_STATE_CODE("VENDOR_STATE_CODE"), BUYER_STATE_CODE("BUYER_STATE_CODE"), RTO_SCORE("RTO_SCORE");


            private String code;

            private Type(String code) {
                this.code = code;
            }

            public String code() {
                return this.code;
            }
        }

        public SOIDetail(String attributeName, String value) {
            this.attributeName = attributeName;
            this.value = value;
        }

        public String getAttributeName() {
            return attributeName;
        }

        public void setAttributeName(String attributeName) {
            this.attributeName = attributeName;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
