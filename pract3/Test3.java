package pract3;

import java.util.*;

public class Test3 {
    public static void main (String[] args) throws Exception{
        SyncMap<Integer, String> mySyncMap = new SyncMap();
        mySyncMap.put(1, "12345");
        mySyncMap.put(12, "12");
        System.out.println(mySyncMap.size());
        System.out.println(mySyncMap.containsKey(43));
        System.out.println(mySyncMap.containsKey(12));
        System.out.println(mySyncMap.isEmpty());
        System.out.println(mySyncMap.keySet());

        mySyncMap.clear();

        SemaphSet<Integer> mySyncSet = new SemaphSet();
        mySyncSet.add(1);
        mySyncSet.add(12);
        System.out.println(mySyncSet.size());
        System.out.println(mySyncSet.contains(43));
        System.out.println(mySyncSet.contains(12));
        System.out.println(mySyncSet.isEmpty());
        System.out.println(mySyncSet.hashCode());

        mySyncSet.clear();

        final Integer targetKey = 0b1111_1111_1111_1111; // 65 535
        final String targetValue = "v";

        int ch = 2;

        if(ch == 0)
        {
            final Map<Integer, String> NotSyncMap = new HashMap<>();


            NotSyncMap.put(targetKey, targetValue);

            new Thread(() -> {
                for (int i = 0; i < targetKey; i++) {
                    NotSyncMap.put(i, "someValue");
                }
            }).start();


            while (true) {
                if (!targetValue.equals(NotSyncMap.get(targetKey))) {
                    throw new RuntimeException("HashMap is not thread safe.");
                }
            }

        }
        else if(ch == 1) {

            mySyncMap.put(targetKey, targetValue);

            new Thread(() -> {
                for (int i = 0; i < targetKey; i++) {
                    mySyncMap.put(i, "someValue");
                }
            }).start();


            while (true) {
                if (!targetValue.equals(mySyncMap.get(targetKey))) {
                    throw new RuntimeException("mySyncMap is not thread safe.");
                }
            }
        }

        else {

            Thread th1 = new Thread(() -> {
                for (int i = 0; i < 50; i++) {
                    mySyncSet.add(i);
                }
            });

            Thread th2 = new Thread(() -> {
                for (int i = 5; i < 100; i++) {
                    mySyncSet.add(i);
                }
            });

            th1.start();
            th2.start();

            Thread.sleep(3000);
            Object[] res = mySyncSet.toArray();
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i]);
                System.out.print(" ");
            }
        }





    }
}
