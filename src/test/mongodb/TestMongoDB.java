package test.mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import test.mongodb.bean.Person;

import java.net.UnknownHostException;

public class TestMongoDB {

    /** <一句话功能简述>
     * <功能详细描述>
     * @param args
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args) {
        
            try {
                MongoClient mongo = new MongoClient("localhost",27017);
                
                MongoDatabase db = mongo.getDatabase("ims");

                MongoCollection collection = db.getCollection("ims");

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
