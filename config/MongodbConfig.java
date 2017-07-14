package webdemo.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by exastax-03 on 7/11/2017.
 */
@Configuration
@EnableMongoRepositories(basePackages = "webdemo.repository")
public class MongodbConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "admin";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient("localhost", 27017);
    }
}
