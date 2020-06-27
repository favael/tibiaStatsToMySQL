import api.TibiaApi;
import dao.DataDAO;
import db.dao.SessionProvider;
import models.Data;
import org.hibernate.SessionFactory;

import java.io.IOException;
import java.util.ArrayList;
public class Main {


    private static SessionFactory factory;

    public static void main(String[] args) throws IOException, InterruptedException {

        TibiaApi aplikacja = new TibiaApi();


        String [] servers = {"Antica", "Assombra", "Astera", "Belluma", "Belobra", "Bona", "Calmera", "Carnera",
                "Celebra", "Celesta", "Concorda", "Cosera", "Damora", "Descubra", "Dibra", "Duna", "Emera", "Epoca",
                "Estela", "Faluna", "Ferobra", "Firmera", "Funera", "Furia", "Garnera", "Gentebra", "Gladera",
                "Harmonia", "Helera", "Honbra", "Impera", "Inabra", "Javibra", "Jonera", "Kalibra", "Kenora", "Lobera",
                "Luminera", "Lutabra", "Macabra", "Menera", "Mitigera", "Monza", "Nefera", "Noctera", "Nossobra", "Olera", "Ombra", "Pacembra",   };

        for (int i = 0; i < servers.length; i++) {
            SessionProvider sessionProvider = SessionProvider.INSTANCE;
            DataDAO dao = new DataDAO(sessionProvider.getSession());
            ArrayList<Data> data  = aplikacja.getHighcoreList(servers[i]).getHighscores().getData();
            for (int j = 0; j < data.size(); j++) {
                dao.save(data.get(j));

            }
            dao.close();
//            sessionProvider.closeFactory();
        }

        }
    }





