package test.mongodb;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import test.mongodb.bean.Person;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMongoDB {

    /** <一句话功能简述>
     * <功能详细描述>
     * @param args
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args) {
        
            try {
                MongoCredential credential = MongoCredential.createScramSha1Credential("imsuser", "ims", "q111111".toCharArray());


                List<MongoCredential> credentials = new ArrayList<MongoCredential>();
                credentials.add(credential);

                MongoClient mongo = new MongoClient(new ServerAddress("192.168.23.163", 27017), credentials);

                MongoDatabase db = mongo.getDatabase("ims");

                MongoCollection collection = db.getCollection("user");

                /*Document user = new Document("name", "yuan")
                        .append("age", 18);
                collection.insertOne(user);*/


                FindIterable<Document> findIterable = collection.find();
                MongoCursor<Document> mongoCursor = findIterable.iterator();
                while(mongoCursor.hasNext()){
                    System.out.println(mongoCursor.next());
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        
        

    }

}
