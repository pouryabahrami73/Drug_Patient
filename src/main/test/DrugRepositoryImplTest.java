import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.text.ParseException;

public class DrugRepositoryImplTest {
    /*EntityManager entityManager = EntityManagerMaker.getEntityManager();*/
    /*TypedQuery<Account> query = entityManager.createQuery("SELECT a FROM Account a WHERE a.emailAddress =" +
            "\'pooria.bahrami73@gmail.com\'", Account.class);*/
    /*Account account = query.getSingleResult();*/
    @BeforeAll
    static void beforeAll() throws ParseException {

    }
    @Test
    void findByEmailAddress() {
        /*AccountRepositoryImpl accountRepository = new AccountRepositoryImpl(Account.class);
        Assertions.assertEquals(account, accountRepository.findByEmailAddress("pooria.bahrami73@gmail.com"));*/
    }
}
