package four;

public class Constr {
    int pop;

    Constr(int ii1) {
        pop = ii1;
        System.out.println(pop);
    }
    Constr(int ii1, int ii2) {
        this(ii1);
        pop = ii1 + ii2;
        System.out.println(pop);
    }
}
