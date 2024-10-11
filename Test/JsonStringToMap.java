//package PrepDSA.Test;
//
//import com.google.gson.Gson;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//
//
///**
// * @author: sonali.shakya
// */
//public class JsonStringToMap {
//    public static void main(String[] args) {
//        String s = "{\"jsonData\":[{\"name\":\"SSI_CB\",\"value\":\"0\"},{\"name\":\"PAID_AMNT\",\"value\":\"399\"},{\"name\":\"HND_CHG_GST\",\"value\":\"[{\\\"taxRate\\\":18.00,\\\"taxAmount\\\":0.00,\\\"taxType\\\":\\\"IGST\\\"},{\\\"taxRate\\\":0.00,\\\"taxAmount\\\":0.00,\\\"taxType\\\":\\\"CESS\\\"},{\\\"taxRate\\\":0.00,\\\"taxAmount\\\":0.00,\\\"taxType\\\":\\\"TCS_IGST\\\"}]\"},{\"name\":\"VSI_CASHBACK\",\"value\":\"0\"},{\"name\":\"GST_TAX_BRKUP\",\"value\":\"[{\\\"taxRate\\\":0.00,\\\"taxAmount\\\":0,\\\"taxType\\\":\\\"IGST\\\"},{\\\"taxRate\\\":0.00,\\\"taxAmount\\\":0,\\\"taxType\\\":\\\"CESS\\\"},{\\\"taxRate\\\":0.00,\\\"taxAmount\\\":0,\\\"taxType\\\":\\\"TCS_IGST\\\"}]\"},{\"name\":\"MRP\",\"value\":\"798\"},{\"name\":\"EXT_CB\",\"value\":\"0\"},{\"name\":\"SHP_MTHD_CHG\",\"value\":\"0\"},{\"name\":\"VSE_CB\",\"value\":\"0\"},{\"name\":\"SHP_CHG\",\"value\":\"0\"},{\"name\":\"NET_HND_CHG_GST\",\"value\":\"[{\\\"taxRate\\\":18.00,\\\"taxAmount\\\":0.00,\\\"taxType\\\":\\\"IGST\\\"},{\\\"taxRate\\\":0.00,\\\"taxAmount\\\":0.00,\\\"taxType\\\":\\\"CESS\\\"},{\\\"taxRate\\\":0.00,\\\"taxAmount\\\":0.00,\\\"taxType\\\":\\\"TCS_IGST\\\"}]\"},{\"name\":\"INT_CB\",\"value\":\"0\"},{\"name\":\"SD_PROMO_AMNT_NET\",\"value\":\"0.0\"},{\"name\":\"PROMO_VAL\",\"value\":\"0\"},{\"name\":\"GVT_LEV_ACTUAL\",\"value\":\"0\"},{\"name\":\"FC_CB\",\"value\":\"0\"},{\"name\":\"GVT_LEV\",\"value\":\"0\"},{\"name\":\"SD_CB_NET\",\"value\":\"0.0\"},{\"name\":\"VIP_DISCOUNT\",\"value\":\"0\"},{\"name\":\"SD_CASH\",\"value\":\"0\"},{\"name\":\"OFR_DSCNT\",\"value\":\"0\"},{\"name\":\"CLCT_AMNT\",\"value\":\"339\"},{\"name\":\"SD_SHP_CHG_NET\",\"value\":\"0.0\"},{\"name\":\"ITEM_PRICE\",\"value\":\"399\"},{\"name\":\"SSE_CB\",\"value\":\"0\"},{\"name\":\"TOTAL_SC_ADJ_AMNT\",\"value\":\"0.0\"}]}";
//        double cashbackValue = 0;
//        Gson gson = new Gson();
//        JsonElement element = gson.fromJson(s,JsonElement.class);
//        JsonObject jsonObject = element.getAsJsonObject();
//        JsonArray jsonArray = jsonObject.get("jsonData").getAsJsonArray();
//        for(int i = 0 ; i < jsonArray.size(); i++) {
//            String key = jsonArray.get(i).getAsJsonObject().get("name").getAsString();
//            if (key.contains("CB") || key.contains("CASHBACK")) {
//                cashbackValue = cashbackValue + jsonArray.get(i).getAsJsonObject().get("value").getAsDouble();
//                System.out.println(jsonArray.get(i).getAsJsonObject().get("name").getAsString()+ " " + jsonArray.get(i).getAsJsonObject().get("value").getAsDouble());
//
//            }
//        }
//        System.out.println(cashbackValue);
//
//        String p = "VjUwI2FmMWExY2MyLTM5YmItNDQxNi1hMTAxLTg3ZThjN2ZjMTU1Yw@snpde.in";
//        System.out.println(p.substring(0, p.lastIndexOf("@snpde.in")));
//
//
//        int i  = 5;
//        char ch = (char) (i + '0');
//        System.out.println(ch);
//    }
//}
