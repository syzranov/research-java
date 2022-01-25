package accessmodificatorresearch;

public class RunResearch {

    public static void main(String[] args) {

        BaseAccessResearch baseAccessResearch = new BaseAccessResearch();

        System.out.println(baseAccessResearch.CalculateDate());
        System.out.println(baseAccessResearch.RunTimer());
        System.out.println(baseAccessResearch.TrimString());

        ChildAAccessResearch childAAccessResearch = new ChildAAccessResearch();

        System.out.println(childAAccessResearch.CalculateDate());
        System.out.println(childAAccessResearch.RunTimer());
        System.out.println(childAAccessResearch.TrimString());
    }
}
