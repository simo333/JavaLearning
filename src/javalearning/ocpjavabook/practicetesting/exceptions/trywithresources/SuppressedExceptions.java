package javalearning.ocpjavabook.practicetesting.exceptions.trywithresources;

public class SuppressedExceptions {
    public static void main(String[] args) {
        try (RiverRaft raft = new RiverRaft();) {
            raft.crossRapid();
        }
        catch (Exception e) {
            System.out.println("Exception caught: " + e);
            Throwable[] exs = e.getSuppressed();
            if(exs.length > 0)
                System.out.println(exs[0]);
        }
        finally {
            System.out.println("finally");
        }

    }
}
