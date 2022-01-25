package collectionresearch;

import java.util.ArrayList;

public class ListResearch {

    private ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> getList() {
        return list;
    }

    public void testAddDubleValue() {
        list.add("123");
        list.add("123");

        System.out.println("Same data added " + getList());
    }

    public void testAddNull() {
        list.add(null);
        list.add(null);
        list.add(null);

        System.out.println("Null data added " + getList());
    }
}
