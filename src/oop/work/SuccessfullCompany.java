package oop.work;

public class SuccessfullCompany extends Company implements Administration {

    @Override
    public void director() {
        System.out.println("dir");

    }

    @Override
    public void secretary() {
        System.out.println("secret");

    }

    @Override
    public void manager() {
        System.out.println("manag");

    }

    @Override
    public void stocks() {
        System.out.println("1200$ each stock");

    }
}
