package ru.netology.domain;

public class NotfoundExeption {
    public void trowChecked() {
        throw new CheckedException();
    }

    public void trowUnhecked() {
        throw new UnheckedException();
    }

    manager.removeById(2);
        System.out.println("main done"); // for demo only

        try

    {
        System.out.println("before remove");
        manager.removeById(2);
        System.out.println("after remove");
    } catch(
    ArrayIndexOutOfBoundsException e)

    {
        e.printStackTrace();
        System.out.println("specific catch");
    } catch(
    RuntimeException e)

    {
        System.out.println("runtime catch");
    } catch(
    Exception e)

    {
        System.out.println("catch");
    } finally

    {
        System.out.println("finally");
    }

        try

    {
        System.out.println("before remove");
        manager.removeById(2);
        System.out.println("after remove");
    } catch(
    Throwable e)

    {

    }
}
