package tw.leonchen.collections;

import java.util.*;

public class TestCollectionEx1 {

    public static void main(String[] args) {

        // 宣告 Collection（用 ArrayList 實作）
        Collection<String> collection = new ArrayList<>();

        // 加入資料
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Apple"); 
        collection.add("grape");// 可重複

        // 輸出集合內容
        for (String item : collection) {
            System.out.println(item);
        }
    }
}
