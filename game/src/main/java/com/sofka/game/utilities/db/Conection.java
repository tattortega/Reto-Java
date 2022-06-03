package com.sofka.game.utilities.db;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class Conection {

    //ConnectionString connectionString = new ConnectionString("mongodb+srv://tatto:8skiHkt6FzXq5qKX@cluster0.luvde.mongodb.net/?retryWrites=true&w=majority");
    ConnectionString connectionString = new ConnectionString("mongodb://tatto:8skiHkt6FzXq5qKX@cluster0-shard-00-00.luvde.mongodb.net:27017,cluster0-shard-00-01.luvde.mongodb.net:27017,cluster0-shard-00-02.luvde.mongodb.net:27017/?ssl=true&replicaSet=atlas-bv9r9o-shard-0&authSource=admin&retryWrites=true&w=majority");
    CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
            fromProviders(PojoCodecProvider.builder().automatic(true).build()));
    CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .codecRegistry(codecRegistry)
            .build();
    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("game");

    public MongoDatabase getDatabase(){
        return database;
    }
}
