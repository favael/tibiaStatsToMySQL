import api.TibiaApi;
import dao.DataDAO;
import db.dao.SessionProvider;
import models.*;
import org.hibernate.SessionFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static SessionFactory factory;

    public static void main(String[] args) throws IOException, InterruptedException {
        TibiaApi aplikacja = new TibiaApi();
        SessionProvider sessionProvider = SessionProvider.INSTANCE;
        DataDAO dao = new DataDAO(sessionProvider.getSession());

        ArrayList<Data> statistic = aplikacja.getHighcoreList("damora").getHighscores().getData();

        for (int i = 0; i < statistic.size(); i++) {
            dao.update(statistic.get(i));
//
        }

        dao.close();
        sessionProvider.closeFactory();
    }
}




